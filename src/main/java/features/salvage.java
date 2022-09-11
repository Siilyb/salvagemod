package features;


import Command.BackPackClear;
import Command.SalvageCommand;
import Main.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class salvage {
    Minecraft mc=Minecraft.getMinecraft();
    BackPackClear backPackClear=new BackPackClear();
    

    @SubscribeEvent
    public  void onSalvageEvent(GuiOpenEvent e) throws InterruptedException {
        if(isSalvageGui(e.gui)==0){
        salvageevent();
        }
        if(isSalvageGui(e.gui)==2){
            cleanerevent();
        }

    }

    public void click(final int slot, final boolean shift, final long delay){
        Minecraft.getMinecraft()

                .playerController.windowClick(Minecraft.getMinecraft()

                .thePlayer.openContainer.windowId, slot, 0,shift?1:0, Minecraft.getMinecraft()

                .thePlayer);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    private int isSalvageGui(GuiScreen guiScreen){
        if(guiScreen instanceof GuiChest){
            Container container=((GuiChest) guiScreen).inventorySlots;
            if(container instanceof  ContainerChest){
                if(((ContainerChest) container).getLowerChestInventory().getDisplayName().getUnformattedText().contains("Salvage")){
                    return  0;
                }
                if(((ContainerChest) container).getLowerChestInventory().getDisplayName().getUnformattedText().contains("Backpack")){
                    return 2;
                }
                //hi!
            }
        }
        return 1;
    }
    public void salvageevent(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    List<String> list=ExampleMod.salvagecommand.getStringList();
                    for (Slot s : Minecraft.getMinecraft()
                            .thePlayer.openContainer.inventorySlots) {
                        if (s.slotNumber > 53) {

                            ItemStack is = mc.thePlayer.inventoryContainer.getInventory().get(s.slotNumber - 45);


                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Slug Boot")) {
                                click(s.slotNumber, true, 300);
                                

                            }




                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Moogma Legging")) {
                                click(s.slotNumber, true, 300);
                                
                            }



                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Staff of the Volcano")) {
                                click(s.slotNumber, true, 300);
                                
                            }



                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Blade of the Volcano")) {
                                click(s.slotNumber, true, 300);
                                
                            }



                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Flaming Chestplate")) {
                                click(s.slotNumber, true, 300);
                                
                            }



                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Taurus Helmet")) {
                                click(s.slotNumber, true, 300);
                                
                            }

                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Rampart")) {
                                click(s.slotNumber, true, 300);
                                
                            }


                            for (int i = 0; i < list.size(); i++) {
                                if (is != null && is.hasDisplayName() && is.getDisplayName().contains(new SalvageCommand().stringList.get(i))) {
                                    click(s.slotNumber, true, 300);

                                    click(31, false, 300);

                                }
                            }






                        }
                    }
                }catch (Exception ignored){
                    return;
                }
            }
        }).start();
    }


    public void cleanerevent(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    List<String> list=ExampleMod.salvagecommand.getStringList();
                    for (Slot s : Minecraft.getMinecraft()
                            .thePlayer.openContainer.inventorySlots) {
                        if (s.slotNumber > 53) {

                            ItemStack is = mc.thePlayer.inventoryContainer.getInventory().get(s.slotNumber - 36);


                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Slug Boot")) {
                                click(s.slotNumber, true, 300);
                                

                            }




                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Moogma Legging")) {
                                click(s.slotNumber, true, 300);
                                
                            }



                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Staff of the Volcano")) {
                                click(s.slotNumber, true, 300);
                                
                            }



                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Blade of the Volcano")) {
                                click(s.slotNumber, true, 300);
                                
                            }



                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Flaming Chestplate")) {
                                click(s.slotNumber, true, 300);
                                
                            }



                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Taurus Helmet")) {
                                click(s.slotNumber, true, 300);
                                
                            }

                            if (is != null && is.hasDisplayName() && is.getDisplayName().contains("Rampart")) {
                                click(s.slotNumber, true, 300);
                                
                            }


                            for (int i = 0; i < list.size(); i++) {
                                if (is != null && is.hasDisplayName() && is.getDisplayName().contains(new SalvageCommand().stringList.get(i))) {
                                    click(s.slotNumber, true, 300);



                                }
                            }






                        }
                    }
                }catch (Exception ignored){
                    return;
                }
            }
        }).start();
    }

}


