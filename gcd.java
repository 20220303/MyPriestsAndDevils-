public class Test{
	public int abs（int a,int b）{
		if(a>b){
			a=a-b;
		}else{
			a=b-a;
		}
		return a;
	}

	
	public int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		for (int i = 0; i < len; ++i) {
		    for (int j = i + 1; j < len; ++j) {
			if (nums[i] + nums[j] == target) {
			    return new int[]{i, j};
			}
		    }
		}
		return new int[0];
	}

}

