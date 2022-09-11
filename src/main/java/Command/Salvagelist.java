package Command;

import Main.ExampleMod;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import java.util.List;

public class Salvagelist extends CommandBase {
    @Override
    public String getCommandName() {
        return "salvagelist";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender iCommandSender, String[] strings)  {
        List<String> list=ExampleMod.salvagecommand.getStringList();
        for(int i=0;i<list.size();i++){
            iCommandSender.addChatMessage(new ChatComponentText(i+". "+list.get(i)+"\n"));

        }iCommandSender.addChatMessage(new ChatComponentText("\nSlug Boots \nMoogma Leggings\nFlaming Chestplate\nTaurus Helmet\nBlade/Staff of the Volcano\n Rampart cp/legg"));

    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender p_canCommandSenderUseCommand_1_) {
        return true;
    }
}
