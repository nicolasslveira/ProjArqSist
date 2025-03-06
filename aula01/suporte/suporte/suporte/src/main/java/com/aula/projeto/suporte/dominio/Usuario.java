package com.aula.projeto.suporte.dominio;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Usuario extends Pessoa{
    @OneToMany(mappedBy = "usuario_id")
    private List<Chamados> chamados=new ArrayList<>();
}
