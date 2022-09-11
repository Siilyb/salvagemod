package Main;

import Command.BackPackClear;
import Command.SalvageCommand;

import Command.Salvagelist;

import Command.backpackcloser;
import com.google.common.io.Files;
import com.google.gson.Gson;

import features.salvage;

import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.lwjgl.Sys;

import java.io.*;

import java.util.List;
import java.util.stream.Collectors;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "autosalvage";
    public static final String VERSION = "1.0";
    public static SalvageCommand salvagecommand = new SalvageCommand();


    @EventHandler
    public void init(final FMLInitializationEvent event) throws IOException {
        MinecraftForge.EVENT_BUS.register(new salvage());

        ClientCommandHandler.instance.registerCommand((ICommand)salvagecommand);
        ClientCommandHandler.instance.registerCommand((ICommand)new Salvagelist());
        ClientCommandHandler.instance.registerCommand((ICommand) new BackPackClear());
        ClientCommandHandler.instance.registerCommand((ICommand) new backpackcloser());

    }
















}



