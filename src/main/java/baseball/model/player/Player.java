package baseball.model.player;

import camp.nextstep.edu.missionutils.Console;

import static baseball.contract.Config.BALL_NUMBER_LENGTH;

public class Player {
    public String inputNum() {
        String input = Console.readLine();
        isValidateNumber(input);
        isValidateSizeNumber(BALL_NUMBER_LENGTH, input);
        return input;
    }

    public String selectMenu() {
        return Console.readLine();
    }

    public void isValidateNumber(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException();
        }
    }

    public void isValidateSizeNumber(int size, String input) {
        if (input.length() != size) {
            throw new IllegalArgumentException();
        }
    }
}
