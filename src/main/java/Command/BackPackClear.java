package Command;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class BackPackClear extends CommandBase {
    public boolean aBoolean=false;
    @Override
    public String getCommandName() {
        return "Cleaneropen";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender iCommandSender, String[] strings) throws CommandException {
        aBoolean=true;
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("open"));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender p_canCommandSenderUseCommand_1_) {
        return  true;
    }
}
