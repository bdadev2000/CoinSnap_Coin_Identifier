package com.plantcare.ai.identifier.plantid.data.database.daos;

import androidx.lifecycle.LiveData;
import com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H'¨\u0006\f"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/daos/HistoryPlantDao;", "", "deleteListRecordRemind", "", "histories", "", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/HistoryEntity;", "getAllHistory", "Landroidx/lifecycle/LiveData;", "", "saveHistory", "history", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HistoryPlantDao {
    void deleteListRecordRemind(List<HistoryEntity> histories);

    LiveData<List<HistoryEntity>> getAllHistory();

    void saveHistory(HistoryEntity history);
}
