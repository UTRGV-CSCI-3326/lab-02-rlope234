public class MixMatch{
    public static void main(String[] args) {
       // System.out.println("must have a string" + 5 + true + 7.2);

        int varInt = 100;
        String example = "Example";
        char letter = 'A';
        short varShort = 30000;
        long varLong = 998877665;
        float varFloat = 78.98f;
        double varDouble = 78.9777777;
        boolean state = true;

        System.out.println(varInt + " <- interger, stores whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(example + " <- String (with capital S) stores text, size varies");
        System.out.println(letter + " <- Character ( char) stores a single character, size is 2 bytes");
        System.out.println(varShort + " <- Short, stores smaller integers values than int, size is 2 bytes");
        System.out.println(varLong + " <- LOng, stores larger integers values than int, size is 8 bytes");
        System.out.println(varFloat + " <-Float, stores decimal numbers, size is 4 bytes, 'f' at the end of value to signal float data type");
        System.out.println(varDouble + " <- Double, stores more decimal numbers than float, size is 8 bytes");
        System.out.println(state + "<-Boolean data type, only two values - true and falst");
    }
}