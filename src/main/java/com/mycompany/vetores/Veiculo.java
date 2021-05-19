/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Veiculo {

    String marca[] = new String[3];
    String modelo[] = new String[3];

    public void cadVeiculo() {
        String resultado = "";
        String respostaCodigo = "";
        int codigo = 0;

        for (int i = 0; i < marca.length; i++) {
            marca[i] = JOptionPane.showInputDialog("Digite a marca " + (i + 1));
            modelo[i] = JOptionPane.showInputDialog("Digite o modelo " + (i + 1));
            resultado += marca[i] + " - " + modelo[i] + "\n";
        }
             
        JOptionPane.showMessageDialog(null, resultado);
           
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));
        respostaCodigo = marca[codigo] + " - " + modelo[codigo];
         
        JOptionPane.showMessageDialog(null, respostaCodigo);
        


    }

    // Tentativa inicial.
    
//    public void getCodigo() {
//        String result = "";
//        int codigo = 0;
//        
//        
//        for (int i = 0; i < marca.length; i++) {
//            marca[i] = JOptionPane.showInputDialog("Digite a marca " + (i+1));
//            modelo[i] = JOptionPane.showInputDialog("Digite o modelo " + (i+1));
//            result = marca[i] + " - " + modelo[i];
//            
//        }
//        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));
//        result = marca[codigo] + " - " + modelo[codigo];
//        
//        JOptionPane.showMessageDialog(null, result);
//    }

}
