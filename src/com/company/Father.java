package com.company;

public class Father extends Grandfather{
    private String job;

    public Father(int age, Hobby hobby, String  job) {
        super(age, hobby);
        this.job = job;
    }

    public Father(int age, Hobby hobby) {
        super(age, hobby);
    }

    public String  getJob() {
        return job;
    }

    public String whatDoesHeDo(String goTo, String vehicle) {
        return "He's going to " + goTo + " on " + vehicle;
    }
    public String whatDoesHeDo(String goTo) {
        return "He's going to " + goTo;
    }
}
