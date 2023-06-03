package strategy;

public class RangedAttackStrategy implements AttackStrategy{
    @Override
    public void attack(Character source, Character target) {
        System.out.println(source.getName() + "Performs a ranged attack on " + target.getName());
    }
}
