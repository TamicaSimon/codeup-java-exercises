import java.util.Scanner;

public class TextRPG {
    private static final int MAX_ENEMY_HEALTH = 20;
    private static final int MAX_HERO_HEALTH = 20;
    private static final int MIN_ATTACK_DAMAGE = 1;
    private static final int MAX_ATTACK_DAMAGE = 5;
    private static final int POTION_HEAL_AMOUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Text RPG game!");
        System.out.print("Are you ready to start? (yes/no) ");
        String startAnswer = scanner.nextLine();
        if (!startAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Well come back when you're ready!");
            return;
        }
        System.out.print("What's your name, hero? ");
        String heroName = scanner.nextLine();
        System.out.println("Welcome, " + heroName + "! I hope you're ready for this adventure.");

        int enemyHealth = MAX_ENEMY_HEALTH;
        int heroHealth = MAX_HERO_HEALTH;

        while (enemyHealth > 0 && heroHealth > 0) {
            System.out.println("\nYour stats: Health = " + heroHealth);
            System.out.println("Enemy stats: Health = " + enemyHealth);

            System.out.print("\nWhat do you want to do? (attack/potion/run) ");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("attack")) {
                int attackDamage = (int) (Math.random() * (MAX_ATTACK_DAMAGE - MIN_ATTACK_DAMAGE + 1)) + MIN_ATTACK_DAMAGE;
                System.out.println("You attack the enemy for " + attackDamage + " damage!");
                enemyHealth -= attackDamage;
            } else if (action.equalsIgnoreCase("potion")) {
                if (heroHealth == MAX_HERO_HEALTH) {
                    System.out.println("Your health is already full!");
                } else {
                    heroHealth += POTION_HEAL_AMOUNT;
                    if (heroHealth > MAX_HERO_HEALTH) {
                        heroHealth = MAX_HERO_HEALTH;
                    }
                    System.out.println("You drink a potion and heal " + POTION_HEAL_AMOUNT + " health.");
                }
            } else if (action.equalsIgnoreCase("run")) {
                System.out.println("You ran away.  You're a coward!");
                return;
            } else {
                System.out.println("Try again.");
            }

            if (enemyHealth <= 0) {
                System.out.println("\nYou defeated the enemy! Congratulations, hero!");
            } else {
                int enemyAttackDamage = (int) (Math.random() * (MAX_ATTACK_DAMAGE - MIN_ATTACK_DAMAGE + 1)) + MIN_ATTACK_DAMAGE;
                System.out.println("\nThe enemy attacks you for " + enemyAttackDamage + " damage!");
                heroHealth -= enemyAttackDamage;
                if (heroHealth <= 0) {
                    System.out.println("You died. Game over.");
                }
            }
        }
    }
}

