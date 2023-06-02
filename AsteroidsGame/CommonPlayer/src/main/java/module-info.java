import dk.sdu.common.services.IBulletCreator;
import dk.sdu.common.services.IEntityProcessingService;
import dk.sdu.common.services.IGamePluginService;
import dk.sdu.player.PlayerControlSystem;
import dk.sdu.player.PlayerPlugin;

module DefaultPlayer {
    requires Common;

    uses IBulletCreator;

    provides IGamePluginService with PlayerPlugin;
    provides IEntityProcessingService with PlayerControlSystem;
}