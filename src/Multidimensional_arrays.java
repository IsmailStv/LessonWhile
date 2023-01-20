public class Multidimensional_arrays {
    public static void main(String[] args) {
//        int[] number = {1, 2, 3};
        int[][] matrics = {{1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrics[2][2]);
        System.out.println(matrics[1][1]);
        System.out.println(matrics[0][4]);

        String[][] strings = {{"q", "w", "e", "r", "t", "y"}, {"a", "s", "d", "f"}, {"z", "x", "c", "v"}};
        System.out.println(strings[1][2]);
        for(int i = 0; i < strings.length; i++){
            for(int j = 0; j < strings[i].length; j++){
                System.out.print(strings[i][j] + " ");
            }
            System.out.println();
        }
    }
}
