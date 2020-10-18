/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.doubleLetters("orange"));
    }
    
    public boolean doubleLetters(String str){
        char[] tmp = str.toLowerCase().toCharArray();
        
        for(int i = 0; i < tmp.length-1; i++){
            if(tmp[i] == tmp[i + 1]){
                return true;
            }
        }
        return false;
    }
    
}
