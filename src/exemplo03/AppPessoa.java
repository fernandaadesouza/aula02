package exemplo03;

import java.util.Dictionary;

public class AppPessoa {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Marcos Antonio");

        System.out.println(estudante.getNome());

        System.out.println(estudante);

        Pessoa p = new Estudante("Joao");

        System.out.println(p);

        Pessoa vetor[] = new Pessoa[10];

        vetor[0] = new Estudante("A");
        vetor[1] = new Diretor("D");
        vetor[2] = new Estudante("B");

        for (int i = 0; i < 3; i++) {
            System.out.println(vetor[i]);
        }
    }
}
