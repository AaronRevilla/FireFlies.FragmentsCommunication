package com.example.aaron.fragmentscommunication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne, FragmentTwo{

    SecondFragments twoF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(findViewById(R.id.fragmentContainer) != null){

            OneFragment oneF = new OneFragment();
            twoF = new SecondFragments();

            //adding fragment one
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.fragmentContainer, oneF);

            //adding fragment two
            ft.add(R.id.fragmentContainer2, twoF);
            //opcional
            ft.addToBackStack(null);
            ft.commit();

//          getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.myContainer, bFF)
//                    .commit();

        }



    }


    @Override
    public void sendValue(String text) {
        twoF.setTextValue(text);
    }

    @Override
    public void setTextValue(String text) {

    }
}
