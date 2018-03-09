import java.util.Scanner;

public class Goteras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, drop, tempH, tempM, tempS, temp;
        String h = "0", m = "0", s = "0";
        
        n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            drop = sc.nextInt();
            
            if(drop < 60){
                if(drop < 10){
                    if(drop == 0){
                        s = "00";
                    }else{
                        s = "0";
                        s = s + String.valueOf(drop);
                    }
                }else{
                    s = String.valueOf(drop);
                }
                
                System.out.println("00:00:"+ s);
            }else if((drop < 3600) && (drop >= 60)){
                tempM = drop / 60;
                
                if(tempM < 10){
                    if(tempM == 0){
                        m = "00";
                    }else{
                        m = "0";
                        m = m + String.valueOf(tempM);
                    }
                }else{
                    m = String.valueOf(tempM);
                }
                
                tempS = drop - (tempM*60);
                
                if(tempS < 10){
                    if(tempS == 0){
                        s = "00";
                    }else{
                        s = "0";
                        s = s + String.valueOf(tempS);
                    }
                }else{
                    s = String.valueOf(tempS);
                }
                
                System.out.println("00:"+m+":"+s);
            }else if(drop >= 3600){
                tempH = drop / 3600;
                
                if(tempH < 10){
                    h = "0";
                    h = h + String.valueOf(tempH);
                }else{
                    h = String.valueOf(tempH);
                }
                
                drop = drop - (tempH * 3600);
                
                tempM = drop / 60;
                
                if(tempM < 10){
                    if(tempM == 0){
                        m = "00";
                    }else{
                        m = "0";
                        m = m + String.valueOf(tempM);
                    }
                }else{
                    m = String.valueOf(tempM);
                }
                
                tempS = drop - (tempM*60);
                
                if(tempS < 10){
                    if(tempS == 0){
                        s = "00";
                    }else{
                        s = "0";
                        s = s + String.valueOf(tempS);
                    }
                }else{
                    s = String.valueOf(tempS);
                }
                
                System.out.println(h+":"+m+":"+s);
            }
        }
    }
    
}