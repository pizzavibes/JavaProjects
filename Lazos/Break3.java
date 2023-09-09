package break3;
public class Break3 {

    public static void main(String[] args) {
        jajas:
        for (int i = 0; i < 10; i++) {
            atak:
            for (int j = 1; j < 12; j++) {
                if (i==2&&j==2) {
                    break jajas;
                }
                 System.out.println(i+" "+j);
            }
            
               
            }
        }
    }
    

