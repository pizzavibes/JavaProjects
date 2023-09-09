package breakwhile;
public class BreakWhile {
    public static void main(String[] args) {
        int eo=3;
        while(eo<=12){
            if (eo==8) {
                eo++;
                break;
                
            }
            System.out.println(eo);
            eo++;
            
        }
    }
    
}
