package mcm.edu.ph.myapplication;

public class ThirdClass extends SecondClass {

    int var1, var2, var3, var4;
    public static final int var5 = 12;

    ThirdClass() {} //
    ThirdClass(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
        var3 ++;
        var4 += 5;
    }
    ThirdClass(int var1, int var2, int var3, int var4) {
        this.var2 = var2;
        this.var4 = var4;
        this.var1 = var1 + var3;
    }
    @Override
    void Operation1(int var1, int var2, int var3, int var4){
        this.var1 = var1;
        this.var3 = var1 + var3;
        this.var4 = 0;
    }
    @Override
    void Operation2(int var1, int var2, int var3, int var4){
        this.var1 = super.var1 + var1;
        super.var2 = var2 + this.var2;
        super.var3 = 0;
        this.var4 = var5;
    }
}
