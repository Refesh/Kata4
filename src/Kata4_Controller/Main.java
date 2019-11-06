 
package Kata4_Controller;

import Kata4_Model.*;
import Kata4_View.*;
import java.util.List;

public class Main {

    
    public static void main(String[] args) {
        String fileName = new String("email.txt");
         List<Mail> mailList = MailListReader.read(fileName);
         Histogram<String> histogram = MailHistogramBuilder.build(mailList);
         HistogramDisplay hist = new HistogramDisplay(histogram);
        hist.execute();
    }
    
}
