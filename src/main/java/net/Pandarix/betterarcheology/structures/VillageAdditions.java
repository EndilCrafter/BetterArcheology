package net.Pandarix.betterarcheology.structures;

import com.sun.jdi.VoidValue;
import net.Pandarix.betterarcheology.BetterArcheology;
import net.Pandarix.betterarcheology.impl.FabricStructurePoolRegistry;
import net.minecraft.util.Identifier;

public class VillageAdditions {
    // Using https://github.com/fzzyhmstrs/structurized-reborn (Under MIT License)
    public static void registerNewVillageStructures() {
        FabricStructurePoolRegistry.registerSimple(
                new Identifier("minecraft:village/plains/streets"),
                new Identifier(BetterArcheology.MOD_ID, "catacombs"),
                1
        );
    }
}
