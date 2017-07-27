package com.app.prisca.mywishlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddWishlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_wishlist);
    }

    public void createListAndReturnHome(View view){
        Intent intent = new Intent(AddWishlistActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
