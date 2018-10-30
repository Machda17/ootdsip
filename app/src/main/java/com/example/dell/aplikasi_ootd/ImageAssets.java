package com.example.dell.aplikasi_ootd;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {



    //Variabel ini adalah pengelompokan untuk bodi , dan menyimpan data
    private  static List<Integer> bodies = new ArrayList<Integer>(){{
        add(R.drawable.devils1);
        add(R.drawable.devils2);
        add(R.drawable.devils3);

    }};

    //Variabel ini adalah pengelompokan untuk kaki , dan menyimpan data
    private  static List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.devilpants);
        add(R.drawable.devilpants1);
        add(R.drawable.devilpants3);

    }};



    //ini adalah method yang digunakan untuk mengambil/memanggil variabel body
    public static List<Integer> getBodies(){
        return bodies;
    }

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel leg
    public static List<Integer> getLegs(){
        return legs;
    }


}