import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return "fire";
    }

    public void inferno(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with inferno");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void pyroBall(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with pyroBall");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void fireLash(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with fireLash");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void flameThrower(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with flameThrower");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
