import javax.swing.JOptionPane;

public class JOptionTeste {
  public static void main(String[] args) {

    String frutas = JOptionPane.showInputDialog("Quantas frutas tem? ");
    String pessoas = JOptionPane.showInputDialog("Quantas pessoas tem? ");

    double numFrutas = Double.parseDouble(frutas);
    double numPessoas = Double.parseDouble(pessoas);

    int divisao = (int) (numFrutas / numPessoas);

    double resto = numFrutas % numPessoas;

    JOptionPane.showMessageDialog(null,
        "Cada pessoa vai receber " + divisao + " frutas e sobrará " + resto + " frutas.");

  }
}