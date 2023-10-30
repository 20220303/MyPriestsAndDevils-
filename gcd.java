public class Test{
	//GCD（get Greatest Common Divisor）获得最大公约数的方法
	public int gcd（int a,int b）{
		while(b!=0){
			if(a>b){
				a=a-b;
			}else{
				b=b-a;
			}
		}
	}


	public int abs（int a,int b）{
		
	}
}

