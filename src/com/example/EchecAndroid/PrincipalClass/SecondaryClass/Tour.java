package com.example.EchecAndroid.PrincipalClass.SecondaryClass;

import com.example.EchecAndroid.PrincipalClass.Coordonnees;
import com.example.EchecAndroid.PrincipalClass.Echiquier;
import com.example.EchecAndroid.PrincipalClass.Piece;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 */
public class Tour extends Piece {

    public List<Coordonnees> getPossibleMovement(Echiquier e) {
        List<Coordonnees> l = new LinkedList<>();

        l.addAll(
                this.getAvailableCaseDependDirection(
                        e,
                        new Coordonnees(0,1)
                ));
        l.addAll(this.getAvailableCaseDependDirection(e, new Coordonnees(1,0)));
        l.addAll(this.getAvailableCaseDependDirection(e, new Coordonnees(0,-1)));
        l.addAll(this.getAvailableCaseDependDirection(e, new Coordonnees(-1,0)));
        return l;


    }
}
