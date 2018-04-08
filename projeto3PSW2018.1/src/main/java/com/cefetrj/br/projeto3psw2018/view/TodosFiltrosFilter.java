/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefetrj.br.projeto3psw2018.view;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.apache.log4j.Logger;

/**
 * Classe que implementa todos os filtros do projeto.
 * @author vinicius
 * @version 1.0
 */
@WebFilter("/*")
public class TodosFiltrosFilter implements Filter {
    
    /**
     * O método doFilter é chamado pelo contêiner toda vez que um par de solicitação/resposta é passado pela cadeia devido a uma solicitação do cliente para um recurso no final da cadeia.
     * @param request O pedido de servlet que está sendo processado
     * @param response A resposta do servlet que está sendo criada
     * @param chain A cadeia de filtros que está sendo processada
     * @exception IOException se ocorrer um erro de entrada / saída
     * @exception ServletException se ocorrer um erro de servlet
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try{
            chain.doFilter(request, response);
        }catch(Exception e){
            Logger lg = Logger.getLogger(TodosFiltrosFilter.class);
            lg.info(e.getMessage()); //aqui tem que entrer o log, veja no código da primeira aula.
            request.getRequestDispatcher("/error.html").forward(request, response);
        }
    }

    /**
     * Método chamado pelo contêiner da web para indicar a um filtro que está sendo colocado em serviço.
     * @param filterConfig um objeto de configuração de filtro usado por um contêiner de servlet para passar informações para um filtro durante a inicialização
     * @throws ServletException define uma exceção geral que um servlet pode lançar quando encontra dificuldades
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    
    }
    
    /**
     * Método chamado pelo contêiner da web para indicar a um filtro que está sendo retirado de serviço.
     */
    @Override
    public void destroy() {
    
    }
    
}
