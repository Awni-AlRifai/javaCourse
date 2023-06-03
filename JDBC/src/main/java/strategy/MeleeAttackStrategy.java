package strategy;

public class MeleeAttackStrategy implements AttackStrategy {
    @Override
    public void attack(Character source, Character target) {
        System.out.println(source.getName() + "Performs a melee attack on " + target.getName() );
    }
}
