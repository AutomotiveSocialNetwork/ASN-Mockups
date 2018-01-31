package com.example.android.asn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FeaturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);
    }

    public void goToMyRoute(View view){
        Intent intent =new Intent(this,RouteActivity.class);
        startActivity(intent);
    }
}
