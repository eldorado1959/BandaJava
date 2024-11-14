/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulador;

/**
 *
 * @author Aluno
 */
public class Piano implements Instrumentos{
    @Override
    public void tocar(){
        System.out.println( "Tocando piano");
    }
    
    @Override
    public void afinar(){
      System.out.println( "Afinando piano");
   
    }
}



