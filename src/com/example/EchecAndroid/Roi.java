package com.example.EchecAndroid;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 */
public class Roi extends Piece {

    public Roi() {
        Deplacement.add(new Coordonnees(-1,-1));
        Deplacement.add(new Coordonnees(-1,0));
        Deplacement.add(new Coordonnees(-1,1));
        Deplacement.add(new Coordonnees(0,1));
        Deplacement.add(new Coordonnees(1,1));
        Deplacement.add(new Coordonnees(0,1));
        Deplacement.add(new Coordonnees(-1,1));
        Deplacement.add(new Coordonnees(0,-1));
    }
}
