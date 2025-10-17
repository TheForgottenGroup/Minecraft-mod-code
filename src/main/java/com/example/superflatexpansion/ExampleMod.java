// ...existing code...
package com.example.superflatexpansion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.neoforged.fml.common.Mod; // changed from net.minecraftforge

@Mod(ExampleMod.MODID)
public class ExampleMod {
    public static final String MODID = "superflatexpansion";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public ExampleMod() {
        // Mod constructor
    }
}
// ...existing code...