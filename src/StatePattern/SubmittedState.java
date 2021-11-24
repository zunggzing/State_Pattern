package StatePattern;

public class SubmittedState implements State {
    @Override
    public void handleRequest() {
        System.out.println("SubmittedState");
    }
}
