package textbook;
//��Java������ơ�P040
//3.��дJava��������һ��4λ��������1234�������������ÿλ���ֵ�ֵ����������
public class Three {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        int x=1234;
        System.out.println("����x��ǧλ�ǣ�"+x/1000);
        //�Ƚ�x����1000������1������Ϊ234
        System.out.println("����x�İ�λ�ǣ�"+x/100%10);
        //�Ƚ�x����100������12������Ϊ34��Ȼ��12����10������1������Ϊ2
        System.out.println("����x��ʮλ�ǣ�"+x/10%10);
        //�Ƚ�x����10������123������Ϊ4��Ȼ��123����10������12������Ϊ3
        System.out.println("����x�ĸ�λ�ǣ�"+x%10);
        //�Ƚ�x����10������123������Ϊ4
        System.out.println("����x��������Ϊ��"+(x%10)+(x/10%10)+(x/100%10)+(x/1000));
	}

}