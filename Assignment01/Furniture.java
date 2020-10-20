
class Furniture{

    public static void main(String []args){

        Chair chair=new Chair();

        Bed bed=new Bed();

        List list=new List();

         System.out.printf("Chair colour %s is %d\n",chair, chair.price());
        
        System.out.printf("Bed Colour %s is %d\n",bed, bed.price());
     
        System.out.println("list is "+list);
    }
}