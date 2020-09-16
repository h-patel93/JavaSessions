package EnumExample;

enum Mobile
{
    APPLE(100),SAMSUNG,HTC(90);
    int price;

    Mobile(int price) {
        this.price = price;
    }

    Mobile()
    {
        System.out.println("Constructor");
    }
    public int getPrice()
    {
        return price;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
       Mobile m = Mobile.APPLE;

       switch(m)
        {
            case APPLE:
                System.out.println("apple ");
                break;

            case SAMSUNG:
                System.out.println("samsung");
                break;
            default:
                System.out.println("everything");
                break;

        }

        System.out.println(Mobile.APPLE.getPrice());

       Mobile mo[] = Mobile.values();
       for (Mobile mobile :mo)
       {
           System.out.println(mobile);
       }
    }
}
