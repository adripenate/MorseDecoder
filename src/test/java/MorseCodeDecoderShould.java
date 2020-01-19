import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MorseCodeDecoderShould {
    @Test
    public void decode_a_letter() {
        assertThat(MorseCodeDecoder.decode(".-")).isEqualTo("A");
    }

    private static class MorseCodeDecoder {
        public static String decode(String code) {
            return null;
        }
    }
}
