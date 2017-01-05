package com.project_sharing.opencloset.opencloset;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.PopupWindow;

/**
 * Created by andytu28 on 1/4/17.
 */

public class upload_page extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload_page);

        NavigationView navigationView = (NavigationView)findViewById(R.id.upload_navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ImageButton home_in_upload_page = (ImageButton)findViewById(R.id.home_in_upload_page);
        home_in_upload_page.setOnClickListener(this);

        ImageButton back_in_upload_page = (ImageButton)findViewById(R.id.back_in_upload_page);
        back_in_upload_page.setOnClickListener(this);

        FloatingActionButton upload = (FloatingActionButton) findViewById(R.id.upload);
        upload.setOnClickListener(this);

        ImageButton menu_in_upload_page = (ImageButton) findViewById(R.id.menu_in_upload_page);
        menu_in_upload_page.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_in_upload_page:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.back_in_upload_page:
                this.finish();
                break;
            case R.id.upload:
                break;
            case R.id.menu_in_upload_page:
                DrawerLayout drawer = (DrawerLayout)findViewById(R.id.upload_drawer_layout);
                drawer.openDrawer(GravityCompat.START);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.upload_drawer_layout);
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
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.upload_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
