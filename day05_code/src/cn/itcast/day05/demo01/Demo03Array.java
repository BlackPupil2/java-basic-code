package cn.itcast.day05.demo01;
/*
* 静态省略格式
* 数据类型【】数据名称={元素}；
* 注意事项
* 静态会推算出长度
* 静态初始化可以拆分成两个不走
* 使用建议：不确定内容用动态，确定内容用静态
* */
public class Demo03Array {
    public static void main(String[] args) {
        int[] arrayA={10,20,30};
        //
        int[] arrayB;
        arrayB= new int[]{11,21,31};
        //静态初始化的省略格式不能拆分


    }
}
