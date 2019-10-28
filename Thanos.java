

import java.util.Collections;
import java.util.ArrayList;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
    	Hero bWidow = new Hero("Black Widow", 34);
        // name: Captain America, age: 100
    	Hero cAmerica = new Hero("Captain America", 100);
        // name: Vision, age: 3
    	Hero vision = new Hero("Vision", 3);
        // name: Iron Man, age: 48
    	Hero ironMan = new Hero("Iron Man", 48);
        // name: Scarlet Witch, age: 29
    	Hero sWitch = new Hero("Scarlet Witch", 29);
        // name: Thor, age: 1500
    	Hero thor = new Hero("Thor", 1500);
        // name: Spider-Man, age: 18
    	Hero spider = new Hero("Spider-Man", 18);
        // name: Hulk, age: 49
    	Hero hulk = new Hero("Hulk", 49);
        // name: Doctor Strange, age: 42
    	Hero drStrange = new Hero("Doctor Strange", 42);
    	
    	heroes.add(bWidow);
    	heroes.add(cAmerica);
    	heroes.add(vision);
    	heroes.add(ironMan);
    	heroes.add(sWitch);
    	heroes.add(thor);
    	heroes.add(spider);
    	heroes.add(hulk);
    	heroes.add(drStrange);
    	
    	
    	
        // TODO 3 : It's Thor birthday, now he's 1501
    	//Hero thor = new Hero("Thor", 1501);
    	thor.setAge(1501);
    	heroes.set(5, thor);
    	
    	
        // TODO 4 : Shuffle the heroes list
    	Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
    	ArrayList<Hero> heroesSub = new ArrayList<Hero>(heroes.subList(0, 5));
    	
    
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    	for(Hero hero : heroesSub) {
    		System.out.println(hero.getName());
    	}
    }
}