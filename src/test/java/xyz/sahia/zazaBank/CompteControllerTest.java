package xyz.sahia.zazaBank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompteControllerTest {

    @Test
    public void viewBalanceShouldDisplayBalanceDuCompteDonne() {

        var compte = new Compte();
        compte.depot(10);
        var compteController = new CompteController(compte);
        assertThat(compteController.viewBalance()).isEqualTo("10 ar");
    }
}