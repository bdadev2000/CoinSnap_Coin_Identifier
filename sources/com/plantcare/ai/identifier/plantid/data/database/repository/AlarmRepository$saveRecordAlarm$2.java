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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plantcare.ai.identifier.plantid.data.database.repository.AlarmRepository$saveRecordAlarm$2", f = "AlarmRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class AlarmRepository$saveRecordAlarm$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AlarmEntity $entity;
    int label;
    final /* synthetic */ AlarmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmRepository$saveRecordAlarm$2(AlarmRepository alarmRepository, AlarmEntity alarmEntity, Continuation<? super AlarmRepository$saveRecordAlarm$2> continuation) {
        super(2, continuation);
        this.this$0 = alarmRepository;
        this.$entity = alarmEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlarmRepository$saveRecordAlarm$2(this.this$0, this.$entity, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AlarmDao alarmDao;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            alarmDao = this.this$0.alarmDao;
            alarmDao.saveRecordAlarm(this.$entity);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AlarmRepository$saveRecordAlarm$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
