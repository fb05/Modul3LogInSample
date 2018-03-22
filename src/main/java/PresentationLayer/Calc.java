/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;



/**
 *
 * @author simon
 */
public class Calc {
    
    
    public int[]result(int height, int length, int width){

    int[]res = new int[3];    
        
    
    int[]arrayL;
    int[]arrayW;
    
    int sumLarge = 0;
    int sumMed = 0;
    int sumSmall = 0;

    
    while(height>0){
      int layer = height%2;
        
switch(layer){
    
    
    case 0:
    arrayL = sideCalc2(length);
    sumLarge = sumLarge + arrayL[0];
    sumMed = sumMed + arrayL[1];
    sumSmall = sumSmall + arrayL[2];
    
    arrayW = widthCalc2(width);
    sumLarge = sumLarge + arrayW[0];
    sumMed = sumMed + arrayW[1];
    sumSmall = sumSmall + arrayW[2];
    
    height--;
    
    break;
    
    case 1:
    arrayL = sideCalc1(length);
    sumLarge = sumLarge + arrayL[0];
    sumMed = sumMed + arrayL[1];
    sumSmall = sumSmall + arrayL[2];
    
    arrayW = widthCalc1(width);
    sumLarge = sumLarge + arrayW[0];
    sumMed = sumMed + arrayW[1];
    sumSmall = sumSmall + arrayW[2];
    
    height--;
    
    break;
}
res[0] = sumLarge;
res[1] = sumMed;
res[2] = sumSmall;
}

    for(int i = 0; i < res.length; i++)
    {
        System.out.println(res[i]);
    }
    
return res;
}    
    public int[] sideCalc1(int length){
        int[] bricks = new int[3];
        int theBrick = 4;
        int countLarge = 0;
        int countMed = 0;
        int countSmall = 0;

        
        
        while(theBrick <= length)
        {
            length = length - theBrick;
            countLarge++;
        }
        theBrick = 2;
        while(theBrick <= length)    
        {
            length = length-theBrick;
            countMed++;
        }
        theBrick = 1;
        while(theBrick <= length)    
        {
            length = length-theBrick;
            countSmall++;
        }

        countLarge = countLarge*2;
        countMed = countMed*2;
        countSmall = countSmall*2;
        
        bricks[0] = countLarge;
        bricks[1] = countMed;
        bricks[2] = countSmall;

        return bricks;
    }
    public int[] sideCalc2(int length){
        int[] bricks = new int[3];
        int theBrick = 4;
        int countLarge = 0;
        int countMed = 0;
        int countSmall = 1;
        length--;
        
        
        while(theBrick <= length)
        {
            length = length - theBrick;
            countLarge++;
        }
        theBrick = 2;
        while(theBrick <= length)    
        {
            length = length-theBrick;
            countMed++;
        }
        theBrick = 1;
        while(theBrick <= length)    
        {
            length = length-theBrick;
            countSmall++;
        }
        
        countLarge = countLarge*2;
        countMed = countMed*2;
        countSmall = countSmall*2;
        
        bricks[0] = countLarge;
        bricks[1] = countMed;
        bricks[2] = countSmall;
        System.out.println("S2  "+countSmall);
        return bricks;
    }
    
        public int[] widthCalc1(int length){
        int[] bricks = new int[3];
        int theBrick = 4;
        int countLarge = 0;
        int countMed = 0;
        int countSmall = 0;
        length = length - 4;
        
        
        while(theBrick <= length)
        {
            length = length - theBrick;
            countLarge++;
        }
        theBrick = 2;
        while(theBrick <= length)    
        {
            length = length-theBrick;
            countMed++;
        }
        theBrick = 1;
        while(theBrick <= length)    
        {
            length = length-theBrick;
            countSmall++;
        }
        
        countLarge = countLarge*2;
        countMed = countMed*2;
        countSmall = countSmall*2;

        bricks[0] = countLarge;
        bricks[1] = countMed;
        bricks[2] = countSmall;

        return bricks;
        }
        
        public int[] widthCalc2(int length){
        int[] bricks = new int[3];
        int theBrick = 4;
        int countLarge = 0;
        int countMed = 0;
        int countSmall = 1;
        length = length - 5;
        
        
        while(theBrick <= length)
        {
            length = length - theBrick;
            countLarge++;
        }
        theBrick = 2;
        while(theBrick <= length)    
        {
            length = length-theBrick;
            countMed++;
        }
        theBrick = 1;
        while(theBrick <= length)    
        {
            length = length-theBrick;
            countSmall++;
        }
        
        countLarge = countLarge*2;
        countMed = countMed*2;
        countSmall = countSmall*2;

        bricks[0] = countLarge;
        bricks[1] = countMed;
        bricks[2] = countSmall;
            System.out.println("W2  "+countSmall);
        return bricks;
        }
        
        
    public static void main(String[] args) {
        Calc c = new Calc();
        c.result(2, 4, 6);
        
    }
}
