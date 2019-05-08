package com.tutorialspoint;

public class ByeWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("ByeWorld Bean is going through init.");
    }

    public void destroy() {
        System.out.println("ByeWorld Bean will destroy now");
    }
}
