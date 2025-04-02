package oop;

public class Account {
    int balance;

    public void desposit(int amount){
        balance+=amount;
    }
    
    public void withdraw(int amount){
        if (balance<amount){
            System.out.println("잔액 부족");
        } else balance-=amount;
    }
}
