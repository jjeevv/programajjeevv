import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GalosRomanosYOtrasGentes {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        int n, i;
        String name, nameAux;
        
        n = Integer.parseInt (br.readLine());
        
        for(i=0; i<n; i++){
            name = br.readLine();
            
            if(checkSuffixA(name)){
                if(checkPre(name)){
                    System.out.println("MULATO");
                }else{
                    System.out.println("INDIO");
                }
            }else{
                nameAux = checkSuffixRest(name);
                
                if(!(nameAux.equals("NOTHING"))){
                    if(checkPre(name)){
                        System.out.println("MULATO");
                    }else{
                        System.out.println(nameAux);
                    }
                }else if(checkPre(name)){
                    System.out.println("PICTO");
                }else{
                    System.out.println("PLUS ULTRA");
                }
            }
        }
    }
    
    public static boolean checkSuffixA(String name){
        boolean res = false;
        
        if(name.charAt(name.length()-1) == 'A'){
            res = true;
        }
        
        return res;
    }
    
    public static String checkSuffixRest(String name){
        String res, suffix;
        
        if(name.length() < 3){
            suffix = name;
        }else{
            suffix = name.substring(name.length()-2);
        }
        
        switch(suffix){
            case "IX":
                res = "GALO";
                break;

            case "US":
                res = "ROMANO";
                break;

            case "UM":
                res = "ROMANO";
                break;

            case "IC":
                res = "GODO";
                break;

            case "AS":
                res = "GRIEGO";
                break;

            case "AF":
                res = "NORMANDO";
                break;

            case "IS":
                res = "BRETON";
                break;

            case "OS":
                res = "BRETON";
                break;

            case "AX":
                res = "BRETON";
                break;

            case "EZ":
                res = "HISPANO";
                break;

            default:
                res = "NOTHING";
        }
        
        return res;
    }
    
    public static boolean checkPre(String name){
        boolean res = false;
        String pre;
        
        if(name.length() < 3){
            res = false;
        }else{
            pre = name.substring(0,3);
                
            if(pre.equals("MAC")){
                res = true;
            } 
        }
        
        return res;
    }
}