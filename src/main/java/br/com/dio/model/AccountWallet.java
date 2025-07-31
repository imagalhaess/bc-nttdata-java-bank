package br.com.dio.model;

import lombok.Getter;
import java.util.List;
import static br.com.dio.model.BankService.ACCOUNT;

@Getter
public class AccountWallet extends Wallet {

    private final List<String> pix;

    // Construtor básico: apenas define os pix
    public AccountWallet(final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
    }

    // Construtor que também adiciona o valor inicial na criação da conta
    public AccountWallet(final long amount, final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
        addMoney(amount, "valor de criação da conta");
    }

    // Metodo para adicionar dinheiro com uma descrição
    public void addMoney(final long amount, final String description) {
        var money = generateMoney(amount, description);
        this.getMoney().addAll(money);
    }

    // toString para exibir os dados da conta
    @Override
    public String toString() {
        return super.toString() + ", pix = " + pix;
    }
}
