package com.company;

public final class Son extends Father{
    private int school;

    public Son(int age, Hobby hobby, int school) {
        super(age, hobby);
        this.school = school;
    }

    public int getSchool() {
        return school;
    }

    @Override
    public String whatDoesHeDo(String goTo, String whatDidHeTake) {
        return super.whatDoesHeDo(goTo) + " with " + whatDidHeTake;
    }
}
