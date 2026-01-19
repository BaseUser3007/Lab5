package Lab;

public class Ex4 {
    public static void main(String[] args){
        ExampleClass exampleClass1 = new ExampleClass(1,'A');
        ExampleClass exampleClass2 = new ExampleClass(65.1267);

        exampleClass1.OutValue();
        exampleClass2.OutValue();
    }


    public static class ExampleClass{

        private int _first = 0;
        private char _someSymbol = 0;

        public ExampleClass(double Number){
            _someSymbol = (char)(int)Number;

            _first = (int) Math.floor(Number % 1 * 100);
        }

        public ExampleClass(int First, char SomeSymbol){
            _first = First;
            _someSymbol = SomeSymbol;
        }

        public void OutValue(){
            System.out.printf("%d, %c\n\r", _first, _someSymbol);
        }
    }
}
