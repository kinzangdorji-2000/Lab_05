public class Linear_Search
{
    public static void main(String[] args)
    {
        linear();
    }
    public static void linear()
    {
        int value = 10;
        int [] a = {1,5,2,3,7,8,10,9,4,6};
        for (int i=0; i<a.length; i++)
        {
            if (value == a[i])
            {
                System.out.println(a[i]);
            }
        }
    }
}