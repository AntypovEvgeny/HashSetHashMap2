import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected Set<String> set;

    public WordsChecker(String text) {
        this.set = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
