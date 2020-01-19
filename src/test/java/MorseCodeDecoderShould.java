import org.junit.Test;

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
        assertThat(MorseCodeDecoder.decode(".... --- .-.. .-   .- -- .. --. .-")).isEqualTo("HOLA AMIGA");
    }

}
