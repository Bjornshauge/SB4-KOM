import dk.sdu.common.services.IBulletCreator;
import dk.sdu.common.services.IEntityProcessingService;
import dk.sdu.common.services.IGamePluginService;
import dk.sdu.common.util.SPILocator;
import dk.sdu.enemy.EnemyControlSystem;
import dk.sdu.enemy.EnemyPlugin;

module DefaultEnemy {
    requires Common;

    uses SPILocator;
    uses IBulletCreator;

    provides IGamePluginService with EnemyPlugin;
    provides IEntityProcessingService with EnemyControlSystem;
}