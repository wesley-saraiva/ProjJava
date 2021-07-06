/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principio.resposabilidade;

/**
 *
 * @author wesle
 */
public class ContaBancaria {

    private String descricao;
    private double saldo = 8000;

    public void soma100Reais() {
        saldo += 100;
    }

    public void diminui100Reais() {
        saldo -= 100;
    }

    public void sacarDinheiro(double sacar) {
        saldo -= sacar;

    }

    public void depositarDinheiro(double deposito) {
        saldo += deposito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "descricao=" + descricao + ", saldo=" + saldo + '}';
    }
    
}
