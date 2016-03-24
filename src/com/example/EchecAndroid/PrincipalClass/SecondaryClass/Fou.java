package com.example.EchecAndroid.PrincipalClass.SecondaryClass;

import com.example.EchecAndroid.PrincipalClass.Coordonnees;
import com.example.EchecAndroid.PrincipalClass.Echiquier;
import com.example.EchecAndroid.PrincipalClass.Piece;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 */
public class Fou extends Piece {

    public List<Coordonnees> deplacementsPossibles(Echiquier e) {
        List<Coordonnees> l = new LinkedList<>();

        l.addAll(
                this.getAvailableCaseDependDirection(
                        e,
                        e.getIndices(this),
                        new Coordonnees(1,1)
                ));
        l.addAll(this.getAvailableCaseDependDirection(e,e.getIndices(this), new Coordonnees(1,-1)));
        l.addAll(this.getAvailableCaseDependDirection(e,e.getIndices(this), new Coordonnees(-1,-1)));
        l.addAll(this.getAvailableCaseDependDirection(e,e.getIndices(this), new Coordonnees(-1,1)));
        return l;


    }
}
