

public class Main {

    public static void main(String[] args) {
        System.out.print("cwiczenie arrays ");
        int[] testArr = {1,2,3,4};
        MyArray ma = new MyArray();
        MyArray ma2 = new MyArray(testArr);

        ma.print();
        ma2.print();
        System.out.println(ma.length() + ", " + ma2.length() + "," + testArr.length);
        System.out.println("3 jest na miejscu: " + ma2.find( 3));
        System.out.println("Element na miejscu 8 to: " + ma.pick(8));
        ma.push(17);
        ma.print();
        ma.push(17);
        ma.print();
        ma.push(17);
        ma.print();
        ma.pop();
        ma.print();
    }

}
