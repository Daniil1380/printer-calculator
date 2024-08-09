package history;

import java.util.List;

public interface HistoryService {

    void addToHistory(HistoryLine historyLine);

    List<HistoryLine> showHistory();

}
