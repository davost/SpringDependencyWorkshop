package se.lexicon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ScannerInputService implements UserInputService {

    private Scanner scanner;

   /* public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    */

    //Not sure I understand why this code is written like this
    @Autowired
        public ScannerInputService(Scanner scanner){this.scanner = scanner;}

    @Override
    public String getString() {
        return null;
    }

    @Override
    public int getInt() {
        return 0;
    }
}
