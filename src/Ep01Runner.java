/*
          here we are using Testing input algorithm
 */


import javax.swing.*;

public class Ep01Runner {
    public static void main(String[] args) {
        Ep01Function ep = new Ep01Function();

        //optionDialogs
         Object[] option1  = {"NOK", "YEN", "quit"};
         Object[] option2  = {"Try again","quit"};


        while(true){
            String input = JOptionPane.showInputDialog(null, "Enter a value");
            System.out.println(input);

            if (ep.check(input) == true){
                double wInput = Double.parseDouble(input);

                int choice = JOptionPane.showOptionDialog(null, "choose which currency you wish to convert",
                        "currency converter",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        option1, option1[2]);
                if (choice == 0){
                    ep.dollarToNok(wInput);
                    int choice2 = JOptionPane.showOptionDialog(null, "what do you wish to do",
                            "Currency converter",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,
                            option2, option2[1]);
                    if (choice2 == 0){
                    }
                    else {break;}

                } else if (choice == 1) {
                    ep.dollarToYen(wInput);
                    int choice2 = JOptionPane.showOptionDialog(null, "what do you wish to do",
                            "Currency converter",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,
                            option2, option2[1]);
                    if (choice2 == 0){
                    }
                    else {break;}
                }else {
                    break;
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid output, try again");
                int choice2 = JOptionPane.showOptionDialog(null, "what do you wish to do",
                        "Currency converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        option2, option2[1]);
                if (choice2 == 0) {
                } else {
                    break;
                }
            }
        }
    }

}