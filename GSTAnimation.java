class GSTAnimation 
{
    public static void Animation () throws InterruptedException
    {
    String s= "***Goods Service Tax***";
    for(int i = 0; i<s.length(); i++)
    {
    Thread.sleep(300);
    System.out.print(s.charAt(i));
    }
    }
}
