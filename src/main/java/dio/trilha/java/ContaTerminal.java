package dio.trilha.java;

import dio.trilha.java.service.TerminalService;

public class ContaTerminal {
  public static void main(String[] args) {

    TerminalService terminalService = new TerminalService();
    terminalService.initTerminal();
  }
}