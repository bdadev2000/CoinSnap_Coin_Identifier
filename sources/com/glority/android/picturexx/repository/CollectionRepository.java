package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import com.picturecoin.generatedAPI.kotlinAPI.collection.ExportCustomSeriesMessage;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionByIdMessage;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionListPaginateMessage;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionsSummaryMessage;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionsSummaryNewMessage;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CollectionRepository.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00052\u0006\u0010\t\u001a\u00020\bJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0014\u001a\u00020\u000eJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u00052\u0006\u0010\u0014\u001a\u00020\u000eJ1\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000bH\u0087@¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"Lcom/glority/android/picturexx/repository/CollectionRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "saveCollectionMessage", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "Lcom/glority/network/model/Status;", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "collection", "getCollectionListMessageSync", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionListPaginateMessage;", "pageSize", "", "lastId", "(ILjava/lang/Integer;)Lcom/glority/network/model/Resource;", "getCollectionsSummaryMessageSync", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionsSummaryMessage;", "deleteCollectionByIdMessage", "collectionId", "getCollectionByIdMessage", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionByIdMessage;", "exportCollectionSeries", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/ExportCustomSeriesMessage;", "gradeScale", "", Args.customSeriesId, "email", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getCollectionsSummaryNew", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionsSummaryNewMessage;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final CollectionRepository INSTANCE = new CollectionRepository();

    private CollectionRepository() {
    }

    public final LiveData<Pair<Status, Collection>> saveCollectionMessage(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CollectionRepository$saveCollectionMessage$1(collection, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final Resource<GetCollectionListPaginateMessage> getCollectionListMessageSync(int pageSize, Integer lastId) {
        String countryCode = CoinConfigUtils.INSTANCE.getCountryCode();
        LogUtils.d("CollectionRepository", "countryCode: " + countryCode);
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetCollectionListPaginateMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), countryCode, Integer.valueOf(pageSize), lastId));
    }

    public final Resource<GetCollectionsSummaryMessage> getCollectionsSummaryMessageSync() {
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetCollectionsSummaryMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode()));
    }

    public final LiveData<Status> deleteCollectionByIdMessage(int collectionId) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CollectionRepository$deleteCollectionByIdMessage$1(collectionId, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final LiveData<Resource<GetCollectionByIdMessage>> getCollectionByIdMessage(int collectionId) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CollectionRepository$getCollectionByIdMessage$1(collectionId, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final LiveData<Resource<ExportCustomSeriesMessage>> exportCollectionSeries(String gradeScale, Integer customSeriesId, String email) {
        Intrinsics.checkNotNullParameter(gradeScale, "gradeScale");
        Intrinsics.checkNotNullParameter(email, "email");
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new ExportCustomSeriesMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), gradeScale, customSeriesId, email));
    }

    public final Object getCollectionsSummaryNew(Continuation<? super Resource<GetCollectionsSummaryNewMessage>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CollectionRepository$getCollectionsSummaryNew$2(null), continuation);
    }
}
