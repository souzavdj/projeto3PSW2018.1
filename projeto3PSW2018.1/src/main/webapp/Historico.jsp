<%-- 
    Document   : Historico
    Created on : 24/03/2018, 21:04:00
    Author     : vinicius
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.cefetrj.br.projeto3psw2018.model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Histórico</title>
    </head>
    <body>
    <%
        ArrayList<Aluno> alunos = (ArrayList<Aluno>) request.getServletContext().getAttribute("alunos");

    %>        
        <table border="1">
            <tr>
                <td>Nome</td>
                <td>Frequência</td>
                <td>Prova 1</td>
                <td>Trabalho Final</td>
                <td>Trabalhos de Aula</td>
                <td>Prova Final</td>
                <td>Situação</td>
            </tr>
    <%               
            for (int i = 0; i < alunos.size(); i++) {
    %>
                <tr>
                    <td><%= alunos.get(i).getName()%></td>
                    <td><%= alunos.get(i).getFrequency()%></td>
                    <td><%= alunos.get(i).getNota1()%></td>
                    <td><%= alunos.get(i).getFinalWork()%></td>
                    <td><%= alunos.get(i).getClassProject()%></td>
                    <td><%= alunos.get(i).getpF()%></td>
                    <td><%= alunos.get(i).situation()%></td>
                </tr>
    <%      }
    %>
        </table>
    </body>
</html>
