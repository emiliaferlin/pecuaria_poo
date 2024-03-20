/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.test;

import br.edu.ifsul.cc.lpoo.projetopecuaria.modelo.Raca;
import br.edu.ifsul.cc.lpoo.projetopecuaria.modelo.dao.PersistenciaJPA;
import java.util.Collection;
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
        
    //@Test
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
        
        
    //@Test
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
    
    @Test
    public void testListarRaca() throws Exception{
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            Collection<Raca> lista = jpa.listRacas();
            if(lista.isEmpty()){
            
                Raca r = new Raca();
                r.setNome("Massa");
                jpa.persist(r);
                System.out.println("Raca cadastrada: " + r.getId());
                r = new Raca();
                r.setNome("Alado");
                jpa.persist(r);
                System.out.println("Raca cadastrada: " + r.getId());
  
            }else{
                
                for(Raca raca : lista){
                    System.out.println("Racas no banco: " + raca.getNome());
                    System.out.println("Racas no banco: " + raca.getId());
                    
                    
                       
                raca.setNome("Amarelo");
                jpa.persist(raca);
                System.out.println("nome alterado: " + raca.getNome());
                jpa.remover(raca);//remove o registro a partir do objeto gerenciado (p).
                System.out.println("nome removido: " + raca.getId());
                    
                    
                }
                
                
               
                 
                    
                    
            }                                   
            
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    }
    
}
    
    

