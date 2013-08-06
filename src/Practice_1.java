import java.io.File;
/**
 * 以下练习针对QQ日志：JAVA：File类(1): 
 * 构造 按照要求声明好变量后
 * 右键点击和这个类文件在一起的另一个文件：Practice_1Test-->运行方式-->JUnit测试
 * 目标是所有的变量x0~3对应的测试全部通过【左下角绿色对钩】 
 * 如果有红色或者蓝色对钩则表示测试不过，就需要修改你的声明
 * 
 * @author Administrator
 * 
 */
public class Practice_1 {
	// 练习1： 构建一个File类的对象x0, 使其能够表示文件:".\1\2.txt"
	File x0 = new File("./1/2.txt");
	// 练习2：利用temp0构建一个File类的对象x1, 使其能够表示文件:".\1\2.txt"
	File temp0 = new File("./1");
	// 练习3：利用temp1和temp2构建一个File类的对象x2, 使其能够表示文件:".\1\2.txt"
	String temp1 = ".";
	String temp2 = "1";
	// 练习4：定义一个布尔类型的变量x3，使其表示x0表示的文件是否存在
}
