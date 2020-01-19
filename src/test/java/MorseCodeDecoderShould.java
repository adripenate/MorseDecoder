import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class MorseCodeDecoderShould {
    @Test
    public void decode_a_letter() {
        assertThat(MorseCodeDecoder.decode(".-")).isEqualTo("A");
    }

    @Test
    public void decode_a_word() {
        assertThat(MorseCodeDecoder.decode(".... --- .-.. .-")).isEqualTo("HOLA");
    }

    private static class MorseCodeDecoder {
        private static Map<String, String> decoder = new HashMap<String, String>(){{
            put(".-", "A");
            put("-...", "B");
            put("-.-.", "C");
            put("-..", "D");
            put(".", "E");
            put("..-.", "F");
            put("--.-", "G");
            put("....", "H");
            put("..", "I");
            put(".---", "J");
            put("-.-", "K");
            put(".-..", "L");
            put("--", "M");
            put("-.", "N");
            put("---", "O");
            put(".--.", "P");
            put("--.-", "Q");
            put(".-.", "R");
            put("...", "S");
            put("-", "T");
            put("..-", "U");
            put("...-", "V");
            put(".--", "W");
            put("-..-", "X");
            put("-.--", "Y");
            put("--..", "Z");
        }};

        public static String decode(String code) {
            return Arrays.stream(code.split(" "))
                    .map(letter -> translate(letter))
                    .collect(Collectors.joining(""));
        }

        private static String translate(String letter) {
            return decoder.get(letter);
        }
    }
}
