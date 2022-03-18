public class Power {
    public static void main(String[] args) {
//        В целочисленную степень
        int base = 2;
        ///2^7
        int a2=base*base;
        int a4=a2*a2;
        int result=a4*a2*base;
        System.out.println(result);
        //в вещественную степень
        double dbase= 2.1;
        double dresult=Math.pow(dbase,2);
        System.out.println(dresult);
    }
}
