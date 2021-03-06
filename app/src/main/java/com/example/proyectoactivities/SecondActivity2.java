package com.example.proyectoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        //Activar el soporte para la actión BAR
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getParametros();
    }

    //Destruir la aplicación

    public void onBackPressed(){
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem){
        int id = menuitem.getItemId();
        if(id==android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public void getParametros(){
        Bundle extras=getIntent().getExtras();
        String msg= extras.getString("msg");
        int year = extras.getInt("year");
        Toast.makeText(this, msg+""+year, Toast.LENGTH_SHORT).show();
    }

    public void goToMainActivity(View view){
        Intent newIntent= new Intent(this,MainActivity.class);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(newIntent);
    }
}