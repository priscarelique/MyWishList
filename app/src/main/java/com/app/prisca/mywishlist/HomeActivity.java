package com.app.prisca.mywishlist;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Prisca on 26/07/2017.
 */

public class HomeActivity extends AppCompatActivity {

    String wishListNames[] = {"Liste 1", "Liste 2", "Liste 3", "Liste 4"};
    ListView myListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myListView = (ListView) findViewById(R.id.wishListsView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, wishListNames);

        myListView.setAdapter(arrayAdapter);

    }

    public void goToAddView(View view){
        Intent intent = new Intent(HomeActivity.this, AddWishlistActivity.class);
        startActivity(intent);
    }
}
