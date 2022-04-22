package practice;
//《Java从入门到精通》P75 4.6实践与练习
//2.编写Java程序，应用for打印菱形。
public class Practice7 {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		//首先，把菱形看成上下两部分，上五下四。所以，第一个for循环有5次，第二个for循环有4次
		for(int i=1;i<=5;i++){
			//将空格和*分开看，看“ ”的变化i=1时，*是4，i=2的时候，*是3，找规律
			/*int i=1为初始化表达式，负责完成变量的初始化
			 * i<=5为循环条件表达式，值为boolean型的表达式，指定循环条件
			 * i++为循环后操作表达式，负责修整变量，改变循环条件
			 */
			for(int j=1;j<=5-i;j++){
				/*int j=1为初始化表达式，负责完成变量的初始化
				 * j<=5-i为循环条件表达式，值为boolean型表达式，指定循环条件
				 * j++为循环后操作表达式，负责修整变量，改变循环条件
				 */
				System.out.print(" ");
			}
		    for(int k=1;k<=2*i-1;k++) {  //找规律，i是1、3、5、7、9奇数
			    /*int k=1为初始化表达式，负责完成变量的初始化
			     * k<=2*i-1为循环条件表达式，值为boolean型表达式，指定循环条件
			     * k++为循环后操作表达式，负责修整变量，改变循环条件
			     */
			    System.out.print("*");
		}  //换一行
		        System.out.println();
		}
		for(int i=1;i<=4;i++) {
			/*int i=1为初始化表达式，负责完成变量的初始化
			 * i<=4为循环条件表达式，值为boolean型表达式，指定循环条件
			 * i++为循环后操作表达式，负责修整变量，改变循环条件
			 */
			for(int j=1;j<=i;j++) {  //空格 1 2 3 4 以此类推
				/*int j=1为初始化表达式，负责完成变量的初始化
				 *j<=i为循环条件表达式，值为boolean型表达式，指定循环条件
				 *j++为循环后操作表达式，负责修整变量，改变循环条件 
				 */
				System.out.print(" ");
			}
			for(int k=1;k<=2*(4-i+1)-1;k++){  //* 7 5 3 1倒着来的奇数
				/*int k=1为初始化表达式，负责完成变量的初始化
				 * k<=2*(4-i+1)-1为循环条件表达式，值为boolean型表达式，指定循环条件
				 * k++为循环后操作表达式，负责修整变量，改变循环条件
				 */
				System.out.print("*");
			}
				System.out.println();
			}
		}

	}