package com.aula.projeto.suporte.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Pessoa {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="nome")
    private String nome;
    @Column(name="endereco")
    private String endereco;
    @Column(name="email")
    private String email;
    @Column(name="telefone")
    private String telefone;
    @Column(name="cpf")
    private String cpf;
}
