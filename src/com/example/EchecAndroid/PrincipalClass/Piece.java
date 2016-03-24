package com.example.EchecAndroid.PrincipalClass;

import com.example.EchecAndroid.PrincipalClass.Coordonnees;
import com.example.EchecAndroid.PrincipalClass.Equipe;

import java.util.List;

/**
 * Created by Victor on 21/03/2016.
 */
public abstract class Piece {

    private String nom;
    protected List<Coordonnees> Deplacement;
    private Equipe equipe;

    public List<Coordonnees> getDeplacement() { return this.Deplacement;}
    private void setDeplacement(List<Coordonnees> c) { this.Deplacement=c;}

    public Piece(){}
    public Piece(String n){ this.nom = n; }
    public Piece(String n, Equipe e){ this.nom = n; this.equipe=e; }

    public String getNom() { return this.nom; }
    public void setNom(String n) { this.nom = n; }

    public Equipe getEquipe() { return this.equipe; }
    public void setEquipe(Equipe e) { this.equipe = e; }

}
