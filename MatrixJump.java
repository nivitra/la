public class MatrixJump {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20}, {30, 6745}, {40, 25}};
        outer: for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 50) {
                    System.out.println("Found number > 50: " + matrix[i][j]);
                    break outer;
                }
            }
        }
    }
}