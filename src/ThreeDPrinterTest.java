public class ThreeDPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder); // Object 타입은 모든 타입을 수용하므로 받을 수 있게 된다.
        Powder p = (Powder) printer.getMaterial(); // 하지만 다시 꺼내 올 때에는 Object 타입이므로 형 변환을 강제로 해서 꺼내야 하는 번거로움이 있다. 이로 인해서 제네릭 프로그래밍이 나오게 되었다.
        System.out.println(p.toString());

        Plastic plastic = new Plastic();
        ThreeDPrinter3 printer2 = new ThreeDPrinter3();

        printer2.setMaterial(plastic);
        Plastic p2 = (Plastic) printer2.getMaterial();
        System.out.println(p2.toString());

        // 결과
        // 재료는 Powder입니다.
        // 재료는 Plastic입니다.
    }
}
