import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String code) {
        return Arrays.stream(separateWords(code))
                .map(MorseCodeDecoder::normalizeSpace)
                .map(MorseCodeDecoder::translate)
                .collect(Collectors.joining(""));
    }

    private static String[] separateWords(String code) {
        return normalizeSpaces(code).split(" ");
    }

    private static String normalizeSpaces(String code) {
        return code.replaceAll("\\s{2,}", "  ");
    }

    private static String normalizeSpace(String letter) {
        return (letter.isEmpty()) ? " " : letter;
    }

    private static String translate(String letter) {
        return Decoder.get(letter);
    }
}
