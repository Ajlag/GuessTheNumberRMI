/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessthenumber.rmi.GuessTheNum_RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Ajla
 */
public class Server_RMI {
    
public static void main(String[] args){
try{
Registry reg = LocateRegistry.createRegistry(1098);
GuessTheNum_Interface_Impl num = new GuessTheNum_Interface_Impl() {};
reg.rebind("NumSurvices", num);
}
catch(Exception e){
System.out.println(e);
}
}
}
