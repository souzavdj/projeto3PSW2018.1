/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefetrj.br.projeto3psw2018.view;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Classe Tab para os campos de seleção do projeto.
 * @author vinicius
 * @version 1.0
 */
public class SistemaCombo extends SimpleTagSupport{
    
    /**
     * Atributo disciplinaSelected é responsável por armazenar a disciplina que foi selecionada no campo de seleção.
     */
    private String disciplinaSelected;
    
    /**
     * Atributo isValidity é responsável por armazenar se o campo de seleção está valido ou não.
     */
    private String isValidity;
    
    /**
     * Método que retorna o valor do campo de seleção.
     * @return o atributo {@link #disciplinaSelected}
     */
    public String getDisciplinaSelected() {
        return disciplinaSelected;
    }
    
    /**
     * Método para atribuir valor ao atributo disciplinaSelected.
     * @param disciplinaSelected  variável com a disciplina selecionada a ser inserido no atributo {@link #disciplinaSelected}
     */
    public void setDisciplinaSelected(String disciplinaSelected) {
        this.disciplinaSelected = disciplinaSelected;
    }
    
    /**
     * Método que retorna a validade (Valido ou não) do campo de seleção.
     * @return o atributo {@link #isValidity}
     */
    public String getIsValidity() {
        return isValidity;
    }
    
    /**
     * Método para atribuir valor ao atributo isValidity.
     * @param isValidity variável com a validade do campo de seleção a ser inserido no atributo {@link #isValidity}
     */
    public void setIsValidity(String isValidity) {
        this.isValidity = isValidity;
    }
    
    /**
     * Método que executa a tab.
     * @throws JspException as subclasses podem lançar JspException para indicar que ocorreu um erro ao processar essa tag
     * @throws IOException Subclasses podem lançar IOException se houver um erro ao gravar no fluxo de saída
     */
    @Override
    public void doTag() throws JspException, IOException {
        String selectHtml = 
        "<select name='disciplina' class='custom-select col-3 "+ this.isValidity + "' id='inputDisciplina'>" +
        "    <option value=''>Escolher a Disciplina</option>" +
        "    <option value='Programação de Software para WEB' " + ("Programação de Software para WEB".equals(disciplinaSelected) ? "selected": "") +  " >Programação de Software para WEB</option>" +
        "    <option value='Banco de Dados' " + ("Banco de Dados".equals(disciplinaSelected)  ? "selected": "") + " >Banco de Dados</option>" +
        "    <option value='Programação Orientada a Objetos' " + ("Programação Orientada a Objetos".equals(disciplinaSelected) ? "selected": "") +  " >Programação Orientada a Objetos</option>" +
        "</select>";
        getJspContext().getOut().print(selectHtml);
    }
    
}
