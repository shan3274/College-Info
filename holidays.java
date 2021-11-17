import java.io.File;
import java.awt.Desktop;
public class holidays {
    holidays(){
        try {
            File file = new File("pdf//holidays.pdf");
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File not exist");
            }
        } catch (Exception e) {
            
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new holidays();
    }
}
