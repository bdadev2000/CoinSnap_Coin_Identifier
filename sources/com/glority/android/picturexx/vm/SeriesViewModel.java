package com.glority.android.picturexx.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.RecommendSeriesItem;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.database.entities.UserSeriesDetailItem;
import com.glority.android.database.entities.UserSeriesListItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.repository.SeriesRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.base.viewmodel.BaseViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SeriesViewModel.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002-.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00050\u00190\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\nJ\u001c\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00190\n2\u0006\u0010\"\u001a\u00020\u0013J\u001c\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00190\n2\u0006\u0010%\u001a\u00020&J$\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00050\n2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013J\u0018\u0010*\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u00132\u0006\u0010,\u001a\u00020\u001bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/glority/android/picturexx/vm/SeriesViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "seriesFilterList", "", "Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesFilterData;", "getSeriesFilterList", "()Ljava/util/List;", "recommendSeriesListResponse", "Landroidx/lifecycle/LiveData;", "Lcom/glority/android/database/entities/SeriesItem;", "getRecommendSeriesListResponse", "()Landroidx/lifecycle/LiveData;", "displaySeriesList", "Landroidx/compose/runtime/MutableState;", "getDisplaySeriesList", "()Landroidx/compose/runtime/MutableState;", "searchCountryText", "", "filterCountry", "getFilterCountry", "setFilterCountry", "(Landroidx/compose/runtime/MutableState;)V", "getRecommendSeriesListMessage", "Lcom/glority/base/server/CacheThenNetworkRequest$ResultData;", "getCurrentFilterType", "Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesType;", "fetchRecommendSeriesListMessage", "", "getUserSeriesListMessage", "Lcom/glority/android/database/entities/UserSeriesListItem;", "getRecommendSeriesByIndexListUidMessage", "Lcom/glority/android/database/entities/RecommendSeriesItem;", Args.indexListUid, "getUserSeriesDetail", "Lcom/glority/android/database/entities/UserSeriesDetailItem;", Args.seriesId, "", "getCollectionItemBySeriesId", "Lcom/glority/android/database/entities/CollectionItem;", Args.uid, "searchOfficialSeriesByCountry", "country", "seriesType", "SeriesType", "SeriesFilterData", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SeriesViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final MutableState<List<SeriesItem>> displaySeriesList;
    private MutableState<String> filterCountry;
    private String searchCountryText;
    private final List<SeriesFilterData> seriesFilterList = CollectionsKt.listOf((Object[]) new SeriesFilterData[]{new SeriesFilterData(SeriesType.OFFICIAL, R.string.catalog_officialseries_option_allseries, true), new SeriesFilterData(SeriesType.USER, R.string.catalog_officialseries_option_mycollectingstatus, false)});
    private final LiveData<List<SeriesItem>> recommendSeriesListResponse = DBManager.INSTANCE.getSeriesItemDao().getAll();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SeriesViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesType;", "", "<init>", "(Ljava/lang/String;I)V", "OFFICIAL", "USER", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class SeriesType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SeriesType[] $VALUES;
        public static final SeriesType OFFICIAL = new SeriesType("OFFICIAL", 0);
        public static final SeriesType USER = new SeriesType("USER", 1);

        private static final /* synthetic */ SeriesType[] $values() {
            return new SeriesType[]{OFFICIAL, USER};
        }

        public static EnumEntries<SeriesType> getEntries() {
            return $ENTRIES;
        }

        private SeriesType(String str, int i) {
        }

        static {
            SeriesType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static SeriesType valueOf(String str) {
            return (SeriesType) Enum.valueOf(SeriesType.class, str);
        }

        public static SeriesType[] values() {
            return (SeriesType[]) $VALUES.clone();
        }
    }

    public SeriesViewModel() {
        MutableState<List<SeriesItem>> mutableStateOf$default;
        MutableState<String> mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.displaySeriesList = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.filterCountry = mutableStateOf$default2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: SeriesViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesFilterData;", "", "seriesType", "Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesType;", "name", "", "isSelected", "", "<init>", "(Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesType;IZ)V", "getSeriesType", "()Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesType;", "getName", "()I", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final /* data */ class SeriesFilterData {
        public static final int $stable = 8;
        private boolean isSelected;
        private final int name;
        private final SeriesType seriesType;

        /* renamed from: component1, reason: from getter */
        public final SeriesType getSeriesType() {
            return this.seriesType;
        }

        /* renamed from: component2, reason: from getter */
        public final int getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final SeriesFilterData copy(SeriesType seriesType, int name, boolean isSelected) {
            Intrinsics.checkNotNullParameter(seriesType, "seriesType");
            return new SeriesFilterData(seriesType, name, isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeriesFilterData)) {
                return false;
            }
            SeriesFilterData seriesFilterData = (SeriesFilterData) other;
            return this.seriesType == seriesFilterData.seriesType && this.name == seriesFilterData.name && this.isSelected == seriesFilterData.isSelected;
        }

        public int hashCode() {
            return (((this.seriesType.hashCode() * 31) + Integer.hashCode(this.name)) * 31) + Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return "SeriesFilterData(seriesType=" + this.seriesType + ", name=" + this.name + ", isSelected=" + this.isSelected + ")";
        }

        public SeriesFilterData(SeriesType seriesType, int i, boolean z) {
            Intrinsics.checkNotNullParameter(seriesType, "seriesType");
            this.seriesType = seriesType;
            this.name = i;
            this.isSelected = z;
        }

        public static /* synthetic */ SeriesFilterData copy$default(SeriesFilterData seriesFilterData, SeriesType seriesType, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                seriesType = seriesFilterData.seriesType;
            }
            if ((i2 & 2) != 0) {
                i = seriesFilterData.name;
            }
            if ((i2 & 4) != 0) {
                z = seriesFilterData.isSelected;
            }
            return seriesFilterData.copy(seriesType, i, z);
        }

        public final SeriesType getSeriesType() {
            return this.seriesType;
        }

        public final int getName() {
            return this.name;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final void setSelected(boolean z) {
            this.isSelected = z;
        }
    }

    public final List<SeriesFilterData> getSeriesFilterList() {
        return this.seriesFilterList;
    }

    public final LiveData<List<SeriesItem>> getRecommendSeriesListResponse() {
        return this.recommendSeriesListResponse;
    }

    public final MutableState<List<SeriesItem>> getDisplaySeriesList() {
        return this.displaySeriesList;
    }

    public final MutableState<String> getFilterCountry() {
        return this.filterCountry;
    }

    public final void setFilterCountry(MutableState<String> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.filterCountry = mutableState;
    }

    /* compiled from: SeriesViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.vm.SeriesViewModel$1", f = "SeriesViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.vm.SeriesViewModel$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SeriesViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/glority/android/database/entities/SeriesItem;"}, k = 3, mv = {2, 0, 0}, xi = 82)
        @DebugMetadata(c = "com.glority.android.picturexx.vm.SeriesViewModel$1$1", f = "SeriesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.glority.android.picturexx.vm.SeriesViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C01311 extends SuspendLambda implements Function2<List<? extends SeriesItem>, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SeriesViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01311(SeriesViewModel seriesViewModel, Continuation<? super C01311> continuation) {
                super(2, continuation);
                this.this$0 = seriesViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01311(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends SeriesItem> list, Continuation<? super Unit> continuation) {
                return invoke2((List<SeriesItem>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<SeriesItem> list, Continuation<? super Unit> continuation) {
                return ((C01311) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SeriesViewModel seriesViewModel = this.this$0;
                seriesViewModel.searchOfficialSeriesByCountry(seriesViewModel.searchCountryText, this.this$0.getCurrentFilterType());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(FlowLiveDataConversions.asFlow(SeriesViewModel.this.getRecommendSeriesListResponse()), new C01311(SeriesViewModel.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<List<SeriesItem>>> getRecommendSeriesListMessage() {
        return SeriesRepository.INSTANCE.getRecommendSeriesListMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SeriesType getCurrentFilterType() {
        Object obj;
        SeriesType seriesType;
        Iterator<T> it = this.seriesFilterList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SeriesFilterData) obj).isSelected()) {
                break;
            }
        }
        SeriesFilterData seriesFilterData = (SeriesFilterData) obj;
        return (seriesFilterData == null || (seriesType = seriesFilterData.getSeriesType()) == null) ? SeriesType.OFFICIAL : seriesType;
    }

    public final void fetchRecommendSeriesListMessage() {
        SeriesRepository.INSTANCE.getRecommendSeriesListMessage();
    }

    public final LiveData<List<UserSeriesListItem>> getUserSeriesListMessage() {
        return SeriesRepository.INSTANCE.getUserSeriesListMessage();
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<RecommendSeriesItem>> getRecommendSeriesByIndexListUidMessage(String indexListUid) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        return SeriesRepository.INSTANCE.getRecommendSeriesByIndexListUidMessage(indexListUid);
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<UserSeriesDetailItem>> getUserSeriesDetail(long seriesId) {
        return SeriesRepository.INSTANCE.getUserSeriesDetailBySeriesIdMessage(seriesId);
    }

    public final LiveData<List<CollectionItem>> getCollectionItemBySeriesId(String indexListUid, String uid) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        Intrinsics.checkNotNullParameter(uid, "uid");
        return SeriesRepository.INSTANCE.getCollectionItemBySeriesId(indexListUid, uid);
    }

    public final void searchOfficialSeriesByCountry(String country, SeriesType seriesType) {
        Intrinsics.checkNotNullParameter(seriesType, "seriesType");
        this.searchCountryText = country;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SeriesViewModel$searchOfficialSeriesByCountry$1(this, seriesType, null), 2, null);
    }
}
