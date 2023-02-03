package facade;

public class Hello {
    public String sayHello(Object o) {
        String name = "";

        if (o instanceof String[]) {
            String[] nameArray = (String[]) o;
            boolean checkForComma = false;
            for(String s: nameArray){
                if(s.contains(",")){
                    checkForComma = true;

                }
            }

            if(checkForComma == true){
                String stringToReturn = "";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Hello, ");
                for(String s: nameArray){
                    System.out.println(s + " THIS IS S");
                    if(s.contains(",") == true){
                        System.out.println("IM INSIDE");
                        String[] strings =  s.split(",");

                        if(s == nameArray[nameArray.length-1] ){
                            stringBuilder.append(strings[0] + ", ");
                            stringBuilder.append( "and " + strings[1] + ".");
                        }


                    }
                    if(!s.contains(",") && s != nameArray[nameArray.length-1]){
                        stringBuilder.append(s + ", ");
                    }
                    if(!s.contains(",") && s == nameArray[nameArray.length-1]){
                        stringBuilder.append("and " + s + ".");
                    }
                    stringToReturn = stringBuilder.toString();
                }
                return stringToReturn;
            }


            boolean checkforUCname = false;
            for (String s : nameArray) {
                if (s.chars().allMatch(Character::isUpperCase) == true) {
                    checkforUCname = true;
                }
            }
            if (checkforUCname == true) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Hello, ");
                for (String s : nameArray) {
                    if(s.chars().allMatch(Character::isUpperCase) == false && s == nameArray[nameArray.length-1]){
                        stringBuilder.append(s + ". ");
                    }
                    if (s.chars().allMatch(Character::isUpperCase) == false && s != nameArray[nameArray.length-1]) {
                        stringBuilder.append(s + " and ");
                    }
                }
                stringBuilder.append("AND HELLO ");
                for (String s : nameArray) {
                    if (s.chars().allMatch(Character::isUpperCase) == true) {
                        stringBuilder.append(s.toUpperCase() + "!");
                    }
                }
                String stringToReturn = stringBuilder.toString();
                return stringToReturn;



            }


            if (nameArray.length <= 2) {
                return "Hello, " + nameArray[0] + " and " + nameArray[1] + ".";
            }
            if (nameArray.length >= 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Hello, ");
                for (String s : nameArray) {
                    if (s == nameArray[nameArray.length - 1]) {
                        stringBuilder.append("and " + s + ".");
                    }
                    if (s != nameArray[nameArray.length - 1]) {
                        stringBuilder.append(s + ", ");
                    }
                }
                String stringToReturn = stringBuilder.toString();
                return stringToReturn;
            }

        }

        if (o instanceof String) {
            name = (String) o;
            if (name == null) {
                return "Hello, my friend.";
            }
            if (name.chars().allMatch(Character::isUpperCase) == true) {
                return "HELLO, " + name.toUpperCase() + "!";
            }
            return "Hello, " + name + ".";




        }
        return "Hello, my friend.";
    }
}
