package ZZHlambdas.interfaces;


import ZZHlambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}
