class B
{
    public static void main(String[] args)
    {
        System.out.println("Break");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            break;
            System.out.println(i);
        }
        System.out.println("Continue");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            continue;
            System.out.println(i);
        }
    }
}
