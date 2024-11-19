public class TimeCalc {
    public static void main(String[] args)
     {
        String TimeRightNow = args [0];
        char h1= TimeRightNow.charAt(0);
        char h2= TimeRightNow.charAt(1);
        int teninhuors = Character.getNumericValue(h1)*10;
        int onesinhours = Character.getNumericValue(h2);
        int hours = teninhuors + onesinhours;
        char M1= TimeRightNow.charAt(3);
        char M2 = TimeRightNow.charAt(4);
        int tens = Character.getNumericValue(M1)*10;
        int ones = Character.getNumericValue(M2);
        int Min = tens + ones;
        int MinToAdd = Integer.parseInt(args[1]); 
        int Hourtoadd = 0; 
        int NewHour = hours;
        int NewMin= Min + MinToAdd;
        while ( NewMin >= 60) 
        { 
            Hourtoadd= Hourtoadd + 1;
            NewMin=NewMin-60;
        }
        NewHour= hours+Hourtoadd;
        while (NewHour>24)
        {
            NewHour=NewHour-24;
        }
        if (NewHour<10)
        {
            if (NewMin<10)
            {
            System.out.println("0" + NewHour + ":0" + NewMin);
            }
            else
            {
                System.out.println("0" + NewHour + ":" + NewMin);   
            }
        }
       else
       {
        if (NewMin<10)
        {
        System.out.println(NewHour + ":0" + NewMin);
        }
        else
        {
            System.out.println(NewHour + ":" + NewMin);   
        }
       }

    } 
}