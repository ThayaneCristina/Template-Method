public class ContratoPJ extends Contrato {

    public float verificarSalario() {

        float total = this.getSalario() * 2;
        return total;

    }

    @Override
    public String getTipo() {
        return "Contrato PJ";
    }

}
