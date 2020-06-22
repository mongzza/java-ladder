package laddergame.view;

import laddergame.domain.game.dto.GameInfoDto;

import java.util.Scanner;

public class InputView {
    private static final String NAME_DELIMITER = ",";
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static String[] inputPlayerNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");

        return SCANNER.nextLine().split(NAME_DELIMITER);
    }

    public static int inputLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");

        return Integer.parseInt(SCANNER.nextLine());
    }

    public static String[] inputExecuteResult() {
        System.out.println("실행 결과 입력하세요. (결과는 쉼표(,)로 구분하세요)");

        return SCANNER.nextLine().split(NAME_DELIMITER);
    }

    public static String inputFindResultName() {
        System.out.println("결과를 보고 싶은 사람은?");

        return SCANNER.nextLine();
    }

    public static GameInfoDto inputGameInfos() {
        String[] playerNames = inputPlayerNames();
        String[] executeResults = inputExecuteResult();
        int ladderHeight = inputLadderHeight();

        return new GameInfoDto(playerNames, executeResults, ladderHeight);
    }
}
