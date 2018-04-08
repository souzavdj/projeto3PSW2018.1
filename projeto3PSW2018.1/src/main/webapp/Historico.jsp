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
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css" >
        <title>Histórico</title>
    </head>
    <body>        
        <table border="1" class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Disciplina</th>
                    <th scope="col">Frequência</th>
                    <th scope="col">Prova 1</th>
                    <th scope="col">Trabalho Final</th>
                    <th scope="col">Trabalhos de Aula</th>
                    <th scope="col">Prova Final</th>
                    <th scope="col">Situação</th>
                </tr>
            </thead>
            <tbody>
                <core:forEach items="${applicationScope.alunos}" var="aluno" varStatus="status">
                    <tr>
                        <th scope="row">${status.count}</th>
                        <td>${aluno.name}</td>
                        <td>${aluno.disciplina}</td>
                        <td>${aluno.frequency}</td>
                        <td>${aluno.nota1}</td>
                        <td>${aluno.finalWork}</td>
                        <td>${aluno.classProject}</td>
                        <td>${aluno.pF}</td>
                        <td>${aluno.situation()}</td>
                    </tr>
                </core:forEach>
            </tbody>
        </table>
        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js" ></script>
    </body>
</html>
