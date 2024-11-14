/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulador;

/**
 *
 * @author Aluno
 */
public class Violao implements Instrumentos{
    @Override
    public void tocar(){
        System.out.println( "Tocando violao");
    }
    
    @Override
    public void afinar(){
      System.out.println( "Afinando violao");
   
    }
}


