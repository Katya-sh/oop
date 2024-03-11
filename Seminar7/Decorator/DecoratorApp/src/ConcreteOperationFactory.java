

public class ConcreteOperationFactory implements OperationFactory {
    @Override
    public ComplexOperation createSumOperation() {
        return new SumOperation();
    }

    @Override
    public ComplexOperation createMultiplyOperation() {
        return new MultiplyOperation();
    }

    @Override
    public ComplexOperation createDivideOperation() {
        return new DivideOperation();
    }
}
