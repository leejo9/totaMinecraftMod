package dev.tota.init;

import dev.tota.blocks.BlockTruffle;
import dev.tota.tota;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, tota.MODID);
    public static final RegistryObject<Block> TRUFFLE = register("block_truffle", ()-> new BlockTruffle(BlockBehaviour.Properties.of(Material.CACTUS).dynamicShape().noOcclusion()), new Item.Properties());

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, ()-> new BlockItem(block.get(), properties));
        return block;
    }
}
