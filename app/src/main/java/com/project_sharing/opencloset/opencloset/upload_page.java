package com.project_sharing.opencloset.opencloset;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
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

public class upload_page extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload_page);

        ImageButton home_in_upload_page = (ImageButton)findViewById(R.id.home_in_upload_page);
        home_in_upload_page.setOnClickListener(this);

        ImageButton back_in_upload_page = (ImageButton)findViewById(R.id.back_in_upload_page);
        back_in_upload_page.setOnClickListener(this);

        FloatingActionButton upload = (FloatingActionButton) findViewById(R.id.upload);
        upload.setOnClickListener(this);
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
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
