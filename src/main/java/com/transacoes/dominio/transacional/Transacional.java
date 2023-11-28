package com.transacoes.dominio.transacional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.transacoes.dominio.usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transacional")
public class Transacional {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "remetente_id")
    private Usuario remetente;

    @ManyToOne
    @JoinColumn(name = "recebedor_id")
    private Usuario recebedor;

    @Column(name = "data_transacao")
    private LocalDateTime dataTransacao;

    public Transacional(Long id, BigDecimal valor, Usuario remetente, Usuario recebedor, LocalDateTime dataTransacao) {
        this.id = id;
        this.valor = valor;
        this.remetente = remetente;
        this.recebedor = recebedor;
        this.dataTransacao = dataTransacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public Usuario getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(Usuario recebedor) {
        this.recebedor = recebedor;
    }

    public LocalDateTime getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDateTime dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    
}
