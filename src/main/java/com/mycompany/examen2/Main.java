/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen2;

/**
 *
 * @author Fabricio Laureano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
            static conexionDB connMongo;
;

    public static void main(String[] args) {
        // TODO code application logic here
        connMongo = new conexionDB();
        connMongo.setBD();
        
        Maquinaria formMaquinaria = new Maquinaria();
        formMaquinaria.setVisible(true);

    }
    
}
