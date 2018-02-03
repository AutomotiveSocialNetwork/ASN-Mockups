package com.example.android.asn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class RouteActivity extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        LatLng my_location = new LatLng(30.095103, 31.634002);
        mMap.addMarker(new MarkerOptions().position(my_location).title("My Car ^__^").snippet("I'm Noha ,a software engineer from Egypt")
                //.icon(BitmapDescriptorFactory.fromBitmap(my_car_icon)));
        .icon(bitmapDescriptorFromVector(this,R.drawable.my_car)));

        //);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(my_location,15));


        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.102895, 31.637703))
                .title("Metro Market ")
                .snippet("Come and see our great offers for this week !!")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_add_shopping_cart_black_24dp)));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.106360, 31.630415))
                .title("KFC ")
                .snippet("Enjoy your meal with us")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_restaurant_black_24dp)));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.111231, 31.636227))
                .title("Oasis Car Maintenance ")
                .snippet("Drive Safely after visiting us")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_train_black_24dp)));
       mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.096421, 31.637389))
                .title("Other cars ")
                .snippet("Want to talk with me?start pairing")
                .icon(bitmapDescriptorFromVector(this,R.drawable.other_car)));
                //.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
       mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.094805, 31.633065))
                .title("Other cars ")
                .snippet("Want to talk with me?start pairing")
                //.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
               .icon(bitmapDescriptorFromVector(this,R.drawable.other_car)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.094573, 31.631810))
                .title("Other cars ")
                .snippet("Want to talk with me?start pairing")
               // .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                .icon(bitmapDescriptorFromVector(this,R.drawable.other_car)));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.094852, 31.633280))
                .title("Other cars ")
                .snippet("Want to talk with me?start pairing")
                .icon(bitmapDescriptorFromVector(this,R.drawable.other_car)));
               // .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.094391, 31.632018))
                .title("Other cars ")
                .snippet("Want to talk with me?start pairing")
                .icon(bitmapDescriptorFromVector(this,R.drawable.other_car)));
                //.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(30.095179, 31.634839))
                .title("Other cars ")
                .snippet("Want to talk with me?start pairing")
                //.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                .icon(bitmapDescriptorFromVector(this,R.drawable.other_car)));

        mMap.addCircle(new CircleOptions()
                .center(my_location)
                .radius(300)
                .strokeColor(Color.RED));





    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, @DrawableRes int vectorDrawableResourceId){
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorDrawableResourceId);
        vectorDrawable.setBounds(40, 20, vectorDrawable.getIntrinsicWidth() , vectorDrawable.getIntrinsicHeight() );
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }


}
