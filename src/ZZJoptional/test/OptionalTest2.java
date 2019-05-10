package ZZJoptional.test;

import ZZJoptional.classes.Carro;
import ZZJoptional.classes.Pessoa;
import ZZJoptional.classes.Seguradora;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("Dev seguradora");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa pessoa = new Pessoa(carro, "Luiz");

        obterNomeSeguradora(Optional.ofNullable(pessoa));
    }

    public static String obterNomeSeguradora(Optional<Pessoa> pessoa) {

        return pessoa.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome).orElse("Não existe seguradora");
    }


}
