class main{
	public static void main(String[] args){
		int[] arr={2,3,4,8,6,3,4};
		int l=1;
		int r=4;
		int[] prefix=new int[arr.length];
		prefix[0]=arr[0];
		for(int i=1; i<arr.length;i++){
			prefix[i]=prefix[i-1]+arr[i];
		}
		int ans=0;
		for(int i=l; i<=r;i++){
			ans=prefix[r]-prefix[l-1];
		}
		System.out.print(ans);
	}
}
