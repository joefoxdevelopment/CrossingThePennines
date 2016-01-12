package com.hudsoft.crossingthepennines;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class InfoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String location;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //Accessed from MapsActivity by pressing an InfoWindow
            location = extras.getString("location");
        }else{
            //Accessed from AboutActivity through Back Stack
            location = "";
            Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(intent);
        }

        getSupportActionBar().setTitle(location);

        TextView text = (TextView)findViewById(R.id.description);
        text.setText(getDesc(location));

        Drawable pic = getResources().getDrawable(getImage(location));
        ImageView image = (ImageView)findViewById(R.id.descImage);
        image.setImageDrawable(pic);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_about:
                openAbout();
                break;
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }

    private String getDesc(String id) {
        if (id.equals(getString(R.string.m1t))){
            return getString(R.string.m1d);
        }else if (id.equals(getString(R.string.m2t))){
            return getString(R.string.m2d);
        }else if (id.equals(getString(R.string.m3t))) {
            return getString(R.string.m3d);
        }else if (id.equals(getString(R.string.m4t))){
            return getString(R.string.m4d);
        }else if (id.equals(getString(R.string.m5t))){
            return getString(R.string.m5d);
        }else if (id.equals(getString(R.string.m6t))){
            return getString(R.string.m6d);
        }else if (id.equals(getString(R.string.m7t))){
            return getString(R.string.m7d);
        }else if (id.equals(getString(R.string.m8t))){
            return getString(R.string.m8d);
        }else if (id.equals(getString(R.string.m9t))){
            return getString(R.string.m9d);
        }else if (id.equals(getString(R.string.m10t))){
            return getString(R.string.m10d);
        }else if (id.equals(getString(R.string.m11t))){
            return getString(R.string.m11d);
        }else if (id.equals(getString(R.string.m12t))){
            return getString(R.string.m12d);
        }else if (id.equals(getString(R.string.m13t))){
            return getString(R.string.m13d);
        }else if (id.equals(getString(R.string.m14t))){
            return getString(R.string.m14d);
        }else if (id.equals(getString(R.string.m15t))){
            return getString(R.string.m15d);
        }else if (id.equals(getString(R.string.m16t))){
            return getString(R.string.m16d);
        }else if (id.equals(getString(R.string.m17t))){
            return getString(R.string.m17d);
        }else if (id.equals(getString(R.string.m18t))){
            return getString(R.string.m18d);
        }else if (id.equals(getString(R.string.m19t))){
            return getString(R.string.m19d);
        }else if (id.equals(getString(R.string.m20t))){
            return getString(R.string.m20d);
        }else if (id.equals(getString(R.string.m21t))){
            return getString(R.string.m21d);
        }else if (id.equals(getString(R.string.m22t))){
            return getString(R.string.m22d);
        }else if (id.equals(getString(R.string.m23t))){
            return getString(R.string.m23d);
        }else if (id.equals(getString(R.string.m24t))){
            return getString(R.string.m24d);
        }else if (id.equals(getString(R.string.m25t))){
            return getString(R.string.m25d);
        }else if (id.equals(getString(R.string.m26t))){
            return getString(R.string.m26d);
        }else if (id.equals(getString(R.string.m27t))){
            return getString(R.string.m27d);
        }else if (id.equals(getString(R.string.m28t))){
            return getString(R.string.m28d);
        }else if (id.equals(getString(R.string.m29t))){
            return getString(R.string.m29d);
        }else if (id.equals(getString(R.string.m30t))){
            return getString(R.string.m30d);
        }else if (id.equals(getString(R.string.m31t))){
            return getString(R.string.m31d);
        }else if (id.equals(getString(R.string.m32t))){
            return getString(R.string.m32d);
        }else{
            return "No details for this marker yet";
        }
    }

    private int getImage(String id) {
        if (id.equals(getString(R.string.m1t))){
            return R.drawable.m1i;
        }else if (id.equals(getString(R.string.m2t))){
            return R.drawable.m2i;
        }else if (id.equals(getString(R.string.m3t))) {
            return R.drawable.m3i;
        }else if (id.equals(getString(R.string.m4t))){
            return R.drawable.m4i;
        }else if (id.equals(getString(R.string.m5t))){
            return R.drawable.m5i;
        }else if (id.equals(getString(R.string.m6t))){
            return R.drawable.m6i;
        }else if (id.equals(getString(R.string.m7t))){
            return R.drawable.m7i;
        }else if (id.equals(getString(R.string.m8t))){
            return R.drawable.m8i;
        }else if (id.equals(getString(R.string.m9t))){
            return R.drawable.m9i;
        }else if (id.equals(getString(R.string.m10t))){
            return R.drawable.m10i;
        }else if (id.equals(getString(R.string.m11t))){
            return R.drawable.m11i;
        }else if (id.equals(getString(R.string.m12t))){
            return R.drawable.m12i;
        }else if (id.equals(getString(R.string.m13t))){
            return R.drawable.m13i;
        }else if (id.equals(getString(R.string.m14t))){
            return R.drawable.m14i;
        }else if (id.equals(getString(R.string.m15t))){
            return R.drawable.m15i;
        }else if (id.equals(getString(R.string.m16t))){
            return R.drawable.m16i;
        }else if (id.equals(getString(R.string.m17t))){
            return R.drawable.m17i;
        }else if (id.equals(getString(R.string.m18t))){
            return R.drawable.m18i;
        }else if (id.equals(getString(R.string.m19t))){
            return R.drawable.m19i;
        }else if (id.equals(getString(R.string.m20t))){
            return R.drawable.m20i;
        }else if (id.equals(getString(R.string.m21t))){
            return R.drawable.m21i;
        }else if (id.equals(getString(R.string.m22t))){
            return R.drawable.m22i;
        }else if (id.equals(getString(R.string.m23t))){
            return R.drawable.m23i;
        }else if (id.equals(getString(R.string.m24t))){
            return R.drawable.m24i;
        }else if (id.equals(getString(R.string.m25t))){
            return R.drawable.m25i;
        }else if (id.equals(getString(R.string.m26t))){
            return R.drawable.m26i;
        }else if (id.equals(getString(R.string.m27t))){
            return R.drawable.m27i;
        }else if (id.equals(getString(R.string.m28t))){
            return R.drawable.m28i;
        }else if (id.equals(getString(R.string.m29t))){
            return R.drawable.m29i;
        }else if (id.equals(getString(R.string.m30t))){
            return R.drawable.m30i;
        }else if (id.equals(getString(R.string.m31t))){
            return R.drawable.m31i;
        }else if (id.equals(getString(R.string.m32t))){
            return R.drawable.m32i;
        }else{
            return R.drawable.ic_launcher;
        }
    }

    private void openAbout() {
        Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
        startActivity(intent);
    }
}
