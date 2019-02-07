package refactoring_gilbut.chap12.after;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class RectangleGraph extends Graph {
	private static final RectangleGraph instance = new RectangleGraph();

	public static RectangleGraph getInstance(int width, int height) {
		instance.setPreferredSize(new Dimension(width, height));
		return instance;
	}

	private RectangleGraph() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Rectangle bounds = getBounds();
		int nagative = graphValue > 0 ? 1 : -1;
		int w = (int) (bounds.width / 2 * nagative * graphValue / 100.0);
		int x = bounds.width / 2;
		int h = bounds.height / 2;
		int y = bounds.height / 4;
		g.setColor(graphValue > 0 ? Color.BLUE : Color.RED);
		g.fillRect(graphValue > 0 ? x : x - w, y, w, h);
	}
}
