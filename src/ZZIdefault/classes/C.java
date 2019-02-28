package ZZIdefault.classes;

import ZZIdefault.interfaces.A;
import ZZIdefault.interfaces.B;

public class C implements A, B {
    public static void main(String[] args) {
        new C().oi();
    }

    public void oi(){
        A.super.oi();
    }
}
