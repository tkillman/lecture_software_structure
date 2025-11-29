package main.java.cor_pattern;

public class President extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("President")) {
            System.out.println("President handled the request.");
        } else {
            super.handleRequest(request);
        }
    }

}
