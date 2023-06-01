import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ContratoEstagioTest {

    @Test
    void deveRetornarInformacoes() {
        ContratoEstagio contrato = new ContratoEstagio();
        contrato.setNome("Mateus");
        contrato.setSalario(500.0f);

        assertEquals("Contrato{nome=Mateus, salario=500.0, total=250.0}", contrato.getInfo());
    }

}
