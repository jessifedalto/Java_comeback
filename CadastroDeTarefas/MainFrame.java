package CadastroDeTarefas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private ArrayList<String> tasksArrayList;
    private ArrayList<String> durationsArrayList;

    private JPanel mainPanel;
    
    public MainFrame(ArrayList taskArrayList, ArrayList durationArrayList) {

        this.tasksArrayList = tasksArrayList != null ? tasksArrayList : new ArrayList<>();
        this.durationsArrayList = durationsArrayList != null ? durationsArrayList : new ArrayList<>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        JLabel lbTaskName = new JLabel("Nome da tarefa:");
        JTextField tfTaskName = new JTextField(20);
        
        JLabel lbDuration = new JLabel("Tempo de duração:");
        JTextField tfDuration = new JTextField(20);
        
        JButton btRegister = new JButton("Cadastrar Tarefa");
        
        btRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfTaskName.getText().isEmpty() || tfDuration.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Erro, você não preencheu todos os campos!");
                    return;
                }

                String task = tfTaskName.getText();
                String duration = tfDuration.getText();
                
                registerTask(task, duration, taskArrayList, durationArrayList);
                System.out.println(taskArrayList);
                System.out.println(durationArrayList);

                tfTaskName.setText("");
                tfDuration.setText("");
                
                JOptionPane.showMessageDialog(null, "Tarefa Registrada!!");
                
                updateTasksDisplay();

                setVisible(false);
                
            }
        });
        

        JPanel inputPanel = new JPanel();
        inputPanel.add(lbTaskName);
        inputPanel.add(tfTaskName);
        inputPanel.add(lbDuration);
        inputPanel.add(tfDuration);
        inputPanel.add(btRegister);

        add(inputPanel, BorderLayout.NORTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        updateTasksDisplay();
        
    }

    public void registerTask(String task, String duration, ArrayList taskArrayList, ArrayList durationArrayList) {
        taskArrayList.add(task);
        durationArrayList.add(duration);
    }

    private void updateTasksDisplay() {
        for (int i = 0; i < tasksArrayList.size(); i++) {
            String task = tasksArrayList.get(i);
            String duration = durationsArrayList.get(i);
            JLabel lbTaskName = new JLabel(task);
            JLabel lbDuration = new JLabel(duration);
            mainPanel.add(lbTaskName);
            mainPanel.add(lbDuration);
        }
        mainPanel.revalidate();
 
    }
}
