import tw.fc.*;
import static tw.fc.Std.cout;
import static tw.fc.Std.cin;
import java.io.IOException;

public class TestSeason {
    static void test1(){
        Season s1 = new Season(3);
        Season s2 = new Season(0);
        Season s3 = new Season(2);
        cout.p(s1).p(", ").p(s2).p(", ").p(s3).pn(".");
    }
    
    static void test2(){
        Season s = new Season();
        for (int i = 0; i < 3; i++) {
            cin.g("Type a season: ", s);
            cout.p("The season is: ").pn(s);
        }
        
    }
    
    static void test3() throws IOException{
        TxOFStream fout = new TxOFStream("data1.txt");
        for (int i = 2, j = i + 7 ; i <= j ; i++) {
            fout.p(new Season(i%4)).p(" ");
        }
        fout.close();
    }
    
    static void test4() throws IOException{
        TxIFStream fin = new TxIFStream("data1.txt");
        Season s = new Season();
        while(!fin.skipWS().probeEOF()){
            fin.skipWS().g(s);
            cout.p(s).p(", ");
        }
        cout.pn("\b\b.");
    }
    
    public static void main(String[] Facebook) throws IOException{
//        test1();
//        test2();
        test3();
        test4();
    }
}
