package org.example;

    public enum Weapon {
        SWORD(50, 1.2),
        PISTOL(30, 3.0);

        private final int damage;
        private final double attackSpeed;

        Weapon(int damage, double attackSpeed) {
            this.damage = damage;
            this.attackSpeed = attackSpeed;
        }

        public int getDamage() {
            return damage;
        }

        public double getAttackSpeed() {
            return attackSpeed;
        }
    }
