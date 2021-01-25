#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.ui.BaseWindow;
import ${package}.view.${project-name-uppercase}Panel;

/**
 * @author lgdamy@ on 22/01/2021
 */
public class App {

    public static void main(String[] args) {
        new BaseWindow(new ${project-name-uppercase}Panel(), 400,300);
    }
}
