package com.glority.android.picturexx.repository;

import androidx.lifecycle.MutableLiveData;
import com.glority.android.database.DBManager;
import com.glority.android.repository.BaseRepository;
import com.glority.component.generatedAPI.kotlinAPI.item.DeleteItemMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
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
/* compiled from: HistoryRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.HistoryRepository$deleteItem$1", f = "HistoryRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class HistoryRepository$deleteItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $itemId;
    final /* synthetic */ MutableLiveData<Status> $liveData;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryRepository$deleteItem$1(long j, MutableLiveData<Status> mutableLiveData, Continuation<? super HistoryRepository$deleteItem$1> continuation) {
        super(2, continuation);
        this.$itemId = j;
        this.$liveData = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryRepository$deleteItem$1(this.$itemId, this.$liveData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryRepository$deleteItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Resource sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new DeleteItemMessage(this.$itemId));
        this.$liveData.postValue(sendMessageBlocking.getStatus());
        if (sendMessageBlocking.getStatus() == Status.SUCCESS) {
            DBManager.INSTANCE.getHistoryItemDao().delete(this.$itemId);
        }
        return Unit.INSTANCE;
    }
}
