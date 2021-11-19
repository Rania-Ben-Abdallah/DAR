package tp2;

import java.util.Scanner;

public class ISIGame {
    
        public ISIException(String s) {
            super(s);
        }

        public ISIException() {

        }
    }


    public static void main(String[] args) {
        System.out.println("Enter a word");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line.toUpperCase();
        try
        {
            if(line.contains("ISI"))
            {
                throw new ISIException();
            }
            System.out.println("OK");
        }
        catch(ISIException ex)
        {
            System.out.println("Life is not isi");
        }

        // now you have to check if the word contains 'isi' or not
        // if not print 'ok'
        // if yes throw the exception 'ISIException'
        // and when you catch it print 'life is not isi'
    }
}
