import dk.sdu.collision.CollisionDetection;
import dk.sdu.common.services.IPostEntityProcessingService;

module Collision {
    requires Common;

    provides IPostEntityProcessingService with CollisionDetection;
}