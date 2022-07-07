package Exception;

public class M1ab2 {

    public static boolean m_1ab2(String Str) {
        int i = Str.indexOf("1a2b");
        int b = Str.length();
        boolean c=true;
        if ((b-i-4)!=0) c=false;
        return c;
    }
}
