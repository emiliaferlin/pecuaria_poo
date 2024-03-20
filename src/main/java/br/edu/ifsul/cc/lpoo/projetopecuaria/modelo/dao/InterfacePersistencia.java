/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetopecuaria.modelo.dao;

import br.edu.ifsul.cc.lpoo.projetopecuaria.modelo.Raca;
import java.util.Collection;

/**
 *
 * @author Mili
 */
public interface InterfacePersistencia {
    
    
    public Boolean conexaoAberta();
    public void fecharConexao();
    public Object find(Class c, Object id) throws Exception;
    public void persist(Object o) throws Exception;
    public void remover(Object o) throws Exception;
    public Collection<Raca> listRacas() throws Exception; // a gente precisa de metodos para poder chamar. serve para organizar funcionalidades
    
    
}
