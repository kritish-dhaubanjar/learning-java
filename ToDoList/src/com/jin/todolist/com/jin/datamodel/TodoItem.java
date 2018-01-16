package com.jin.todolist.com.jin.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String shortDesc, detailDesc;
    private LocalDate dueDate;

    public TodoItem(String shortDesc, String detailDesc, LocalDate dueDate) {
        this.shortDesc = shortDesc;
        this.detailDesc = detailDesc;
        this.dueDate = dueDate;
    }

    @Override
    public String toString(){
        return this.shortDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
