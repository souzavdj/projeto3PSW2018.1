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
            Nome:              <input type ="text" name="name" value="<%= request.getParameter("name") != null ? request.getParameter("name") : ""%>"><%= request.getAttribute("msgErrName") != null ? request.getAttribute("msgErrName") : "" %><br>
            Frequência:        <input type ="text" name="frequency" value="<%= request.getParameter("frequency") != null ? request.getParameter("frequency") : ""%>"><%= request.getAttribute("msgErrFrequency") != null ? request.getAttribute("msgErrFrequency") : "" %><br>
            Prova 1:           <input type ="text" name="nota1" value="<%= request.getParameter("nota1") != null ? request.getParameter("nota1") : ""%>"><%= request.getAttribute("msgErrNota1") != null ? request.getAttribute("msgErrNota1") : "" %><br>
            Trabalho Final:    <input type ="text" name="finalWork" value="<%= request.getParameter("finalWork") != null ? request.getParameter("finalWork") : ""%>"><%= request.getAttribute("msgErrFinalWork") != null ? request.getAttribute("msgErrFinalWork") : "" %><br>
            Trabalhos de Aula: <input type ="text" name="classProject" value="<%= request.getParameter("classProject") != null ? request.getParameter("classProject") : ""%>"><%= request.getAttribute("msgErrClassProject") != null ? request.getAttribute("msgErrClassProject") : "" %><br>
            Prova Final:       <input type ="text" name="pF" value="<%= request.getParameter("pF") != null ? request.getParameter("pF") : ""%>"><%= request.getAttribute("msgErrPF") != null ? request.getAttribute("msgErrPF") : "" %><br>
            <button type="submit"> Enviar </button>
        </form>
    </body>
</html>
