import authorization.Authorization;

import java.io.IOException;

public class BankApp {

    public static void main(String[] args) throws IOException {
        Authorization authorization = new Authorization();
        authorization.applicationLogin();
    }
}