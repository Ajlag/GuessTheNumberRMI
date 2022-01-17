/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guessthenumber.rmi.GuessTheNum_RMI;

import java.rmi.Remote;

/**
 *
 * @author Ajla
 */
public interface GuessTheNumber_Interface extends Remote{

    /**
     *
     * @param a
     * @param choice
     * @return
     * @throws Exception
     */
    public  int randomNum(int choice) throws Exception;

   
}
