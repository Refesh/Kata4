package Kata4_View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4_Model.Mail;


public class MailListReader {

    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            IteratorReader it = new IteratorReader(reader);
            
            for(String line : it){
                if(Mail.isMail(line))
                    list.add(new Mail(line));
            }
            
        } catch(FileNotFoundException exception){
            System.out.println("ERROR MailListREader::read (File not Found) " +exception.getMessage());
        }
        return list;
    }
    
}

