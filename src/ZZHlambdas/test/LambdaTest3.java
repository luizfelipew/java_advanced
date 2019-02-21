package ZZHlambdas.test;

import ZZHlambdas.classes.Carro;
import ZZHlambdas.classes.ComparadorCarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

import static java.util.Arrays.asList;

public class LambdaTest3 {
    public static void main(String[] args) {
        foreach(asList("Luiz Felipe", "Torq", "facebook.com/devdojo"), System.out::println);
        List<Carro> carros = asList(new Carro("vermelho", 1999), new Carro("azul", 2005), new Carro("preto", 1985));
        //Reference to a static method
        Collections.sort(carros, ComparadorCarro::comparePorCor);
        System.out.println(carros);
        //Reference to an instance method of a particular object
//        ComparadorCarro comparadorCarro = new ComparadorCarro();
//        Collections.sort(carros, comparadorCarro::comparePorAno);

        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
        Collections.sort(carros, comparadorCarroSupplier.get()::comparePorAno);
        System.out.println(carros);

        //Reference to an instance method of a arbitrary object of a particular type
        List<String> nomes = asList("Luiz Felipe", "Torq", "Anna", "Breno");
//        nomes.sort((s1, s2) -> s1.compareTo(s2));
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInteger2 = Integer::parseInt;
        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(stringToInteger2.apply("10"));
        System.out.println(contains2.test(nomes, "Luiz Felipe"));

        // Reference to a constructor
        BiFunction<String, Integer, Carro> carroBiFunction = (s, i) -> new Carro(s, i);
        BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
        System.out.println(carroBiFunction2.apply("rosa", 1994));

    }


    public static <T> void foreach(List<T> list, Consumer<T> c){
        for (T e : list){
            c.accept(e);
        }
    }


    public static <T, R> List<R> map(List<T> list, Function<T, R> f){
        List<R> result = new ArrayList<>();

        for (T e : list){
            result.add(f.apply(e));
        }

        return result;
    }
}
