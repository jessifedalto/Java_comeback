    package CadastroDeTarefas;
    import javax.swing.BoxLayout;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JOptionPane;
    import javax.swing.JPanel;
    import javax.swing.JPasswordField;
    import javax.swing.JScrollPane;
    import javax.swing.JTextArea;
    import javax.swing.JTextField;
    import java.awt.FlowLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;

    public class Main {

        public void registerTask(String task, String duration) {
            tasksArrayList.add(task);
            durationsArrayList.add(duration);
        }

        public ArrayList<String> getTaskArrayList() {
            return tasksArrayList;
        }

        public ArrayList<String> getDurationArrayList(){
            return durationsArrayList;
        }

        public static void main(String[] args) {
            ArrayList<String> tasksArrayList = new ArrayList<String>();
            ArrayList<String> durationsArrayList = new ArrayList<String>();
        
            JFrame frame = new JFrame("My Tasks");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JButton btRegister = new JButton("Adicionar tarefa");
            
            JPanel mainPanel = new JPanel();
            mainPanel.add(btRegister);

            mainPanel.setLayout(
                new BoxLayout(mainPanel, BoxLayout.Y_AXIS)
                );
        
            frame.add(mainPanel);
            frame.pack();
            
            frame.setVisible(true);

            btRegister.addActionListener(new ActionListener(){
                    
                @Override
                public void actionPerformed(ActionEvent e) {
                        
                    frame.setVisible(false);
                        
                    MainFrame mainFrame = new MainFrame(tasksArrayList, durationsArrayList);
                    
                    mainFrame.setVisible(true);

                    for (int i = 0; i < durationsArrayList.size(); i++) {
                        String task = tasksArrayList.get(i);
                        String duration = durationsArrayList.get(i);
                        JLabel lbTaskName = new JLabel(task);
                        JLabel lbDuration = new JLabel(duration);

                        mainPanel.add(lbTaskName);
                        mainPanel.add(lbDuration);
                    }
                    mainFrame.revalidate(); 
                    // mainFrame.repaint();

                    frame.setVisible(true);
                }
            });
                
            mainPanel.add(btRegister);
        }
    }