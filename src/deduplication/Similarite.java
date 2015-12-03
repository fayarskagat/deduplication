/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deduplication;

/**
 *
 * @author Yunho
 */
public class Similarite {
    
    private String attribut;
    private TypeAlgorithme algorithme;
    private double seuil;

    public Similarite(String attribut, TypeAlgorithme algorithme, double seuil) {
        this.attribut = attribut;
        this.algorithme = algorithme;
        this.seuil = seuil;
    }

    public Similarite(String attribut, TypeAlgorithme algorithme) {
        this.attribut = attribut;
        this.algorithme = algorithme;
    }

    
    public Similarite() {
    }

    public String getAttribut() {
        return attribut;
    }

    public void setAttribut(String attribut) {
        this.attribut = attribut;
    }

    public TypeAlgorithme getAlgorithme() {
        return algorithme;
    }

    public void setAlgorithme(TypeAlgorithme algorithme) {
        this.algorithme = algorithme;
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "Similarite{" + "attribut=" + attribut + '}';
    }
    
    
}
