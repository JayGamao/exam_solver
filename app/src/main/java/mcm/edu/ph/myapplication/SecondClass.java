package mcm.edu.ph.myapplication;

public class SecondClass {
    int var1 = 1, var2 = 2, var3 = 3, var4 = 4;

    SecondClass() {
    }

    SecondClass(int var1) {
        this.var1 = var1;
        var2 *= 2;
        var3 -= 12;
        var4 = 3;
    }

    SecondClass(int var1, int var2) {
        this.var1 = var1;
        this.var2 = 2 + var2;
        var3 = 1;
        var4 *= 0;

    }

    void Operation1(int var1, int var2, int var3, int var4){
    this.var1 =var1;
    this.var2 =var2;
    this.var3 =var3;
    this.var4 =var4;
    this.var4 =var1 *var2 *var3;
}
    void Operation2(int var1, int var2,int var3, int var4){
        this.var4=var4*2;
    }
}
