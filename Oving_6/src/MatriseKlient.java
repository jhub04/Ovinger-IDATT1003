public class MatriseKlient {
    public static void main(String[] args) {
        Matrise matrise1 = new Matrise(new int[][]{{3,1, -2},{-5,0, 1}});
        Matrise matrise2 = new Matrise(new int[][]{{4,1},{-2,0},{2, 7}});
        Matrise matrise3 = new Matrise(new int[][]{{1, 0, -3}, {9, 8, 1}});

        int[][] nyMatrise2 = matrise1.addert(matrise3);
        for (int i = 0; i < nyMatrise2.length; i++){
            for (int j = 0; j < nyMatrise2[0].length; j++){
                System.out.print(nyMatrise2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] nyMatrise1 = matrise1.multiplisert(matrise2);
        for (int i = 0; i < nyMatrise1.length; i++){
            for (int j = 0; j < nyMatrise1[0].length; j++){
                System.out.print(nyMatrise1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        int[][] nyMatrise3 = matrise2.transpose();
        for (int i = 0; i < nyMatrise3.length; i++){
            for (int j = 0; j < nyMatrise3[0].length; j++){
                System.out.print(nyMatrise3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
