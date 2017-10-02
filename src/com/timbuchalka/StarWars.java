package com.timbuchalka;

/**
 * Created by KH389659 on 02/10/2017.
 */
public class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "So much war in a galaxy ";
    }
}
