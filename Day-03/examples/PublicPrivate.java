class PublicPrivate
{
    public static void displayPublic()
    {
        System.out.println("This is a public method.");
    }

    private static void displayPrivate()
    {
        System.out.println("This is a private method.");
    }

    public static void main(String a[])
    {
        displayPublic();
        displayPrivate();
    }
}