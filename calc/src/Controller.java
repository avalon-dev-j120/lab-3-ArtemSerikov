import com.sun.xml.internal.bind.XmlAccessorFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Text output;
    private String operation = "";
    private long number1 = 0;
    private  Model model = new Model();
    private boolean start = true;

    @FXML
    private void processNum(ActionEvent ae){

        if(start){
            output.setText("");
            start = false;
        }
        String value = ((Button) ae.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOp(ActionEvent ae){
        String value = ((Button) ae.getSource()).getText();
        if(!"=".equals(value)){
            operation = value;
            number1 = Long.parseLong((output.getText()));
        }
        else {
            if(operation.isEmpty()) return;
            output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operation)));
        }

    }



}
