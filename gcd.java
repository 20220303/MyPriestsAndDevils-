public class Test{
	public int gcd（int a,int b）{
		while(b!=0){
			if(a>b){
				a=a-b;
			}else{
				b=b-a;
			}
		}
		return a;
	}
}

