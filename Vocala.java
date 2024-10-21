public class Vocala {
    private String cuvant;

    public int getNumarVocale(String cuvant){
        int nrVocale = 0;
        int length = cuvant.length();
        for(int i = 0; i < length; i++){
            if(isVocala(cuvant.charAt(i))){
                nrVocale++;
            }
        }
        return nrVocale;
    }
    public int getIndexOfVocala(String cuvant, char vocala){
        for(int i = 0; i < cuvant.length(); i++){
            if(isVocala(cuvant.charAt(i))){
                return i;
            }
        }
        return -1;
    }
    public boolean isVocala(char litera){
        char vocale[] = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < 5; i++){
            if(litera == vocale[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Vocala vocala = new Vocala();
        String myString = "dbdafnaieumbncapc";
        //a)
        System.out.println("Nr de vocala:");
        System.out.println(vocala.getNumarVocale(myString));
        //b)
        System.out.println("Index of vocala:");
        System.out.println(vocala.getIndexOfVocala(myString, 'u'));
    }
}
