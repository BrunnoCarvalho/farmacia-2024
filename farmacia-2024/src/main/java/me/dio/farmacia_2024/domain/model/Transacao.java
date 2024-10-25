package me.dio.farmacia_2024.domain.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_transacoes")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantidade;
    private String tipoTransacao;

    private String codigoDeBarras;
    private String nomeProduto;
    
    private LocalDate dataMovimentacao;
    
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "farmaceutico_id")
    Farmaceutico farmaceutico;

    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }
    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getTipoTransacao() {
        return tipoTransacao;
    }
    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }
    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

}

