package com.plantcare.ai.identifier.plantid.data.database.repository;

import com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plantcare.ai.identifier.plantid.data.database.repository.AlarmRepository$alreadyNotifyTypeDailyExits$2", f = "AlarmRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class AlarmRepository$alreadyNotifyTypeDailyExits$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ AlarmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmRepository$alreadyNotifyTypeDailyExits$2(AlarmRepository alarmRepository, Continuation<? super AlarmRepository$alreadyNotifyTypeDailyExits$2> continuation) {
        super(2, continuation);
        this.this$0 = alarmRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlarmRepository$alreadyNotifyTypeDailyExits$2(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AlarmDao alarmDao;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            alarmDao = this.this$0.alarmDao;
            return Boxing.boxBoolean(!alarmDao.getAllRecordLabelIsNotifyDailyType().isEmpty());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((AlarmRepository$alreadyNotifyTypeDailyExits$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
