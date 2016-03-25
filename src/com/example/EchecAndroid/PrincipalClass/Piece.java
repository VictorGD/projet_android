package com.example.EchecAndroid.PrincipalClass;

import com.example.EchecAndroid.PrincipalClass.Coordonnees;
import com.example.EchecAndroid.PrincipalClass.Equipe;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 * Classe mère de toute les pièces
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

    //Retourne toutes les cases libres jusqu'à rencontrer un obstacle dans une direction
    //Prend en paramètre une direction sous la forme d'une coordonnée en facteur (ex : Nord => (0,1)
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

    //Fonction qui prend en paramètre l'échiquier, la pièce renverra une liste des coordonnées qui correspond
    //aux cases sur lesquelles elle peut se déplacer
    //Fonction implémentée différement pour chaque classe fille
    public List<Coordonnees> getPossibleMovement(Echiquier e) {
        return new LinkedList<>();
    }
}
