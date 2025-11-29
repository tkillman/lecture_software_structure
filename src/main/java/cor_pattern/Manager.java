package main.java.cor_pattern;

public class Manager extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("Manager")) {
            System.out.println("Manager handled the request.");
        } else {
            super.handleRequest(request);
        }
    }

}
