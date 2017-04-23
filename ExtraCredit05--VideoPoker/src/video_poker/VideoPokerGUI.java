package video_poker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VideoPokerGUI implements ActionListener {
  // Miscellaneous J-Items
  private JFrame frame;
  private JTextArea money;
  
  // Buttons for Cards
  private JButton card01;
  private JButton card02;
  private JButton card03;
  private JButton card04;
  private JButton card05;
  
  // Buttons for Wagers
  private JButton wager10;
  private JButton wager20;
  private JButton wager50;
  private JButton wager100;
  private JButton wagerContinue;

  // Instance variables for earnings
  private int earnings;
  
  // Instance variables for dimensions
  private int bWidth = 50;
  private int bHeight = 100;
  private int bXBase = 50;
  private int bYBase = 50;
  private int bDX = 70;
  private int bDY = 70;
  
  // Default Constructor
  public VideoPokerGUI () {
    // Initialize variables
    this.frame = new JFrame("CSCE 145 -- Video Poker");
    this.earnings = getEarnings();
    this.money = new JTextArea(earnings + "");
    
    this.card01 = new JButton();
    this.card02 = new JButton();
    this.card03 = new JButton();
    this.card04 = new JButton();
    this.card05 = new JButton();

    this.wager10 = new JButton("$10");
    this.wager20 = new JButton("$20");
    this.wager50 = new JButton("$50");
    this.wager100 = new JButton("$100");
    this.wagerContinue = new JButton("GO!!");
    
    // Set Boundaries
    this.card01.setBounds(bXBase, bYBase, bWidth, bHeight);
    this.card02.setBounds(bXBase + bDX, bYBase, bWidth, bHeight);
    this.card03.setBounds(bXBase + bDX*2, bYBase, bWidth, bHeight);
    this.card04.setBounds(bXBase + bDX*3, bYBase, bWidth, bHeight);
    this.card05.setBounds(bXBase + bDX*4, bYBase, bWidth, bHeight);

    this.wager10.setBounds(bXBase, bYBase + bDY*2, bWidth, bHeight/2);
    this.wager20.setBounds(bXBase + bDX, bYBase + bDY*2, bWidth, bHeight/2);
    this.wager50.setBounds(bXBase + bDX*2, bYBase + bDY*2, bWidth, bHeight/2);
    this.wager100.setBounds(bXBase + bDX*3, bYBase + bDY*2, bWidth, bHeight/2);
    this.wagerContinue.setBounds(bXBase + bDX*4, bYBase + bDY*2, bWidth, bHeight/2);

    this.money.setBounds(bXBase + bDX*5, bYBase + bDY*2, bWidth, bHeight/2);
    
    // Add Buttons
    this.frame.add(card01);
    this.frame.add(card02);
    this.frame.add(card03);
    this.frame.add(card04);
    this.frame.add(card05);
    this.frame.add(wager10);
    this.frame.add(wager20);
    this.frame.add(wager50);
    this.frame.add(wager100);
    this.frame.add(wagerContinue);
    this.frame.add(money);
    
    
    // Set Frame Settings
    this.frame.setLayout(null);
    this.frame.setVisible(true);
    this.frame.setSize(money.getX() + bWidth + bDX, money.getY() + bHeight/2 + bDY);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.setResizable(false);  
    
    // Set Button Response
    this.card01.addActionListener(this);
    this.card02.addActionListener(this);
    this.card03.addActionListener(this);
    this.card04.addActionListener(this);
    this.card05.addActionListener(this);
    this.wager10.addActionListener(this);
    this.wager20.addActionListener(this);
    this.wager50.addActionListener(this);
    this.wager100.addActionListener(this);
    this.wagerContinue.addActionListener(this);
  } // end of Constructor
  
  public int getEarnings() {
    return 0;
  }
  public void setEarnings() {
    
  }

  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
  }
} // end of VideoPokerGUI