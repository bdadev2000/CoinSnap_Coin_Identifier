package com.glority.android.picturexx.repository;

import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionsSummaryNewMessage;
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
/* compiled from: CollectionRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionsSummaryNewMessage;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.CollectionRepository$getCollectionsSummaryNew$2", f = "CollectionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CollectionRepository$getCollectionsSummaryNew$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Resource<? extends GetCollectionsSummaryNewMessage>>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CollectionRepository$getCollectionsSummaryNew$2(Continuation<? super CollectionRepository$getCollectionsSummaryNew$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionRepository$getCollectionsSummaryNew$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Resource<? extends GetCollectionsSummaryNewMessage>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Resource<GetCollectionsSummaryNewMessage>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Resource<GetCollectionsSummaryNewMessage>> continuation) {
        return ((CollectionRepository$getCollectionsSummaryNew$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetCollectionsSummaryNewMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode()));
    }
}
