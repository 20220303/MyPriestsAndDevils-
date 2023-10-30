public class Test{
	public int gcd（int a,int b）{
		while(a!=0){
			if(b>a){
				b=b-a;
			}else{
				a=a-b;
			}
		}
	}
}

