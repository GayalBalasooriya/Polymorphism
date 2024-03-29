package com.company;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }


}

class IndependeneceDay extends Movie{
    public IndependeneceDay(){
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempts to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and accept a maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }


}

public class Main {

    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie "+i+" : "+movie.getName()+
                    "\n"+"Plot : "+movie.plot()+"\n");
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1;
        System.out.println("Random number generated was "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependeneceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

        }
        return null;
    }
}
