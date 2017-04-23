package calculator;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
  // Java GUI Instance Variables
  public JFrame frame;
  public JTextField text;
  public JButton b0;
  public JButton b1;
  public JButton b2;
  public JButton b3;
  public JButton b4;
  public JButton b5;
  public JButton b6;
  public JButton b7;
  public JButton b8;
  public JButton b9;
  public JButton bAdd;
  public JButton bSub;
  public JButton bMul;
  public JButton bDiv;
  public JButton bExp;
  public JButton bSqrt;
  public JButton bLog;
  public JButton bSin;
  public JButton bCos;
  public JButton bTan;
  public JButton bASin;
  public JButton bACos;
  public JButton bATan;
  public JButton bClr;
  public JButton bEql;
  public JButton bDec;
  
  // Variables for Button Placement
  public int bWidth = 50;
  public int bHeight = 50;
  public int bXBase = 40;
  public int bYBase = 100;
  public int bDX = 70;
  public int bDY = 70;
  
  // Variables for Functions
  public double first = 0.0;
  public double second = 0.0;
  public double result = 0.0;
  public int operation = 0;
  
  public CalculatorGUI() {
    // Initializes Buttons
    this.frame = new JFrame("Calculator -- CSCE 145");
    this.text = new JTextField();    
    this.b0 = new JButton("0");
    this.b1 = new JButton("1");
    this.b2 = new JButton("2");
    this.b3 = new JButton("3");
    this.b4 = new JButton("4");
    this.b5 = new JButton("5");
    this.b6 = new JButton("6");
    this.b7 = new JButton("7");
    this.b8 = new JButton("8");
    this.b9 = new JButton("9");
    this.bAdd = new JButton("+");
    this.bSub = new JButton("-");
    this.bMul = new JButton("*");
    this.bDiv = new JButton("/");
    this.bExp = new JButton("x ^ y");
    this.bSqrt = new JButton("sqrt");
    this.bLog = new JButton("log");
    this.bSin = new JButton("sin");
    this.bCos = new JButton("cos");
    this.bTan = new JButton("tan");
    this.bASin = new JButton("asin");
    this.bACos = new JButton("acos");
    this.bATan = new JButton("atan");
    this.bClr = new JButton("clear");
    this.bEql = new JButton("=");
    this.bDec = new JButton(".");
    
    // Usage ------------------------------------------------
    // this.<insert element>.setBounds(x, y, width, height);

    this.text.setBounds(bXBase, bYBase/4, bXBase*3 + bDX*5, bYBase/2);
    
    // First Row Buttons
    this.b7.setBounds(bXBase, bYBase, bWidth, bHeight);
    this.b8.setBounds(bXBase + bDX, bYBase, bWidth, bHeight);
    this.b9.setBounds(bXBase + bDX*2, bYBase, bWidth, bHeight);
    this.bDiv.setBounds(bXBase + bDX*3, bYBase, bWidth, bHeight);
    this.bExp.setBounds(bXBase + bDX*4, bYBase, bWidth, bHeight);
    this.bSin.setBounds(bXBase + bDX*5, bYBase, bWidth, bHeight);
    this.bASin.setBounds(bXBase + bDX*6, bYBase, bWidth, bHeight);
    
    // Second Row Buttons
    this.b4.setBounds(bXBase, bYBase + bDY, bWidth, bHeight);
    this.b5.setBounds(bXBase + bDX, bYBase + bDY, bWidth, bHeight);
    this.b6.setBounds(bXBase + bDX*2, bYBase + bDY, bWidth, bHeight);
    this.bSub.setBounds(bXBase + bDX*3, bYBase + bDY, bWidth, bHeight);
    this.bSqrt.setBounds(bXBase + bDX*4, bYBase + bDY, bWidth, bHeight);
    this.bCos.setBounds(bXBase + bDX*5, bYBase + bDY, bWidth, bHeight);
    this.bACos.setBounds(bXBase + bDX*6, bYBase + bDY, bWidth, bHeight);
    
    // Third Row Buttons
    this.b1.setBounds(bXBase, bYBase + bDY*2, bWidth, bHeight);
    this.b2.setBounds(bXBase + bDX, bYBase + bDY*2, bWidth, bHeight);
    this.b3.setBounds(bXBase + bDX*2, bYBase + bDY*2, bWidth, bHeight);
    this.bMul.setBounds(bXBase + bDX*3, bYBase + bDY*2, bWidth, bHeight);
    this.bLog.setBounds(bXBase + bDX*4, bYBase + bDY*2, bWidth, bHeight);
    this.bTan.setBounds(bXBase + bDX*5, bYBase + bDY*2, bWidth, bHeight);
    this.bATan.setBounds(bXBase + bDX*6, bYBase + bDY*2, bWidth, bHeight);

    // Fourth Row Buttons
    this.bDec.setBounds(bXBase, bYBase + bDY*3, bWidth, bHeight);
    this.b0.setBounds(bXBase + bDX, bYBase + bDY*3,
        bWidth + bDX, bHeight);
    this.bAdd.setBounds(bXBase + bDX*3, bYBase + bDY*3, bWidth, bHeight);
    this.bEql.setBounds(bXBase + bDX*4, bYBase + bDY*3,
        bWidth + bDX/2, bHeight);
    this.bClr.setBounds(bXBase + bDX*5 + bDX/2, bYBase + bDY*3,
        bWidth + bDX/2, bHeight);
    
    // Add buttons to the frame
    this.frame.add(text);
    this.frame.add(b0);
    this.frame.add(b1);
    this.frame.add(b2);
    this.frame.add(b3);
    this.frame.add(b4);
    this.frame.add(b5);
    this.frame.add(b6);
    this.frame.add(b7);
    this.frame.add(b8);
    this.frame.add(b9);
    this.frame.add(bAdd);
    this.frame.add(bSub);
    this.frame.add(bMul);
    this.frame.add(bDiv);
    this.frame.add(bExp);
    this.frame.add(bSqrt);
    this.frame.add(bLog);
    this.frame.add(bSin);
    this.frame.add(bCos);
    this.frame.add(bTan);
    this.frame.add(bASin);
    this.frame.add(bACos);
    this.frame.add(bATan);
    this.frame.add(bClr);
    this.frame.add(bEql);
    this.frame.add(bDec);
    
    // Frame Options
    this.frame.setLayout(null);
    this.frame.setVisible(true);
    this.frame.setSize(bClr.getX() + bClr.getWidth() + bDX,
        bClr.getY() + bClr.getHeight() + bDY/2);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.setResizable(false);

    // Response from Buttons
    this.b1.addActionListener(this);
    this.b2.addActionListener(this);
    this.b3.addActionListener(this);
    this.b4.addActionListener(this);
    this.b5.addActionListener(this);
    this.b6.addActionListener(this);
    this.b7.addActionListener(this);
    this.b8.addActionListener(this);
    this.b9.addActionListener(this);
    this.b0.addActionListener(this);
    this.bAdd.addActionListener(this);
    this.bDiv.addActionListener(this);
    this.bMul.addActionListener(this);
    this.bSub.addActionListener(this);
    this.bDec.addActionListener(this);
    this.bExp.addActionListener(this);
    this.bSqrt.addActionListener(this);
    this.bLog.addActionListener(this);
    this.bSin.addActionListener(this);
    this.bCos.addActionListener(this);
    this.bTan.addActionListener(this);
    this.bATan.addActionListener(this);
    this.bACos.addActionListener(this);
    this.bASin.addActionListener(this);
    this.bEql.addActionListener(this);
    this.bClr.addActionListener(this); 
  }
  
  public void actionPerformed(ActionEvent event) {  
    // Checks to add numbers to the text box
    if (event.getSource() == b1) {
      text.setText(text.getText().concat("1"));
    } else if (event.getSource() == b2) {
      text.setText(text.getText().concat("2"));
    } else if (event.getSource() == b3) {
      text.setText(text.getText().concat("3"));
    } else if (event.getSource() == b4) {
      text.setText(text.getText().concat("4"));
    } else if (event.getSource() == b5) {
      text.setText(text.getText().concat("5"));
    } else if (event.getSource() == b6) {
      text.setText(text.getText().concat("6"));
    } else if (event.getSource() == b7) {
      text.setText(text.getText().concat("7"));
    } else if (event.getSource() == b8) {
      text.setText(text.getText().concat("8"));
    } else if (event.getSource() == b9) {
      text.setText(text.getText().concat("9"));
    } else if (event.getSource() == b0) {
      text.setText(text.getText().concat("0"));
    } else if (event.getSource() == bDec) {
      text.setText(text.getText().concat("."));
    }
    
    //  Checks for Single Input Functions
    else if (event.getSource() == bClr) {
      text.setText("");
    } else if (event.getSource() == bSqrt) {
      first = Double.parseDouble(text.getText());
      result = MathFunctions.squareRoot(first);
      text.setText("" + result);
    } else if (event.getSource() == bLog) {
      first = Double.parseDouble(text.getText());
      result = MathFunctions.log(first);
      text.setText("" + result);
    } else if (event.getSource() == bSin) {
      first = Double.parseDouble(text.getText());
      result = MathFunctions.sine(first);
      text.setText("" + result);
    } else if (event.getSource() == bCos) {
      first = Double.parseDouble(text.getText());
      result = MathFunctions.cosine(first);
      text.setText("" + result);
    } else if (event.getSource() == bTan) {
      first = Double.parseDouble(text.getText());
      result = MathFunctions.tangent(first);
      text.setText("" + result);
    } else if (event.getSource() == bASin) {
      first = Double.parseDouble(text.getText());
      result = MathFunctions.arcsine(first);
      text.setText("" + result);
    } else if (event.getSource() == bACos) {
      first = Double.parseDouble(text.getText());
      result = MathFunctions.arccosine(first);
      text.setText("" + result);
    } else if (event.getSource() == bATan) {
      first = Double.parseDouble(text.getText());
      result = MathFunctions.arctangent(first);
      text.setText("" + result);
    }
    
    // Checks for Binary Operations
    else if (event.getSource() == bAdd) {
      first = Double.parseDouble(text.getText());
      text.setText("");
      operation = 1;
    } else if (event.getSource() == bSub) {
      first = Double.parseDouble(text.getText());
      text.setText("");
      operation = 2;
    } else if (event.getSource() == bMul) {
      first = Double.parseDouble(text.getText());
      text.setText("");
      operation = 3;
    } else if (event.getSource() == bDiv) {
      first = Double.parseDouble(text.getText());
      text.setText("");
      operation = 4;
    } else if (event.getSource() == bExp) {
      first = Double.parseDouble(text.getText());
      text.setText("");
      operation = 5;
    }
    
    // Checks for Equals
    else if (event.getSource() == bEql) {
      second = Double.parseDouble(text.getText());
      switch (operation) {
        case 1:
          result = MathFunctions.addition(first, second);
          break;
        case 2:
          result = MathFunctions.subtraction(first, second);
          break;
        case 3:
          result = MathFunctions.multiplication(first, second);
          break;
        case 4:
          if (second != 0.0) {
            result = MathFunctions.division(first, second);
          } else {
            result = 0;
          }
          break;
        case 5:
          result = MathFunctions.exponent(first, second);
          break;
      } // end switch
      if (operation == 4 && second == 0.0) {
        text.setText("Divide by Zero Exception!");
      }
      else {
        text.setText("" + result);
      }
    }
  } // end of actionPerformed(ActionEvent event)
} // end of CalculatorGUI
