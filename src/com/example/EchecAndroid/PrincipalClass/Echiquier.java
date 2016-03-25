package com.example.EchecAndroid.PrincipalClass;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 */
public class Echiquier {
    private static Echiquier _Instance = null;
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

    public Piece[][] getMatrice() { return this.matrice;}
    private void setMatrice(Piece[][] m) { this.matrice = m;}

    private Echiquier() {
    }

    public static Echiquier getInstance() {
        if (_Instance == null)
        {
            _Instance = new Echiquier();
        }
        return _Instance;
    }

    public boolean IsInMatrice(Coordonnees c) {
        boolean b =false;
        if (c.getY() >= 0 &&
                c.getY() <= Echiquier._Instance.getMatrice().length -1 &&
                c.getX() >= 0 &&
                c.getX() <= Echiquier._Instance.getMatrice()[0].length -1){
            b = true;

        }
        return b;
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
