class Furniture{

    public static void main(String []args){

        Chair chair=new Chair();  

        Bed bed=new Bed();   
        
        Sofa sofa =new Sofa();

        List list=new List();


        System.out.printf("Chair Furn  %s is %d\n",chair, chair.price());
        System.out.printf("Bed Furn %s is %d\n",bed, bed.price());
        System.out.printf("Sofa Furn %s is %d\n",bed, sofa.price());
        System.out.println("list is "+list);
    }
}