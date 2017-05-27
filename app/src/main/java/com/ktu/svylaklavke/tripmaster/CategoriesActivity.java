package com.ktu.svylaklavke.tripmaster;

/**
 * Created by deima on 2017-04-11.
 */

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Environment;
import android.renderscript.ScriptGroup;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.tagmanager.PreviewActivity;
import com.google.android.gms.vision.text.Text;
import com.google.android.gms.wallet.MaskedWallet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutionException;

public class CategoriesActivity extends FragmentActivity {
    public static String places = "";
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        Button btnDone = (Button) findViewById(R.id.done_button);
        btnDone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonState();
            }
        });
    }

    public void buttonState(){
        CheckBox food =      (CheckBox) findViewById(R.id.food);
        CheckBox hotel =     (CheckBox) findViewById(R.id.hotel);
        CheckBox sights =    (CheckBox) findViewById(R.id.sights);
        CheckBox wifi =      (CheckBox) findViewById(R.id.wifi);
        CheckBox petrol =    (CheckBox) findViewById(R.id.petrol);
        CheckBox artGalery = (CheckBox) findViewById(R.id.art);
        CheckBox church =    (CheckBox) findViewById(R.id.church);
        CheckBox cityHall =  (CheckBox) findViewById(R.id.city_hall);
        CheckBox embassy =   (CheckBox) findViewById(R.id.embassy);
        CheckBox library =   (CheckBox) findViewById(R.id.library);
        CheckBox museum =    (CheckBox) findViewById(R.id.museum);
        CheckBox school =    (CheckBox) findViewById(R.id.school);
        CheckBox zoo =       (CheckBox) findViewById(R.id.zoo);

        if(food.isChecked()){
            places += places + "food|";
        }
        if(hotel.isChecked()){
            places += places + "hotel|";
        }
        if(sights.isChecked()){
            places += places + "sights|";
        }
        if(wifi.isChecked()){
            //places += places + "wifi|";
        }
        if(petrol.isChecked()){
            places += places + "gas_station|";
        }
        if(artGalery.isChecked()){
            places += places + "art_gallery|";
        }
        if(church.isChecked()){
            places += places + "church|";
        }
        if(cityHall.isChecked()){
            places += places + "city_hall|";
        }
        if(embassy.isChecked()){
            places += places + "embassy|";
        }
        if(library.isChecked()){
            places += places + "library|";
        }
        if(museum.isChecked()){
            places += places + "museum|";
        }
        if(school.isChecked()){
            places += places + "school|";
        }
        if(zoo.isChecked()){
            places += places + "zoo|";
        }
        finish();
    }

}
