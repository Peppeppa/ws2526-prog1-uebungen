package Klausurvorbereitung;

public class Liste {

    private PersonenKnoten start;

    public Liste(){
        start = null;

    }

    public void insertSorted(PersonenKnoten neu){
        if (neu == null){
            return;
        }
        neu.prev = null;
        neu.next = null;

        //Liste ist leer
        if (start == null){
            start = neu;
            return;
        }

        //Einfügen vor dem Start -> neu jünger als bestehend
        if (neu.alter <= start.alter){
            neu.next = start;
            start.prev = neu;
            start = neu;
            return;
        }

        //Einfügen in der Mitte
        if (neu.alter > start.alter){

        }


    }


}
