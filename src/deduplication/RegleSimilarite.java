/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deduplication;

import java.util.ArrayList;

/**
 *
 * @author Yunho
 */
public class RegleSimilarite {
    
    private ArrayList<Similarite> similarites;

    public RegleSimilarite() {
        this.similarites = new ArrayList();
    }
    
    public RegleSimilarite(ArrayList<Similarite> similarites) {
        this.similarites=similarites;
    }

    public ArrayList<Similarite> getSimilarites() {
        return similarites;
    }

    public void setSimilarites(ArrayList<Similarite> similarites) {
        this.similarites = similarites;
    }

    @Override
    public String toString() {
        return "RegleSimilarite{" + "similarites=" + similarites + '}';
    }

    

    
    
}
