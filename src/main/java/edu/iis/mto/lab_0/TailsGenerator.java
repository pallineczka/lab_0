package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        ArrayList<String> lista = new ArrayList<>();

        //1
        if(value == null){
            return new ArrayList<>();
        }

        return new ArrayList<>(value.length());
    }

}
