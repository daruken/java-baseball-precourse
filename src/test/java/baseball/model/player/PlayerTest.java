package baseball.model.player;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PlayerTest {
    @Test
    void 사용자_입력값_체크_정상() {
        Player player = new Player();

        assertThatNoException().isThrownBy(() -> player.isValidateNumber("123"));
    }

    @Test
    void 사용자_입력값_체크_숫자가아닌값() {
        Player player = new Player();

        assertThatThrownBy(() -> {
            player.isValidateNumber("abcdefg");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사용자_입력값_체크_사이즈초과() {
        Player player = new Player();

        assertThatThrownBy(() -> {
            player.isValidateSizeNumber("1234");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
