package main;

public class MatrixNonNative implements Matrix {

    public double[][] multiply(double[][] m1, double[][] m2){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
        return null;
        // throw new UnsupportedOperationException();
    }

}