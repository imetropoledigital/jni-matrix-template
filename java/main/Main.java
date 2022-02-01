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
        int n1,m1,n2,m2=2;

        if (args.length < 3){
            System.out.println("Você deve passar quatro parâmetros: Ex: java main.Main 2 3 3 2");
            System.exit(-1);
        }

        n1 = Integer.valueOf(args[0]);
        m1 = Integer.valueOf(args[1]);
        n2 = Integer.valueOf(args[2]);
        m2 = Integer.valueOf(args[3]);

        System.out.println("Multiplicando matrizes não nativas " + n1 + "x" + m1 + " por " + n2 + "x" + m2);
        Main.execute(MatrixFactory.create(false));
        System.out.println("Multiplicando matrizes nativas " + n1 + "x" + m1 + " por " + n2 + "x" + m2);
        Main.execute(MatrixFactory.create(true));
    }

}