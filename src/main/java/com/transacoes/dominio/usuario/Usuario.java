package com.transacoes.dominio.usuario;

import java.math.BigDecimal;

import com.transacoes.Enums.TipoUsuario;

import static com.transacoes.utils.Constantes.PARAMETRO_OBRIGATORIO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

/* 
 * Entidade que represenda um usuário do sistema, seja cliente ou lojista. 
 */
@Entity(name = "users")
@Table(name = "users")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = PARAMETRO_OBRIGATORIO + "nome")
    private String nome;
    @NotBlank(message = PARAMETRO_OBRIGATORIO + "documento")
    @Column(unique = true)
    private String documento;
    @NotBlank(message = PARAMETRO_OBRIGATORIO + "email")
    @Column(unique = true)
    private String email;
    @NotBlank(message = PARAMETRO_OBRIGATORIO + "email")
    private String senha;
    private BigDecimal saldo;
    @NotBlank(message = PARAMETRO_OBRIGATORIO + "tipoUsuario")
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;
    
    public Usuario(Long id, String nome, String documento, String email, String senha, BigDecimal saldo,
            TipoUsuario tipoUsuario) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
        this.tipoUsuario = tipoUsuario;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
