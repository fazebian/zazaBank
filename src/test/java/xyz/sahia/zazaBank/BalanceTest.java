package xyz.sahia.zazaBank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BalanceTest {
    @Test

    public void uneNewCompteShouldHaveZeroBalance() {

        var compte = new Compte();

        assertThat(compte.balance()).isZero();
    }
}
