import dk.sdu.bullet.BulletControlSystem;
import dk.sdu.bullet.BulletPlugin;
import dk.sdu.common.services.IBulletCreator;
import dk.sdu.common.services.IEntityProcessingService;
import dk.sdu.common.services.IGamePluginService;

module CommonWeapon {
    requires Common;

    provides IBulletCreator with BulletPlugin;
    provides IGamePluginService with BulletPlugin;
    provides IEntityProcessingService with BulletControlSystem;
}