package com.company;

public class Program {
    public static void main(String[] args) {
        Person2 tom = new Person2("Tom", "2023");
        tom.displayPerson();
        tom.account.displayAccount();

        new Person2("Tom", "123") { // anonime class
            void displayPerson() {
                this.account.displayAccount();

            }

        };

    }
}
 class Person2 {
    public String name;
    Account account;
    Person2(String name, String password){
        this.name = name;
        account = new Account(password);
    }
    void displayPerson(){
        System.out.println(name + " " + account.password);
    }
    class Account{
        public String password;

        Account(String pass){
            this.password = pass;
        }
        void displayAccount(){
            System.out.println(Person2.this.name + " " + password);
        }
    }
 }