/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_melvinrivas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author l3306
 */
public class Mynecraft {

    int diamante = 0, palo = 0, hierro = 0;
    ArrayList<Pico> picos = new ArrayList();
    ArrayList<String> bloques = new ArrayList();

    public void play() {

        Scanner input = new Scanner(System.in);
        int opplay = 1;
        while (opplay != 0) {
            
        
        System.out.println("0. Salir ");
        System.out.println("1. Agregar lingote de hierro");
        System.out.println("2. Agregar diamante");
        System.out.println("3. Agregar palo");
        System.out.println("4. Agregar un pico de hierro");
        System.out.println("5. Agregar un pico de diamante");
        System.out.println("6. Mejorar un pico de hierro");
        System.out.println("7. Listar picos");
        System.out.println("8. Agregar bloque");
        System.out.println("9. Romper bloque");
        System.out.println("10. Listar bloque");
        System.out.print("Que desea hacer: ");
        opplay = input.nextInt();

        switch (opplay) {
            case 1: {
                hierro++;
                System.out.println("Tienes " + hierro + " de hierro");
                break;
            }
            case 2: {
                diamante++;
                System.out.println("Tienes " + diamante + " de diamantes");
                break;
            }
            case 3: {
                palo++;
                System.out.println("Tienes " + palo + " de palo");
                break;
            }
            case 4: {
                if (hierro < 3) {
                    System.out.println("Insuficiente cantidad de Hierro: " + hierro);
                }
                if (palo < 2) {
                    System.out.println("Insuficientes cantidad de palos: " + palo);
                }
                if (palo >= 2 && hierro >= 3) {
                    Pico pico = new Pico("hierro");
                    picos.add(pico);
                    palo = palo - 2;
                    hierro = hierro - 3;
                    System.out.println("***Disfruta tu nuevo pico de hierro***");
                }
                break;
            }
            case 5: {
                
                if (diamante < 3) {
                    System.out.println("Insuficiente cantidad de Hierro: " + diamante);
                }
                if (palo < 2) {
                    System.out.println("Insuficientes cantidad de palos: " + palo);
                }
                if (palo >= 2 && diamante >= 3) {
                    Pico pico = new Pico("diamante");
                    picos.add(pico);
                    palo = palo - 2;
                    diamante = diamante - 3;
                    System.out.println("***Disfruta tu nuevo pico de hierro***");
                }
                break;
            }
            case 6: {
                int cont=0;
                if(diamante==3){
                for (int i = 0; i < picos.size(); i++) {
                    String mat = picos.get(i).getMaterial();
                    if (mat.equals("hierro")) {
                        picos.get(i).setMaterial("diamante");
                        System.out.println("***Su pico ah sido mejorado***");
                        cont++;
                        break;
                    }
                }
                }else{
                    System.out.println("Insuficiente cantidad de diamantes: "+diamante);
                }
                if (cont==0) {
                    System.out.println("No hay picos que mejorar");
                }
                
                break;
            }
            case 7: {
                int conhierro=0,condiamante=0;
                int vida = 14;
                //Pico pico = new Pico (vida);
                 for (int i = 0; i < picos.size(); i++) {
                    //String mat = picos.get(i).getMaterial().equals("hie");
                     System.out.println(i+". "+picos.get(i).toString());
                 }
             break;    
            }
            case 8: {
                System.out.println("1. Agregar bloque de obsidiana");
                System.out.println("2 Agregar bloque de oro");
                System.out.println("3. Agregar bloque de carbon");
                System.out.print("Que bloque desea agregar: ");
                int  opbloque = input.nextInt();
                switch (opbloque) {
                    case 1: {
                        bloques.add("bloque de obsidiana");
                        System.out.println("**Se agrego un bloque de obsidiana***");
                        break;
                    }
                    case 2: {
                        bloques.add("bloque de oro");
                        System.out.println("***Se agrego un bloque de obsidiana***");
                        break;
                    }
                    case 3: {
                        bloques.add("bloque de carbon");
                        System.out.println("***Se agrego un bloque de obsidiana***");
                        break;
                    }
                    
                }
                break;
            }
            case 9: {
                  for (int i = 0; i < bloques.size(); i++) {
                  String bloque = bloques.get(i);
                  System.out.println(i+". "+bloque);
                }
                 System.out.print("Que bloques deseas picar: ");
                 int  blopicar= input.nextInt();
                for (int i = 0; i < picos.size(); i++) {
                    //String mat = picos.get(i).getMaterial().equals("hie");
                     System.out.println(i+". "+picos.get(i).toString());
                }
                System.out.print("Que pico deseas usar: ");
                int  picousar = input.nextInt();
                bloques.remove(blopicar);
                System.out.println("El bloque ha sido picado");    
                
                break;
            }
            
            case 10: {
                for (int i = 0; i < bloques.size(); i++) {
                  String bloque = bloques.get(i);
                          System.out.println(i+". "+bloque);
                }
                break;
            }
            default: {
                System.out.println("Caracter Invalido");
                break;
            }
        }
            System.out.println("");
        }
    }
}
