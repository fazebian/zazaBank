package xyz.sahia.zazaBank;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CompteTransactionTest {
    @Test
    void newCompteShouldHaveZeroTransactions() {
        var compte = new Compte();
        assertThat(compte.transactions()).isEmpty();
    }
}
