<%-- 
    Document   : Historico
    Created on : 24/03/2018, 21:04:00
    Author     : vinicius
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.cefetrj.br.projeto3psw2018.model.Aluno"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Histórico</title>
    </head>
    <body>        
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
            <core:forEach items="${applicationScope.alunos}" var="aluno">
                <tr>
                    <td>${aluno.name}</td>
                    <td>${aluno.frequency}</td>
                    <td>${aluno.nota1}</td>
                    <td>${aluno.finalWork}</td>
                    <td>${aluno.classProject}</td>
                    <td>${aluno.pF}</td>
                    <td>${aluno.situation()}</td>
                </tr>
            </core:forEach>
        </table>
    </body>
</html>
