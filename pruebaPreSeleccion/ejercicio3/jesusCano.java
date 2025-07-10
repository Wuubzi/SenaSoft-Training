/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletras;

/**
 *
 * @author DANIEL
 */
public class ejercicio3 {
    public static void main(String[] args) {
        int [] array ={2,4,0,100,11,2602,36};
        int [] array2 ={160,31719,19,11,13,-21};
        System.out.println(buscar(array2));
        
       
    }
   
     public static double buscar(int array[]){
        boolean validar =false;
        double punto1 =0 ,punto2=0;
         
        for(int i=2;i<array.length;i++){
            punto1=(array[i-1]%2);
            punto2=(array[i]%2);
         
            if(punto1!=punto2){
                if(punto1==(array[i-2]%2)){
                    return array[i];
                }else{
                    return array[i-1];
                }
                
            }else{
                if((array[i-2]%2)!=punto1){
                    return array[i-2];
                }
                
            }
                
              
        }
        
         return 1000;
    }
}
