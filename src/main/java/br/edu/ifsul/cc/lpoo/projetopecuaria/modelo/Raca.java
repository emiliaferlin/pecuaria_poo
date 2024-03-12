/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetopecuaria.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Mili
 */
@Entity //indica que a classe vai ser gerenciada pelo JPA
@Table(name = "tb_raca") // indica que vai ser criada a tabela
public class Raca implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_raca", sequenceName = "seq_raca_id", allocationSize = 1) // quando tem a necessidade e para deixar o banco de dados gerar o proximo valor
    @GeneratedValue(generator = "seq_raca", strategy = GenerationType.SEQUENCE)  
    
    @Column(nullable = false, length = 200) // false é obrigatorio
    
    private Integer id;
    private String nome;
    
    public Raca(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
