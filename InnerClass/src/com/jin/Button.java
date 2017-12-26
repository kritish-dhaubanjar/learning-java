package com.jin;

public class Button {
    private String name;
    private OnClickListner onClickListner;

    public Button(String name) {
        this.name = name;
    }

    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }
    public void onClick(){
        this.onClickListner.onClick(this.name);
    }

    public interface OnClickListner{
        void onClick(String name);
    }
}
