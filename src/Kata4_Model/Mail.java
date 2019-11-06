package kata4_Model;

public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getDomain(){
        return mail.substring(mail.indexOf("@") + 1);
    } 
    
    public static boolean isMail(String lineFile){
        return lineFile.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
            
            
}
