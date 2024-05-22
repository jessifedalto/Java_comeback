import java.awt.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        Graph graph = new Graph();
        graph.setSize(600,600);

        graph.add(40, Color.red);
        graph.add(40, Color.blue);
        graph.add(40, Color.yellow);




    }
}