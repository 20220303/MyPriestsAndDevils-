public class Test{
	
	public int gcd（int a,int b）{
		while(b!=0){
			if(a>b){//aaaaaaaaaaaaaa
				a=a-b;
			}else{
				b=b-a;
			}
		}
		return a;
	}
	
	public int abs（int a,int b）{
		if(a>b){
			a=a-b;
		}else{
			a=b-a;
		}
		return a;
	}
}

