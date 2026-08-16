public class ProductLocator {
    public static boolean search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            int current = matrix[row][column];
            System.out.println("checking " + current);

            if (current == target) {
                return true;
            }

            if (current > target) {
                column--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        int target = 15;
        boolean result = ProductLocator.search(matrix, target);

        if (result) {
            System.out.println("Target found: " + target);
        } else {
            System.out.println("Target not found: " + target);
        }
    }
}


