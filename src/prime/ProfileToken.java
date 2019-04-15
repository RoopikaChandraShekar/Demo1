package prime;

public class ProfileToken {

  private String documentNumber;

  private String email;

  public String getDocumentNumber() {
      return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
      this.documentNumber = documentNumber;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public ProfileToken(String documentNumber, String email) {
      super();
      this.documentNumber = documentNumber;
      this.email = email;
  }

}
