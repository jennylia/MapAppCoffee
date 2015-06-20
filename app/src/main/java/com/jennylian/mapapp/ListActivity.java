package com.jennylian.mapapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class ListActivity extends ActionBarActivity {

    ArrayList venueList;

    //Adding the Four Square client_id and client_secret
    //The app is called Coffee Addiction

    final String CLIENT_ID = "NHBAVCQRJG3ARXAPPT4VWJSDOXGIO13XKTIQ25B0VXAYAMDP";
    final String CLIENT_SECRET= "YCDO1V3Y1PYJ2TDOE54NNT5MLSH4CPSZDCDZ2UEZSIUTEYSN";
    final String BASE_URL = "https://api.foursquare.com/v2/venues/search?client_id=";
    final String QUERY = "query";
    final String NEAR = "near";
    final String VANCOUVER = "Vancouver";

/*    Useful Linkes:
https://developer.foursquare.com/docs/venues/search

A great Android API tutorial that got me started:
http://examples.javacodegeeks.com/android/android-foursquare-api-example/

Stuff to call:
https://api.foursquare.com/v2/venues/search?client_id=NHBAVCQRJG3ARXAPPT4VWJSDOXGIO13XKTIQ25B0VXAYAMDP&client_secret=YCDO1V3Y1PYJ2TDOE54NNT5MLSH4CPSZDCDZ2UEZSIUTEYSN&v=20130815&query=coffee&near=Vancouver

 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //This is where you start a task for foursquare
        String url = urlConstructor();
        makeCall(url);

    }

    private void makeCall(String url) {

    }

    private String urlConstructor() {
        return base_url + client_id + "&client_secrete=" + client_secret + ""
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

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
}
