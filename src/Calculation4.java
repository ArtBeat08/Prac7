import java.util.Scanner;

public class Calculation4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір матриці: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];
        System.out.println("Введіть елементи матриці:");
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

        System.out.print("Введіть номер рядка для мінору (1-" + size + "): ");
        int rowToRemove = scanner.nextInt() - 1;
        System.out.print("Введіть номер стовпця для мінору (1-" + size + "): ");
        int colToRemove = scanner.nextInt() - 1;

        int[][] minor = getMinor(matrix, rowToRemove, colToRemove);
        System.out.println("Мінор матриці:");
        for (int[] row : minor) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMinor(int[][] matrix, int rowToRemove, int colToRemove) {
        int size = matrix.length;
        int[][] minor = new int[size - 1][size - 1];
        int minorRow = 0;

        for (int i = 0; i < size; i++) {
            if (i == rowToRemove) continue;
            int minorCol = 0;
            for (int j = 0; j < size; j++) {
                if (j == colToRemove) continue;
                minor[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }
}
