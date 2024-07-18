package javaapplication57;

public class JavaApplication57 {

    public static void main(String[] args) {
        int matriz[][] = {{5, 7, 9}, {4, 2, 1}, {1, 1, 1}};
        int matriz2[][] = new int[3][3];
        int fila = 2;
        int col = 2;

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz2[fila][col]= matriz[i][j];
                col --;
            }
            fila --;
            col = 2;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz2[i][j] + "|");
            }
            System.out.println("");
        }
       
    }

}
