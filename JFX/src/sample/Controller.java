package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Button helloBtn, byeBtn;
    @FXML
    private TextField nameField;
    @FXML
    private Text status;
    @FXML
    private CheckBox clear;
    @FXML
    private Label threadLabel;

    public void initialize(){
        helloBtn.setDisable(true);
        byeBtn.setDisable(true);
    }

    public void onClickListner(Event e){
        if (e.getSource().equals(helloBtn)){
            status.setText("Hello ! " + nameField.getText());
        }else if(e.getSource().equals(byeBtn)){
            status.setText("Bye ! " + nameField.getText());
        }

//        try{
//            Thread.sleep(10000);
//        }catch(InterruptedException event){
//            //
//        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Current :" + (Platform.isFxApplicationThread() ? "UI":"Background") );
                try{
                    Thread.sleep(10000);


                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println("Current :" + (Platform.isFxApplicationThread() ? "UI":"Background") );
                            threadLabel.setText("Thread Has Completed its Sleep.");
                        }
                    });

                }catch(InterruptedException event){
                    //
                }
            }
        };

        Thread newThread = new Thread(task);
        newThread.start();

        if(clear.isSelected()){
            nameField.clear();
            helloBtn.setDisable(true);
            byeBtn.setDisable(true);
        }
    }

    public void onKeyReleaseListner(){
        String name = nameField.getText();
        boolean disable = name.isEmpty() || name.trim().isEmpty();
        helloBtn.setDisable(disable);
        byeBtn.setDisable(disable);
    }

}
