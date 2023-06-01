import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContratoPJTest {

    @Test
    void deveRetornarInformacoes() {
        ContratoPJ contrato = new ContratoPJ();
        contrato.setNome("Mateus");
        contrato.setSalario(500.0f);

        assertEquals("Contrato PJ{nome=Mateus, salario=500.0, total=1000.0}", contrato.getInfo());
    }

}
