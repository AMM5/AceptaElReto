
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diang
 */
public class Problema150 {
    static java.util.Scanner   in;
 
    public  static   void   main ( String   args [ ] ){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int num = sc.nextInt();
        String c = sc.next();
        while(!c.equals("0")){
            sb.delete(0, sb.length());
            for(int i = 0; i < num-1; i++){
                sb.append(" ");
            }

            for(int i = 1; i < num+1; i++){
                if(i == 1){
                    for(int e = 0; e < num; e++){
                         sb.append(c);
                    }
                    sb.append(" ");
                }else{
                    int aux = num-i;
                    sb.replace(aux,aux+1, c);
                    sb.insert(sb.length()-1,c);
                }
                System.out.println(sb);
            }
            for(int i = num; i > 1; i--){
                sb.delete(sb.length()-2, sb.length()-1);
                sb.replace(num-i, num-i+1, " ");
                System.out.println(sb);
            }
            num = sc.nextInt();
            c = sc.next();
        }
    }
}
