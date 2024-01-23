package studyMaterial.streams;


import java.util.Optional;

/*Write a java code using streams to find the 2nd character
with just one occurrence in the String "welcome to bottomline"*/
public class SecondDistinctCharacter {

    public static void main(String[] args) {
        String inputString = "welcome to bottomline";

        Optional<Character> secondDistinctCharacter = inputString.chars()
                .filter(c -> Character.isWhitespace(c) || inputString.indexOf(c) == inputString.lastIndexOf(c))
                .distinct()
                .skip(1) // Skip the first distinct character
                .mapToObj(c -> (char) c)
                .findFirst();

        if (secondDistinctCharacter.isPresent()) {
            System.out.println("Second distinct character: " + secondDistinctCharacter.get());
        } else {
            System.out.println("No second distinct character found.");
        }
    }
}
