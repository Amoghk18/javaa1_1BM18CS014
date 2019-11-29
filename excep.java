class noargs extends Exception
{
    String s;
    noargs(String a){
        s=a;
    }
    public String toString(){
        return s;
    }
}
class excep {
    public static void main(String args[])
    {
        try{
            if(args.length==0){
                throw new noargs("No arguments");
            }
            int a=Integer.parseInt(args[2]);
            int b=Integer.parseInt(args[3]);
            int c=Integer.parseInt(args[4]);
            if(a<0 || b<0 || c<0)
                throw new noargs("marks less than 0");
        }
        catch(noargs e){
            System.out.println(e);
        }

    }
}
