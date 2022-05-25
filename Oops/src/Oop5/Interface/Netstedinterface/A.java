package Oop5.Interface.Netstedinterface;

import Oop5.Interface.Netstedinterface.A.Nestedinterface;

public class A {

    // lets create interface here known as nested interface
    public interface Nestedinterface {
        boolean isodd(int num);

    }
}

class B implements Nestedinterface {

    @Override
    public boolean isodd(int num) {
        // TODO Auto-generated method stub
        return (num & 1) == 1;
    }
}
