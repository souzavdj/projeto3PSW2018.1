/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefetrj.br.projeto3psw2018.view;

import com.cefetrj.br.projeto3psw2018.model.Aluno;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *  Classe Servlet responsável referente ao JSP Formulario.
 * @author vinicius
 * @version 3.0
 */
@WebServlet("/ServletFormulario")
public class ServletFormulario extends HttpServlet {
    
    /**
     * Handles the HTTP <code>POST</code> method.
     * Método responsável por receber os dados do JSP Formulario, fazer a validação dos mesmo e envia-los para a JSP Historico.
     * @param request um objeto HttpServletRequest que contém a solicitação feita pelo cliente do servlet.
     * @param response um objeto HttpServletResponse que contém a resposta que o servlet envia para o cliente
     * @throws ServletException se o pedido do POST não puder ser tratado
     * @throws IOException se um erro de entrada ou saída for detectado quando o servlet manipula o pedido
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        boolean validity = true;
        String isValidity = "";
        String name = request.getParameter("name");
        String disciplina = request.getParameter("disciplina");
        double frequency=0;
        double nota1=0;
        double finalWork=0;
        double classProject=0;
        double pF=0;
        
        //Validação do campo Nome.
        if (name.isEmpty() || name.length() < 3) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityName", isValidity);
            String msgErrName = "O nome não pode ficar vazio e não pode ter menos de 3 caracteres.";
            Logger lg = Logger.getLogger(ServletFormulario.class);
            lg.info("Campo nome não preenchido!"); //aqui tem que entrer o log, veja no código da primeira aula.
            request.setAttribute("msgErrName", msgErrName);
        }else {
            isValidity = "is-valid";
            request.setAttribute("isValidityName", isValidity);
        }
        
        //Validação do campo Disciplina.
        if (disciplina.isEmpty() || disciplina == null || disciplina.equals("")) {
            isValidity = "is-invalid";
            request.setAttribute("isValidityDisciplina", isValidity);
            validity = false;
            String msgErrDisciplina = "A disciplina não pode ficar vazia.";
            request.setAttribute("msgErrDisciplina", msgErrDisciplina);
        }else {
            isValidity = "is-valid";
            request.setAttribute("isValidityDisciplina", isValidity);
        }
        
        //Validação do campo Frequência.
        try {
            frequency = Double.parseDouble(request.getParameter("frequency"));
            isValidity = "is-valid";
            request.setAttribute("isValidityFrequency", isValidity);
        }catch (NumberFormatException e) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityFrequency", isValidity);
            String msgErrFrequency = "Campo Numérico, digite somente numeros reais. ";
            request.setAttribute("msgErrFrequency", msgErrFrequency);
        }
        if (frequency > 100.0 || frequency < 0.0) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityFrequency", isValidity);
            String msgErrFrequency = "Frequência deve ser entre 100 e 0";
            request.setAttribute("msgErrFrequency", msgErrFrequency);
        }
        
        //Validação do campo Prova 1.
        try {
            nota1 = Double.parseDouble(request.getParameter("nota1"));
            isValidity = "is-valid";
            request.setAttribute("isValidityNota1", isValidity);
        }catch (NumberFormatException e) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityNota1", isValidity);
            String msgErrNota1 = "Campo Numérico, digite somente numeros reais.";
            request.setAttribute("msgErrNota1", msgErrNota1);
        }
        if (nota1 > 10.0 || nota1 < 0.0) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityNota1", isValidity);
            String msgErrNota1 = "A nota da prova 1 deve ser entre 10.0 e 0.0";
            request.setAttribute("msgErrNota1", msgErrNota1);
        }
        
        //Validação do campo Trabalho final.
        try {
            finalWork = Double.parseDouble(request.getParameter("finalWork"));
            isValidity = "is-valid";
            request.setAttribute("isValidityFinalWork", isValidity);
        }catch (NumberFormatException e) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityFinalWork", isValidity);
            String msgErrFinalWork = "Campo Numérico, digite somente numeros reais.";
            request.setAttribute("msgErrFinalWork", msgErrFinalWork);
        }
        if (finalWork > 10.0 || finalWork < 0.0) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityFinalWork", isValidity);
            String msgErrFinalWork = "A nota do trabalho final deve ser entre 10.0 e 0.0";
            request.setAttribute("msgErrFinalWork", msgErrFinalWork);
        }
        
        //Validação do campo Trabalhos de aula.
        try {
            classProject = Double.parseDouble(request.getParameter("classProject"));
            isValidity = "is-valid";
            request.setAttribute("isValidityClassProject", isValidity);
        }catch (NumberFormatException e) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityClassProject", isValidity);
            String msgErrClassProject = "Campo Numérico, digite somente numeros reais.";
            request.setAttribute("msgErrClassProject", msgErrClassProject);
        }
        if (classProject > 10.0 || classProject < 0.0) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityClassProject", isValidity);
            String msgErrClassProject = "A nota dos trabalhos de aula deve ser entre 10.0 e 0.0";
            request.setAttribute("msgErrClassProject", msgErrClassProject);
        }
        
        //Validação do campo Prova final.
        try {
            pF = Double.parseDouble(request.getParameter("pF"));
            isValidity = "is-valid";
            request.setAttribute("isValidityPF", isValidity);
        }catch (NumberFormatException e) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityPF", isValidity);
            String msgErrPFFormat = "Campo Numérico, digite somente numeros reais.";
            request.setAttribute("msgErrPF", msgErrPFFormat);
        }
        if (pF > 10.0 || pF < 0.0) {
            validity = false;
            isValidity = "is-invalid";
            request.setAttribute("isValidityPF", isValidity);
            String msgErrPFInterval = "A nota da prova final deve ser entre 10.0 e 0.0";
            request.setAttribute("msgErrPF", msgErrPFInterval);
        }
        
        if (validity) {
            Aluno aluno = new Aluno(name, disciplina, frequency, nota1, finalWork, classProject, pF);
            ArrayList<Aluno> alunos = new ArrayList<Aluno> ();
            if (request.getServletContext().getAttribute("alunos")==null) {
                alunos.add(aluno);
                request.getServletContext().setAttribute("alunos", alunos);
            }else {
                alunos = (ArrayList<Aluno>) request.getServletContext().getAttribute("alunos");
                alunos.add(aluno);
                request.getServletContext().setAttribute("alunos", alunos);
            }
            request.getRequestDispatcher("Historico.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("Formulario.jsp").forward(request, response);
        }
    }

}
