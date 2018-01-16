package com.jin.todolist;

import com.jin.todolist.com.jin.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import java.util.List;

public class Controller {
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea textDetailView;

    private List<TodoItem> todoItems = new ArrayList<>();

    public void initialize(){
        TodoItem item1 = new TodoItem("Buy Birthday Card!",
                "Jin's Birthday on Feb, 13",
                LocalDate.of(2018, Month.FEBRUARY, 13));
        TodoItem item2 = new TodoItem("Buy Notes For Preparation",
                "Start Preparing for Board Exam!",
                LocalDate.of(2016, Month.DECEMBER, 20));

        todoItems.add(item1);
        todoItems.add(item2);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void onListClickListner(){
        TodoItem todoItem = todoListView.getSelectionModel().getSelectedItem();
        StringBuilder sb = new StringBuilder(todoItem.getDetailDesc());
        sb.append("\n\n\n");
        sb.append("Due Date:-" + todoItem.getDueDate().toString());
        textDetailView.setText(sb.toString());
    }



}
