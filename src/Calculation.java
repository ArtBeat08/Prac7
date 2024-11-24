public class Calculation
{
    public static void main(String[] args) {
        int[][] jaggedArray = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        System.out.println("Піраміда у звичайному порядку:");
        for (int[] row : jaggedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\nПіраміда у зворотному порядку:");
        for (int i = jaggedArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
