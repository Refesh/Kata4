package Kata4_View;

import Kata4_Model.Histogram;
import java.util.List;
import kata4_Model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram<>();
        
        for (Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }
    
}
