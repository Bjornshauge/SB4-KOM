package dk.sdu.components;

import dk.sdu.common.data.GameData;
import dk.sdu.common.data.World;
import dk.sdu.common.services.IGamePluginService;
import dk.sdu.common.util.SPILocator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pluginInjector")
public class PluginInjector {

    public void startPlugins(GameData gameData, World world) {
        List<IGamePluginService> plugins = SPILocator.locateAll(IGamePluginService.class);
        plugins.forEach((plugin) -> plugin.start(gameData, world));
    }
}
