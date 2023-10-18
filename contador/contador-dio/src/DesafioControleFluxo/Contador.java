package DesafioControleFluxo;

public class Contador {
  public static void main(String[] args) {
    try {
      if (args.length < 2) {
        throw new IllegalArgumentException("É necessário fornecer dois parâmetros inteiros.");
      }

      int primeiroParametro = Integer.parseInt(args[0]);
      int segundoParametro = Integer.parseInt(args[1]);

      if (primeiroParametro >= segundoParametro) {
        throw new Exception("O segundo parâmetro deve ser maior que o primeiro.");
      }

      imprimirNumeros(primeiroParametro, segundoParametro);
    } catch (NumberFormatException e) {
      System.err.println("Erro: Os parâmetros fornecidos devem ser números inteiros.");
    } catch (Exception e) {
      System.err.println("Erro: " + e.getMessage());
    }
  }

  static void imprimirNumeros(int inicio, int fim) {
    System.out.println("Imprimindo números de " + inicio + " a " + fim + ":");
    for (int i = inicio; i <= fim; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}
