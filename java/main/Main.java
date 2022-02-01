package main;

import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void execute(Matrix matrix){
        Instant start = Instant.now();
        double result[][] = matrix.multiply(matrix.generateMatrix(2,2), matrix.generateMatrix(2,2));
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end); 
        System.out.println("Duração: "+timeElapsed.toMillis()+" ms");
    }

    public static void main(String args[]){
        System.out.println("JVM");
        Main.execute(MatrixFactory.create(false));
        System.out.println("Nativo");
        Main.execute(MatrixFactory.create(true));
    }

}