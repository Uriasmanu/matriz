import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Solicita a entrada dos valores e preenche a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String input = JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        // Exibe a matriz
        StringBuilder matrizStr = new StringBuilder("Matriz 5x5:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizStr.append(matriz[i][j]).append("\t");
            }
            matrizStr.append("\n");
        }
        JOptionPane.showMessageDialog(null, matrizStr.toString());

        // Calcula a soma dos elementos da matriz
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
        }

        JOptionPane.showMessageDialog(null, "A soma de todos os elementos da matriz é: " + soma);
    }
}
