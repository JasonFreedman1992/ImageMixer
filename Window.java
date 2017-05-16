import javax.swing.*;

public class Window extends JFrame
{
	public static DrawPanel drawPanel;
	public void init(int p_width, int p_height)
	{		
		setTitle("ChatBoard");
		setSize(p_width, p_height);
		State.winWidth = p_width;
		State.winHeight = p_height;
		setLocationRelativeTo(null);
		setMinimumSize(new java.awt.Dimension(p_width, p_height));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new DrawPanel();
		add(drawPanel);
		setVisible(true);
	}

	public void randomStart()
	{
		State.start = true;
		drawPanel.updatePaint();
	}
}