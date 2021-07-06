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
public class TestBanco {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        cb.setDescricao(" Banco do Wesley");
        cb.diminui100Reais();
        System.out.println(cb);
        cb.soma100Reais();
        System.out.println(cb);
        cb.depositarDinheiro(1000);
        System.out.println(cb);
        cb.sacarDinheiro(500);
        System.out.println(cb);
        
        System.out.println(cb);
        
    }
}
