package com.glority.android.picturexx.handler;

import com.glority.android.database.DBManager;
import com.glority.android.picturexx.repository.SeriesRepository;
import com.glority.android.picturexx.repository.SyncCollectionManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserChangedHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.handler.UserChangedHandler$post$1", f = "UserChangedHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class UserChangedHandler$post$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserChangedHandler$post$1(Continuation<? super UserChangedHandler$post$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserChangedHandler$post$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserChangedHandler$post$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DBManager.INSTANCE.getCollectionItemDao().deleteAll();
        DBManager.INSTANCE.getHistoryItemDao().deleteAll();
        DBManager.INSTANCE.getUserSeriesDetailDao().deleteAll();
        DBManager.INSTANCE.getUserSeriesListItemDao().deleteAll();
        DBManager.INSTANCE.getRecommendSeriesDetailItemDao().deleteAll();
        DBManager.INSTANCE.getSeriesItemDao().deleteAll();
        DBManager.INSTANCE.getWishItemDao().deleteAll();
        DBManager.INSTANCE.getUserCustomSeriesItemDao().deleteAll();
        SyncCollectionManager syncCollectionManager = new SyncCollectionManager();
        syncCollectionManager.observeSummary(null);
        syncCollectionManager.syncCollectionList(null);
        SeriesRepository.INSTANCE.getUserCustomSeries();
        SeriesRepository.INSTANCE.getRecommendSeriesListMessage();
        return Unit.INSTANCE;
    }
}
