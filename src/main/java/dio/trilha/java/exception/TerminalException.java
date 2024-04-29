package dio.trilha.java.exception;

import java.io.Serial;
import java.io.Serializable;

public class TerminalException extends RuntimeException implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  public TerminalException(String message) {
    super(message);
  }
}
