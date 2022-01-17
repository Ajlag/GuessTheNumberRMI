/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessthenumber.rmi.GuessTheNum_RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

/**
 *
 * @author Ajla
 */
public abstract class GuessTheNum_Interface_Impl extends UnicastRemoteObject implements GuessTheNumber_Interface{

    public GuessTheNum_Interface_Impl() throws RemoteException {
   super();
    }

public  int randomNum(int choice) throws Exception {

Random randomNumberGenerator = new Random();
int result = 0;
switch(choice){
case 0:
   result=randomNumberGenerator.nextInt(2-1)+1;
   break;
case 1: 
   result=randomNumberGenerator.nextInt(5-1)+1;
   break;
case 2:
   result=randomNumberGenerator.nextInt(10-1)+1;
   break;
case 3:
   result=randomNumberGenerator.nextInt(100-1)+1;
   break;
case 4:
   result=randomNumberGenerator.nextInt(1000-1)+1;
   break;
case 5:
   result=randomNumberGenerator.nextInt(55-1)+1;
   break;
case 6:
   result=randomNumberGenerator.nextInt(41-1)+1;
   break;
default:
   System.out.println("Please Select Valid Number 1-3");
}
return result;

};
    

}
