public abstract class Contrato {

    private String nome;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float verificarSalario();

    public String getTipo() {
        return "Contrato";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome=" + this.nome +
                ", salario=" + this.salario +
                ", total=" + this.verificarSalario() +
                '}';
    }

}
