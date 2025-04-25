package com.glority.android.picturexx.repository;

import androidx.core.os.BundleKt;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.constants.BusinessDebugLogEvents;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import com.picturecoin.generatedAPI.kotlinAPI.collection.SaveCollectionMessage;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.CollectionRepository$saveCollectionMessage$1", f = "CollectionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CollectionRepository$saveCollectionMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Collection $collection;
    final /* synthetic */ MutableLiveData<Pair<Status, Collection>> $liveData;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionRepository$saveCollectionMessage$1(Collection collection, MutableLiveData<Pair<Status, Collection>> mutableLiveData, Continuation<? super CollectionRepository$saveCollectionMessage$1> continuation) {
        super(2, continuation);
        this.$collection = collection;
        this.$liveData = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionRepository$saveCollectionMessage$1(this.$collection, this.$liveData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionRepository$saveCollectionMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Resource sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new SaveCollectionMessage(this.$collection));
            new LogEventRequest(BusinessDebugLogEvents.time_savecollectionapi_debug, BundleKt.bundleOf(TuplesKt.to("time", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis)), TuplesKt.to("type", sendMessageBlocking.getStatus().toString()))).post();
            if (sendMessageBlocking.getStatus() == Status.SUCCESS) {
                SaveCollectionMessage saveCollectionMessage = (SaveCollectionMessage) sendMessageBlocking.getData();
                if (saveCollectionMessage == null) {
                    return Unit.INSTANCE;
                }
                if (this.$collection.getCollectionId() == null) {
                    CollectionRepository.INSTANCE.getCollectionByIdMessage(saveCollectionMessage.getCollectionId());
                }
                this.$collection.setCollectionId(Boxing.boxInt(saveCollectionMessage.getCollectionId()));
                DBManager.INSTANCE.getCollectionItemDao().insert(CollectionItem.INSTANCE.fromCollection(AppViewModel.INSTANCE.getUserId(), this.$collection));
                SaveCollectionMessage saveCollectionMessage2 = (SaveCollectionMessage) sendMessageBlocking.getData();
                if (saveCollectionMessage2 != null && (collection = saveCollectionMessage2.getCollection()) != null) {
                    SaveCollectionMessage saveCollectionMessage3 = (SaveCollectionMessage) sendMessageBlocking.getData();
                    collection.setCollectionId(saveCollectionMessage3 != null ? Boxing.boxInt(saveCollectionMessage3.getCollectionId()) : null);
                }
                MutableLiveData<Pair<Status, Collection>> mutableLiveData = this.$liveData;
                Status status = Status.SUCCESS;
                SaveCollectionMessage saveCollectionMessage4 = (SaveCollectionMessage) sendMessageBlocking.getData();
                mutableLiveData.postValue(new Pair<>(status, saveCollectionMessage4 != null ? saveCollectionMessage4.getCollection() : null));
                if (this.$collection.getCustomSeriesId() != null) {
                    SeriesRepository.INSTANCE.getUserCustomSeries();
                }
                GlobalLiveBus.INSTANCE.collectionCountChanged();
            } else {
                this.$liveData.postValue(new Pair<>(Status.ERROR, null));
            }
        } catch (Throwable unused) {
            this.$liveData.postValue(new Pair<>(Status.ERROR, null));
        }
        return Unit.INSTANCE;
    }
}
