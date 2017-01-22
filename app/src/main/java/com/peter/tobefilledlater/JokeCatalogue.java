package com.peter.tobefilledlater;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Peter on 5/21/2016.
 */
public class JokeCatalogue {

    private ArrayList<Joke> jokes= new ArrayList<>();
    public JokeCatalogue() {
        jokes.add(new Joke("Can a kangaroo jump higher than a house?","Of course, a house doesn’t jump at all."));

        jokes.add(new Joke(" It is so cold outside...","I saw a politician with his hands in his own pockets."));

        jokes.add(new Joke("My dog used to chase people on a bike a lot.","It got so bad, finally I had to take his bike away."));

        jokes.add(new Joke("What is the difference between a snowman and a snowwoman?.","Snowballs"));

        jokes.add(new Joke("What's the difference between a mosquito and a blonde?","The mosquito stops sucking when you slap it"));

        jokes.add(new Joke("Dad i like dogs, Me too, son"," no you don't get it"));

        jokes.add(new Joke("Why is lil Anne still a virgin?!","Cause she's faster than her papa"));

        jokes.add(new Joke("Why was 5 afraid of 6?","Because maths are terrible"));

        jokes.add(new Joke("Dad I had Sex for first time"+"Congratulations son. You are a man now. How do you feel?"
        ,"Well... My butt hurts!"));

        jokes.add(new Joke(
                "A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train. \n",
                "The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one."));

        jokes.add(new Joke(
                "Doctor: I'm sorry but you suffer from a terminal illness and have only 10 to live.\n"+
                        "Patient: What do you mean, 10? 10 what? Months? Weeks?!",
                "Doctor: Nine."));
    }

    public Joke sayRandomJoke(){
        int i = new Random().nextInt(jokes.size());
        return jokes.get(i);
    }
}
