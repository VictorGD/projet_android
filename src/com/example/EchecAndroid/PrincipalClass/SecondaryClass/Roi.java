package com.example.EchecAndroid.PrincipalClass.SecondaryClass;

import com.example.EchecAndroid.PrincipalClass.Coordonnees;
import com.example.EchecAndroid.PrincipalClass.Piece;

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
