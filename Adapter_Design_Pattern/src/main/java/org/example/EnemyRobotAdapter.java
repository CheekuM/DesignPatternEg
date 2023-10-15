package org.example;

public class EnemyRobotAdapter implements EnemyAttacker {
    EnemyRobt enemyRobt;

    EnemyRobotAdapter(EnemyRobt enemyRobt) {
        this.enemyRobt = enemyRobt;
    }

    @Override
    public void fireWeapon() {
        enemyRobt.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobt.walkForward();
    }

    @Override
    public void assignDriver(String DriverName) {
        enemyRobt.reactTohuman(DriverName);
    }
}
