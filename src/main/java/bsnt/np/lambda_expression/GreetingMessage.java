package bsnt.np.lambda_expression;

@FunctionalInterface
public interface GreetingMessage {
    // This is a functional interface and functional interface does not contain more than one method.
    public abstract void greet(String name);
}
