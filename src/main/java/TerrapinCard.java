public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balanceAtStart) {
    balance = balanceAtStart;
  }

  public double getBalance() {
    return balance;
  }

  public void payEconomical() {
    if(balance >= 2.50) {
      balance -= 2.50;
    }
  }

  public void payGourmet() {
    if(balance >= 4.00) {
      balance -= 4.00;
    }
  }

  public void loadMoney(double amount) {
    if(amount >= 0) {
      balance += amount;
    }

    if(balance > 150.0) {
      balance = 150.0;
    }
  }

  public String toString() {
    return "The card has " + balance + " dollars";
  }
}

