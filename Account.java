/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author Hamza Hashmi
 */
public class Account {
private String accName;
private int accNum;
private double currentBal;
    
public Account(String name, int number, double initialBalance)
    {
        accName = name;
        accNum = number;
        currentBal = initialBalance;
    }

    public String getName()
    {
         return accName;
    }

    public int getNumber()
    {
        return accNum;
    }

    public double getBalance()
    {
        return currentBal;
    }

    public boolean withdraw(double withAmount)
    {
        if(withAmount > currentBal || withAmount < 0)
            return false;
        else
        {
            currentBal = getBalance() - withAmount;
            return true;
        }
    }

    public boolean deposit(double depAmount)
    {
        if(depAmount <= 0)
            return false;
        else
        {
            currentBal = getBalance() + depAmount;
            return true;
        }
    }

    @Override
    public String toString() 
    {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
        String.format("$%.2f", getBalance()) + ")";
    }
}
