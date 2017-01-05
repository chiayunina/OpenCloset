package com.project_sharing.opencloset.opencloset;

/**
 * Created by andytu28 on 1/4/17.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class item_list extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_page);

        ArrayList<String> aas = new ArrayList<String>();
        aas.add("123");
        aas.add("123");
        ItemListAdapter ila = new ItemListAdapter(this, aas);
        ListView list_view = (ListView) findViewById(R.id.list_content);
        list_view.setAdapter(ila);
    }

    @Override
    public void onClick(View v) {
        /*switch (v.getId()) {
            case R.id.discussionContent:
                startActivity(new Intent(this, item_page.class));
                break;
        }*/
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