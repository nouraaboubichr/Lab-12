/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
/**
 *
 * @author hp
 */


public class Record implements Serializable {

    private int id;
    private String name;
    private double score;

    public Record(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String toString() {
        return "Record[id=" + id + ", name=" + name + ", score=" + score + "]";
    }
}
