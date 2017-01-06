package com.project_sharing.opencloset.opencloset;

/**
 * Created by andytu28 on 1/4/17.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NavUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class item_list extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_page);

        NavigationView navigationView = (NavigationView)findViewById(R.id.list_navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ArrayList<String> aas = new ArrayList<String>();
        aas.add("123");
        aas.add("123");
        aas.add("123");

        ItemListAdapter ila = new ItemListAdapter(this, aas);
        ListView list_view = (ListView) findViewById(R.id.list_content);
        list_view.setAdapter(ila);

        ImageButton home_in_list_page = (ImageButton)findViewById(R.id.home_in_list_page);
        home_in_list_page.setOnClickListener(this);

        ImageButton back_in_list_page = (ImageButton)findViewById(R.id.back_in_list_page);
        back_in_list_page.setOnClickListener(this);

        ImageButton upload_in_list_page = (ImageButton)findViewById(R.id.upload_in_list_page);
        upload_in_list_page.setOnClickListener(this);

        ImageButton menu_in_list_page = (ImageButton)findViewById(R.id.menu_in_list_page);
        menu_in_list_page.setOnClickListener(this);
    }

    public void viewButtonClick(View v) {
        startActivity(new Intent(this, item_page.class));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_in_list_page:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.upload_in_list_page:
                startActivity(new Intent(this, upload_page.class));
                break;
            case R.id.back_in_list_page:
                this.finish();
                break;
            case R.id.menu_in_list_page:
                DrawerLayout drawer = (DrawerLayout)findViewById(R.id.list_drawer_layout);
                drawer.openDrawer(GravityCompat.START);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.list_drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menu) {
        switch (menu.getItemId()) {
            case R.id.interview:
                break;
            case R.id.office:
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.list_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

class ItemListAdapter extends ArrayAdapter<String> {
    public ItemListAdapter(Context context, ArrayList<String> s) {
        super(context, 0, s);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_list_content, parent, false);
        }
        return convertView;
    }
}