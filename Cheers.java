public class Cheers {
        public static void main(String[] args) {
	    String Whattocheersfor = args[0];
            int Howmanytimstocheers = Integer.parseInt(args[1]); 
            int whatlength = Whattocheersfor.length();
            int i = 0;
            String letterschecks = "AEFHILMNORSXaefhilmnorsx";
            String lowercase = "abcdefghijklmnopqrstuvwxz";
            String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String Whattocheersforbig = "";
            while (i < whatlength)
             {
                char c = Whattocheersfor.charAt(i);
                if (letterschecks.indexOf(c) == -1) 
                {
                        if (lowercase.indexOf(c) == -1) 
                        {
                                System.out.println("Give me a  " + c + ": " + c + "!");
                                Whattocheersforbig = Whattocheersforbig + c;
                        }
                        else 
                        {
                             c = uppercase.charAt(lowercase.indexOf(c));
                             System.out.println("Give me a  " + c + ": " + c + "!");
                             Whattocheersforbig = Whattocheersforbig + c;
                        }
                        
                 
                }
                else
                {
                        if (lowercase.indexOf(c) == -1) 
                        {
                                System.out.println("Give me an " + c + ": " + c + "!");
                                Whattocheersforbig = Whattocheersforbig + c;
                        }
                        else 
                        {
                             c = uppercase.charAt(lowercase.indexOf(c));
                             System.out.println("Give me an " + c + ": " + c + "!");
                             Whattocheersforbig = Whattocheersforbig + c;
                        }
                }
                i++;
        }
            System.out.println("What does that spell?");
            while (Howmanytimstocheers > 0)
            {


                Howmanytimstocheers = Howmanytimstocheers -1;
                System.out.println(Whattocheersforbig + "!!!");
         }
}           
}
