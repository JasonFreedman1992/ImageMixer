public class State
{
	public static Point p1 = new Point(512, 384, java.awt.Color.white);
	public static boolean clear = false;
	public static boolean start = false;

	public static int winWidth = 0;
	public static int winHeight = 0;

	public static void clear()
	{
		java.util.Random r = new java.util.Random();
		clear = false;
		p1.x = r.nextInt(1024);
		p1.y = r.nextInt(768);
/*		p1.x = 512;
		p1.y = 384;*/
		p1.color = new java.awt.Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}
}