public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial(); // 앞서 Object 타입으로 받아서 사용할 때와 다르게 T에 클래스를 변수로 선언하고 그 타입에 맞게 넣고 꺼내기 때문에 형 변환을 할 필요가 없게 되었다.
        System.out.println(p.toString());


        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);

        Plastic p2 = plasticPrinter.getMaterial();
        System.out.println(p2.toString());

        // 결과
        // 재료는 Powder입니다.
        // 재료는 Plastic입니다.
    }
}
