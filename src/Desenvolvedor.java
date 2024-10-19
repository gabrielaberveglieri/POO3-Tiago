public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome) {
        super(nome);
    }

    public double calcularSalario() {
        return 1000 * 3;

    }

    public String descreverResponsabilidades() {
        return "Resolver problema dos outros";

    }

    @Override
    public String toString() {
        return "Desenvolvedor:  " + getNome() + "\nSalário: R$ " + calcularSalario() + "\nResponsabilidades: " + descreverResponsabilidades();
    }
}
