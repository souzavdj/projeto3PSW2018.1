/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefetrj.br.projeto3psw2018.control;

import com.cefetrj.br.projeto3psw2018.model.dao.AlunoDAO;
import com.cefetrj.br.projeto3psw2018.model.entity.Aluno;
import java.util.List;

/**
 * 
 * @author vinicius
 */
public class AlunoController {
    
    public static void inserir(Aluno aluno) {
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.insert(aluno);
    }
    
    public static List<Aluno> buscarTodos () {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.buscarTodos();
    }
}
