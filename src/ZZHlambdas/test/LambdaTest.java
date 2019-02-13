package ZZHlambdas.test;

import ZZHlambdas.classes.Carro;
import ZZHlambdas.interfaces.CarroPredicate;

import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };

        Predicate<Carro> carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
        System.out.println(carroPredicate.test(new Carro("verde", 2011)));
        System.out.println(carroPredicate2.test(new Carro("verde", 2011)));

        Runnable runnable = () -> System.out.println("Dentro do run");
//        runnable.run();
        new Thread(runnable).start();
    }
}
