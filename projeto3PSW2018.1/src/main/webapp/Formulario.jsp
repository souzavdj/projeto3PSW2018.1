<%-- 
    Document   : Formulario
    Created on : 24/03/2018, 19:44:08
    Author     : vinicius
--%>

<%@page import="com.cefetrj.br.projeto3psw2018.model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <form action="ServletFormulario" method="POST">
            Nome:              <input type ="text" name="name" value="${param.name}">${requestScope.msgErrName}<br>
            Frequência:        <input type ="text" name="frequency" value="${param.frequency}">${requestScope.msgErrFrequency}<br>
            Prova 1:           <input type ="text" name="nota1" value="${param.nota1}">${requestScope.msgErrNota1}<br>
            Trabalho Final:    <input type ="text" name="finalWork" value="${param.finalWork}">${requestScope.msgErrFinalWork}<br>
            Trabalhos de Aula: <input type ="text" name="classProject" value="${param.classProject}">${requestScope.msgErrClassProject}<br>
            Prova Final:       <input type ="text" name="pF" value="${param.pF}">${requestScope.msgErrPF}<br>
            <button type="submit"> Enviar </button>
        </form>
    </body>
</html>
