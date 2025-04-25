package com.glority.android.picturexx.repository;

import androidx.lifecycle.MutableLiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionByIdMessage;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.CollectionRepository$getCollectionByIdMessage$1", f = "CollectionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CollectionRepository$getCollectionByIdMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $collectionId;
    final /* synthetic */ MutableLiveData<Resource<GetCollectionByIdMessage>> $liveData;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionRepository$getCollectionByIdMessage$1(int i, MutableLiveData<Resource<GetCollectionByIdMessage>> mutableLiveData, Continuation<? super CollectionRepository$getCollectionByIdMessage$1> continuation) {
        super(2, continuation);
        this.$collectionId = i;
        this.$liveData = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionRepository$getCollectionByIdMessage$1(this.$collectionId, this.$liveData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionRepository$getCollectionByIdMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Resource<GetCollectionByIdMessage> sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetCollectionByIdMessage(this.$collectionId, AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()));
        GetCollectionByIdMessage data = sendMessageBlocking.getData();
        if (data != null && (collection = data.getCollection()) != null) {
            DBManager.INSTANCE.getCollectionItemDao().insert(CollectionItem.INSTANCE.fromCollection(AppViewModel.INSTANCE.getUserId(), collection));
        }
        this.$liveData.postValue(sendMessageBlocking);
        return Unit.INSTANCE;
    }
}
