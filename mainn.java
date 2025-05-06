
public  class mainn {
    public static void main(String[] args) {

        float result = Sashualo(1,2,3,4);
        System.out.println("The average is: " + result);

        int length = StringLength("Hello", "World", "Luka");
        System.out.println("jami aris : " + length);
    }

    static float Sashualo(int x,int y,int z, int q)
    {
        float sum = x + y + z + q;
        float avg = sum / 4;
        return avg;
    }


    static int StringLength(String str,String str2,String str3)
    {
        int length = str.length() + str2.length() + str3.length();
        return length;
    }

  

    
}