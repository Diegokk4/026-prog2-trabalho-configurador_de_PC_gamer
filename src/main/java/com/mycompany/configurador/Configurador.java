package com.mycompany.configurador;

import com.mycompany.configurador.view.Principal;
import com.formdev.flatlaf.FlatLightLaf;

public class Configurador {

    public static void main(String[] args) {
      
       //chama a biblioteca FlatLightLaf
        FlatLightLaf.setup();

        // Instancia e exibe a tela Principal
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
}