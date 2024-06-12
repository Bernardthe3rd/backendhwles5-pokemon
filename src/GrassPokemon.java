import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return "grass";
    }


    public void leafStorm(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leafStorm");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void solarBeam(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with solarBeam");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public void leechSeed(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leechSeed");
        switch (pokemon.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 40hp" + pokemon.getName() + " gains 10hp");
                enemy.setHp(getHp() - 40);
                pokemon.setHp(getHp() + 40);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 30hp" + pokemon.getName() + " gains 20hp");
                enemy.setHp(getHp() - 30);
                pokemon.setHp(getHp() + 30);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 20hp" + pokemon.getName() + " gains 10hp");
                enemy.setHp(getHp() - 20);
                pokemon.setHp(getHp() + 20);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 10hp and " + pokemon.getName() + " gains 10hp");
                enemy.setHp(getHp() - 10);
                pokemon.setHp(getHp() + 10);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
        System.out.println(pokemon.getName() + " hp is " + pokemon.getHp());
    }

    public void leaveBlade(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leaveBlade");
        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 30hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            }
            default: {
                System.out.println(enemy.getName() + " loses 40hp");
                enemy.setHp(enemy.getHp() - 40);
                break;
            }
        }
        System.out.println(enemy.getName() + " hp is " + enemy.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
