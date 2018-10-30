package com.example.dell.aplikasi_ootd;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout);

        FragmentManager fragmentManager = getSupportFragmentManager();


        BodyPartsFragments bodyFragment = new BodyPartsFragments();
        bodyFragment.setmImageIds(ImageAssets.getBodies());
        bodyFragment.setmListIndex(0);
        fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit();

        BodyPartsFragments legFragment = new BodyPartsFragments();
        legFragment.setmImageIds(ImageAssets.getLegs());
        legFragment.setmListIndex(0);
        fragmentManager.beginTransaction().add(R.id.legs_container, legFragment).commit();
    }
}
