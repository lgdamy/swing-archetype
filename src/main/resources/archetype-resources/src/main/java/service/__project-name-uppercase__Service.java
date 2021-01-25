#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.pojo.${project-name-uppercase}Pojo;

/**
 * @author lgdamy on 25/01/2021
 */
public class ${project-name-uppercase}Service {
    private static ${project-name-uppercase}Service INSTANCE;

    private ${project-name-uppercase}Service() {}

    public static ${project-name-uppercase}Service getInstance() {
        return INSTANCE = INSTANCE == null ? new ${project-name-uppercase}Service() : INSTANCE;
    }

    public ${project-name-uppercase}Pojo gerarNumeroAleatorio() {
        return new ${project-name-uppercase}Pojo((int)(Math.random() * 1000));
    }
}
