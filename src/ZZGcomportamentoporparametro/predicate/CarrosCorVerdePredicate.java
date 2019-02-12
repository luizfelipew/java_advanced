package ZZGcomportamentoporparametro.predicate;

import ZZGcomportamentoporparametro.classes.Carro;
import ZZGcomportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
