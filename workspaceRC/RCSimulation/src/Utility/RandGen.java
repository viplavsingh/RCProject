package Utility;

import java.util.Random;


public class RandGen extends Random {

 
    public int getRandIntBetween(int min, int max) {
        return min + super.nextInt(max - min + 1);
    }

  
    public double getRandDoubleBetween(double min, double max) {
        double dnew = min + (max - min) * super.nextDouble();
        return (double) (dnew);
    }

  
    public int getEvenRandIntBetween(int min, int max) {
        return (min + super.nextInt(max - min + 1)) & -2;
    }
}
