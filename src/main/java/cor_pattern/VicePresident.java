package main.java.cor_pattern;

public class VicePresident extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("VicePresident")) {
            System.out.println("Vice President handled the request.");
        } else {
            super.handleRequest(request);
        }
    }

}
