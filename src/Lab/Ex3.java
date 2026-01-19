package Lab;

public class Ex3 {

    public static void main(String[] args){
        ExampleClass exampleClass1 = new ExampleClass();
        ExampleClass exampleClass2 = new ExampleClass(1);
        ExampleClass exampleClass3 = new ExampleClass(1,2);
    }


    public static class ExampleClass{

        private int _first = 0;
        private int _second = 0;

        public ExampleClass(){

        }

        public ExampleClass(int First){
            _first = First;
        }

        public ExampleClass(int First, int Second){
            _first = First;
            _second = Second;
        }

    }
}
