package history;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HistoryServiceImpl implements HistoryService {

    private List<HistoryLine> historyLines;

    private static int DAY_BEFORE = 1;

    public HistoryServiceImpl() {
        this.historyLines = new ArrayList<>();
    }

    @Override
    public void addToHistory(HistoryLine historyLine) {
        historyLines.add(historyLine);
    }

    @Override
    public List<HistoryLine> showHistory() {
        cleanOldHistory();
        return historyLines;
    }

    private void cleanOldHistory() {
        LocalDateTime yesterday = LocalDateTime.now().minusDays(DAY_BEFORE);

        historyLines = historyLines.stream()
                .filter(historyLine -> historyLine.getLocalDateTime().isAfter(yesterday))
                .toList();
    }
}
