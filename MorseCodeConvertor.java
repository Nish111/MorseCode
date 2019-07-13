package morseCodeNew;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConvertor
{
    public static void main(String[] args)
    {
    	Map<String, Mapping> mapAll = englishMapping();
                
        System.out.println("The convention followed for Morse Code is as below");
        System.out.println("Individual letters are separated by a space while individual words are separated by a forward slash (/).");
        //System.out.println("For English inout enter 'E', For Devnagari enter 'D'");
        System.out.println("Please enter the data to be converted to Morse Code");

        morseCoder(mapAll);
       /*
        * This is Zoro. Pirate Hunter
- .... .. ... / .. ... / --.. --- .-. --- .-.-.- / .--. .. .-. .- - . / .... ..- -. - . .-. 
        */
        
      
        
        
// https://www.geocaching.com/geocache/GC2T9M6_morse-code?guid=1490daee-7c43-4761-b8d7-be7db2d7b2d5
      /*
       * Morse code can be written in different ways. The two most common are shown below:
1) Individual letters are separated by a space while individual words are separated by a forward slash (/).
2) Individual letters are separated by a forward slash (/) and individual words are separated by a DOUBLE forward slash (//). 
Sentences in this format are separated by Four slashes (////).

As an example, let's use the first sentence above ↑: "This is a simple, yet challenging cache."
Written as in Example #1 above it would be written the following way
- .... .. ... / .. ... / .- / ... .. -- .--. .-.. . --..-- / -.-- . - / -.-. .... .- .-.. .-.. . -. --. .. -. --. / -.-. .- -.-. .... . .-.-.-
Written as in Example #2 above it would be written like this
-/..../../...//../...//.-//.../../--/.--./.-.././--..--//-.--/./-//-.-./..../.-/.-../.-.././-./--./../-./--.//-.-./.-/-.-./...././.-.-.////
       */
    }

	private static Map<String, Mapping> englishMapping() {
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
        // https://en.wikipedia.org/wiki/Morse_code_for_non-Latin_alphabets
        // Generic Type with two type parameters
        Map<String, Mapping> mapAll = new HashMap<>();

        // generic put method - parameterized by both key and value
        mapAll.put(forA.getLetter(), forA);
        mapAll.put(forB.getLetter(), forB);
        mapAll.put(forC.getLetter(), forC);
        mapAll.put(forD.getLetter(), forD);
        mapAll.put(forE.getLetter(), forE);
        mapAll.put(forF.getLetter(), forF);
        mapAll.put(forG.getLetter(), forG);
        mapAll.put(forH.getLetter(), forH); 
        mapAll.put(forI.getLetter(), forI);
        mapAll.put(forJ.getLetter(), forJ);
        mapAll.put(forK.getLetter(), forK);
        mapAll.put(forL.getLetter(), forL);
        mapAll.put(forM.getLetter(), forM);
        mapAll.put(forN.getLetter(), forN);
        mapAll.put(forO.getLetter(), forO);
        mapAll.put(forP.getLetter(), forP);
        mapAll.put(forQ.getLetter(), forQ);
        mapAll.put(forR.getLetter(), forR);
        mapAll.put(forS.getLetter(), forS);
        mapAll.put(forT.getLetter(), forT);
        mapAll.put(forU.getLetter(), forU);
        mapAll.put(forV.getLetter(), forV);
        mapAll.put(forW.getLetter(), forW);
        mapAll.put(forX.getLetter(), forX);
        mapAll.put(forY.getLetter(), forY);
        mapAll.put(forZ.getLetter(), forZ);
        
        mapAll.put(forComma.getLetter(), forComma);
        mapAll.put(forPeriod.getLetter(), forPeriod);
        
        mapAll.put(for1.getLetter(), for1);
        mapAll.put(for2.getLetter(), for2);
        mapAll.put(for3.getLetter(), for3);
        mapAll.put(for4.getLetter(), for4);
        mapAll.put(for5.getLetter(), for5);
        mapAll.put(for6.getLetter(), for6);
        mapAll.put(for7.getLetter(), for7);
        mapAll.put(for8.getLetter(), for8);
        mapAll.put(for9.getLetter(), for9);
        mapAll.put(for0.getLetter(), for0);
		return mapAll;
	}

	private static void morseCoder(Map<String, Mapping> mapAll) {
		Scanner scan = new Scanner(System.in);
        String arr=scan.nextLine();
        System.out.println(arr);
        char temp ;
        for(int i=0; i<arr.length();i++)
        {
        	temp = arr.toUpperCase().charAt(i);
        	//System.out.print(temp);
        	String temp2 = Character.toString(temp);
        	if (temp2.contains(" "))
        	{
        		//System.out.println("Space given");
        		System.out.print("/ ");
        	}
        	else
        	{
        		for (Mapping person : mapAll.values())
                {
            		if (person.getLetter().contains(temp2))
            		{
            			System.out.print(person.getCode());
            			System.out.print(" ");
            		}
                    
                }
        	}
        	
        }
	}

}
