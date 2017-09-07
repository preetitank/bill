package com.example.preeti.bill;

public class DataObject {
    private String Text1;
    private String Text2;
    private String num;

    DataObject (String text1, String text2,String num){
        this.Text1 = text1;
        this.Text2 = text2;
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getText1() {
        return Text1;
    }

    public void setText1(String Text1) {
        this.Text1 = Text1;
    }

    public String getText2() {
        return Text2;
    }

    public void setText2(String Text2) {
        this.Text2 = Text2;
    }
}