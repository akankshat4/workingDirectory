package classes;

public class ChildClassExtendingAbstractClass extends AbstractClassWithConstructor {
    public ChildClassExtendingAbstractClass(int a) {
        super();
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
