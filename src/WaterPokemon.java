import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return "water";
    }


    public void surf(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with surf");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void hydroPump(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with hydroPump");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void hydroCanon(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with hydroCanon");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void rainDance(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with rainDance");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " gains a 20hp boost");
                enemy.setHp(enemy.getHp() + 20);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            default: {
                System.out.println("Has no effect on " + enemy.getName());
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
