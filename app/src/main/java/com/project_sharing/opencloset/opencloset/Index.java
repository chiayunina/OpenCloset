package com.project_sharing.opencloset.opencloset;

import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v4.media.RatingCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Index extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_page);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layerout);

        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);


        ImageButton upload_in_index_page = (ImageButton)findViewById(R.id.upload_in_index_page);
        upload_in_index_page.setOnClickListener(this);

        ImageButton menu_in_index_page = (ImageButton)findViewById(R.id.menu_in_index_page);
        menu_in_index_page.setOnClickListener(this);

        LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
        for (int i = 0; i < 10; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
            imageView.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), R.drawable.main_pic));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            layout.addView(imageView);
        }

        LinearLayout layout2 = (LinearLayout) findViewById(R.id.linear2);
        for (int i = 0; i < 10; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
            imageView.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), R.drawable.main_pic));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            layout2.addView(imageView);
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.upload_in_index_page:
                startActivity(new Intent(this, upload_page.class));
                break;
            case R.id.menu_in_index_page:
                DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layerout);
                drawer.openDrawer(GravityCompat.START);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layerout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menu) {
        return true;
    }
}
