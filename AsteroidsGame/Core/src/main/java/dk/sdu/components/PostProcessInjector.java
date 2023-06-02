package dk.sdu.components;

import dk.sdu.common.data.GameData;
import dk.sdu.common.data.World;
import dk.sdu.common.services.IPostEntityProcessingService;
import dk.sdu.common.util.SPILocator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("postProcessorInjector")
public class PostProcessInjector implements IProcessor {
    @Override
    public void process(GameData gameData, World world) {
        List<IPostEntityProcessingService> processors = SPILocator.locateAll(IPostEntityProcessingService.class);
        processors.forEach((processor) -> processor.process(gameData, world));
    }
}
