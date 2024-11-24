import java.util.Scanner;

public class Calculation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[][] matrix = new int[size][size];

        System.out.println("Введіть елементи матриці 5x5:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ваша матриця:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int determinant = calculateDeterminant(matrix);
        System.out.println("\nВизначник матриці: " + determinant);
    }

    private static int calculateDeterminant(int[][] matrix) {
        return 0;
    }
}

