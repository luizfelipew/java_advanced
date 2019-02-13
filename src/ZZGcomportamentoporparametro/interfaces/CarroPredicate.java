package ZZGcomportamentoporparametro.interfaces;

import ZZGcomportamentoporparametro.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}
