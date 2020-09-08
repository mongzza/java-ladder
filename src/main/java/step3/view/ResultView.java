package step3.view;

import step3.domain.Ladder;

import java.util.List;

public class ResultView {
	private static final int FIRST = 0;
	private static final String BLANK = "     |";
	private static final String POINT = "-----|";

	private ResultView() {}

	public static void printCreatedLadderInfo(Ladder ladder) {
		System.out.println("사다리 결과");

		ladder.getUsersName()
				.forEach(name -> System.out.printf("%6s", name));
		System.out.println();
		ladder.getCreatedLadder()
				.subList(FIRST, ladder.getUsersName().size())
				.forEach(line -> System.out.println(ladderFormat(line.getPoints())));
	}

	private static String ladderFormat(List<Boolean> points) {
		StringBuilder sb = new StringBuilder();
		for (Boolean isPoint : points) {
			sb.append(pointOrBlank(isPoint));
		}
		return sb.toString();
	}

	private static String pointOrBlank(boolean point) {
		if (point) {
			return POINT;
		}
		return BLANK;
	}
}
