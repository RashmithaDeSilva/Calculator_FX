package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import java.util.Objects;

public class CalculatorController {
    public TextField ansDisplay;
    public TextField typeDisplay;
    private String num1 = "";
    private String num2 = "";
    private String operator = "";


    // Operators
    public void ansOnAction(ActionEvent actionEvent) {
        if (!num1.equals("") && !num2.equals("")) {
            switch (operator){
                case "+":
                    num2 = String.valueOf(Integer.parseInt(num2) + Integer.parseInt(num1));
                    break;

                case "-":
                    num2 = String.valueOf(Integer.parseInt(num2) - Integer.parseInt(num1));
                    break;

                case "*":
                    num2 = String.valueOf(Integer.parseInt(num2) * Integer.parseInt(num1));
                    break;

                case "/":
                    if (Objects.equals(num1, "0")) {
                        ansDisplay.setText("Math Error");
                    } else {
                        num2 = String.valueOf(Integer.parseInt(num2) / Integer.parseInt(num1));
                    }
                    break;
            }

            ansDisplay.setText(num2);
            num1 = "";
            operator = "";
        }
    }

    public void cleOnAction(ActionEvent actionEvent) {
        num1 = "";
        num2 = "";
        operator = "";
        ansDisplay.setText("");
        typeDisplay.setText("");
    }

    public void delOnAction(ActionEvent actionEvent) {
        String[] strArr = typeDisplay.getText().split(" ");

        if (strArr.length == 3 || strArr.length == 1) {
            char[] charArr = num1.toCharArray();
            num1 = "";
            for (int i=0;i<charArr.length-1;i++) {
                num1 += charArr[i];
            }
            typeDisplay.setText("");
            for (int i=0;i<strArr.length-1;i++) {
                typeDisplay.setText(typeDisplay.getText() + strArr[i] + " ");
            }
            typeDisplay.setText(typeDisplay.getText() + num1);

        } else if (strArr.length == 2) {
            operator = "";
            typeDisplay.setText(strArr[0]);
        }
    }

    public void addOnAction(ActionEvent actionEvent) {
        if (num2.equals("")) {
            num2 = num1;
            num1 = "";

        } else {
            ansOnAction(actionEvent);
        }
        operator = "+";
        typeDisplay.setText(typeDisplay.getText()+" + ");
    }

    public void subOnAction(ActionEvent actionEvent) {
        if (num2.equals("")) {
            num2 = num1;
            num1 = "";

        } else {
            ansOnAction(actionEvent);
        }
        operator = "-";
        typeDisplay.setText(typeDisplay.getText()+" - ");
    }

    public void mulOnAction(ActionEvent actionEvent) {

        if (num2.equals("")) {
            num2 = num1;
            num1 = "";

        } else {
            ansOnAction(actionEvent);
        }
        operator = "*";
        typeDisplay.setText(typeDisplay.getText()+" x ");
    }

    public void divOnAction(ActionEvent actionEvent) {
        if (num1.equals("0")) {
            ansDisplay.setText("Math Error");

        } else {
            if (num2.equals("")) {
                num2 = num1;
                num1 = "";

            } else {
                ansOnAction(actionEvent);
            }
        }
        operator = "/";
        typeDisplay.setText(typeDisplay.getText()+" / ");
    }


    // Numbers
    public void num1OnAction(ActionEvent actionEvent) {
        num1 += "1";
        typeDisplay.setText(typeDisplay.getText()+"1");
    }

    public void num2OnAction(ActionEvent actionEvent) {
        num1 += "2";
        typeDisplay.setText(typeDisplay.getText()+"2");
    }

    public void num3OnAction(ActionEvent actionEvent) {
        num1 += "3";
        typeDisplay.setText(typeDisplay.getText()+"3");
    }

    public void num4OnAction(ActionEvent actionEvent) {
        num1 += "4";
        typeDisplay.setText(typeDisplay.getText()+"4");
    }

    public void num5OnAction(ActionEvent actionEvent) {
        num1 += "5";
        typeDisplay.setText(typeDisplay.getText()+"5");
    }

    public void num6OnAction(ActionEvent actionEvent) {
        num1 += "6";
        typeDisplay.setText(typeDisplay.getText()+"6");
    }

    public void num7OnAction(ActionEvent actionEvent) {
        num1 += "7";
        typeDisplay.setText(typeDisplay.getText()+"7");
    }

    public void num8OnAction(ActionEvent actionEvent) {
        num1 += "8";
        typeDisplay.setText(typeDisplay.getText()+"8");
    }

    public void num9OnAction(ActionEvent actionEvent) {
        num1 += "9";
        typeDisplay.setText(typeDisplay.getText()+"9");
    }

    public void num0OnAction(ActionEvent actionEvent) {
        num1 += "0";
        typeDisplay.setText(typeDisplay.getText()+"0");
    }
}
