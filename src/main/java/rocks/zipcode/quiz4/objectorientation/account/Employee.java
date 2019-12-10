package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    BankAccount compositeBankAccount;
    Double hoursWorked = 0.0;
    Double hourlyWage = 35.0;

    public Employee() {
        compositeBankAccount = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        this.compositeBankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return this.compositeBankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.compositeBankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.compositeBankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.compositeBankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.compositeBankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage * hoursWorked;
    }
}
