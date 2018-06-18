<%-- 
    Document   : Formulario
    Created on : 24/03/2018, 19:44:08
    Author     : vinicius
--%>

<%@taglib prefix="selects" uri="WEB-INF/selects.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css" >
        <title>Formulario</title>
    </head>
    <body>

        <form action="ServletFormulario" method="POST">
            <div class="form-group row">
                <label for="inputName" class="col-sm-2 col-form-label"> Nome: </label>
                <div class="col-sm-10">
                    <input type ="text" class="form-control col-3 ${requestScope.isValidityName}" id="inputName" name="name" placeholder="Entrar com o nome" value="${param.name}" required>
                    <div class="invalid-feedback">
                        ${requestScope.msgErrName}
                    </div>
                </div>
            </div>

            <div class="form-group row">
                <label for="inputDisciplina" class="col-sm-2 col-form-label"> Disciplina: </label>
                <div class="col-sm-10">
                    <selects:SistemaCombo disciplinaSelected="${param.disciplina}" isValidity="${requestScope.isValidityDisciplina}"/>
                    <div class="invalid-feedback">${requestScope.msgErrDisciplina}</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputFrequency" class="col-sm-2 col-form-label"> Frequência: </label>
                <div class="col-sm-10">
                    <input type ="text" class="form-control col-3 ${requestScope.isValidityFrequency}" id="inputFrequency" name="frequency" placeholder="Entrar com a Frequência" value="${param.frequency}" required>
                    <div class="invalid-feedback">
                        ${requestScope.msgErrFrequency}
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputNota1" class="col-sm-2 col-form-label"> Prova 1: </label>
                <div class="col-sm-10">
                    <input type ="text" class="form-control col-3 ${requestScope.isValidityNota1}" id="inputNota1" name="nota1" placeholder="Entrar com a Nota da Prova 1" value="${param.nota1}" required>
                    <div class="invalid-feedback">
                        ${requestScope.msgErrNota1}
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputFinalWork" class="col-sm-2 col-form-label"> Trabalho Final: </label>
                <div class="col-sm-10">
                    <input type ="text" class="form-control col-3 ${requestScope.isValidityFinalWork}" id="inputFinalWork" name="finalWork" placeholder="Entrar com a Nota do Trabalho Final" value="${param.finalWork}" required>
                    <div class="invalid-feedback">
                        ${requestScope.msgErrFinalWork}
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputClassProject" class="col-sm-2 col-form-label"> Trabalhos de Aula: </label>
                <div class="col-sm-10">
                    <input type ="text" class="form-control col-3 ${requestScope.isValidityClassProject}" id="inputClassProject" name="classProject" placeholder="Entrar com a Nota dos Trabalhos de Aula" value="${param.classProject}" required>
                    <div class="invalid-feedback">
                        ${requestScope.msgErrClassProject}
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPF" class="col-sm-2 col-form-label"> Prova Final: </label>
                <div class="col-sm-10">
                    <input type ="text" class="form-control col-3 ${requestScope.isValidityPF}" id="inputPF" name="pF" placeholder="Entrar com a Nota da Prova Final" value="${param.pF}" required>
                    <div class="invalid-feedback">
                        ${requestScope.msgErrPF}
                    </div>
                </div>
            </div>
            <button type="submit" class="btn btn-primary"> Enviar </button>
        </form>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js" ></script>
    </body>
</html>
