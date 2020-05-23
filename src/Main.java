public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();


        double index= service.calculate(1.99, 80);
        System.out.println(index);
        double index2= service.calculate(1.52, 102);
        System.out.println(index2);
        double index3= service.calculate(1.47, 37);
        System.out.println(index3);
        double index4= service.calculate(1.35, 150);
        System.out.println(index4);
    }
}
