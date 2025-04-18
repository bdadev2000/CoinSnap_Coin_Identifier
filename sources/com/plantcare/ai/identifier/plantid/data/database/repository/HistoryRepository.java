package com.plantcare.ai.identifier.plantid.data.database.repository;

import androidx.lifecycle.LiveData;
import com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao;
import com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\fJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/repository/HistoryRepository;", "", "dao", "Lcom/plantcare/ai/identifier/plantid/data/database/daos/HistoryPlantDao;", "(Lcom/plantcare/ai/identifier/plantid/data/database/daos/HistoryPlantDao;)V", "deleteListRecordRemind", "", "histories", "", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/HistoryEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllHistory", "Landroidx/lifecycle/LiveData;", "", "saveHistory", "history", "(Lcom/plantcare/ai/identifier/plantid/data/database/entities/HistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HistoryRepository {
    private final HistoryPlantDao dao;

    public HistoryRepository(HistoryPlantDao dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
    }

    public final Object deleteListRecordRemind(List<HistoryEntity> list, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new HistoryRepository$deleteListRecordRemind$2(this, list, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final LiveData<List<HistoryEntity>> getAllHistory() {
        return this.dao.getAllHistory();
    }

    public final Object saveHistory(HistoryEntity historyEntity, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new HistoryRepository$saveHistory$2(this, historyEntity, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
