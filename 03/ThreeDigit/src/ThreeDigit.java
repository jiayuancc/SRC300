public class ThreeDigit {
	public static void main(String[] args) {
		int[] a={1,2,3,4};
		System.out.println("������������λ���ǣ�");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(j==i)
					continue;
				for(int k=0;k<a.length;k++)
				{
					if(k==i||k==j)
						continue;
					for(int h=0;h<a.length;h++)
					{
						if(h==i||h==j||h==k)
							continue;
						System.out.print(a[j]*100+a[k]*10+a[h]+" ");
					}
				}
			}
		}
	}
}