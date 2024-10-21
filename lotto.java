public class lotto {
    public static long calcChanceOfWinning(int n, int k){
        long chance = 1;
        for (int i = 0; i < k; i++) {
            chance *= (n - i); // n * (n-1) * (n-2) * ... * (n-k+1)
            chance /= (i + 1); // 1 * 2 * 3 * ... * k
        }
        return chance;
    }
    /*public static long factor(int number){
        long rezultat = 1;
        for(int i = 2; i <= number; i++){
            rezultat = rezultat * i;
        }
        return rezultat;
    }*/
    //cauza overflow!!!
    public static long extragere(int n, int k){
        long rezultat = 0;
        int counter = 0;
        while(counter < k){
            int randomNumber = (int) ((Math.random() * n) + 1);
            if((rezultat & (1L << randomNumber)) == 0){//verificarea daca bitul ii stetat
                rezultat |= (1L << randomNumber);//setarea bitului
                counter++;
            }
        }
        return rezultat;
    }
    public static void displayRezultatOrderAsc(long rezultat, int n){
        System.out.println("Numerele extrase:");
        for(int i = 0; i <= n; i++){
            if((rezultat & (1L << i)) != 0){
                System.out.print(i + " ");//+ se leaga rezultatul cu whitespace char
            }
        }
    }
    public static void main(String[] args) {
        int n = 49;
        int k = 6;

        long chance = calcChanceOfWinning(n, k);
        System.out.println("Sansa de a castiga 1/" + chance);
        long numereleExtrase = extragere(n, k);
        displayRezultatOrderAsc(numereleExtrase, n);
    }
}
