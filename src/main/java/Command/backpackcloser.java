package Command;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class backpackcloser extends CommandBase {
    @Override
    public String getCommandName() {
        return "Cleanerclose";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender iCommandSender, String[] strings) throws CommandException {
        BackPackClear backPackClear=new BackPackClear();
        backPackClear.aBoolean=false;
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("closed"));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender p_canCommandSenderUseCommand_1_) {
        return  true;
    }
}
