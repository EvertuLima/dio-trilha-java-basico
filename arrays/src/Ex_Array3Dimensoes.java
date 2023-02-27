public class Ex_Array3Dimensoes {
    public static void main(String[] args) {

        //int[][][] matriz = new int[2][2][2];

        int[][][] matriz = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} }
          };
          System.out.println(matriz[0][1][0]);
        for (int[][] is : matriz) {
            for (int[] is2 : is) {
                for (int is3 : is2) {
                    System.out.print(is3+" ");
                }
                System.out.println();
            }
        }



        //int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        // for (int[] is : matriz) {
        //     for (int is2 : is) {
        //         System.out.print(is2+" ");
        //     }
        //     System.out.println();
        // }

    }
}
