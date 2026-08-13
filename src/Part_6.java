public class Part_6 {
    public static void main(String[] args) {

        String name = "Aditya Mitra";

        //int length = name.length();
        //char letter = name.charAt(0);
        //int index = name.indexOf(" ");
        //int lastIndex = name.lastIndexOf("a");

        //name=name.toUpperCase();
        //name=name.toLowerCase();
        //name=name.trim();
        //name=name.replace("a", "o");

        System.out.println(name);

        if(name.isEmpty()){
            System.out.println("Name is empty");
        }
        else {
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Name contains spaces");
        }
        else{
            System.out.println("No spaces found ");
        }

        if(name.equals("password")){
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello "+name);
        }

        String email = "playtrick544@gmail.com";
        String username = email.substring(0, 6);
        String domain=email.substring(13, 22);

        System.out.println(username);
        System.out.println(domain);
    }
}
