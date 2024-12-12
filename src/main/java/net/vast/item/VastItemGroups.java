package net.vast.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vast.VAST;

public class VastItemGroups {
    public static final ItemGroup VAST_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VAST.MOD_ID,"vast"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vast"))
                    .icon(() -> new ItemStack(VastItems.CHRONOMIUM)).entries((displayContext, entries) -> {
                        entries.add(VastItems.CHRONOMIUM);
                        entries.add(VastItems.ACTIVATED_CHRONOMIUM);
                    }).build());

    public static void registerItemGroups() {
        VAST.LOGGER.info("groups registering for vast items");
    }
}
