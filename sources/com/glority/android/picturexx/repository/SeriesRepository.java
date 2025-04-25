package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.SeriesItemDao;
import com.glority.android.database.dao.UserCustomSeriesItemDao;
import com.glority.android.database.dao.UserSeriesListItemDao;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.RecommendSeriesItem;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.database.entities.UserSeriesDetailItem;
import com.glority.android.database.entities.UserSeriesListItem;
import com.glority.android.database.entities.UserSeriesListItemKt;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.series.CreateUserCustomSeriesMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.DeleteUserCustomSeriesMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.EditUserCustomSeriesMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.GetRecommendSeriesByIndexListUidMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.GetRecommendSeriesListMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.GetUserCustomSeriesListMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.GetUserSeriesDetailBySeriesIdMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.GetUserSeriesListMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeries;
import com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesList;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserCustomSeries;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserSeries;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SeriesRepository.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00060\u0005J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0005J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0007J\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ$\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00060\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0019J$\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00070\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ\u001a\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00070\u00060\u0005J\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00052\u0006\u0010\"\u001a\u00020#J\"\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0 0\u00052\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u000fJ\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0 0\u00052\u0006\u0010*\u001a\u00020\u000f¨\u0006+"}, d2 = {"Lcom/glority/android/picturexx/repository/SeriesRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "getRecommendSeriesListMessage", "Landroidx/lifecycle/LiveData;", "Lcom/glority/base/server/CacheThenNetworkRequest$ResultData;", "", "Lcom/glority/android/database/entities/SeriesItem;", "getUserSeriesListMessage", "Lcom/glority/android/database/entities/UserSeriesListItem;", "getUserSeriesListMessageSync", "getRecommendSeriesByIndexListUidMessage", "Lcom/glority/android/database/entities/RecommendSeriesItem;", Args.indexListUid, "", "updateCreatedSeriesItem", "", "userSeriesListItem", "allSeriesItem", "getUserSeriesDetailBySeriesIdMessage", "Lcom/glority/android/database/entities/UserSeriesDetailItem;", Args.seriesId, "", "getUserSeriesDetailBySeriesIdMessageSync", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectionItemBySeriesId", "Lcom/glority/android/database/entities/CollectionItem;", Args.uid, "getUserCustomSeries", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "deleteUserCustomSeries", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/DeleteUserCustomSeriesMessage;", Args.customSeriesId, "", "renameUserCustomSeries", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/EditUserCustomSeriesMessage;", "customSeriesItem", "newTitle", "createCustomSeries", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CreateUserCustomSeriesMessage;", Args.title, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SeriesRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final SeriesRepository INSTANCE = new SeriesRepository();

    private SeriesRepository() {
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<List<SeriesItem>>> getRecommendSeriesListMessage() {
        return new CacheThenNetworkRequest<GetRecommendSeriesListMessage, List<? extends SeriesItem>>() { // from class: com.glority.android.picturexx.repository.SeriesRepository$getRecommendSeriesListMessage$request$1
            @Override // com.glority.base.server.CacheThenNetworkRequest
            public LiveData<CacheThenNetworkRequest.ResultData<List<? extends SeriesItem>>> doRequest() {
                return CacheThenNetworkRequest.DefaultImpls.doRequest(this);
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public Resource<GetRecommendSeriesListMessage> networkRequest() {
                return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetRecommendSeriesListMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()));
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public List<? extends SeriesItem> cacheRequest() {
                return DBManager.INSTANCE.getSeriesItemDao().getAllSync();
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public List<SeriesItem> updateCache(GetRecommendSeriesListMessage resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                List<RecommendSeriesList> seriesList = resource.getSeriesList();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(seriesList, 10));
                for (RecommendSeriesList recommendSeriesList : seriesList) {
                    arrayList.add(new SeriesItem(recommendSeriesList.getIndexListUid(), recommendSeriesList.getTitle(), recommendSeriesList.getImageUrl(), recommendSeriesList.getTotalNum(), recommendSeriesList.getCountry()));
                }
                ArrayList arrayList2 = arrayList;
                SeriesItemDao seriesItemDao = DBManager.INSTANCE.getSeriesItemDao();
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((SeriesItem) it.next()).getIndexListUid());
                }
                seriesItemDao.deleteAll(arrayList4);
                SeriesRepository.INSTANCE.updateCreatedSeriesItem(DBManager.INSTANCE.getUserSeriesListItemDao().getAllSync(), arrayList2);
                return arrayList2;
            }
        }.doRequest();
    }

    public final LiveData<List<UserSeriesListItem>> getUserSeriesListMessage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SeriesRepository$getUserSeriesListMessage$1(null), 3, null);
        return DBManager.INSTANCE.getUserSeriesListItemDao().getAll();
    }

    public final List<UserSeriesListItem> getUserSeriesListMessageSync() {
        GetUserSeriesListMessage getUserSeriesListMessage;
        List<UserSeriesList> seriesList;
        Resource sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetUserSeriesListMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()));
        ArrayList arrayList = null;
        if (sendMessageBlocking.getStatus() == Status.SUCCESS && (getUserSeriesListMessage = (GetUserSeriesListMessage) sendMessageBlocking.getData()) != null && (seriesList = getUserSeriesListMessage.getSeriesList()) != null) {
            List<UserSeriesList> list = seriesList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(UserSeriesListItemKt.toUserSeriesListItem((UserSeriesList) it.next()));
            }
            arrayList = arrayList2;
            UserSeriesListItemDao userSeriesListItemDao = DBManager.INSTANCE.getUserSeriesListItemDao();
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Long.valueOf(((UserSeriesListItem) it2.next()).getSeriesId()));
            }
            userSeriesListItemDao.deleteAll(arrayList4);
            UserSeriesListItemDao userSeriesListItemDao2 = DBManager.INSTANCE.getUserSeriesListItemDao();
            UserSeriesListItem[] userSeriesListItemArr = (UserSeriesListItem[]) arrayList.toArray(new UserSeriesListItem[0]);
            userSeriesListItemDao2.insert((UserSeriesListItem[]) Arrays.copyOf(userSeriesListItemArr, userSeriesListItemArr.length));
            INSTANCE.updateCreatedSeriesItem(arrayList, DBManager.INSTANCE.getSeriesItemDao().getAllSync());
        }
        return arrayList;
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<RecommendSeriesItem>> getRecommendSeriesByIndexListUidMessage(final String indexListUid) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        return new CacheThenNetworkRequest<GetRecommendSeriesByIndexListUidMessage, RecommendSeriesItem>() { // from class: com.glority.android.picturexx.repository.SeriesRepository$getRecommendSeriesByIndexListUidMessage$request$1
            @Override // com.glority.base.server.CacheThenNetworkRequest
            public LiveData<CacheThenNetworkRequest.ResultData<RecommendSeriesItem>> doRequest() {
                return CacheThenNetworkRequest.DefaultImpls.doRequest(this);
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public Resource<GetRecommendSeriesByIndexListUidMessage> networkRequest() {
                return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetRecommendSeriesByIndexListUidMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode(), indexListUid));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.glority.base.server.CacheThenNetworkRequest
            public RecommendSeriesItem cacheRequest() {
                return DBManager.INSTANCE.getRecommendSeriesDetailItemDao().getItemByIndexListUidSync(indexListUid);
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public RecommendSeriesItem updateCache(GetRecommendSeriesByIndexListUidMessage resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                RecommendSeries series = resource.getSeries();
                RecommendSeriesItem recommendSeriesItem = new RecommendSeriesItem(indexListUid, series.getTitle(), series.getComposition(), series.getSeriesDescription(), series.getPageHeaderUrl(), series.getDetails(), series.getChildType());
                DBManager.INSTANCE.getRecommendSeriesDetailItemDao().insert(recommendSeriesItem);
                return recommendSeriesItem;
            }
        }.doRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCreatedSeriesItem(List<UserSeriesListItem> userSeriesListItem, List<SeriesItem> allSeriesItem) {
        Integer num;
        Object obj;
        List<SeriesItem> list = allSeriesItem;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                SeriesItemDao seriesItemDao = DBManager.INSTANCE.getSeriesItemDao();
                SeriesItem[] seriesItemArr = (SeriesItem[]) arrayList.toArray(new SeriesItem[0]);
                seriesItemDao.insert((SeriesItem[]) Arrays.copyOf(seriesItemArr, seriesItemArr.length));
                return;
            }
            SeriesItem seriesItem = (SeriesItem) it.next();
            Iterator<T> it2 = userSeriesListItem.iterator();
            while (true) {
                num = null;
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (Intrinsics.areEqual(((UserSeriesListItem) obj).getIndexListUid(), seriesItem.getIndexListUid())) {
                        break;
                    }
                }
            }
            UserSeriesListItem userSeriesListItem2 = (UserSeriesListItem) obj;
            seriesItem.setCreated(userSeriesListItem2 != null);
            seriesItem.setSeriesId(userSeriesListItem2 != null ? Long.valueOf(userSeriesListItem2.getSeriesId()) : null);
            if (userSeriesListItem2 != null) {
                num = Integer.valueOf(userSeriesListItem2.getCurrentCount());
            }
            seriesItem.setCurrentCount(num);
            arrayList.add(seriesItem);
        }
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<UserSeriesDetailItem>> getUserSeriesDetailBySeriesIdMessage(final long seriesId) {
        return new CacheThenNetworkRequest<GetUserSeriesDetailBySeriesIdMessage, UserSeriesDetailItem>() { // from class: com.glority.android.picturexx.repository.SeriesRepository$getUserSeriesDetailBySeriesIdMessage$request$1
            @Override // com.glority.base.server.CacheThenNetworkRequest
            public LiveData<CacheThenNetworkRequest.ResultData<UserSeriesDetailItem>> doRequest() {
                return CacheThenNetworkRequest.DefaultImpls.doRequest(this);
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public Resource<GetUserSeriesDetailBySeriesIdMessage> networkRequest() {
                return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetUserSeriesDetailBySeriesIdMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), seriesId));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.glority.base.server.CacheThenNetworkRequest
            public UserSeriesDetailItem cacheRequest() {
                return DBManager.INSTANCE.getUserSeriesDetailDao().getItemSync(seriesId);
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public UserSeriesDetailItem updateCache(GetUserSeriesDetailBySeriesIdMessage resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                UserSeries series = resource.getSeries();
                UserSeriesDetailItem userSeriesDetailItem = new UserSeriesDetailItem(seriesId, series.getTitle(), series.getComposition(), series.getSeriesDescription(), series.getPageHeaderUrl(), series.getSeriesDetailList(), series.getChildType());
                DBManager.INSTANCE.getUserSeriesDetailDao().insert(userSeriesDetailItem);
                return userSeriesDetailItem;
            }
        }.doRequest();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getUserSeriesDetailBySeriesIdMessageSync(long r21, kotlin.coroutines.Continuation<? super com.glority.android.database.entities.UserSeriesDetailItem> r23) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.repository.SeriesRepository.getUserSeriesDetailBySeriesIdMessageSync(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final LiveData<List<CollectionItem>> getCollectionItemBySeriesId(String indexListUid, String uid) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        Intrinsics.checkNotNullParameter(uid, "uid");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SeriesRepository$getCollectionItemBySeriesId$1(indexListUid, uid, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<List<UserCustomSeriesItem>>> getUserCustomSeries() {
        return new CacheThenNetworkRequest<GetUserCustomSeriesListMessage, List<? extends UserCustomSeriesItem>>() { // from class: com.glority.android.picturexx.repository.SeriesRepository$getUserCustomSeries$request$1
            @Override // com.glority.base.server.CacheThenNetworkRequest
            public LiveData<CacheThenNetworkRequest.ResultData<List<? extends UserCustomSeriesItem>>> doRequest() {
                return CacheThenNetworkRequest.DefaultImpls.doRequest(this);
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public Resource<GetUserCustomSeriesListMessage> networkRequest() {
                return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetUserCustomSeriesListMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode()));
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public List<? extends UserCustomSeriesItem> cacheRequest() {
                return DBManager.INSTANCE.getUserCustomSeriesItemDao().getAllSync();
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public List<UserCustomSeriesItem> updateCache(GetUserCustomSeriesListMessage resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                List<UserCustomSeries> seriesList = resource.getSeriesList();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(seriesList, 10));
                for (UserCustomSeries userCustomSeries : seriesList) {
                    arrayList.add(new UserCustomSeriesItem(userCustomSeries.getCustomSeriesId(), userCustomSeries.getTitle(), userCustomSeries.getCreatedAt(), userCustomSeries.getUpdatedAt(), userCustomSeries.getCollectionCount(), userCustomSeries.getLatestCollectionUrlList(), userCustomSeries.getTotalPrice()));
                }
                ArrayList arrayList2 = arrayList;
                UserCustomSeriesItemDao userCustomSeriesItemDao = DBManager.INSTANCE.getUserCustomSeriesItemDao();
                UserCustomSeriesItem[] userCustomSeriesItemArr = (UserCustomSeriesItem[]) arrayList2.toArray(new UserCustomSeriesItem[0]);
                userCustomSeriesItemDao.insert((UserCustomSeriesItem[]) Arrays.copyOf(userCustomSeriesItemArr, userCustomSeriesItemArr.length));
                return arrayList2;
            }
        }.doRequest();
    }

    public final LiveData<Resource<DeleteUserCustomSeriesMessage>> deleteUserCustomSeries(int customSeriesId) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SeriesRepository$deleteUserCustomSeries$1(customSeriesId, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final LiveData<Resource<EditUserCustomSeriesMessage>> renameUserCustomSeries(UserCustomSeriesItem customSeriesItem, String newTitle) {
        Intrinsics.checkNotNullParameter(customSeriesItem, "customSeriesItem");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SeriesRepository$renameUserCustomSeries$1(customSeriesItem, newTitle, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final LiveData<Resource<CreateUserCustomSeriesMessage>> createCustomSeries(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SeriesRepository$createCustomSeries$1(title, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }
}
