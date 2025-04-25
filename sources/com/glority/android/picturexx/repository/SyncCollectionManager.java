package com.glority.android.picturexx.repository;

import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.CollectionItemDao;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.utils.CoinSPUtils;
import com.glority.android.picturexx.utils.PriceUtils;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionListPaginateMessage;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionsSummaryMessage;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: SyncCollectionManager.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0003'()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0016\u0010!\u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u000f\u0010%\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0018\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006*"}, d2 = {"Lcom/glority/android/picturexx/repository/SyncCollectionManager;", "", "<init>", "()V", "totalCount", "", "lastCollectionId", "getLastCollectionId", "()Ljava/lang/Integer;", "setLastCollectionId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "summaryLivedata", "Landroidx/lifecycle/MutableLiveData;", "Lcom/glority/android/picturexx/repository/SyncCollectionManager$SummaryInfo;", "getSummaryLivedata", "()Landroidx/lifecycle/MutableLiveData;", "syncStatusLivedata", "Lcom/glority/android/picturexx/repository/SyncCollectionManager$SyncStatus;", "getSyncStatusLivedata", "needDisplaySyncUi", "", "Ljava/lang/Boolean;", "syncThread", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "observeSummary", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "syncCollectionList", "startId", "collectionsToSummary", "collectionItems", "", "Lcom/glority/android/database/entities/CollectionItem;", "cacheState", "()Ljava/lang/Boolean;", "SummaryInfo", "SyncStatus", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SyncCollectionManager {
    private static final String keyHasCache = "key_collections_has_cache";
    private Integer lastCollectionId;
    private Boolean needDisplaySyncUi;
    private final MutableLiveData<SummaryInfo> summaryLivedata = new MutableLiveData<>();
    private final MutableLiveData<SyncStatus> syncStatusLivedata = new MutableLiveData<>();
    private final ExecutorService syncThread;
    private int totalCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SyncCollectionManager() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.syncThread = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new Runnable() { // from class: com.glority.android.picturexx.repository.SyncCollectionManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SyncCollectionManager._init_$lambda$0(SyncCollectionManager.this);
            }
        });
    }

    public final Integer getLastCollectionId() {
        return this.lastCollectionId;
    }

    public final void setLastCollectionId(Integer num) {
        this.lastCollectionId = num;
    }

    public final MutableLiveData<SummaryInfo> getSummaryLivedata() {
        return this.summaryLivedata;
    }

    public final MutableLiveData<SyncStatus> getSyncStatusLivedata() {
        return this.syncStatusLivedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SyncCollectionManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.cacheState() == null) {
            PersistData.INSTANCE.set(keyHasCache, Boolean.valueOf(DBManager.INSTANCE.getCollectionItemDao().getCountSync(AppViewModel.INSTANCE.getUserId()) != 0));
        }
    }

    /* compiled from: SyncCollectionManager.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/repository/SyncCollectionManager$SummaryInfo;", "", "totalCount", "", "priceValue", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "countryCount", "<init>", "(ILcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;I)V", "getTotalCount", "()I", "getPriceValue", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "getCountryCount", "getDisplayPrice", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final /* data */ class SummaryInfo {
        public static final int $stable = 8;
        private final int countryCount;
        private final PriceValue priceValue;
        private final int totalCount;

        /* renamed from: component1, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceValue getPriceValue() {
            return this.priceValue;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCountryCount() {
            return this.countryCount;
        }

        public final SummaryInfo copy(int totalCount, PriceValue priceValue, int countryCount) {
            Intrinsics.checkNotNullParameter(priceValue, "priceValue");
            return new SummaryInfo(totalCount, priceValue, countryCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryInfo)) {
                return false;
            }
            SummaryInfo summaryInfo = (SummaryInfo) other;
            return this.totalCount == summaryInfo.totalCount && Intrinsics.areEqual(this.priceValue, summaryInfo.priceValue) && this.countryCount == summaryInfo.countryCount;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.totalCount) * 31) + this.priceValue.hashCode()) * 31) + Integer.hashCode(this.countryCount);
        }

        public String toString() {
            return "SummaryInfo(totalCount=" + this.totalCount + ", priceValue=" + this.priceValue + ", countryCount=" + this.countryCount + ")";
        }

        public SummaryInfo(int i, PriceValue priceValue, int i2) {
            Intrinsics.checkNotNullParameter(priceValue, "priceValue");
            this.totalCount = i;
            this.priceValue = priceValue;
            this.countryCount = i2;
        }

        public static /* synthetic */ SummaryInfo copy$default(SummaryInfo summaryInfo, int i, PriceValue priceValue, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = summaryInfo.totalCount;
            }
            if ((i3 & 2) != 0) {
                priceValue = summaryInfo.priceValue;
            }
            if ((i3 & 4) != 0) {
                i2 = summaryInfo.countryCount;
            }
            return summaryInfo.copy(i, priceValue, i2);
        }

        public final int getCountryCount() {
            return this.countryCount;
        }

        public final PriceValue getPriceValue() {
            return this.priceValue;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final String getDisplayPrice() {
            return this.priceValue.getSymbol() + PriceUtils.INSTANCE.formatPrice(this.priceValue.getValue());
        }
    }

    /* compiled from: SyncCollectionManager.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/glority/android/picturexx/repository/SyncCollectionManager$SyncStatus;", "", "totalCount", "", "currentCount", "status", "Lcom/glority/network/model/Status;", "needDisplaySyncUi", "", "<init>", "(IILcom/glority/network/model/Status;Z)V", "getTotalCount", "()I", "getCurrentCount", "getStatus", "()Lcom/glority/network/model/Status;", "getNeedDisplaySyncUi", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final /* data */ class SyncStatus {
        public static final int $stable = 0;
        private final int currentCount;
        private final boolean needDisplaySyncUi;
        private final Status status;
        private final int totalCount;

        /* renamed from: component1, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCurrentCount() {
            return this.currentCount;
        }

        /* renamed from: component3, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getNeedDisplaySyncUi() {
            return this.needDisplaySyncUi;
        }

        public final SyncStatus copy(int totalCount, int currentCount, Status status, boolean needDisplaySyncUi) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new SyncStatus(totalCount, currentCount, status, needDisplaySyncUi);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SyncStatus)) {
                return false;
            }
            SyncStatus syncStatus = (SyncStatus) other;
            return this.totalCount == syncStatus.totalCount && this.currentCount == syncStatus.currentCount && this.status == syncStatus.status && this.needDisplaySyncUi == syncStatus.needDisplaySyncUi;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.totalCount) * 31) + Integer.hashCode(this.currentCount)) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.needDisplaySyncUi);
        }

        public String toString() {
            return "SyncStatus(totalCount=" + this.totalCount + ", currentCount=" + this.currentCount + ", status=" + this.status + ", needDisplaySyncUi=" + this.needDisplaySyncUi + ")";
        }

        public SyncStatus(int i, int i2, Status status, boolean z) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.totalCount = i;
            this.currentCount = i2;
            this.status = status;
            this.needDisplaySyncUi = z;
        }

        public static /* synthetic */ SyncStatus copy$default(SyncStatus syncStatus, int i, int i2, Status status, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = syncStatus.totalCount;
            }
            if ((i3 & 2) != 0) {
                i2 = syncStatus.currentCount;
            }
            if ((i3 & 4) != 0) {
                status = syncStatus.status;
            }
            if ((i3 & 8) != 0) {
                z = syncStatus.needDisplaySyncUi;
            }
            return syncStatus.copy(i, i2, status, z);
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final int getCurrentCount() {
            return this.currentCount;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final boolean getNeedDisplaySyncUi() {
            return this.needDisplaySyncUi;
        }
    }

    public final void observeSummary(final LifecycleOwner owner) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.syncThread.execute(new Runnable() { // from class: com.glority.android.picturexx.repository.SyncCollectionManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                SyncCollectionManager.observeSummary$lambda$1(SyncCollectionManager.this, booleanRef, owner);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeSummary$lambda$1(SyncCollectionManager this$0, Ref.BooleanRef isNoCacheBefore, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(isNoCacheBefore, "$isNoCacheBefore");
        if (!Intrinsics.areEqual((Object) this$0.cacheState(), (Object) true)) {
            LogUtils.d("SyncCollectionManager", "first query summary");
            isNoCacheBefore.element = true;
        }
        Resource<GetCollectionsSummaryMessage> collectionsSummaryMessageSync = CollectionRepository.INSTANCE.getCollectionsSummaryMessageSync();
        if (collectionsSummaryMessageSync.getStatus() == Status.SUCCESS) {
            GetCollectionsSummaryMessage data = collectionsSummaryMessageSync.getData();
            Intrinsics.checkNotNull(data);
            this$0.totalCount = data.getTotalCount();
            GetCollectionsSummaryMessage data2 = collectionsSummaryMessageSync.getData();
            Intrinsics.checkNotNull(data2);
            int totalCountryCount = data2.getTotalCountryCount();
            CoinSPUtils coinSPUtils = CoinSPUtils.INSTANCE;
            GetCollectionsSummaryMessage data3 = collectionsSummaryMessageSync.getData();
            Intrinsics.checkNotNull(data3);
            coinSPUtils.setPriceSymbol(data3.getTotalPrice().getSymbol());
            CoinSPUtils coinSPUtils2 = CoinSPUtils.INSTANCE;
            GetCollectionsSummaryMessage data4 = collectionsSummaryMessageSync.getData();
            Intrinsics.checkNotNull(data4);
            coinSPUtils2.setPriceCurrencyCode(data4.getTotalPrice().getCurrencyCode());
            MutableLiveData<SummaryInfo> mutableLiveData = this$0.summaryLivedata;
            int i = this$0.totalCount;
            GetCollectionsSummaryMessage data5 = collectionsSummaryMessageSync.getData();
            Intrinsics.checkNotNull(data5);
            mutableLiveData.postValue(new SummaryInfo(i, data5.getTotalPrice(), totalCountryCount));
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new SyncCollectionManager$observeSummary$1$1(lifecycleOwner, isNoCacheBefore, this$0, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void syncCollectionList(Integer startId) {
        new LogEventRequest(LogEvents.sync_collections_start, null, 2, null).post();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = startId;
        final long currentTimeMillis = System.currentTimeMillis();
        this.syncThread.execute(new Runnable() { // from class: com.glority.android.picturexx.repository.SyncCollectionManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SyncCollectionManager.syncCollectionList$lambda$3(SyncCollectionManager.this, objectRef, currentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void syncCollectionList$lambda$3(SyncCollectionManager this$0, Ref.ObjectRef id, long j) {
        int i;
        GetCollectionListPaginateMessage data;
        List<Collection> collections;
        List<Collection> collections2;
        List<Collection> collections3;
        Collection collection;
        List<Collection> collections4;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(id, "$id");
        Boolean bool = this$0.needDisplaySyncUi;
        boolean z = true;
        if (bool != null) {
            z = bool.booleanValue();
        } else if (Intrinsics.areEqual((Object) this$0.cacheState(), (Object) true)) {
            z = false;
        }
        this$0.needDisplaySyncUi = Boolean.valueOf(z);
        MutableLiveData<SyncStatus> mutableLiveData = this$0.syncStatusLivedata;
        int i2 = this$0.totalCount;
        SyncStatus value = this$0.syncStatusLivedata.getValue();
        int currentCount = value != null ? value.getCurrentCount() : 0;
        Status status = Status.LOADING;
        Boolean bool2 = this$0.needDisplaySyncUi;
        Intrinsics.checkNotNull(bool2);
        mutableLiveData.postValue(new SyncStatus(i2, currentCount, status, bool2.booleanValue()));
        do {
            i = id.element == 0 ? 20 : 500;
            Resource<GetCollectionListPaginateMessage> collectionListMessageSync = CollectionRepository.INSTANCE.getCollectionListMessageSync(i, (Integer) id.element);
            SyncStatus value2 = this$0.syncStatusLivedata.getValue();
            int currentCount2 = value2 != null ? value2.getCurrentCount() : 0;
            ?? r8 = 0;
            r8 = 0;
            r8 = 0;
            if (collectionListMessageSync.getStatus() == Status.SUCCESS) {
                GetCollectionListPaginateMessage data2 = collectionListMessageSync.getData();
                int size = currentCount2 + ((data2 == null || (collections4 = data2.getCollections()) == null) ? 0 : collections4.size());
                LogUtils.d("SyncCollectionManager", "syncCount: " + size);
                GetCollectionListPaginateMessage data3 = collectionListMessageSync.getData();
                if (data3 != null && (collections3 = data3.getCollections()) != null && (collection = (Collection) CollectionsKt.lastOrNull((List) collections3)) != null) {
                    r8 = collection.getCollectionId();
                }
                this$0.lastCollectionId = r8;
                id.element = r8;
                if (size > this$0.totalCount) {
                    this$0.totalCount = size;
                }
                GetCollectionListPaginateMessage data4 = collectionListMessageSync.getData();
                if (((data4 == null || (collections2 = data4.getCollections()) == null) ? 0 : collections2.size()) < i) {
                    MutableLiveData<SyncStatus> mutableLiveData2 = this$0.syncStatusLivedata;
                    int i3 = this$0.totalCount;
                    Status status2 = Status.SUCCESS;
                    Boolean bool3 = this$0.needDisplaySyncUi;
                    Intrinsics.checkNotNull(bool3);
                    mutableLiveData2.postValue(new SyncStatus(i3, size, status2, bool3.booleanValue()));
                    PersistData.INSTANCE.set(keyHasCache, true);
                } else {
                    MutableLiveData<SyncStatus> mutableLiveData3 = this$0.syncStatusLivedata;
                    int i4 = this$0.totalCount;
                    Status status3 = Status.LOADING;
                    Boolean bool4 = this$0.needDisplaySyncUi;
                    Intrinsics.checkNotNull(bool4);
                    mutableLiveData3.postValue(new SyncStatus(i4, size, status3, bool4.booleanValue()));
                }
                CollectionItemDao collectionItemDao = DBManager.INSTANCE.getCollectionItemDao();
                GetCollectionListPaginateMessage data5 = collectionListMessageSync.getData();
                Intrinsics.checkNotNull(data5);
                List<Collection> collections5 = data5.getCollections();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collections5, 10));
                Iterator<T> it = collections5.iterator();
                while (it.hasNext()) {
                    arrayList.add(CollectionItem.INSTANCE.fromCollection(AppViewModel.INSTANCE.getUserId(), (Collection) it.next()));
                }
                CollectionItem[] collectionItemArr = (CollectionItem[]) arrayList.toArray(new CollectionItem[0]);
                collectionItemDao.insert((CollectionItem[]) Arrays.copyOf(collectionItemArr, collectionItemArr.length));
                data = collectionListMessageSync.getData();
            } else {
                LogUtils.d("SyncCollectionManager", "syncCollectionList: " + collectionListMessageSync.getException());
                new LogEventRequest(LogEvents.sync_collections_fail, null, 2, null).post();
                MutableLiveData<SyncStatus> mutableLiveData4 = this$0.syncStatusLivedata;
                int i5 = this$0.totalCount;
                Status status4 = Status.ERROR;
                Boolean bool5 = this$0.needDisplaySyncUi;
                Intrinsics.checkNotNull(bool5);
                mutableLiveData4.postValue(new SyncStatus(i5, currentCount2, status4, bool5.booleanValue()));
                return;
            }
        } while (((data == null || (collections = data.getCollections()) == null) ? 0 : collections.size()) >= i);
        new LogEventRequest(LogEvents.sync_collections_success, BundleKt.bundleOf(TuplesKt.to("time", Double.valueOf(System.currentTimeMillis() - j)), TuplesKt.to("count", Integer.valueOf(this$0.totalCount)))).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SummaryInfo collectionsToSummary(List<CollectionItem> collectionItems) {
        Object obj;
        String currencySymbol;
        Object obj2;
        String currencyCode;
        PriceValue marketValue;
        PriceValue marketValue2;
        int size = collectionItems.size();
        List<CollectionItem> list = collectionItems;
        Iterator<T> it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            PriceValue marketValue3 = ((CollectionItem) it.next()).getMarketValue();
            d += marketValue3 != null ? marketValue3.getValue() : 0.0d;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((CollectionItem) obj).getMarketValue() != null) {
                break;
            }
        }
        CollectionItem collectionItem = (CollectionItem) obj;
        if (collectionItem == null || (marketValue2 = collectionItem.getMarketValue()) == null || (currencySymbol = marketValue2.getSymbol()) == null) {
            currencySymbol = PriceUtils.INSTANCE.getCurrencySymbol();
        }
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (((CollectionItem) obj2).getMarketValue() != null) {
                break;
            }
        }
        CollectionItem collectionItem2 = (CollectionItem) obj2;
        if (collectionItem2 == null || (marketValue = collectionItem2.getMarketValue()) == null || (currencyCode = marketValue.getCurrencyCode()) == null) {
            currencyCode = PriceUtils.INSTANCE.getCurrencyCode();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList.add(((CollectionItem) it4.next()).getIssuerCountryCode());
        }
        int size2 = CollectionsKt.distinct(arrayList).size();
        PriceValue priceValue = new PriceValue(0, 1, null);
        priceValue.setCurrencyCode(currencyCode);
        priceValue.setSymbol(currencySymbol);
        priceValue.setValue(d);
        Unit unit = Unit.INSTANCE;
        return new SummaryInfo(size, priceValue, size2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean cacheState() {
        return (Boolean) PersistData.INSTANCE.get(keyHasCache, null);
    }

    /* compiled from: SyncCollectionManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/repository/SyncCollectionManager$Companion;", "", "<init>", "()V", "keyHasCache", "", "isSyncOver", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isSyncOver() {
            return Intrinsics.areEqual(PersistData.INSTANCE.get(SyncCollectionManager.keyHasCache, null), (Object) true);
        }
    }
}
