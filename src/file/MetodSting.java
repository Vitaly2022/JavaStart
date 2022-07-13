package file;

public class MetodSting {

    public static int find1(String Str) {
        int i=0;
        int a=0;
        int b=0;
        a = Str.indexOf("docnum");
        b = Str.indexOf("contract");
        if ((a!=0)||(b!=0)) i++;
        return i;
    }


}
