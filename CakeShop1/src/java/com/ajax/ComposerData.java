package com.ajax;

import java.util.HashMap;

public class ComposerData {
    
    private HashMap composers = new HashMap();
    

    public HashMap getComposers() {
        return composers;
    }
    
    public ComposerData() {
        
        composers.put("1", new Composer("1", "XBOX One"));
        composers.put("2", new Composer("2", "XBOX 360"));
        composers.put("3", new Composer("3", "PS3"));
        composers.put("4", new Composer("4", "PS4"));
        composers.put("5", new Composer("5", "Wii"));
        composers.put("6", new Composer("6", "WiiU"));
        composers.put("7", new Composer("7", "Ea"));
        composers.put("8", new Composer("8", "Take-Two Interactive"));
        composers.put("9", new Composer("9", "Activision"));
        composers.put("10", new Composer("10", "Accessories"));
        composers.put("11", new Composer("11", "Offers"));
    }

}
