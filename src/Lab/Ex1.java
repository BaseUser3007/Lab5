package Lab;

public class Ex1 {
    public static void main(String[] args){
        ExampleClass asd = new ExampleClass();

        asd.SetValue('A');
        asd.OutValue();
    }

    private static class ExampleClass{
        private char _someSymbol = 0;

        public char SetValue(char value){
            _someSymbol = value;
            return _someSymbol;
        }

        public int GetCode(){
            return _someSymbol;
        }

        public void OutValue(){
            System.out.printf("%c = %d", _someSymbol, (int)_someSymbol);
        }

    }
}
