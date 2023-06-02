package dk.sdu.components;

import dk.sdu.common.data.GameData;
import dk.sdu.common.data.World;
import dk.sdu.common.services.IEntityProcessingService;
import dk.sdu.common.util.SPILocator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("processorInjector")
public class ProcessInjector implements IProcessor {
    @Override
    public void process(GameData gameData, World world) {
        List<IEntityProcessingService> processors = SPILocator.locateAll(IEntityProcessingService.class);
        processors.forEach((processor) -> processor.process(gameData, world));
    }
}
