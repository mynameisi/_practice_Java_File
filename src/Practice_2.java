import java.io.File;
import java.util.ArrayList;
/**
 * 以下练习针对QQ日志：JAVA：File类(2): 获取信息 
 * 按照要求声明好变量后
 * 右键点击和这个类文件在一起的另一个文件：Practice_2Test-->运行方式-->JUnit测试 
 * 目标是所有的变量对应的测试全部通过【左下角绿色对钩】 
 * 如果有红色或者蓝色对钩则表示测试不过，就需要修改你的声明
 * 
 * @author Administrator
 * 
 */
public class Practice_2 {
	File temp = new File("./1/2.txt");
	// 定义一个布尔变量x0,使其表示temp是否可读
	boolean x0 = temp.canRead();
	// 定义一个布尔变量x1,使其表示temp是否可写

	// 定义一个布尔变量x2,使其表示temp是否是一个文件夹

	// 定义一个布尔变量x3, 如果你认为x2=true, 那么就声明x3=true; 否则声明x3=false;

	// 定义一个布尔变量x4,使其表示temp是否是一个文件

	// 定义一个布尔变量x5, 如果你认为x4=true, 那么就声明x5=true; 否则声明x5=false;

	// 定义一个布尔变量x6,使其表示temp是否是一个隐藏文件

	// 定义一个布尔变量x7, 如果你认为x6=true, 那么就声明x7=true; 否则声明x7=false;

	// 定义一个长整型变量 x8, 使其表示你的C盘还大约剩余多少G的空间

	// 定义一个字符串变量x9, 使其等于temp的文件名

	// 定义一个字符串变量x10, 使其等于temp的文件夹名

	// 定义一个字符串变量x11, 使其等于temp的文件绝对路径名(文件夹+文件名)

	// 定义一个File类对象x12，表示temp的文件夹，注意，直接通过方法获得

	/**
	 * ArrayList 数组列表类是一个很有用的工具，你可以把他理解为一个变长的数组
	 * 我们可以实时的向ArrayList中添加新元素，比如：
	 * 
	 * ArrayList<String> al=new ArrayList<String>(); //<String>强制ArrayList中每个元素必须是String
	 * al.add("1");
	 * al.add("2");
	 * al.add("3");
	 * 以上代码段就向 al中添加了三个字符串 "1", "2", "3"
	 * 下面代码中已经定义了
	 * 1. 一个静态的ArrayList变量x13, 注意<File>强制ArrayList中的每一个元素必须是File类型的
	 * 2. 一个静态的File对象temp2
	 * 你要做的就是在下面的静态代码段中写一个for循环
	 * 想办法把temp2的文件夹中的所有文件都构建一个File对象然后存在al里面
	 * 你的程序运行完成之后x13里面的内容可以形象理解为:
	 * {new File(./1/1.txt), new File(./1/2.txt), new File(./1/3.txt)....}
	 */
	static ArrayList<File> x13 = new ArrayList<File>();
	static File temp2 = new File("./1/2.txt");
	static {
		//你的代码段要写在这里

	}
	//创建一个File类型的数组x14，里面应该放有你的"C:\WINDOWS\system32"目录下所有文件的File的对象

	//创建一个整型的变量x15, 他的值应该等于你的C盘中有多少文件和文件夹

}
