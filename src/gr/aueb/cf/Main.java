package gr.aueb.cf;

import gr.aueb.cf.model.Account;
import gr.aueb.cf.model.OverdraftAccount;
import gr.aueb.cf.model.User;

public class Main {

    public static void main(String[] args) {
        User sp = new User("Sp.", "D.", "12345");
        Account account = new Account(sp, "GR12345", 1000);

        System.out.println("Account: \n" + account);

        Account overSp = new OverdraftAccount(sp, "GR23456", 500);
        System.out.println("Overdraft: \n" + overSp);

//        User anna = new User("Anna", "G.", "56789");
//        Account overJointAccount = new OverdraftJointAccount(sp, "GR256789", 200.50, anna);
    }
}
