#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.view;

import ${package}.pojo.${project-name-uppercase}Pojo;
import ${package}.service.${project-name-uppercase}Service;
import ${package}.ui.BaseWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author lgdamy on 25/01/2021
 */
public class ${project-name-uppercase}Panel implements BaseWindow.ContentForm {
    private JTextField numberField;
    private JButton gerarButton;
    private JPanel root;
    private JRadioButton imparRadio;
    private JRadioButton parRadio;
    private JRadioButton primeRadio;

    public ${project-name-uppercase}Panel() {
        gerarButton.addActionListener(this::gerar);
    }

    private void gerar(ActionEvent e) {
        ${project-name-uppercase}Pojo pojo = ${project-name-uppercase}Service.getInstance().gerarNumeroAleatorio();
        numberField.setText(pojo.getRandomNumber() + "");
        parRadio.setSelected(pojo.isEven());
        imparRadio.setSelected(pojo.isOdd());
        primeRadio.setSelected(pojo.isPrime());
    }

    @Override
    public JPanel root() {
        return this.root;
    }

//    Sobrescreva esse metodo apenas se sua janela vai mudar de titulo
//    @Override
//    public String title() {
//        return "Meu titulo especial";
//    }
}
