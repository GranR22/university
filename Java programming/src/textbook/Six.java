package textbook;
//��Java������ơ�P041
//6.���ַ����㡯���������������������������м��ܣ�������ġ����ִ������¡�
/*
 * char a1='��',a2='��',a3='��',a4='��';
 * char secret='A';
 * a1=(char)(a1^secret);
 * ...
 * System.out.println("���ģ�"+a1+a2+a3+a4);
 * a1=(char)(a1^secret);
 * ...
 * System.out.println("ԭ�ģ�"+a1+a2+a3+a4);
 */
public class Six {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 char a1='��',a2='��',a3='��',a4='��';
		 char secret='A';
		 a1=(char)(a1^secret);
		 a2=(char)(a2^secret);
		 a3=(char)(a3^secret);
		 a4=(char)(a4^secret);
		 System.out.println("���ģ�"+a1+a2+a3+a4);
		 a1=(char)(a1^secret);
		 a2=(char)(a2^secret);
		 a3=(char)(a3^secret);
		 a4=(char)(a4^secret);
		 System.out.println("ԭ�ģ�"+a1+a2+a3+a4);
	}

}