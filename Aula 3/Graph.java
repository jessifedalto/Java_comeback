import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Graph {
    
    private ArrayList<Float> values = new ArrayList<Float>();
    private ArrayList<Color> colors = new ArrayList<Color>();

    public void add(Float value, Color color){
        values.add(value);
        colors.add(color);
        repaint();
    }


    @Override
    protected void paintComponent (Graphics g){
        int x = getx();
        int y = 0;
        int width = 600;
        int height = 600;

        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);

        Float sum = 0f;

        for (Float value : values) {
            sum += value;
        }

        for (int i = 0; i < colors.size(); i++) {
            Float value = values.get(i);
            Color color = colors.get(i);
            g.setColor(color);

            g.setColor(color);


        }
    }
}
