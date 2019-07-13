package morseCodeNew;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeDecoder
{
    public static void main(String[] args)
    {
    	// This code works for words
    	Mapping forA = new Mapping("A", ".-");
        Mapping forB = new Mapping("B", "-...");
        Mapping forC = new Mapping("C", "-.-.");
        Mapping forD = new Mapping("D", "-..");
        Mapping forE = new Mapping("E", ".");
        Mapping forF = new Mapping("F", "..-.");
        Mapping forG = new Mapping("G", "--.");
        Mapping forH = new Mapping("H", "....");
        Mapping forI = new Mapping("I", "..");
        Mapping forJ = new Mapping("J", ".---");
        Mapping forK = new Mapping("K", "-.-");
        Mapping forL = new Mapping("L", ".-..");
        Mapping forM = new Mapping("M", "--");
        Mapping forN = new Mapping("N", "-.");
        Mapping forO = new Mapping("O", "---");
        Mapping forP = new Mapping("P", ".--.");
        Mapping forQ = new Mapping("Q", "--.-");
        Mapping forR = new Mapping("R", ".-.");
        Mapping forS = new Mapping("S", "...");
        Mapping forT = new Mapping("T", "-");
        Mapping forU = new Mapping("U", "..-");
        Mapping forV = new Mapping("V", "...-");
        Mapping forW = new Mapping("W", ".--");
        Mapping forX = new Mapping("X", "-..-");
        Mapping forY = new Mapping("Y", "-.--");
        Mapping forZ = new Mapping("Z", "--..");
        
        Mapping forComma = new Mapping(",", "--..--");
        Mapping forPeriod = new Mapping(".", ".-.-.-");
        
        Mapping for1 = new Mapping("1", ".----");
        Mapping for2 = new Mapping("2", "..---");
        Mapping for3 = new Mapping("3", "...--");
        Mapping for4 = new Mapping("4", "....-");
        Mapping for5 = new Mapping("5", ".....");
        Mapping for6 = new Mapping("6", "-....");
        Mapping for7 = new Mapping("7", "--...");
        Mapping for8 = new Mapping("8", "---..");
        Mapping for9 = new Mapping("9", "----.");
        Mapping for0 = new Mapping("0", "-----");
        
        // Generic Type with two type parameters
        Map<String, Mapping> mapMorse = new HashMap<>();

        // for morse to mapping
        mapMorse.put(forA.getCode(), forA);
        mapMorse.put(forB.getCode(), forB);
        mapMorse.put(forC.getCode(), forC);
        mapMorse.put(forD.getCode(), forD);
        mapMorse.put(forE.getCode(), forE);
        mapMorse.put(forF.getCode(), forF);
        mapMorse.put(forG.getCode(), forG);
        mapMorse.put(forH.getCode(), forH);
        mapMorse.put(forI.getCode(), forI);
        mapMorse.put(forJ.getCode(), forJ);
        mapMorse.put(forK.getCode(), forK);
        mapMorse.put(forL.getCode(), forL);
        mapMorse.put(forM.getCode(), forM);
        mapMorse.put(forN.getCode(), forN);
        mapMorse.put(forO.getCode(), forO);
        mapMorse.put(forP.getCode(), forP);
        mapMorse.put(forQ.getCode(), forQ);
        mapMorse.put(forR.getCode(), forR);
        mapMorse.put(forS.getCode(), forS);
        mapMorse.put(forT.getCode(), forT);
        mapMorse.put(forU.getCode(), forU);
        mapMorse.put(forV.getCode(), forV);
        mapMorse.put(forW.getCode(), forW);
        mapMorse.put(forX.getCode(), forX);
        mapMorse.put(forY.getCode(), forY);
        mapMorse.put(forZ.getCode(), forZ);
        
        mapMorse.put(forComma.getCode(), forComma);
        mapMorse.put(forPeriod.getCode(), forPeriod);
        
        mapMorse.put(for1.getCode(), for1);
        mapMorse.put(for2.getCode(), for2);
        mapMorse.put(for3.getCode(), for3);
        mapMorse.put(for4.getCode(), for4);
        mapMorse.put(for5.getCode(), for5);
        mapMorse.put(for6.getCode(), for6);
        mapMorse.put(for7.getCode(), for7);
        mapMorse.put(for8.getCode(), for8);
        mapMorse.put(for9.getCode(), for9);
        mapMorse.put(for0.getCode(), for0);
        
        // Decode
        System.out.println("The convention followed for Morse Code is as below");
        System.out.println("Individual letters are separated by a space while individual words are separated by a forward slash (/).");
        System.out.println("Please enter the data to be converted from Morse Code");

        Scanner scan = new Scanner(System.in);
        String arr=scan.nextLine();
        //System.out.println(arr);
        char temp ;
                
        String lines[] = arr.split(" ");
        //System.out.println(lines[0] + "input " + lines[1]);
        for (int j=0; j<lines.length; j++)
        {
        	String temp2 = Character.toString(lines[j].charAt(0));
        	if (lines[j].length() == 1 & lines[j].charAt(0) == '/')
        	{
        		System.out.print(" ");
        	}
        	for(int i=1; i<lines[j].length();i++)
            {
            	if(lines[j].charAt(i) == '/')
            	{
            		break;
            	}
            	else
            	{
            		temp2 += lines[j].charAt(i);
            	}
            }
        	//System.out.println(temp2 + "Value for one letter");
            for (Mapping code : mapMorse.values())
            {
              	if (code.getCode().equals(temp2))
               	{
               		System.out.print(code.getLetter());
               	}
            }
        }
        // Nishant = -. .. ... .... .- -. - 
        
        
     
    }

}
