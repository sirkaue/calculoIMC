import javax.swing.JOptionPane;

public class Main {
  /* Calcule o IMC */
  public static void main(String[] args) {
    String pesoDigitado = JOptionPane.showInputDialog(null, "Digite seu peso em kg:");
    double peso = Double.parseDouble(pesoDigitado);
    String alturaDigitada = JOptionPane.showInputDialog(null, "Digite sua altura em metros:");
    double altura = Double.parseDouble(alturaDigitada);
    double imc = peso / (altura * altura);
    
    if (imc < 18.5) {
      JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
    } else if (imc < 24.9) {
      JOptionPane.showMessageDialog(null, "Você está com peso normal");
    } else if (imc < 29.9) {
      JOptionPane.showMessageDialog(null, "Você está sobrepeso");
    } else if (imc < 34.9) {
      JOptionPane.showMessageDialog(null, "Você está com obesidade leve");
    } else if (imc < 39.9) {
      JOptionPane.showMessageDialog(null, "Você está com obesidade moderada");
    } else if (imc > 39.9) {
      JOptionPane.showMessageDialog(null, "Você está com obesidade mórbida");
    }
    JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc));
  }
}