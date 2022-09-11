package Command;

import Main.ExampleMod;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import scala.collection.script.Remove;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SalvageCommand extends CommandBase {

    ExampleMod exampleMod=new ExampleMod();
    public List<String> stringList = new ArrayList<String>();

    @Override
    public String getCommandName() {
        return "salvageadd";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender iCommandSender, String[] strings) throws CommandException {
        iCommandSender.addChatMessage(new ChatComponentText("done"));
            for(int i=0;i<strings.length;i++){
                if(stringList.contains(strings[i])!=true){
                    stringList.add(strings[i].replace("_"," "));

                }
            }



    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender p_canCommandSenderUseCommand_1_) {
        return true;
    }

    public List<String> getStringList() {

        return stringList;
    }

    public void cfg() throws IOException {
        File f = new File(System.getProperty("user.dir") + "/test.cfg");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
        if (!f.exists()) {
            f.createNewFile();
        }
    }

}
