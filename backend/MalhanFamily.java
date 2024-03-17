package backend;class Malhanuncle{
    void personlity(){
        System.out.println("He is a funny persopn");
    }

}

class TriggeredInsaan extends Malhanuncle{

    void personlityTriggered(){

        System.out.println("He is a gamer");
    }
}

class fukrainsan extends Malhanuncle{

    void personalityFukraInsan(){
        System.out.println("He is a Indian Mr beast");
    }
}


public class MalhanFamily {
    public static void main(String[] args) {
    
        fukrainsan obj = new fukrainsan();
        obj.personlity();

        TriggeredInsaan obj2 = new TriggeredInsaan();
        obj2.personlity();


}
}
