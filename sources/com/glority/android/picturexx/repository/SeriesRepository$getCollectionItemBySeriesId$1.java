package com.glority.android.picturexx.repository;

import androidx.lifecycle.MutableLiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.CollectionItemDao;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionByIndexListUidAndUidMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeriesRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.SeriesRepository$getCollectionItemBySeriesId$1", f = "SeriesRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SeriesRepository$getCollectionItemBySeriesId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $indexListUid;
    final /* synthetic */ MutableLiveData<List<CollectionItem>> $liveData;
    final /* synthetic */ String $uid;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeriesRepository$getCollectionItemBySeriesId$1(String str, String str2, MutableLiveData<List<CollectionItem>> mutableLiveData, Continuation<? super SeriesRepository$getCollectionItemBySeriesId$1> continuation) {
        super(2, continuation);
        this.$indexListUid = str;
        this.$uid = str2;
        this.$liveData = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SeriesRepository$getCollectionItemBySeriesId$1(this.$indexListUid, this.$uid, this.$liveData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SeriesRepository$getCollectionItemBySeriesId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List<Collection> collections;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Resource sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetCollectionByIndexListUidAndUidMessage(this.$indexListUid, this.$uid, AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode()));
        if (sendMessageBlocking.getStatus() == Status.SUCCESS) {
            GetCollectionByIndexListUidAndUidMessage getCollectionByIndexListUidAndUidMessage = (GetCollectionByIndexListUidAndUidMessage) sendMessageBlocking.getData();
            if (getCollectionByIndexListUidAndUidMessage == null || (collections = getCollectionByIndexListUidAndUidMessage.getCollections()) == null) {
                arrayList = new ArrayList();
            } else {
                List<Collection> list = collections;
                String str = this.$indexListUid;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Collection collection : list) {
                    CollectionItem.Companion companion = CollectionItem.INSTANCE;
                    long userId = AppViewModel.INSTANCE.getUserId();
                    collection.setSeriesIndexListUid(str);
                    Unit unit = Unit.INSTANCE;
                    arrayList2.add(companion.fromCollection(userId, collection));
                }
                arrayList = arrayList2;
            }
            CollectionItemDao collectionItemDao = DBManager.INSTANCE.getCollectionItemDao();
            CollectionItem[] collectionItemArr = (CollectionItem[]) arrayList.toArray(new CollectionItem[0]);
            collectionItemDao.insert((CollectionItem[]) Arrays.copyOf(collectionItemArr, collectionItemArr.length));
            this.$liveData.postValue(arrayList);
        } else {
            this.$liveData.postValue(null);
        }
        return Unit.INSTANCE;
    }
}
