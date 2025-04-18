package com.plantcare.ai.identifier.plantid.data.database.repository;

import com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/AlarmEntity;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plantcare.ai.identifier.plantid.data.database.repository.AlarmRepository$searchAlarmById$2", f = "AlarmRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class AlarmRepository$searchAlarmById$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AlarmEntity>, Object> {
    final /* synthetic */ long $id;
    int label;
    final /* synthetic */ AlarmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmRepository$searchAlarmById$2(AlarmRepository alarmRepository, long j3, Continuation<? super AlarmRepository$searchAlarmById$2> continuation) {
        super(2, continuation);
        this.this$0 = alarmRepository;
        this.$id = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlarmRepository$searchAlarmById$2(this.this$0, this.$id, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AlarmDao alarmDao;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            alarmDao = this.this$0.alarmDao;
            return alarmDao.searchAlarmById(this.$id);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AlarmEntity> continuation) {
        return ((AlarmRepository$searchAlarmById$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
