import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	public DrawPanel()
	{

	}

	int width = 500;
	int height = 500;
	public java.awt.image.BufferedImage paintImage = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_RGB);
	public java.awt.image.BufferedImage img1 = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_RGB);
	public java.awt.image.BufferedImage img2 = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_RGB);
	public java.awt.image.BufferedImage img3 = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_RGB);
	public java.awt.image.BufferedImage img4 = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_RGB);


	java.awt.Graphics g = paintImage.createGraphics();



	protected void paintComponent(java.awt.Graphics g)
	{
		g.drawImage(paintImage, 0, 0, null);
	}

	public void updatePaint()
	{
		//
		// if (stuff happening) update
		//
		//

		try
		{
			load();
			System.out.println("loaded");
		}
		catch(Exception f)
		{

		}

		paintImage = img2;
		repaint();

		
		java.util.Random r = new java.util.Random();
		int[][] pixels = new int[500][500];
		for(int i = 0; i < 500; i++)
		{
			for(int j = 0; j < 500; j++)
			{
				int y = r.nextInt(2);
				if(y==0)
				{
					pixels[i][j] = img1.getRGB(i,j);
				}
				else
				{
					pixels[i][j] = img4.getRGB(i,j);
				}
			}
		}

		for(int i = 0; i < 500; i++)
		{
			for(int j = 0; j < 500; j++)
			{
				paintImage.setRGB(i, j, pixels[i][j]);
			}
		}
		try{save();}catch(Exception f){}
		repaint();
	}
    public void save() throws java.io.IOException
    {
        javax.imageio.ImageIO.write(paintImage, "PNG", new java.io.File("newImg.png"));
    }

    public void load() throws java.io.IOException
    {
    	img1 = javax.imageio.ImageIO.read(new java.io.File("jason.png"));
    	img2 = javax.imageio.ImageIO.read(new java.io.File("blueojtrees.png"));
    	img3 = javax.imageio.ImageIO.read(new java.io.File("palmtrees.png"));
    	img4 = javax.imageio.ImageIO.read(new java.io.File("pinktrees.png"));
    }
}