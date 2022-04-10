package Contınue;
public enum Color_Enum {
    Yellow,Black,Blue,Green,White,Pink,Orange;
    public static int size()
    {
        int size=0;
         for(Color_Enum i:Color_Enum.values())
             size++;
         return size;
    }
}




