package com.jin;

public class Main {

    public static void main(String[] args) {
        //Inner Class
        GearBox mcLauren = new GearBox();
        GearBox.Gear mcGear = mcLauren.new Gear(); //Not Recommended

        Button btn_primary = new Button("Print");

        //Local Class
        class ClickListner implements Button.OnClickListner{

            public ClickListner(){
                System.out.println("Default Constructor");
            }

            @Override
            public void onClick(String name) {
                System.out.println("Primary Pressed " + name);
            }
        }
        btn_primary.setOnClickListner(new ClickListner());
        btn_primary.onClick();

        Button btn_secondary = new Button("View");
        btn_secondary.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void onClick(String name) {
                System.out.println("Secondary Pressed " + name);
            }
        });

        btn_secondary.onClick();

    }
}
