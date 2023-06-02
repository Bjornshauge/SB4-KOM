import dk.sdu.asteroid.AsteroidControlSystem;
import dk.sdu.asteroid.AsteroidPlugin;
import dk.sdu.common.services.IEntityProcessingService;
import dk.sdu.common.services.IGamePluginService;

module Asteroid {
    requires Common;

    provides IGamePluginService with AsteroidPlugin;
    provides IEntityProcessingService with AsteroidControlSystem;
}