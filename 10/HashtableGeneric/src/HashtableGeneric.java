import java.util.Hashtable;
//Hashtable�ķ��ͻ�
public class HashtableGeneric<K, V> {
	// ����Hashtable�ķ��������
	public Hashtable<K, V> hashTable = new Hashtable<K, V>();
	// ����put����Ϊkey��value��ֵ
	public void put(K k, V v) {
		hashTable.put(k, v);
	}
	// ����get�������Ը���keyֵ��ȡvalue��ֵ
	public V get(K k) {
		return hashTable.get(k);
	}
	public static void main(String args[]) {
		HashtableGeneric<String, String> t = new HashtableGeneric<String, String>();
		t.put("key", "I love Java��");
		String s = t.get("key");
		System.out.println("����keyֵ��ȡ��value�����ݣ�\n\t" + s);
	}
}