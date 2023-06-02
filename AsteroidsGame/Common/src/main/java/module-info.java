import dk.sdu.common.services.IBulletCreator;
import dk.sdu.common.services.IEntityProcessingService;
import dk.sdu.common.services.IGamePluginService;
import dk.sdu.common.services.IPostEntityProcessingService;

module Common {
    exports dk.sdu.common.services;
    exports dk.sdu.common.data;
    exports dk.sdu.common.data.entityparts;
    exports dk.sdu.common.util;

    uses IBulletCreator;
    uses IGamePluginService;
    uses IEntityProcessingService;
    uses IPostEntityProcessingService;
}