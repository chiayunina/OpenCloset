package com.project_sharing.opencloset.opencloset;

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

/**
 * Created by andytu28 on 1/4/17.
 */

public class item_page extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_page);

        ImageButton home_in_item_page = (ImageButton)findViewById(R.id.home_in_item_page);
        home_in_item_page.setOnClickListener(this);

        ImageButton back_in_item_page = (ImageButton)findViewById(R.id.back_in_item_page);
        back_in_item_page.setOnClickListener(this);

        ImageButton upload_in_item_page = (ImageButton)findViewById(R.id.upload_in_item_page);
        upload_in_item_page.setOnClickListener(this);

        FloatingActionButton fab1 = (FloatingActionButton)findViewById(R.id.fab1);
        fab1.setOnClickListener(this);

        FloatingActionButton fab2 = (FloatingActionButton)findViewById(R.id.fab1);
        fab2.setOnClickListener(this);
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
            case R.id.fab1:
                break;
            case R.id.fab2:
                break;
        }
    }
}
