/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trycatch;

import java.util.Scanner;

/**
 *
 * @author devsys-b
 */
public class TesteErro {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int[] vetor = new int[4];
        boolean flag = true;
        
        do{
        try {

            System.out.println("Digite um valor: ");
            int num = t.nextInt();            
           
            System.out.println(vetor [num] );


        } catch (ArrayIndexOutOfBoundsException ex) {
        System.err.printf("Erro: %s",ex);
        System.out.println("Erro - valor da array inexistente!");
       
      
        }
        }while(flag);
 
    }

}
