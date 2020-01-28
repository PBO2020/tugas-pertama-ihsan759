package kalkulator;

public class setget {
    int total;
    double totalbagi;
    public void settotaltambah(int a,int b){
        this.total = a + b;
    }
    public void settotalkali(int a,int b){
        this.total = a*b;
    }
    public void settotalbagi(double a, double b){
        this.totalbagi= a/b;
    }
    public void settotalkurang(int a, int b){
        this.total = a - b;
    }
    public int gettotal(){
        return total;
    }
    public double gettotalbagi(){
        return totalbagi;
    }
}