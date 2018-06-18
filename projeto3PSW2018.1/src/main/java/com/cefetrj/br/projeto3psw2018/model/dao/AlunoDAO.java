/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefetrj.br.projeto3psw2018.model.dao;

import com.cefetrj.br.projeto3psw2018.model.entity.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe dao para controle de acesso de alunos no banco de dados
 * @author vinicius
 */
public class AlunoDAO {
    
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.cefetrj.br.projeto3psw2018");
    private EntityManager manager = factory.createEntityManager();
    
    public void insert (Aluno aluno) {
        manager.getTransaction().begin();
        manager.persist(aluno);
        manager.getTransaction().commit();
        manager.close();
        factory.close();
    }
    public List<Aluno> buscarTodos () {
        manager.getTransaction().begin();
        //buscar uma lista de registros no banco, sem filtrar (todos)
        List<Aluno> lista = (List<Aluno>)manager.createQuery("select a from Aluno as a").getResultList();
        //for (Pessoa pessoa : lista) {
        //    System.out.println(pessoa.getNome());
        //}
        manager.getTransaction().commit();
        manager.close();
        factory.close();
        return lista;
    }
    
}
