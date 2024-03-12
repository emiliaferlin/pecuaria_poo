/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.test;

import br.edu.ifsul.cc.lpoo.projetopecuaria.modelo.Raca;
import br.edu.ifsul.cc.lpoo.projetopecuaria.modelo.dao.PersistenciaJPA;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author Mili
 */
public class TestPersistenciaJPA {
    
    /** @Test
    public void testConexaoJPA(){
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    };**/
    
    /**@Test
    public void testRegistroRaca() throws Exception{
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){

            Raca r = new Raca();
            r.setNome("Calabreso");
            jpa.persist(r);
            System.out.println("Incluiu o raca: "+ r.getId());

            System.out.println("conectou no BD via jpa ...");
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }**/
        
    @Test
    public void testAlteraRegistroJPA() throws Exception{
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
            Raca r =  (Raca)jpa.find(Raca.class, Integer.valueOf(2));
            if(r!=null){
                 r.setNome("Amarelo");
                 jpa.persist(r);
           // jpa.remover(r);
            }else{
                System.out.println("Não encontrou");
            }
            
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
        
    }
        
        
    @Test
    public void testExcluirRaca() throws Exception{
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
         if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
            Raca r =  (Raca)jpa.find(Raca.class, Integer.valueOf(3));
            if(r!=null){
                jpa.remover(r);
            }else{
                System.out.println("Não encontrou");
            }
            
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    }
    
}
    
    

