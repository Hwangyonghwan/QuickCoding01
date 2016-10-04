package com.example.iamyonghwan.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    int[] arr = {5,6,3,7,8,9,4};
    Minimun min = new Minimun();
    Average avr = new Average();
    String result1 = Integer.toString(min.getresult(arr));
    String result2 = Integer.toString(avr.getresult(arr));



    public void onButten1Clicked(View v){

        Toast.makeText(getApplicationContext(),result1,Toast.LENGTH_LONG).show();
    }

    public void onButten2Clicked(View v){
        Toast.makeText(getApplicationContext(),result2,Toast.LENGTH_LONG).show();
    }
}
