import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return "electric";
    }


    public void thunderPunch(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with thunderPunch");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void electroBall(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with electroBall");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void thunder(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with thunder");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " gains a 10hp boost!");
                enemy.setHp(enemy.getHp() + 10);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void voltTackle(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with voltTackle");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
