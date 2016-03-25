package com.example.EchecAndroid.PrincipalClass;

import com.example.EchecAndroid.PrincipalClass.Coordonnees;
import com.example.EchecAndroid.PrincipalClass.Equipe;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 */
public abstract class Piece {

    private String nom;
    private Equipe equipe;

    public Piece(){}
    public Piece(String n){ this.nom = n; }
    public Piece(String n, Equipe e){ this.nom = n; this.equipe=e; }

    public String getNom() { return this.nom; }
    public void setNom(String n) { this.nom = n; }

    public Equipe getEquipe() { return this.equipe; }
    public void setEquipe(Equipe e) { this.equipe = e; }

    protected List<Coordonnees> getAvailableCaseDependDirection(Echiquier e, Coordonnees direction) {
        List<Coordonnees> l = new LinkedList<>();
        boolean fin = false;
        Coordonnees currentTest = new Coordonnees(e.getIndices(this).getX()+direction.getX(),e.getIndices(this).getY()+direction.getY());
        while (fin == false) {
            if (currentTest.getX() <= 7 &&
                    currentTest.getY() <= 7 &&
                    currentTest.getX() <= 0 &&
                    currentTest.getY() <= 0
                    ) {
                if (e.getMatrice()[currentTest.getX()][currentTest.getY()] == null)
                {
                    l.add(currentTest);
                }
                if (e.getMatrice()[currentTest.getX()][currentTest.getY()] != null &&
                        e.getMatrice()[currentTest.getX()][currentTest.getY()].getEquipe() != this.getEquipe()) {
                    l.add(currentTest);
                    fin = true;
                }
            }
            else
            {
                fin = true;
            }
            currentTest.setX(currentTest.getX()+direction.getX());
            currentTest.setY(currentTest.getY()+direction.getY());
        }
        return l;
    }

    public List<Coordonnees> getPossibleMovement() {
        return new LinkedList<>();
    }
}
