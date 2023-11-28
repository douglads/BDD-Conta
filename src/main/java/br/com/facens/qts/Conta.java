package br.com.facens.qts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * Classe que funciona como se fosse uma conta bancária
 * @author Douglas Machado
 * @version 0.1.0
 */
public class Conta {
    private int saldo;
    private boolean especial;

    /**
     * Seta usuário como especial e seu saldo
     * respectivo saldo.
     * @param saldo Valor do saldo da conta.
     */
    @Given("Um cliente especial com saldo de {int} reais")
    public void um_cliente_especial_com_saldo_de_reais(int saldo) {
        this.especial = true;
        this.saldo = saldo;
    }

    /**
     * Seta o valor do saldo subtraindo do saque.
     * @param saque Valor a ser sacado.
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(int saque) {
    	this.saldo -= saque;
    }

    /**
     * Faz o saque e altera o saldo
     * chamando a função for_solicitado_um_saque_no_valor_de_reais.
     * @param saque Valor da quantia desejada.
     */
    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int saque) {
    	int saldoAnterior =  this.saldo ;
    	for_solicitado_um_saque_no_valor_de_reais(saque);
        assert this.saldo == (saldoAnterior - saque);
    }

    /**
     * Descobre se o usuario é especial
     */
    @Then("check more outcomes")
    public void check_more_outcomes() {
        assert this.especial;
    }

    /**
     * Muda o usuario para padrão e altera o saldo
     * @param saldo Valor do saldo da conta.
     */
    @Given("Um cliente comum com saldo atual de {int} reais")
    public void um_cliente_comum_com_saldo_atual_de_reais(int saldo) {
        this.especial = false;
        this.saldo = saldo;
    }

    /**
     * Altera o saldo e chama a função caso não seja possivel sacar
     * @param saque Valor a ser sacado.
     */
    @When("solicitar um saque de {int} reais")
    public void solicitar_um_saque_de_reais(int saque) {
        if (this.especial || this.saldo >= saque) {
            this.saldo -= saque;
        } else {
        	não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_de_saldo_insuficiente();
        }
    }

    /**
     * Mostra a mensagem informando Saldo insuficiente
     * @see Conta#transacoes
     */
    @Then("não deve efetuar o saque e deve retornar a mensagem de Saldo Insuficiente")
    public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_de_saldo_insuficiente() {
        System.out.println("Saldo insuficiente");
    }

}
