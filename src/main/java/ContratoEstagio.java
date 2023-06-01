public class ContratoEstagio extends Contrato {

    public float verificarSalario() {

        float total = this.getSalario() / 2;
        return total;

    }

}
