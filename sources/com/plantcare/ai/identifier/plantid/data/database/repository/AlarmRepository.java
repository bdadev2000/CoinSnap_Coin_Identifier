package com.plantcare.ai.identifier.plantid.data.database.repository;

import androidx.lifecycle.LiveData;
import com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0007J!\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006J\u001b\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/repository/AlarmRepository;", "", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/AlarmEntity;", "entity", "", "saveRecordAlarm", "(Lcom/plantcare/ai/identifier/plantid/data/database/entities/AlarmEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "", "getAllRecordAlarm", "", "records", "deleteListRecordRemind", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "record", "updateRecord", "", "id", "searchAlarmById", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "alreadyNotifyTypeDailyExits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "alarmEntity", "insertOnlyOneRecordTypeNotifyDaily", "Lcom/plantcare/ai/identifier/plantid/data/database/daos/AlarmDao;", "alarmDao", "Lcom/plantcare/ai/identifier/plantid/data/database/daos/AlarmDao;", "<init>", "(Lcom/plantcare/ai/identifier/plantid/data/database/daos/AlarmDao;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AlarmRepository {
    private final AlarmDao alarmDao;

    public AlarmRepository(AlarmDao alarmDao) {
        Intrinsics.checkNotNullParameter(alarmDao, "alarmDao");
        this.alarmDao = alarmDao;
    }

    public final Object alreadyNotifyTypeDailyExits(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AlarmRepository$alreadyNotifyTypeDailyExits$2(this, null), continuation);
    }

    public final Object deleteListRecordRemind(List<AlarmEntity> list, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AlarmRepository$deleteListRecordRemind$2(this, list, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final LiveData<List<AlarmEntity>> getAllRecordAlarm() {
        return this.alarmDao.getAllRecordAlarm();
    }

    public final Object insertOnlyOneRecordTypeNotifyDaily(AlarmEntity alarmEntity, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AlarmRepository$insertOnlyOneRecordTypeNotifyDaily$2(this, alarmEntity, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object saveRecordAlarm(AlarmEntity alarmEntity, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AlarmRepository$saveRecordAlarm$2(this, alarmEntity, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object searchAlarmById(long j3, Continuation<? super AlarmEntity> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AlarmRepository$searchAlarmById$2(this, j3, null), continuation);
    }

    public final Object updateRecord(AlarmEntity alarmEntity, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AlarmRepository$updateRecord$2(this, alarmEntity, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
