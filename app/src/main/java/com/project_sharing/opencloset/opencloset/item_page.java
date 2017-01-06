package com.project_sharing.opencloset.opencloset;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v4.media.RatingCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by andytu28 on 1/4/17.
 */

public class item_page extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_page);

        NavigationView navigationView = (NavigationView)findViewById(R.id.item_navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ImageButton home_in_item_page = (ImageButton)findViewById(R.id.home_in_item_page);
        home_in_item_page.setOnClickListener(this);

        ImageButton back_in_item_page = (ImageButton)findViewById(R.id.back_in_item_page);
        back_in_item_page.setOnClickListener(this);

        ImageButton upload_in_item_page = (ImageButton)findViewById(R.id.upload_in_item_page);
        upload_in_item_page.setOnClickListener(this);

        FloatingActionButton fab1 = (FloatingActionButton)findViewById(R.id.fab1);
        fab1.setOnClickListener(this);

        FloatingActionButton fab2 = (FloatingActionButton)findViewById(R.id.fab2);
        fab2.setOnClickListener(this);

        ImageButton menu_in_item_page = (ImageButton)findViewById(R.id.menu_in_item_page);
        menu_in_item_page.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_in_item_page:
                startActivity(new Intent(this, Index.class));
                break;
            case R.id.back_in_item_page:
                this.finish();
                break;
            case R.id.upload_in_item_page:
                startActivity(new Intent(this, upload_page.class));
                break;
            case R.id.menu_in_item_page:
                DrawerLayout drawer = (DrawerLayout)findViewById(R.id.item_drawer_layout);
                drawer.openDrawer(GravityCompat.START);
                break;
            case R.id.fab1:
                break;
            case R.id.fab2:
                startActivity(new Intent(this, popup_list.class));
                overridePendingTransition(R.anim.bottom_in, R.anim.no_change);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.item_drawer_layout);
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
                startActivity(new Intent(this, item_list.class));
                break;
            case R.id.office:
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.item_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
