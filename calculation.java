import  java.util.*;

class Calculation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请您输入第一个要计算的数字");
		int one = input.nextInt();
		System.out.println("请您输入第二个要计算的数字");
		int two = input.nextInt();
		System.out.println("请您输入一个符号");
		int operator = input.nextInt();
		if(operator==1){
			System.out.println(one + two);
		}else if(operator==2){
			System.out.println(one - two);
		}else if(operator==3){
			System.out.println(one * two);
		}else if(operator==4){
			System.out.println(one / two);
		}else{
			System.out.println("error...");
		}

	}
}