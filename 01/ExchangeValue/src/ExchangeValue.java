import java.util.Scanner;
public class ExchangeValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// ����ɨ����
        System.out.println("���������A��ֵ");
        long A = scan.nextLong();// ���յ�һ������ֵ
        System.out.println("���������B��ֵ");
        long B = scan.nextLong();// ���յڶ�������ֵ
        System.out.print("A=" + A + "\tB=" + B);
        System.out.print("\tִ�б�������...\t");
        A = A ^ B;// ִ�б�������
        B = B ^ A;
        A = A ^ B;
        System.out.println("A=" + A + "\tB=" + B);
    }
}