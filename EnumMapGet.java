package com.keyword;

import java.util.EnumMap;

enum Code{R,B,G,Y,O}
public class EnumMapGet
{
    public static void main(String[] args)
    {
        EnumMap<Code,String> map = new EnumMap<Code, String>(Code.class);
        map.put(Code.R,"RED");
        map.put(Code.B,"BLUE");
        map.put(Code.G,"GREEN");
        map.put(Code.Y,"YELLOW");
        map.put(Code.O,"ORANGE");
        System.out.println("The Map is "+map);
        System.out.println("The Value for B is "+map.get(Code.B));

    }
}
