package strategy;

public class Character {
    private String name;
    private AttackStrategy attackStrategy;

    public Character(String name, AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public String getName() {
        return name;
    }

    public void attack(Character target){
        attackStrategy.attack(this,target);
    }
}
