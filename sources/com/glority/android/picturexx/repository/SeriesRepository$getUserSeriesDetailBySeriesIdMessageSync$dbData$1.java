package com.glority.android.picturexx.repository;

import com.glority.android.database.DBManager;
import com.glority.android.database.entities.UserSeriesDetailItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeriesRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/glority/android/database/entities/UserSeriesDetailItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$dbData$1", f = "SeriesRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$dbData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserSeriesDetailItem>, Object> {
    final /* synthetic */ long $seriesId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$dbData$1(long j, Continuation<? super SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$dbData$1> continuation) {
        super(2, continuation);
        this.$seriesId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$dbData$1(this.$seriesId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserSeriesDetailItem> continuation) {
        return ((SeriesRepository$getUserSeriesDetailBySeriesIdMessageSync$dbData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DBManager.INSTANCE.getUserSeriesDetailDao().getItemSync(this.$seriesId);
    }
}
