package strategy;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Character("Warrior", new MeleeAttackStrategy());
        Character archer = new Character("Archer",new RangedAttackStrategy());
        warrior.attack(archer);
    }
}

