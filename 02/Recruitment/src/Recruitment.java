import java.util.Scanner;
public class Recruitment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("��ӦƸ������������");
        String name = scan.nextLine();// ����ӦƸ������
        System.out.println("����������ӦƸ�ı�����ԣ�");
        String language = scan.nextLine();// ����ӦƸ��ӦƸ�ı������
        // ���ݱ������ȷ��ӦƸ�߷���Ĳ���
        switch (language.hashCode()) {
            case 3254818:// java�Ĺ�ϣ��
            case 2301506:// Java�Ĺ�ϣ��
            case 2269730:// JAVA�Ĺ�ϣ��
                System.out.println("ӦƸ��"+name+"�����䵽Java���򿪷����š�");
                break;
            case 3104:// c#�Ĺ�ϣ�� 
            case 2112:// C#�Ĺ�ϣ�� 
                System.out.println("ӦƸ��"+name+"�����䵽C#��Ŀά���顣");
                break;
            case -709190099: // asp.net�Ĺ�ϣ�� 
            case 955463181:  // Asp.net�Ĺ�ϣ�� 
            case 9745901:    // ASP.NET�Ĺ�ϣ�� 
                System.out.println("ӦƸ��"+name+"�����䵽Asp.net������Բ��š�");
                break;
            default:
                System.out.println("����˾����Ҫ" + language + "���Եĳ��򿪷���Ա��");
        }
    }
}