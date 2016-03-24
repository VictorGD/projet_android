package com.example.EchecAndroid.PrincipalClass;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 */
public class Echiquier {
    static private Echiquier _Instance = null;
    private Piece matrice [][]= {
            {null, null, null,null,null,null,null,null},
            {null, null, null,null,null,null,null,null},
            {null, null, null,null,null,null,null,null},
            {null, null, null,null,null,null,null,null},
            {null, null, null,null,null,null,null,null},
            {null, null, null,null,null,null,null,null},
            {null, null, null,null,null,null,null,null},
            {null, null, null,null,null,null,null,null}
            };

    private Echiquier() {
    }

    public Echiquier getInstance() {
        if (_Instance == null)
        {
            _Instance = new Echiquier();
        }
        return _Instance;
    }

    public List<Coordonnees> deplacementsPossibles (Piece p) {
        List<Coordonnees> deplacementsPossibles = new LinkedList<>();

        Coordonnees indices = getIndices(p);

        for (Coordonnees c : p.getDeplacement()) {
            if (matrice[indices.y - c.getY()][indices.x-c.getX()]  == null) {
                deplacementsPossibles.add(new Coordonnees(indices.y - c.getY(),indices.x-c.getX()));

                //passer la case en bleue

            }
            if (matrice[indices.y - c.getY()][indices.x-c.getX()]  != null &&
                    matrice[indices.y - c.getY()][indices.x-c.getX()].getEquipe() != p.getEquipe()) {
                deplacementsPossibles.add(new Coordonnees(indices.y - c.getY(),indices.x-c.getX()));

                //passer la case en rouge

            }
            //si une piece devant retirer la case possible
        }
        return deplacementsPossibles;
    }

    public Coordonnees getIndices(Piece p) {
        Coordonnees c = new Coordonnees();
        for (int x=0;x<8;x++) { for (int y=0;y<8;y++) {
            if (matrice[x][y] == p) {
                c = new Coordonnees(x,y);
            }
        }}
        return c;
    }
}
