
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        if (cashGiven >= 2.50) {
            cashInRegister += 2.50;
            economicalSold++;
            return cashGiven - 2.50;
        } else {
            return cashGiven;
        }      
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.00) {
            cashInRegister += 4.00;
            gourmetSold++;
            return cashGiven - 4.00;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard lyyracard) {
        // price of the economical lunch is 2.50 euros
        if (lyyracard.pay(2.50)) {
            economicalSold++;
            return true;
        } else {
            return false;
        }      
    }

    public boolean payGourmet(LyyraCard lyyracard) {
        if (lyyracard.pay(4.00)) {
            gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }        
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
