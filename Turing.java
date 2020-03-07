/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turing;

import java.util.Scanner;

/**
 *
 * @author Surinder Rawat
 */
public class Turing {

    public static String[][] getMatrix() {
        Scanner sc = new Scanner(System.in);
        int rowsLen = sc.nextInt();
        int colsLen = sc.nextInt();
        String matrix[][] = new String[rowsLen][colsLen];
        int i;
        for(i=0;i<rowsLen;i++){
            String line = sc.next();
            for(int j=0;j<line.length();j++) {
               matrix[i][j] = String.valueOf(line.charAt(j));  
            }
        }
        return matrix;
    }
    
    public static void main(String args[])
    {
        int result = numOffices(getMatrix()); 
        System.out.println(result);
    }
    
    public static int numOffices(String[][] grid) {
        int result = 0;
        boolean status=false;        
        for(int i=0;i<grid.length;i++){            
            for(int k=0;k<grid[i].length;k++){
                try{
                    
                    if((k-1 >= 0) && (k-1 < grid.length) 
                            && !status
                            && ((grid[i][k-1].equals("1")))
                        ){
                        continue;
                    }                    
                    
                    if((i-1 >= 0)
                            && (i-1 < grid.length)                            
                            && !status
                            && ((grid[i-1][k].equals("1")))
                        ){
                        continue;
                    }

                    if(!status && grid[i][k].equals("1")){
                        status=true;
                        result++;
                        continue;
                    }

                    if(!grid[i][k].equals("1")){
                        status=false;
                    }
                } catch(Exception e){
                    System.out.println("turing.Turing.numOffices()");
                }
            }
        }

        
        return result;
    }
    
}
