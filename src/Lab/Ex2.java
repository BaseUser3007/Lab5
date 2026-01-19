package Lab;

public class Ex2 {
    public static void main(String[] args){
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.firstChar = 'A';
        exampleClass.secondChar = 'D';
        exampleClass.OutValue();
    }

    private static class ExampleClass{
        public char firstChar = 0;
        public char secondChar = 0;

        public void OutValue(){
            for(int i = (int)firstChar; i <= secondChar; i++){
                char tepm = (char)i;
                System.out.printf("%c ", tepm);
            }
        }

    }
}
