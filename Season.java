import java.io.IOException;
import tw.fc.*;

public class Season implements PrintableI, ScannableI{
    
    int d;
    
    Season(){}
    
    Season(int season_id){
        this.d = season_id;
    }
    
    @Override public void printTo(TxOStream oS) throws IOException{
        oS.p("S").p(this.d);
    }
    
    @Override public void scanFrom(TxIStream iS) throws IOException{
        iS.skipWS().expect("S");
        this.d = iS.get_int();
    }
}
