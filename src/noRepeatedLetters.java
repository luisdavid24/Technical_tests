import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class noRepeatedLetters {
    public static void main(String[] args) {
        String str = "mamta";
        System.out.println(stringDuplicates(str));
    }


    private static StringBuffer stringDuplicates(String str) {
        StringBuffer stringBuffer = new StringBuffer("");
        Set<Character> aux = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if(aux.add(c)){
                stringBuffer.append(c);
            }
        }
        return stringBuffer;
    }
}
