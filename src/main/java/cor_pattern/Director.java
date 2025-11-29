package main.java.cor_pattern;

public class Director extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("Director")) {
            System.out.println("Director handled the request.");
        } else {
            super.handleRequest(request);
        }
    }

}
