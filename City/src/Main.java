import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.URL;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Main {
	JFrame frame;
	JList list;
	JList list2;
	JLabel label, label2;
	JButton button1, button2;
	static int imageWidth = 60, imageHeight = 60;

	public Main() {
		frame = new JFrame();
		initialize();
		Box box = Box.createVerticalBox();
		String[] students = { "Nick", "Mark", "Zac", "Ally", "Purf", "Duke", "William", "Martina", " " };
		String[] teachers = { "Pete", "Kent", "Trefry", "Oiler", "Laurie", " " };
		String[] polices = { "Geof", "Garen", "Mark", "Lux" };
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);
		JLabel title = new JLabel("Buildings");
		JButton btnSchool = new JButton("School");
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.insets = new Insets(0, 0, 5, 5);
		gbc_title.gridx = 3;
		gbc_title.gridx = 1;
		frame.getContentPane().add(title, gbc_title);
		GridBagConstraints gbc_btnSchool = new GridBagConstraints();
		gbc_btnSchool.insets = new Insets(0, 0, 5, 5);
		gbc_btnSchool.gridx = 2;
		gbc_btnSchool.gridy = 0;
		frame.getContentPane().add(btnSchool, gbc_btnSchool);
		btnSchool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					URL po = getClass().getResource("/resource/whitworth.jpg");
					Image img = toolkit.getImage(po);
					img = img.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
					ImageIcon icon = new ImageIcon(img);
					JButton btn = new JButton(icon);
					JOptionPane.showMessageDialog(null, "This is Whitworth University", "Whitworth",
							JOptionPane.INFORMATION_MESSAGE, icon);
				} catch (Exception ex) {
					;
				}
				frame.dispose();
				JButton button3 = new JButton("Get information");
				JButton button4 = new JButton("Get school detail");
				label = new JLabel("Students");
				label2 = new JLabel("Teachers");
				list = new JList(students);
				list2 = new JList(teachers);
				frame = new JFrame("Whitworth Univeristy");
				frame.setLayout(new GridBagLayout());
				addgb(label, 0, 0);
				addgb(list, 0, 1);
				addgb(label2, 2, 0);
				addgb(list2, 2, 1);
				addgb(button3, 1, 2);
				addgb(button4, 1, 3);
				frame.setSize(300, 500);
				frame.setBounds(100, 100, 450, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(new FlowLayout());
				frame.setVisible(true);
				button3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						String n;
						String ns;
						n = list2.getSelectedValue().toString();

						if (n == "Pete") {
							try {
								Toolkit toolkit = Toolkit.getDefaultToolkit();
								URL po = getClass().getResource("/resource/TuckerPeter.jpg");
								Image img = toolkit.getImage(po);
								img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
								ImageIcon icon = new ImageIcon(img);
								JButton btn = new JButton(icon);
								JOptionPane.showMessageDialog(null, "Pete is a CS professor in Whitworth University",
										"Pete", JOptionPane.INFORMATION_MESSAGE, icon);
							} catch (Exception ex) {
								;
							}
						} else if (n == "Kent") {
							try {
								Toolkit toolkit = Toolkit.getDefaultToolkit();
								URL po = getClass().getResource("/resource/kjones.jpg");
								Image img = toolkit.getImage(po);
								img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
								ImageIcon icon = new ImageIcon(img);
								JButton btn = new JButton(icon);
								JOptionPane.showMessageDialog(null, "Kent is a CS professor in Whitworth University",
										"Kent", JOptionPane.INFORMATION_MESSAGE, icon);
							} catch (Exception ex) {
								;
							}
						} else if (n == "Trefry") {
							JOptionPane.showMessageDialog(frame, "Trefry is a Math Professor");
						} else if (n == "Oiler") {
							JOptionPane.showMessageDialog(frame, "Oiler is a Art Professor");
						} else if (n == "Laurie") {
							JOptionPane.showMessageDialog(frame, "Laurie is a Literture Professor");
						}

						ns = list.getSelectedValue().toString();
						if (ns == "Nick") {
							JOptionPane.showMessageDialog(frame, "Nick is a art student from Whitworth University");
						} else if (ns == "Mark") {
							JOptionPane.showMessageDialog(frame,
									"Mark is a computer science student from Whitworth University");
						} else if (ns == "Zac") {
							JOptionPane.showMessageDialog(frame,
									"Zac is a computer science student from Whitworth University");
						} else if (ns == "Ally") {
							JOptionPane.showMessageDialog(frame, "Ally is a music student from Whitworth University");
						} else if (ns == "Purf") {
							JOptionPane.showMessageDialog(frame, "Purf a marketing student from Whitworth University");
						} else if (ns == "Duke") {
							JOptionPane.showMessageDialog(frame, "Duke is a legendary student from Duke University");
						} else if (ns == "Martina") {
							JOptionPane.showMessageDialog(frame,
									"Martina is a literture student from Whitworth University");
						} else if (ns == "William") {
							JOptionPane.showMessageDialog(frame,
									"William is a computer science student from Whitworth University");
						}
					}
				});
				button4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						frame.dispose();
						JOptionPane.showMessageDialog(frame, "Try to drag the student!");
						/*
						 * try { Toolkit toolkit = Toolkit.getDefaultToolkit();
						 * URL cityimg =
						 * getClass().getResource("/resource/s.png"); Image img
						 * = toolkit.getImage(cityimg); img =
						 * img.getScaledInstance(300, 300, Image.SCALE_DEFAULT);
						 * 
						 * ImageIcon icon = new ImageIcon(img); JButton btn =
						 * new JButton(icon); frame.add(btn); } catch (Exception
						 * ex) { ; }
						 */

						String sd = "/resource/s.png";
						String field = "/resource/student.png";
						Image image = Toolkit.getDefaultToolkit().getImage(imageComponent.class.getResource(field));
						image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
						Image imageField = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(sd));
						frame = new JFrame("school detail");
						imageComponent lab = new imageComponent(image, imageField);
						frame.add(lab);
						frame.setSize(600, 600);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);

					}
				});
			}
		});
		JButton btnCityHall = new JButton("City Hall");
		btnCityHall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					URL po = getClass().getResource("/resource/cityhall.jpg");
					Image img = toolkit.getImage(po);
					img = img.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
					ImageIcon icon = new ImageIcon(img);
					JButton btn = new JButton(icon);
					JOptionPane.showMessageDialog(null, "This is Spokane City Hall", "City Hall",
							JOptionPane.INFORMATION_MESSAGE, icon);
				} catch (Exception ex) {
					;
				}
				frame.dispose();
				JButton button4 = new JButton("Get information");
				JButton button5 = new JButton("Get city hall detail");
				label = new JLabel("Police Officers");
				list = new JList(polices);
				frame = new JFrame("Spokane City Hall");
				frame.setLayout(new GridBagLayout());
				addgb(label, 0, 0);
				addgb(list, 0, 1);
				addgb(button4, 1, 2);
				addgb(button5, 1, 3);
				frame.setSize(300, 500);
				frame.setBounds(100, 100, 450, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(new FlowLayout());
				frame.setVisible(true);
				button4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						String n = list.getSelectedValue().toString();
						if (n == "Garen") {
							try {
								Toolkit toolkit = Toolkit.getDefaultToolkit();
								URL GAREN = getClass().getResource("/resource/Garen.jpg");
								Image img = toolkit.getImage(GAREN);
								img = img.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
								ImageIcon icon = new ImageIcon(img);
								JButton btn = new JButton(icon);
								JOptionPane.showMessageDialog(null,
										"DEMACIA!!You can not escape from me. The best police officer from DEMACIA.",
										"Garen", JOptionPane.INFORMATION_MESSAGE, icon);
							} catch (Exception ex) {
								;
							}
						} else if (n == "Geof" || n == "Mark") {
							try {
								Toolkit toolkit = Toolkit.getDefaultToolkit();
								URL po = getClass().getResource("/resource/po.png");
								Image img = toolkit.getImage(po);
								img = img.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
								ImageIcon icon = new ImageIcon(img);
								JButton btn = new JButton(icon);
								JOptionPane.showMessageDialog(null,
										"I am a low class police officer, but I protect my city everyday.",
										"Police Officer", JOptionPane.INFORMATION_MESSAGE, icon);
							} catch (Exception ex) {
								;
							}
						} else if (n == "Lux") {
							try {
								Toolkit toolkit = Toolkit.getDefaultToolkit();
								URL GAREN = getClass().getResource("/resource/lux.jpg");
								Image img = toolkit.getImage(GAREN);
								img = img.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
								ImageIcon icon = new ImageIcon(img);
								JButton btn = new JButton(icon);
								JOptionPane.showMessageDialog(null,
										"I never think about losing. Garen's younger sister.", "Lux",
										JOptionPane.INFORMATION_MESSAGE, icon);
							} catch (Exception ex) {
								;
							}
						}
					}
				});
				button5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						frame.dispose();
						JOptionPane.showMessageDialog(frame, "Try to drag the police officer!");

						String sd2 = "/resource/po.png";
						String field2 = "/resource/ch.jpg";
						Image image2 = Toolkit.getDefaultToolkit().getImage(imageComponent.class.getResource(sd2));
						image2 = image2.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
						Image imageField = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(field2));
						frame = new JFrame("school detail");
						imageComponent lab1 = new imageComponent(image2, imageField);
						frame.add(lab1);
						frame.setSize(300, 350);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);

					}
				});
			}
		});
		GridBagConstraints gbc_btnCityHall = new GridBagConstraints();
		gbc_btnCityHall.insets = new Insets(0, 0, 5, 5);
		gbc_btnCityHall.gridx = 3;
		gbc_btnCityHall.gridy = 0;
		frame.getContentPane().add(btnCityHall, gbc_btnCityHall);
		frame.setVisible(true);
		initialize();
	}

	private void initialize() {
		JOptionPane.showMessageDialog(frame, "Try to click the map");
		frame = new JFrame("City");
		frame.setSize(600, 350);
		frame.setBounds(100, 100, 600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());

		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			URL cityimg = getClass().getResource("/resource/school.png");
			Image img = toolkit.getImage(cityimg);
			img = img.getScaledInstance(300, 300, Image.SCALE_DEFAULT);

			ImageIcon icon = new ImageIcon(img);
			JButton btn = new JButton(icon);
			frame.add(btn);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					frame.dispose();
					JOptionPane.showMessageDialog(frame, "Try to move the citizen");
					frame = new JFrame("City view");
					String Garen = "/resource/Garen.jpg";
					String Lux = "/resource/lux.jpg";
					String Pete = "/resource/TuckerPeter.jpg";
					String Kent = "/resource/kjones.jpg";
					String student = "/resource/student.png";
					String city = "/resource/school.png";

					Image image = Toolkit.getDefaultToolkit().getImage(imageComponent2.class.getResource(Garen));
					Image image2 = Toolkit.getDefaultToolkit().getImage(imageComponent2.class.getResource(Lux));
					Image image3 = Toolkit.getDefaultToolkit().getImage(imageComponent2.class.getResource(student));
					Image image4 = Toolkit.getDefaultToolkit().getImage(imageComponent2.class.getResource(Kent));
					Image image5 = Toolkit.getDefaultToolkit().getImage(imageComponent2.class.getResource(Pete));
					image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
					image2 = image2.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
					image3 = image3.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
					image4 = image4.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
					image5 = image5.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);

					Image imageField = Toolkit.getDefaultToolkit().getImage(imageComponent2.class.getResource(city));
					imageField = imageField.getScaledInstance(300, 350, Image.SCALE_DEFAULT);
					imageComponent2 lab2 = new imageComponent2(image, image2, image3, image4, image5, imageField);
					frame.add(lab2);
					frame.setSize(300, 350);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			});
		} catch (Exception ex) {
			;
		}

	}

	class imageComponent extends JComponent implements MouseMotionListener {
		int imageX, imageY;
		Image image, imageField;

		public imageComponent(Image i, Image ifield) {
			image = i;
			imageField = ifield;
			addMouseMotionListener(this);
		}

		public void mouseDragged(MouseEvent e) {
			imageX = e.getX();
			imageY = e.getY();
			repaint();
		}

		public void mouseMoved(MouseEvent e) {
		}

		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(imageField, 0, 0, this);
			g2.drawImage(image, imageX, imageY, this);
		}

	}

	class imageComponent2 extends JComponent implements MouseMotionListener {
		int imageX, imageY, imageX2, imageY2, imageX3, imageY3, imageX4, imageY4, imageX5, imageY5;
		Image image, image2, image3, image4, image5, imag6, imageField;

		public imageComponent2(Image i, Image i2, Image i3, Image i4, Image i5, Image ifield) {
			image = i;
			image2 = i2;
			image3 = i3;
			image4 = i4;
			image5 = i5;
			imageField = ifield;
			addMouseMotionListener(this);
		}

		public void mouseDragged(MouseEvent e) {
			imageX = e.getX();
			imageY = e.getY();
			imageX2 = e.getX();
			imageY2 = e.getY();
			imageX3 = e.getX();
			imageY3 = e.getY();
			imageX4 = e.getX();
			imageY4 = e.getY();
			imageX5 = e.getX();
			imageY5 = e.getY();
			repaint();
		}

		public void mouseMoved(MouseEvent e) {
		}

		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(imageField, 0, 0, this);
			g2.drawImage(image, imageX, imageY, this);
			g2.drawImage(image2, imageX2, imageY2, this);
			g2.drawImage(image3, imageX3, imageY3, this);
			g2.drawImage(image4, imageX4, imageY4, this);
			g2.drawImage(image5, imageX5, imageY, this);
		}

	}

	private void addgb(Component c, int x, int y) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = x;
		gbc.gridy = y;
		frame.add(c, gbc);
	}

	public static void main(String[] args) {
		Main m = new Main();
	}
}
