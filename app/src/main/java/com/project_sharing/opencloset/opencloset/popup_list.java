package com.project_sharing.opencloset.opencloset;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by andytu28 on 1/6/17.
 */

public class popup_list extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_menu);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout(width, (int)(height*0.4));
        getWindow().setGravity(Gravity.BOTTOM);

        ArrayList<String> aas = new ArrayList<String>();
        aas.add("123");
        aas.add("123");

        CommentListAdapter ila = new CommentListAdapter(this, aas);
        ListView list_view = (ListView) findViewById(R.id.popup_list);
        list_view.setAdapter(ila);
    }
}

class CommentListAdapter extends ArrayAdapter<String> {
    public CommentListAdapter(Context context, ArrayList<String> s) {
        super(context, 0, s);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.popup_list_content, parent, false);
        }
        return convertView;
    }
}