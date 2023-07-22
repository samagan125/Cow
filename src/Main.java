import java.awt.*;

public class Main {
    public static void main(String[] args) {
     Sheep sheep = new Sheep("sheep",50,3,"Male");
     Sheep sheep1 = new Sheep("sheep1",23,2,"famale");
     Sheep sheep2 = new Sheep("sheep2",52,5,"Male");


     Cow cow = new Cow("nem",45,6,"famale");
     Cow cow1 = new Cow("get",57,2,"male");
     Cow cow2 = new Cow("set",66,1,"famale");
     Cow cow3 = new Cow("string",55,4,"male");
     Cow cow4 = new Cow("nam",78,12,"famale");


     Hjrse hjrse = new Hjrse("in",102,3,"famale","blak");
     Hjrse hjrse2 = new Hjrse("nem",114,4,"male","white");


     Farm farm = new Farm("kgz","Baikal",new Cow[]{cow,cow1,cow2,cow3,cow4},
             new Hjrse[]{hjrse,hjrse2},new Sheep[]{sheep,sheep1,sheep2});

     Farm farm1 = new Farm("Mockow","Baikal",new Cow[]{cow},
             new Hjrse[]{hjrse},new Sheep[]{sheep2});
        System.out.println(farm);
        System.out.println(farm1);
    }
}









    
