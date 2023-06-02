package dk.sdu.common.services;

import dk.sdu.common.data.GameData;
import dk.sdu.common.data.World;

/**
 * Entity processing service for after ordinary processing
 *
 * @author jcs
 */
public interface IPostEntityProcessingService  {
        /**
         * Process entity after all ordinary processing of entities, things like collision detection and relevant death logic.<br />
         * Pre-condition: A game tick has passed since last call and all entities has been processed.<br />
         * Post-condition: The entity has been processed and updated.
         * 
         * @param gameData Data for the game
         * @param world World of the game
         * 
         * @see GameData
         * @see World
         */
        void process(GameData gameData, World world);
}
