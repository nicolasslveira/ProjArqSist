package com.aula.projeto.suporte.dominio;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Chamado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAbertura=LocalDate.now();
    private String prioridade;
    private String status;
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
