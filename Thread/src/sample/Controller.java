package sample;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button helloBtn;
    @FXML
    private Label status;

    @FXML
    public void onClickListner(Event event){
//        try {
//            Thread.sleep(10000);
//        }catch (InterruptedException e){
//            //
//        }
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    System.out.println(Platform.isFxApplicationThread());
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            status.setText("Thread Completed");
                            System.out.println(Platform.isFxApplicationThread());
                        }
                    });
                }catch (InterruptedException e){
                    //
                }
            }
        };

        Thread newThread = new Thread(task);
        newThread.start();
    }
}
