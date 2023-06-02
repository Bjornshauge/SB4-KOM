package dk.sdu.common.services;

import dk.sdu.common.data.Entity;
import dk.sdu.common.data.GameData;

public interface IBulletCreator {
    /**
     * Create a weapon based on an entity as the shooter.
     * <br />
     * Pre-condition: Game running and shooting entity wants bullet to appear.<br />
     * Post-condition: Bullet entity that is ready to be added to the game world.
     *
     * @param shooter World of the game
     * @param gameData Data for the game
     *
     * @return Bullet Entity
     *
     * @see Entity
     * @see GameData
     */
    Entity create(Entity shooter, GameData gameData);
}
