package main.java.br.com.domain.entity;

import java.util.Date;

public class Pessoa() {

    private String Nomecompleto;
      private Date Datadenascimento;
      private Integer CpfCnpj;
      private Integer Ctps;

    /**
     * @construtores: completion, datadenascimento, cpfCnpj, ctps
     */
    public Pessoa(String nomecompleto, Date datadenascimento, Integer cpfCnpj, Integer ctps) {
        Nomecompleto = nomecompleto;
        Datadenascimento = datadenascimento;
        CpfCnpj = cpfCnpj;
        Ctps = ctps;
    }

    /**
     * @Getters: nomecompleto, datadenascimento, cpfCnpj, ctps
     */
    public String getNomecompleto() {
        return Nomecompleto;
    }

    public Date getDatadenascimento() {
        return Datadenascimento;
    }

    public Integer getCpfCnpj() {
        return CpfCnpj;
    }

    public Integer getCtps() {
        return Ctps;
    }

    /**
     * @setters: nomecompleto, datadenascimento, cpfCnpj, ctps
     */
    public void setNomecompleto(String nomecompleto) {
        Nomecompleto = nomecompleto;
    }

    public void setDatadenascimento(Date datadenascimento) {
        Datadenascimento = datadenascimento;
    }

    public void setCpfCnpj(Integer cpfCnpj) {
        CpfCnpj = cpfCnpj;
    }

    public void setCtps(Integer ctps) {
        Ctps = ctps;
    }
}