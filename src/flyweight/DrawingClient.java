package flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import flyweight.ShapeFactory.ShapeType;

public class DrawingClient extends JFrame {

	private static final long serialVersionUID = -1350200437285282550L;
	private final int WIDTH;
	private final int HEIGHT;
	private Random r = new Random();
	
	private static final ShapeType shapes[] = { ShapeType.LINE, ShapeType.OVAL_FILL, ShapeType.OVAL_NOFILL };
	private static final Color colors[] = { Color.RED, Color.GREEN, Color.YELLOW, Color.CYAN, Color.BLUE , Color.MAGENTA , Color.PINK, Color.ORANGE };

	public DrawingClient(int width, int height) {
		this.WIDTH = width;
		this.HEIGHT = height;
		Container contentPane = getContentPane();
		JButton startButton = new JButton("Draw");
		final JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(startButton, BorderLayout.SOUTH);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Graphics g = panel.getGraphics();
				for (int i = 0; i < 200; ++i) {
					Shape shape = ShapeFactory.getShape(getRandomShape());
					shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomColor());
				}
			}
		});
	}

	private ShapeType getRandomShape() {
		return shapes[  getRandomNumberInRange(0, shapes.length )  ];
	}

	private int getRandomX() {
		return  getRandomNumberInRange(0, WIDTH );
	}

	private int getRandomY() {
		return getRandomNumberInRange(0, HEIGHT );
	}

	private int getRandomWidth() {
		return getRandomNumberInRange(0, (WIDTH / 10));
	}

	private int getRandomHeight() {
		return getRandomNumberInRange(0, (HEIGHT / 10));
	}

	private Color getRandomColor() {
		return colors[getRandomNumberInRange(0, colors.length)];
	}

	public static void main(String[] args) {
		DrawingClient drawing = new DrawingClient(500, 600);
	}
	private  int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		
		return this.r.nextInt((max - min) ) + min;
	}

}
