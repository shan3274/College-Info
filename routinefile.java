import java.io.File;
import java.awt.Desktop;
public class routinefile {
    routinefile(){
        try {

            File pdfFile = new File("pdf//TT-3A.pdf");
            if (pdfFile.exists()) {
    
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }
            } else {
                System.out.println("File is not exists!");
            }
    
            System.out.println("Done");
    
          } catch (Exception ex) {
            ex.printStackTrace();
          }
    }
    public static void main(String[] args) {
        new routinefile();
    }
}
