package Lab;

public class Ex6 {
    public static void main(String[] args){
        ExampleClass exampleClass = new ExampleClass(111, 11);

        exampleClass.SetValue(68, 3);

        exampleClass.OutValue();
    }

    public static class ExampleClass{

        private int _max = 0;
        private int _min = 0;

        public ExampleClass(int Number) {
            _max = Number;
        }

        public ExampleClass(int FirstNumber, int SecondNumber) {
            if(FirstNumber >= SecondNumber){
                    _max = FirstNumber;
                    _min = SecondNumber;
            }
            else {
                    _max = SecondNumber;
                    _min = FirstNumber;
            }
        }

        public void SetValue(int Number) {
            if(_max < Number)
                _min = Number;
            else
                _max = Number;
        }

        public void SetValue(int FirstNumber, int SecondNumber) {
            if(FirstNumber >= SecondNumber){
                if(_max < FirstNumber)
                    _max = FirstNumber;
                if(_min > SecondNumber)
                    _min = SecondNumber;
            }
            else {
                if(_max < SecondNumber)
                    _max = SecondNumber;
                if(_min > FirstNumber)
                    _min = FirstNumber;
            }
        }

        public void OutValue(){
            System.out.printf("%d %d\n\r", _min, _max);
        }
    }
}
