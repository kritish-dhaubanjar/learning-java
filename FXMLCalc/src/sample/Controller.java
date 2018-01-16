package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Button nine,eight,seven,six,five,four,three,two,one,zero,add,diff,mul,div,clear,equal;
    @FXML
    private Text num;

    private int result=0, current=0, num1=0;
    private String operation = "add";

    @FXML
    public void initialize(){
        result = 0;
        current = 0;
        num1 = 0;
        operation = "add";
        num.setText("0");
    }

    @FXML
    public void onNumClickListner(Event e){
        int update = 0;

        if(e.getSource().equals(nine))
            update = 9;
        else if (e.getSource().equals(eight))
            update = 8;
        else if (e.getSource().equals(seven))
            update = 7;
        else if (e.getSource().equals(six))
            update = 6;
        else if (e.getSource().equals(five))
            update = 5;
        else if (e.getSource().equals(four))
            update = 4;
        else if (e.getSource().equals(three))
            update = 3;
        else if (e.getSource().equals(two))
            update = 2;
        else if (e.getSource().equals(one))
            update = 1;
        else if (e.getSource().equals(zero))
            update = 0;
        current = current * 10 + update;
        num.setText(Integer.toString(current));
    }

    @FXML
    public void onMathClickListner(Event e){
        num1 = current;


        System.out.println(result + "&" + num1);

        if (operation.equals("add"))
            result += num1;
        else if(operation.equals("diff"))
            result -= num1;
        else if(operation.equals("div")) {
            if (num1 != 0)
                result /= num1;
        }
        else if(operation.equals("mul")) {
            result *= num1;

        }

        if(e.getSource().equals(add))
            operation = "add";
        else if(e.getSource().equals(diff))
            operation = "diff";
        else if(e.getSource().equals(mul))
            operation = "mul";
        else if(e.getSource().equals(div))
            operation = "div";

        num.setText(Integer.toString(result));
        current = 0;
    }


}
