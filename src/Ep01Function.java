import javax.swing.*;

public class Ep01Function {
  public boolean check(String input){
      try {
          double x = Double.parseDouble(input);
          if (x>=0 || x<0);
              return true;
         }
      catch(NumberFormatException e)
         {
          return false;
        }
  }
 public void dollarToNok(double input){
     double nok = input * 8.2;
     JOptionPane.showMessageDialog(null,"amount of "+nok+"kr");
 }
 public void dollarToYen(double input){
     double JPY = input *112.8;
     JOptionPane.showMessageDialog(null, "amount of "+JPY+"yen");
 }


}
