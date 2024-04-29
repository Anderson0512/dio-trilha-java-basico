package dio.trilha.java.service;

import dio.trilha.java.exception.TerminalException;

import java.util.Locale;
import java.util.Scanner;

public class TerminalService {

  public TerminalService() {
  }

  public void initTerminal() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Integer account;
    String agency;
    String name;
    Double value;

    try {
      System.out.println("\n**************  SEJA BEM VINDO(A), ao terminal Bancário ****************\n");

      System.out.println("\nPor favor, digite o número da conta !\n");
      account = sc.nextInt();
      sc.nextLine();

      System.out.println("\nPor favor, digite o número da agência !\n");
      agency = sc.nextLine();

      System.out.println("\nPor favor, digite seu nome completo !\n");
      name = sc.nextLine().toUpperCase();

      System.out.println("\nPor favor, digite seu saldo inicial !\n");
      value = sc.nextDouble();
      sc.nextLine();

      System.out.println("\nOlá ".concat(name).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
              .concat(agency).concat(", conta ").concat(String.valueOf(account)).concat(" e seu saldo R$ ").concat(String.valueOf(value))
              .concat(" já está disponível para saque.\n"));

      System.out.println("Obrigado por utilizar nossos serviços!\n");

    } catch (TerminalException e) {
      System.out.println(e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Generic Error of input!");
    }
  }
}
