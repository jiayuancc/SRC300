import java.util.Scanner;
public class Jiugongge{
    public static void main(String[] args){
    	System.out.println("������Ҫ����ľŹ����ά����");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(); //���볤��
        int h = 0; //��
        //�ھ����У�1�ڵ�һ������
        int l = x / 2; //��
        int[][] a = new int[x][x];
        System.out.println("���������£�");
        for (int i = 1; i <= x * x; i++){
           a[h][l] = i; //������ʾ���
           //��������Ӧ�ŵ���һ�����ֵ����Ϸ�������
           h--;
           l++;
           //��������У��ͷŵ���һ�����ֵ����·�
        if (h < 0 && l >= x){//�ȷ�����һ������
           h++;
           l--;//������һ��
           h++;
        }
        //������ϲ��У��ͷŵ����е����·�����
        else if (h < 0){
           h = x - 1;
        }
        //������Ҳ��У��ͷŵ����е������
        else if (l >= x){
           l = 0;
        }
        //���Ŀ��������Ѿ������֣�Ҳ�ŵ���һ�����ֵ����·�
        else if (a[h][l] > 0){
        //�ȷ�����һ������
           h++;
           l--;
        //������һ��
           h++;
        }
   }
        //��ӡ�Ź���
      for (int j = 0; j < x; j++){
         for (int k = 0; k < x; k++){
            System.out.print(a[j][k] + " ");
      }
        //����
      System.out.println();
      }
   }
}