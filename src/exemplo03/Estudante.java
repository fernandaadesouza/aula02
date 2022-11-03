package exemplo03;

public class Estudante extends Pessoa {

    public Estudante(String nome) {
        super(nome); // super = Pessoa(), referencia ao construtor da classe pai
    }

    @Override
    public String toString() {
        return "Estudante: " + super.toString();
    }
}
