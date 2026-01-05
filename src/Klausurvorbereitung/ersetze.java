package Klausurvorbereitung;

public class ersetze {
    public static void main(String[]arg){
        System.out.println(ersetze("Dat.ei.namen.txt"));

    }

    public static int ersetze(String string){
        char[] name = string.toCharArray();
        int ersetzt=0;
        for (int i = 0; i<name.length-4; i++){
            if(name[i] == '.'){
                name[i] = '_';
                ersetzt++;
            }
        }
        System.out.println(name);
        return ersetzt;

    }
}
