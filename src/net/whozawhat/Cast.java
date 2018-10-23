package net.whozawhat;

public class Cast {
    void public methed(){
        int i=1,j;//局部变量j未初始化
        float f1 = 0.1;float f2=123;//float f1 = 0.1F;
        long l1 =12345678, l2=8888888888;//l2=8888888888L
        double d1 =2e20,d2 = 124;
        byte b1 = 1,b2 = 2,b3 = 129;//byye取值范围-128-127，b3超出取值范围
        j= j+10;//j未初始化无法使用
        i = i/10;
        i = i*0.1;//数据类型不匹配需要类型转换
        char c1='a',c2=125;
        byte b = b1-b2;//结果是int型的数据,不能自动转成byte
        //byte b = (byte)b1-b2;
        char c = c1+c2-1;//结果是int型的数据,不能自动转成char
        //char c = (char)c1+c2-1;
        float f3 = f1+f2;
        float f4 = f1+f2*0.1;//结果是double类型,不能自动转换为float
        //float f4 = (double)f1+f2*0.1;
        double d = d1*i+j;
        float f = (float)(d1*5+d2);
    }
}
