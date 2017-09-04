
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krozz
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

//CONSTRUTOR
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;

    }
//CONSTRUTOR

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
//CONSTRUTOR

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        String line = "";
        String letters = " *";
        String symbol = "";
        for (int i = 0; i < width; i++) {
            double chance = random.nextDouble();
            if (chance > this.density) {
                symbol = " ";
            } else {
                symbol = "*";
                starsInLastPrint++;

            }
            line += symbol;
        }
        System.out.println(line);
    }

    public void print() {
        this.starsInLastPrint = 0;

        for (int i = 0; i < this.height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;

    }

}
