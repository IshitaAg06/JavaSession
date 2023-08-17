package org.example;

public class LoanAccountFactory  implements BankAccountFactory{
    // Concrete Factories

        @Override
        public BankAccount createAccount() {
            return new LoanAccount(0.10); // 10% interest rate for loans
        }
    }

