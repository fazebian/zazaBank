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

    @Test
    public void depotCommandShouldAddAmountToCompte() {
        var depotCommand = new DepotCommand(10000);
        var compte = new Compte();
        var compteController = new CompteController(compte);

        compteController.depot(depotCommand);

        assertThat(compte.balance())
                .isEqualTo(10000);
    }
}