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
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Prisca on 26/07/2017.
 */

public class HomeActivity extends AppCompatActivity {

    String wishListNames[] = {"Liste 1", "Liste 2", "Liste 3", "Liste 4"};
    ListView myListView;
    private FirebaseAuth mAuth;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mAuth = FirebaseAuth.getInstance();

        myListView = (ListView) findViewById(R.id.wishListsView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, wishListNames);

        myListView.setAdapter(arrayAdapter);

    }

    public void goToAddView(View view){
        Intent intent = new Intent(HomeActivity.this, AddWishlistActivity.class);
        startActivity(intent);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Toast.makeText(getApplicationContext(), currentUser.getEmail(), Toast.LENGTH_SHORT).show();
        }
    }
}
