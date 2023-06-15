/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class UrnaEletronica {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // A urna eletronica apresenta tres possiveis candidatos
        // com um numero correspondendo a cada candidato.
        final int candidato1= 77123;// Pedro
        final int candidato2= 90321;// Maria
        final int candidato3= 12345;// Joao
        
        int votosCandidatos1=0;
        int votosCandidatos2=0;
        int votosCandidatos3=0;
        
        int voto=0;   
        
        do{  
            System.out.println("======ELEIÇOES 2023====== \nDigite o número de seu candidato: \n77123 - Pedro \n90321 - Maria\n12345 - Joao");
        // O programa apresenta um campo de entrada de dados para
        // que o usuario digite a escolha de seu candidato
            Scanner scanner = new Scanner(System.in);
        //Apos deve solicitar um novo voto
            voto=scanner.nextInt();
        
        
        // Ao digtar o numero escolhido, o programa irá somar um
        //voto para o candidato escolhido pelo usuario
        
        
            if(voto==77123){
                votosCandidatos1=votosCandidatos1+1;
                System.out.println("Voce votou em Pedro \nSeu voto foi computado com sucesso");      
            }else if(voto==90321){
                votosCandidatos2=votosCandidatos2+1; 
                System.out.println("Voce votou em Maria \nSeu voto foi computado com sucesso");
            }else if(voto==12345){
                votosCandidatos3=votosCandidatos3+1;
                System.out.println("Voce votou em Joao \nSeu voto foi computado com sucesso");
            }else{
                if(voto!=00000){
                System.out.println("Voce nao digitou um numero valido.");
                }
            }   
        }while(voto!=00000);  
        
        System.out.println("A votacao encerrou. \nVotos: \nPedro:"
                +votosCandidatos1+"\nMaria: "
                +votosCandidatos2+"\nJoao: "
                +votosCandidatos3);
        
        // O programa deve exibir ao usuario uma mensagem queo
        // voto foi computado com sucesso
         
         
        
        
        //quando o mesario digitar a sneha secreta o prgrama
        
        //ira parar de disponibilizar votos        
    }
}

