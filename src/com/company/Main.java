package com.company;

public class Main {

    public static void main(String[] args) {
	    Father objectA = new Father(26, Hobby.PROGRAMMING, "GeekTech");
	    Son objectB = new Son(14, Hobby.PLAYING_VIDEOGAMES, 61);
	    Son objectC = new Son(11, Hobby.DO_SOMETHING, 62);

        System.out.println("objectA Job: " + objectA.getJob() + " Hobby: " + objectA.getHobby() + " Age: " + objectA.getAge());
        System.out.println("objectB Hobby: " + objectB.getHobby() + " Age: " + objectB.getAge());
        System.out.println("objectC Hobby: " + objectC.getHobby() + " Age: " + objectC.getAge());

        System.out.println(objectA.whatDoesHeDo("Job", "Car"));
        System.out.println(objectB.whatDoesHeDo("School", "Backpack"));
        System.out.println(objectC.whatDoesHeDo("Supermarket", "Money"));
    }
}
