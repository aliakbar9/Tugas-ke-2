package OperasiMatriks;
import java.util.Scanner;

public class DiagonalMatriks {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan ukuran matriks (n * n) :");
    int n = sc.nextInt();

    int[][] matriks = new int[n][n];

    System.out.print("Masukkan elemen matriks :");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matriks[i][j] = sc.nextInt();
        }
    }

    System.out.print("Diagonal utama : ");
    for (int i = 0; i < n; i++) {
        System.out.print(matriks[i][i] + " ");
    }
    System.out.println();

    System.out.print("Diagonal sekunder : ");
    for (int i = 0; i < n; i++) {
        System.out.print(matriks[i][n - i - 1] + " ");
    }
    System.out.println();

    sc.close();
}
}
