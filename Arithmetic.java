public class Arithmetic {

    public int holderOfNums;

    public int plus(int plus) {
        holderOfNums += plus;
        System.out.println(holderOfNums);
        return holderOfNums;
    }

    public int minus(int minus) {
        holderOfNums -= minus;
        System.out.println(holderOfNums);
        return holderOfNums;
    }

    public int ggr(int ggr) {
        holderOfNums *= ggr;
        System.out.println(holderOfNums);
        return holderOfNums;
    }

    public int delat(int delat) {
        holderOfNums /= delat;
        System.out.println(holderOfNums);
        return holderOfNums;
    }

}
