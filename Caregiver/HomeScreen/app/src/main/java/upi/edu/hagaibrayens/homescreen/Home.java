package upi.edu.hagaibrayens.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void scan(View v){
        Intent switchActivityIntent = new Intent(this, ScanQR.class);
        startActivity(switchActivityIntent);
    }

    public void home(View v){
        Intent switchActivityIntent = new Intent(this, Home.class);
        startActivity(switchActivityIntent);
    }

    public void home(MenuItem item){
        Intent switchActivityIntent = new Intent(this, Home.class);
        startActivity(switchActivityIntent);
    }


    public void list(View v){
        Intent switchActivityIntent = new Intent(this, Riwayat.class);
        startActivity(switchActivityIntent);
    }

    public void list(MenuItem item){
        Intent switchActivityIntent = new Intent(this, Riwayat.class);
        startActivity(switchActivityIntent);
    }

    public void set(View v){
        Intent switchActivityIntent = new Intent(this, setting.class);
        startActivity(switchActivityIntent);
    }

    public void set(MenuItem item){
        Intent switchActivityIntent = new Intent(this, setting.class);
        startActivity(switchActivityIntent);
    }

    public void kontak(View v){
        Intent switchActivityIntent = new Intent(this, Riwayat.class);
        startActivity(switchActivityIntent);
    }

    public void kontak(MenuItem item){
        Intent switchActivityIntent = new Intent(this, Riwayat.class);
        startActivity(switchActivityIntent);
    }

    public void loc(View v){
        Intent switchActivityIntent = new Intent(this, LansiaMap.class);
        startActivity(switchActivityIntent);
    }
}