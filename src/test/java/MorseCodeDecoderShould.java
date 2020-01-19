import org.junit.Test;

import java.util.Arrays;
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

    @Test
    public void decode_a_phrase() {
        assertThat(MorseCodeDecoder.decode(".... --- .-.. .-  .- -- .. --. .-")).isEqualTo("HOLA");
    }

    private static class MorseCodeDecoder {

        public static String decode(String code) {
            return Arrays.stream(code.split(" "))
                    .map(letter -> translate(letter))
                    .collect(Collectors.joining(""));
        }

        private static String translate(String letter) {
            return Decoder.get(letter);
        }
    }
}
