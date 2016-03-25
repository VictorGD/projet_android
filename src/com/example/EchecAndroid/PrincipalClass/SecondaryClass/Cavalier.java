package com.example.EchecAndroid.PrincipalClass.SecondaryClass;

import com.example.EchecAndroid.PrincipalClass.Coordonnees;
import com.example.EchecAndroid.PrincipalClass.Echiquier;
import com.example.EchecAndroid.PrincipalClass.Piece;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 */
public class Cavalier extends Piece {

    public List<Coordonnees> getPossibleMovement(Echiquier e) {
        List<Coordonnees> l = new LinkedList<>();

        l.add(new Coordonnees(e.getIndices(this).getX()-2,e.getIndices(this).getY()+1));
        l.add(new Coordonnees(e.getIndices(this).getX()-2,e.getIndices(this).getY()-1));
        l.add(new Coordonnees(e.getIndices(this).getX()-1,e.getIndices(this).getY()+2));
        l.add(new Coordonnees(e.getIndices(this).getX()-1,e.getIndices(this).getY()-2));
        l.add(new Coordonnees(e.getIndices(this).getX()+1,e.getIndices(this).getY()+2));
        l.add(new Coordonnees(e.getIndices(this).getX()+1,e.getIndices(this).getY()-2));
        l.add(new Coordonnees(e.getIndices(this).getX()+2,e.getIndices(this).getY()+1));
        l.add(new Coordonnees(e.getIndices(this).getX()+2,e.getIndices(this).getY()-1));

        return l;
    }

}
