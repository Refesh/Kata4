 
package Kata4_Controller;

import Kata4_Model.Histogram;
import Kata4_View.HistogramDisplay;
import Kata4_View.MailHistogramBuilder;
import Kata4_View.MailListReader;
import java.util.List;
import kata4_Model.Mail;

public class Main {

    
    public static void main(String[] args) {
        String fileName = "email.txt";
        /* I */List<Mail> mailList = MailListReader.read(fileName);
        /* P */Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        /* O */HistogramDisplay hist = new HistogramDisplay(histogram);
        hist.execute();
    }
    
}
