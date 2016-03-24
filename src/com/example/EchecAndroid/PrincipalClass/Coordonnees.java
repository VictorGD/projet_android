package com.example.EchecAndroid.PrincipalClass;

/**
 * Created by Victor on 23/03/2016.
 */
public class Coordonnees {
    int x;
    int y;

    public Coordonnees(){}

    public Coordonnees(int cX, int cY){ this.x = cX; this.y = cY; }

    public int getX() { return x; }
    public void setX(int cX ) {this.x=cX;}

    public int getY() { return y; }
    public void setY(int cY ) {this.y=cY;}
}
