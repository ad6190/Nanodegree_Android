package com.example.notepad_my.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
//import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_spotify_toast(View v){
        Toast.makeText(getApplicationContext(), "This button will launch my Spotify Steamer App!", Toast.LENGTH_LONG).show();

        }

    public void show_scores_toast(View v){
        Toast.makeText(getApplicationContext(), "This button will launch my Scores App!", Toast.LENGTH_LONG).show();

    }

    public void show_library_toast(View v){
        Toast.makeText(getApplicationContext(), "This button will launch my Library App!", Toast.LENGTH_LONG).show();
    }

    public void show_xyz_toast(View v){
        Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader App!", Toast.LENGTH_LONG).show();
    }

    public void show_build_bigger_toast(View v){
        Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger App!", Toast.LENGTH_LONG).show();

    }

    public void show_capstone_toast(View v){
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone App!", Toast.LENGTH_LONG).show();

    }
    /*
        Button button_spotify = (Button) findViewById(R.id.button_spotify);
        Button button_scores = (Button) findViewById(R.id.button_scores);
        Button button_library = (Button) findViewById(R.id.button_library);
        Button button_build = (Button) findViewById(R.id.button_build);
        Button button_xyz = (Button) findViewById(R.id.button_xyz);
        Button button_capstone = (Button) findViewById(R.id.button_capstone);

        button_spotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Spotify Steamer App!", Toast.LENGTH_LONG).show();

            }
        });
        button_scores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Scores App!", Toast.LENGTH_LONG).show();

            }
        });
        button_library.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Library App!", Toast.LENGTH_LONG).show();

            }
        });
        button_build.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger App!", Toast.LENGTH_LONG).show();

            }
        });
        button_xyz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader App!", Toast.LENGTH_LONG).show();

            }
        });
        button_capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone App!", Toast.LENGTH_LONG).show();

            }
        });
*/




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/
}
