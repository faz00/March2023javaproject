package CodeLab;
import java.util.Scanner;

public class Assignmet3 {

	public static void main(String[] args) {
		
		 
		//System.out.println(74+36);    
			
		//System.out.println(50/3);
		
		//System.out.println(-5+8*6);
		//System.out.println((55+9)%9);
		//System.out.println(20+-3*5/8);
		//System.out.println(5+15/3*2-8%3);
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
	    int number1 = input.nextInt();
	    System.out.println("Enter the second number: ");
	    int number2=input.nextInt();
	    
	    System.out.println(number1*number2);*/
		
	/*	int a=10,b=15;
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("a="+a+"\nb= "+b);*/
	
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
	    int number1 = input.nextInt();
	    System.out.println("Enter the second number: ");
	    int number2=input.nextInt();
		
	    System.out.println(number1+"+"+number2+"="+(number1+number2));
	    System.out.println(number1+"-"+number2+"="+(number1-number2));
	    System.out.println(number1+"*"+number2+"="+(number1*number2));
	    System.out.println(number1+"/"+number2+"="+(number1/number2));
	    System.out.println(number1+" mod "+number2+"="+(number1%number2));
		*/
		
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
	    int number = input.nextInt();
	    if(number%2==0) {
	    	System.out.println(1);
	    }else {
	    	System.out.println(2);
	    }*/
		
		/*int i;
		for(i=1;i<100;i++) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}*/
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
	    int number = input.nextInt();
	    
	    int i;
		for(i=1;i<=10;i++) {
			
			System.out.println(number+"*"+i+"="+(number*i));
			}*/
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
	    int number = input.nextInt();
	    int sum=0;
	   
	    int i=0;
	    int[] tabNumber= new int[5];
	  
	    while(number%10!=0) {
	    	tabNumber[i]=number%10;
	    	sum=sum+tabNumber[i];
	    	number=number/10;
	    	i++;
	    }
	    
	    
	    System.out.println(sum);  */
		
		/*int space,letter,num,other,i;
		space=0;
		letter=0;
		num=0;
		other=0;
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter a sentence ");
	    String sentence = input2.nextLine();
		char ch;
	    
	    
	    for(i=0;i<sentence.length();i++) {
	    	ch=sentence.charAt(i);
	    	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
	    		letter++;
	    	}else if(ch>='0' && ch<='9') {
	    		num++;
	    	}else if(ch==' ') {
	    		space++;
	    	}else {
	    		other++;
	    	}
	    }
	    System.out.println("Letter: "+letter);
	    System.out.println("Space: "+space);
	    System.out.println("Number: "+num);
	    System.out.println("Other: "+other);   */
		
		/* Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence ");
	    String sentence = input.nextLine();
	    int i;
	    char[] inverseSentence = sentence.toCharArray();

        for (i = inverseSentence.length - 1; i >= 0; i--) {


            System.out.print(inverseSentence[i]);
        }*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence ");
	    String sentence = input.nextLine();
	    int i;     //to track all the array
	    int j=0;  // to count the spaces
	    int k=0; //to keep track of indices of the array
	   
	    char[] camelCase = sentence.toCharArray();
	    
	    for (i =0;i< camelCase.length; i++) {
	    	if(i==0) {
	          camelCase[i]=Character.toUpperCase(camelCase[i]); //to make the first char an upper case
	    	}
	    	if(camelCase[i]==' ') {
	    		j++; 
	    	
              camelCase[i+1]=Character.toUpperCase(camelCase[i+1]); //the next letter after the space became an upper case
              continue;
	    	}else  {
	    		camelCase[k++]=camelCase[i]; //copy the other letters 
	    		
	    	}
        }
	    i=0;
	    for(i=0;i<sentence.length()-j;i++) {
	    	System.out.print(camelCase[i]);
	    }
	    
	    }
	
}
