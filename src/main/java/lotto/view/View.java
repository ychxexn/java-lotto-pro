package lotto.view;

import lotto.domain.LottoNumber;
import lotto.domain.LottoResult;
import lotto.domain.Rank;

import java.util.Arrays;
import java.util.List;

// TODO: InputView / OutputView 로 이관
public class View {
    private static final String MSG_LOTTO_COUNT = "%d개를 구매했습니다.";
    private static final String MSG_CORRECT_COUNT = "%d개 일치";
    private static final String MSG_BONUS = ", 보너스 볼 일치";
    private static final String MSG_PRIZE = " (%d원)- %d개";
    private static final String MSG_RETURN_RATE = "총 수익률은 %.2f입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)";

    public int insertMoney() {
        OutputView.print("구입금액을 입력해 주세요.");
        return InputView.nextInt();
    }

    public void print(String text) {
        OutputView.print(text);
    }

    public void printLottoCount(int count) {
        print(String.format(MSG_LOTTO_COUNT, count));
    }

    public List<LottoNumber> insertWinningLotto() {
        OutputView.print("지난 주 당첨 번호를 입력해 주세요.");
        return InputView.inputLotto();
    }

    public LottoNumber insertBonusBall() {
        OutputView.print("보너스 볼을 입력해 주세요.");
        return InputView.inputBonusBall();
    }

    public void printResult(LottoResult result) {
        OutputView.print("당첨 통계");
        OutputView.print("---------");
        Arrays.stream(Rank.values())
                .filter(rank -> rank != Rank.NONE)
                .forEach(rank -> print(generateResultMessage(rank, result.getRankCount(rank))));
        print(String.format(MSG_RETURN_RATE, result.getReturnRate()));
    }

    private String generateResultMessage(Rank rank, int count) {
        return String.format(MSG_CORRECT_COUNT, rank.getMatchCount()) +
                generateBonusMessage(rank) +
                String.format(MSG_PRIZE, rank.getPrize(), count);
    }

    private String generateBonusMessage(Rank rank) {
        if(rank == Rank.SECOND) {
            return MSG_BONUS;
        }
        return "";
    }
}
