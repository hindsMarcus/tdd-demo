package facade;

public class Hello {

    public String sayHello(Object o) {
        String name;
        String[] nameArray;

        if (o instanceof String[]) {
            nameArray = (String[]) o;
            boolean checkForUpper = false;
            if (nameArray.length <= 2) {
            return "Hello, " + nameArray[0] + " and " + nameArray[1];
        }

            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Hello, ");
            for (String s: nameArray) {
                if (s.chars().anyMatch(Character::isUpperCase)) {
                    stringBuilder1.append(" AND HELLO ").append(s);
                }
                if (s == nameArray[nameArray.length - 1]) {
                    stringBuilder1.append("and ").append(s).append(".");
                }
                if (s != nameArray[nameArray.length - 1]) {
                    stringBuilder1.append(s).append(", ");
                }
                String returnString = stringBuilder1.toString();
                return returnString;
            }


            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Hello, ");
            for (String s: nameArray) {
                if (s == nameArray[nameArray.length - 1]) {
                    stringBuilder.append("and ").append(s);
                }
                if (s != nameArray[nameArray.length - 1]) {
                    stringBuilder.append(s).append(", ");
                }
            }
            String stringToReturn = stringBuilder.toString();
            return stringToReturn;
        }


        if (o instanceof String) {
            name = (String) o;
            if (o == null) {
                return "Hello, my friend";
            }
            if (name.chars().allMatch(Character::isUpperCase)) {
                return "HELLO, " + name.toUpperCase() + "!";
            }
            return "Hello, " + name;
        }
        return "Hello my friend";
    }

}
