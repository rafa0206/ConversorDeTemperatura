/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula13_bossini_usjt_ads1an_pla_conversor_tempetura;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author JFernandes
 */
public class ConversorDeTemperaturaTela {
    
    public static void criarTela (){
        JFrame tela = new JFrame ("Conversor de tempetura");
        JTextField celsiusTextField = new JTextField (10);
        JLabel celsiusLabel = new JLabel ("\u00B0C");
        JButton conversaoButton = new JButton ("Converter");
        JLabel valorConvertidoLabel = new JLabel ("");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2, 2));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(conversaoButton);
        painelDeConteudo.add(valorConvertidoLabel);
        conversaoButton.addActionListener((evento) -> {
            double celsius = Double.parseDouble(celsiusTextField.getText());
            double fahrenheit = celsius / 5 * 9 + 32;
            valorConvertidoLabel.setText(
                    String.format("%.2f\u00B0F", fahrenheit)
            );
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        
        /*conversaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double celsius = Double.parseDouble(celsiusTextField.getText());
            }
        });*/
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
    
}
