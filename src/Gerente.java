public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }


    public double calcularSalario() {
        return 1000 * 7;
    }

    public String descreverResponsabilidades() {
        return "Gerenciar a equipe";
    }

    @Override
    public String toString() {
        return "Gerente:  " + getNome() + "\nSalário: R$ " + calcularSalario() + "\nResponsabilidades: " + descreverResponsabilidades();
    }
}
