package Lab;

public class Ex5 {
    public static void main(String[] args){
        ExampleClass exampleClass = new ExampleClass(111);

        exampleClass.OutValue();

        exampleClass.SetValue();

        exampleClass.OutValue();
    }

    public static class ExampleClass{

        private int _first = 0;

        public ExampleClass(){
            _first = 0;
        }

        public ExampleClass(int Value){
            _first = Value < 100 ? Value : 100;
        }

        public int SetValue(){
            _first = 0;
            return _first;
        }

        public int SetValue(int Value){
            _first = Value < 100 ? Value : 100;
            return _first;
        }

        public void OutValue(){
            System.out.printf("%d\n\r", _first);
        }
    }
}
