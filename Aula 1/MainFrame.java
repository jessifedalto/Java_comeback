import java.util.ArrayList;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    private ArrayList<String> tasks = new ArrayList<>();

    MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
