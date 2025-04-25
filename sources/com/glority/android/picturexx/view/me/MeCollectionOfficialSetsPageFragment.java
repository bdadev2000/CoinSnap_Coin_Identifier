package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.cmsui2.util.CmsDataUtilsKt;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.adapter.OfficialSetPageAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionOfficialSetPageBinding;
import com.glority.android.picturexx.business.databinding.ItemHomeFooterBinding;
import com.glority.android.picturexx.business.databinding.LayoutCollectionAllListHeaderBinding;
import com.glority.android.picturexx.business.databinding.LayoutNoneOfficialSeriesEmptyViewBinding;
import com.glority.android.picturexx.definition.CatalogTab;
import com.glority.android.picturexx.definition.SeriesItemWrapper;
import com.glority.android.picturexx.extensions.SeriesItemListExtKt;
import com.glority.android.picturexx.extensions.SeriesSortType;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.utils.app.ResUtils;
import com.glority.widget.tooltips.GlToolTips;
import com.glority.widget.tooltips.GlToolTipsItem;
import com.glority.widget.tooltips.GlToolTipsOnItemClickListener;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: MeCollectionOfficialSetsPageFragment.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010/\u001a\u00020\u001dH\u0014J\b\u00100\u001a\u000201H\u0014J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0014J\b\u00106\u001a\u000203H\u0002J\b\u00107\u001a\u000203H\u0002J \u00108\u001a\u0002032\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J7\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020;2%\b\u0002\u0010@\u001a\u001f\u0012\u0013\u0012\u001101¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0004\u0012\u000203\u0018\u00010AH\u0002J\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020+0'2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020(0*H\u0002J^\u0010G\u001a\u0002032\f\u0010F\u001a\b\u0012\u0004\u0012\u00020(0*2\b\u0010H\u001a\u0004\u0018\u00010\u001d27\u0010I\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020(0*¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\n\u0012\b\u0012\u0004\u0012\u0002030K\u0012\u0006\u0012\u0004\u0018\u00010L0JH\u0002¢\u0006\u0002\u0010MJ\u001c\u0010N\u001a\u0002032\f\u0010O\u001a\b\u0012\u0004\u0012\u00020(0*H\u0082@¢\u0006\u0002\u0010PJ*\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0*2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020(0*2\u0006\u0010R\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010SJ\u0010\u0010T\u001a\u0002032\u0006\u0010U\u001a\u00020VH\u0002J\u0018\u0010W\u001a\u0002032\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020VH\u0002J\b\u0010Y\u001a\u000203H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001dX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u0018\u0010 \u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b,\u0010-¨\u0006Z"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCollectionOfficialSetsPageFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentMeCollectionOfficialSetPageBinding;", "<init>", "()V", "listHeaderBinding", "Lcom/glority/android/picturexx/business/databinding/LayoutCollectionAllListHeaderBinding;", "getListHeaderBinding", "()Lcom/glority/android/picturexx/business/databinding/LayoutCollectionAllListHeaderBinding;", "listHeaderBinding$delegate", "Lkotlin/Lazy;", "singleThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "footerView", "Landroid/view/View;", "getFooterView", "()Landroid/view/View;", "footerView$delegate", "emptyViewBinding", "Lcom/glority/android/picturexx/business/databinding/LayoutNoneOfficialSeriesEmptyViewBinding;", "getEmptyViewBinding", "()Lcom/glority/android/picturexx/business/databinding/LayoutNoneOfficialSeriesEmptyViewBinding;", "emptyViewBinding$delegate", "adapter", "Lcom/glority/android/picturexx/adapter/OfficialSetPageAdapter;", "getAdapter", "()Lcom/glority/android/picturexx/adapter/OfficialSetPageAdapter;", "adapter$delegate", "currentIssuer", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "countryFilterAll", "currentSortType", "Lcom/glority/android/picturexx/extensions/SeriesSortType;", "filterToolTips", "Lcom/glority/widget/tooltips/GlToolTips;", "sortToolTips", "allSeriesItems", "", "Lcom/glority/android/database/entities/SeriesItem;", "sortData", "", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "getSortData", "()Ljava/util/List;", "sortData$delegate", "getLogPageName", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initRecyclerView", "addSubscriptions", "initCountryFilterView", "filterLL", "filterTextView", "Landroid/widget/TextView;", "filterView", "Landroid/widget/ImageView;", "initSortSelectionView", "view", "selectedPosition", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "getCountryFilterData", "data", "filter", "issuer", "onResult", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "updateAdapter", "seriesItems", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sort", "seriesSortType", "(Ljava/util/List;Lcom/glority/android/picturexx/extensions/SeriesSortType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onOfficialSetCardClick", "seriesItem", "Lcom/glority/android/picturexx/definition/SeriesItemWrapper;", "exportOfficialSet", "anchorView", "onDetach", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCollectionOfficialSetsPageFragment extends BaseFragment<FragmentMeCollectionOfficialSetPageBinding> {
    public static final int $stable = 8;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter;
    private final List<SeriesItem> allSeriesItems;
    private final String countryFilterAll;
    private String currentIssuer;
    private SeriesSortType currentSortType;

    /* renamed from: emptyViewBinding$delegate, reason: from kotlin metadata */
    private final Lazy emptyViewBinding;
    private GlToolTips filterToolTips;

    /* renamed from: footerView$delegate, reason: from kotlin metadata */
    private final Lazy footerView;

    /* renamed from: listHeaderBinding$delegate, reason: from kotlin metadata */
    private final Lazy listHeaderBinding = LazyKt.lazy(new Function0<LayoutCollectionAllListHeaderBinding>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$listHeaderBinding$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LayoutCollectionAllListHeaderBinding invoke() {
            LayoutCollectionAllListHeaderBinding inflate = LayoutCollectionAllListHeaderBinding.inflate(MeCollectionOfficialSetsPageFragment.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            LinearLayout llCollectionExport = inflate.llCollectionExport;
            Intrinsics.checkNotNullExpressionValue(llCollectionExport, "llCollectionExport");
            llCollectionExport.setVisibility(8);
            return inflate;
        }
    });
    private final ExecutorCoroutineDispatcher singleThread;

    /* renamed from: sortData$delegate, reason: from kotlin metadata */
    private final Lazy sortData;
    private GlToolTips sortToolTips;

    public MeCollectionOfficialSetsPageFragment() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.singleThread = ExecutorsKt.from(newSingleThreadExecutor);
        this.footerView = LazyKt.lazy(new Function0<FrameLayout>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$footerView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final FrameLayout invoke() {
                ItemHomeFooterBinding inflate = ItemHomeFooterBinding.inflate(MeCollectionOfficialSetsPageFragment.this.getLayoutInflater());
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                return inflate.getRoot();
            }
        });
        this.emptyViewBinding = LazyKt.lazy(new Function0<LayoutNoneOfficialSeriesEmptyViewBinding>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$emptyViewBinding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutNoneOfficialSeriesEmptyViewBinding invoke() {
                LayoutNoneOfficialSeriesEmptyViewBinding inflate = LayoutNoneOfficialSeriesEmptyViewBinding.inflate(MeCollectionOfficialSetsPageFragment.this.getLayoutInflater());
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                return inflate;
            }
        });
        this.adapter = LazyKt.lazy(new Function0<OfficialSetPageAdapter>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$adapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final OfficialSetPageAdapter invoke() {
                return new OfficialSetPageAdapter();
            }
        });
        this.currentIssuer = ResUtils.getString(R.string.collection_banner_all);
        this.countryFilterAll = ResUtils.getString(R.string.collection_banner_all);
        this.currentSortType = SeriesSortType.DATE_UPDATE;
        this.allSeriesItems = new ArrayList();
        this.sortData = LazyKt.lazy(new Function0<List<? extends GlToolTipsItem>>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$sortData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends GlToolTipsItem> invoke() {
                String string = MeCollectionOfficialSetsPageFragment.this.getString(R.string.official_filter_updated);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                GlToolTipsItem glToolTipsItem = new GlToolTipsItem(string, (Integer) null, true, 2, (DefaultConstructorMarker) null);
                String string2 = MeCollectionOfficialSetsPageFragment.this.getString(R.string.official_filter_progress);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return CollectionsKt.listOf((Object[]) new GlToolTipsItem[]{glToolTipsItem, new GlToolTipsItem(string2, (Integer) null, false, 2, (DefaultConstructorMarker) null)});
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentMeCollectionOfficialSetPageBinding access$getBinding(MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment) {
        return (FragmentMeCollectionOfficialSetPageBinding) meCollectionOfficialSetsPageFragment.getBinding();
    }

    private final LayoutCollectionAllListHeaderBinding getListHeaderBinding() {
        return (LayoutCollectionAllListHeaderBinding) this.listHeaderBinding.getValue();
    }

    private final View getFooterView() {
        Object value = this.footerView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    private final LayoutNoneOfficialSeriesEmptyViewBinding getEmptyViewBinding() {
        return (LayoutNoneOfficialSeriesEmptyViewBinding) this.emptyViewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OfficialSetPageAdapter getAdapter() {
        return (OfficialSetPageAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GlToolTipsItem> getSortData() {
        return (List) this.sortData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public String getLogPageName() {
        return "officialsets";
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_me_collection_official_set_page;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initRecyclerView();
        addSubscriptions();
        LinearLayout llRegionSelection = getListHeaderBinding().llRegionSelection;
        Intrinsics.checkNotNullExpressionValue(llRegionSelection, "llRegionSelection");
        AppCompatTextView tvRegionName = getListHeaderBinding().tvRegionName;
        Intrinsics.checkNotNullExpressionValue(tvRegionName, "tvRegionName");
        AppCompatImageView ivRegionIcon = getListHeaderBinding().ivRegionIcon;
        Intrinsics.checkNotNullExpressionValue(ivRegionIcon, "ivRegionIcon");
        initCountryFilterView(llRegionSelection, tvRegionName, ivRegionIcon);
        AppCompatTextView tvSortTypeName = getListHeaderBinding().tvSortTypeName;
        Intrinsics.checkNotNullExpressionValue(tvSortTypeName, "tvSortTypeName");
        initSortSelectionView$default(this, tvSortTypeName, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecyclerView() {
        LinearLayout llCheckAllOfficialSet = getEmptyViewBinding().llCheckAllOfficialSet;
        Intrinsics.checkNotNullExpressionValue(llCheckAllOfficialSet, "llCheckAllOfficialSet");
        ViewExtensionsKt.setSingleClickListener$default(llCheckAllOfficialSet, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initRecyclerView$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(CatalogTab.INSTANCE);
                GlobalLiveBus.INSTANCE.getChangeCatalogTab().setValue(1);
            }
        }, 1, (Object) null);
        ((FragmentMeCollectionOfficialSetPageBinding) getBinding()).rvSeries.setAdapter(getAdapter());
        OfficialSetPageAdapter adapter = getAdapter();
        View root = getListHeaderBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseQuickAdapter.addHeaderView$default(adapter, root, 0, 0, 6, null);
        BaseQuickAdapter.addFooterView$default(getAdapter(), getFooterView(), 0, 0, 6, null);
        OfficialSetPageAdapter adapter2 = getAdapter();
        View root2 = getEmptyViewBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        adapter2.setEmptyView(root2);
        getAdapter().setHeaderFooterEmpty(false, false);
        getAdapter().setOnItemChildClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initRecyclerView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter3, View view, int i) {
                Intrinsics.checkNotNullParameter(adapter3, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                Object orNull = CollectionsKt.getOrNull(adapter3.getData(), i);
                SeriesItemWrapper seriesItemWrapper = orNull instanceof SeriesItemWrapper ? (SeriesItemWrapper) orNull : null;
                if (seriesItemWrapper == null) {
                    return;
                }
                int id = view.getId();
                if (id == R.id.cv_official_set_card) {
                    MeCollectionOfficialSetsPageFragment.this.onOfficialSetCardClick(seriesItemWrapper);
                } else if (id == R.id.iv_more) {
                    MeCollectionOfficialSetsPageFragment.this.exportOfficialSet(view, seriesItemWrapper);
                }
            }
        });
        ((FragmentMeCollectionOfficialSetPageBinding) getBinding()).rvSeries.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initRecyclerView$3
            private boolean hasRecordedScroll;
            private boolean hasRecordedScrollToBottom;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (!this.hasRecordedScroll && newState == 1) {
                    this.hasRecordedScroll = true;
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionOfficialSetsPageFragment.this, LogEvents.Me_Official_Sets_List_Scroll, null, 2, null);
                }
                if (this.hasRecordedScrollToBottom || recyclerView.canScrollVertically(1)) {
                    return;
                }
                this.hasRecordedScrollToBottom = true;
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionOfficialSetsPageFragment.this, LogEvents.Me_Official_Sets_List_Scroll_To_Bottom, null, 2, null);
            }
        });
    }

    private final void addSubscriptions() {
        DBManager.INSTANCE.getSeriesItemDao().getAll().observe(this, new MeCollectionOfficialSetsPageFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends SeriesItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$addSubscriptions$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends SeriesItem> list) {
                invoke2((List<SeriesItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<SeriesItem> seriesItemList) {
                List list;
                List list2;
                Intrinsics.checkNotNullParameter(seriesItemList, "seriesItemList");
                list = MeCollectionOfficialSetsPageFragment.this.allSeriesItems;
                list.clear();
                list2 = MeCollectionOfficialSetsPageFragment.this.allSeriesItems;
                list2.addAll(seriesItemList);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(MeCollectionOfficialSetsPageFragment.this), null, null, new AnonymousClass1(MeCollectionOfficialSetsPageFragment.this, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MeCollectionOfficialSetsPageFragment.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$addSubscriptions$1$1", f = "MeCollectionOfficialSetsPageFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$addSubscriptions$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ MeCollectionOfficialSetsPageFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = meCollectionOfficialSetsPageFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: MeCollectionOfficialSetsPageFragment.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
                /* renamed from: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$addSubscriptions$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes5.dex */
                public /* synthetic */ class C01231 extends FunctionReferenceImpl implements Function2<List<? extends SeriesItem>, Continuation<? super Unit>, Object>, SuspendFunction {
                    C01231(Object obj) {
                        super(2, obj, MeCollectionOfficialSetsPageFragment.class, "updateAdapter", "updateAdapter(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(List<? extends SeriesItem> list, Continuation<? super Unit> continuation) {
                        return invoke2((List<SeriesItem>) list, continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(List<SeriesItem> list, Continuation<? super Unit> continuation) {
                        Object updateAdapter;
                        updateAdapter = ((MeCollectionOfficialSetsPageFragment) this.receiver).updateAdapter(list, continuation);
                        return updateAdapter;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    List list;
                    String str;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment = this.this$0;
                    list = meCollectionOfficialSetsPageFragment.allSeriesItems;
                    str = this.this$0.currentIssuer;
                    meCollectionOfficialSetsPageFragment.filter(list, str, new C01231(this.this$0));
                    return Unit.INSTANCE;
                }
            }
        }));
    }

    private final void initCountryFilterView(View filterLL, final TextView filterTextView, final ImageView filterView) {
        filterTextView.setText(this.countryFilterAll);
        filterView.setImageResource(R.drawable.icon_price_scale_global);
        ViewExtensionsKt.setSingleClickListener$default(filterLL, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initCountryFilterView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                List list;
                final List<GlToolTipsItem> countryFilterData;
                Intrinsics.checkNotNullParameter(it, "it");
                MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment = MeCollectionOfficialSetsPageFragment.this;
                list = meCollectionOfficialSetsPageFragment.allSeriesItems;
                countryFilterData = meCollectionOfficialSetsPageFragment.getCountryFilterData(list);
                MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment2 = MeCollectionOfficialSetsPageFragment.this;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder showArrow = new GlToolTips.Builder(context).addDivider(true).setSelectable(true).setShowArrow(false);
                final MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment3 = MeCollectionOfficialSetsPageFragment.this;
                final ImageView imageView = filterView;
                final TextView textView = filterTextView;
                meCollectionOfficialSetsPageFragment2.filterToolTips = showArrow.setItems(countryFilterData, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initCountryFilterView$1.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        List list2;
                        String str;
                        MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment4 = MeCollectionOfficialSetsPageFragment.this;
                        Pair[] pairArr = new Pair[2];
                        pairArr[0] = TuplesKt.to("from", meCollectionOfficialSetsPageFragment4.getLogPageName());
                        GlToolTipsItem glToolTipsItem = (GlToolTipsItem) CollectionsKt.getOrNull(countryFilterData, position);
                        pairArr[1] = TuplesKt.to("type", glToolTipsItem != null ? glToolTipsItem.getText() : null);
                        meCollectionOfficialSetsPageFragment4.logEvent(LogEvents.Me_Official_Order_By_Country_Click, BundleKt.bundleOf(pairArr));
                        GlToolTipsItem glToolTipsItem2 = countryFilterData.get(position);
                        MeCollectionOfficialSetsPageFragment.this.currentIssuer = glToolTipsItem2.getText();
                        RequestManager with = Glide.with(MeCollectionOfficialSetsPageFragment.this);
                        Object imageUrl = glToolTipsItem2.getImageUrl();
                        if (imageUrl == null) {
                            imageUrl = glToolTipsItem2.getDrawableRes();
                        }
                        with.load(imageUrl).into(imageView);
                        textView.setText(glToolTipsItem2.getText());
                        int i = 0;
                        for (Object obj : countryFilterData) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ((GlToolTipsItem) obj).setSelected(i == position);
                            i = i2;
                        }
                        MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment5 = MeCollectionOfficialSetsPageFragment.this;
                        list2 = meCollectionOfficialSetsPageFragment5.allSeriesItems;
                        str = MeCollectionOfficialSetsPageFragment.this.currentIssuer;
                        meCollectionOfficialSetsPageFragment5.filter(list2, str, new MeCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2(MeCollectionOfficialSetsPageFragment.this, null));
                    }
                }).showLight(it, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initSortSelectionView$default(MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment, TextView textView, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        meCollectionOfficialSetsPageFragment.initSortSelectionView(textView, function1);
    }

    private final void initSortSelectionView(TextView view, final Function1<? super Integer, Unit> selectedPosition) {
        view.setText(R.string.Customseries_dateupdated);
        ViewExtensionsKt.setSingleClickListener$default(view, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initSortSelectionView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                List<GlToolTipsItem> sortData;
                Intrinsics.checkNotNullParameter(it, "it");
                MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment = MeCollectionOfficialSetsPageFragment.this;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder selectable = new GlToolTips.Builder(context).addDivider(true).setSelectable(true);
                sortData = MeCollectionOfficialSetsPageFragment.this.getSortData();
                final MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment2 = MeCollectionOfficialSetsPageFragment.this;
                final Function1<Integer, Unit> function1 = selectedPosition;
                meCollectionOfficialSetsPageFragment.sortToolTips = selectable.setItems(sortData, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initSortSelectionView$1.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        List sortData2;
                        sortData2 = MeCollectionOfficialSetsPageFragment.this.getSortData();
                        Iterator it2 = sortData2.iterator();
                        int i = 0;
                        while (true) {
                            boolean z = true;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            GlToolTipsItem glToolTipsItem = (GlToolTipsItem) next;
                            if (i != position) {
                                z = false;
                            }
                            glToolTipsItem.setSelected(z);
                            i = i2;
                        }
                        MeCollectionOfficialSetsPageFragment.this.currentSortType = SeriesSortType.INSTANCE.fromValue(position);
                        if (position == 0) {
                            MeCollectionOfficialSetsPageFragment.this.logEvent(LogEvents.Me_Official_Order_By_Sort_Click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.customseriesfolder_sortbyreleaseyear)));
                        } else if (position == 1) {
                            MeCollectionOfficialSetsPageFragment.this.logEvent(LogEvents.Me_Official_Order_By_Sort_Click, BundleKt.bundleOf(TuplesKt.to("type", "Price")));
                        } else {
                            MeCollectionOfficialSetsPageFragment.this.logEvent(LogEvents.Me_Official_Order_By_Sort_Click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.customseriesfolder_sortbydateadd)));
                        }
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(MeCollectionOfficialSetsPageFragment.this), null, null, new MeCollectionOfficialSetsPageFragment$initSortSelectionView$1$1$onClick$2(function1, position, MeCollectionOfficialSetsPageFragment.this, null), 3, null);
                    }
                }).showLight(it, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GlToolTipsItem> getCountryFilterData(List<SeriesItem> data) {
        Integer currentCount;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : data) {
            SeriesItem seriesItem = (SeriesItem) obj;
            if (seriesItem.getCountry() != null && seriesItem.getTotalNum() > 0 && (currentCount = seriesItem.getCurrentCount()) != null && currentCount.intValue() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            CountryInfo country = ((SeriesItem) it.next()).getCountry();
            Intrinsics.checkNotNull(country);
            arrayList4.add(country);
        }
        HashSet hashSet = new HashSet();
        ArrayList<CountryInfo> arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (hashSet.add(((CountryInfo) obj2).getCountryCode())) {
                arrayList5.add(obj2);
            }
        }
        for (CountryInfo countryInfo : arrayList5) {
            arrayList.add(new GlToolTipsItem(countryInfo.getCountryCode3(), CmsDataUtilsKt.getFlag(countryInfo), Intrinsics.areEqual(countryInfo.getCountryCode3(), this.currentIssuer)));
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$getCountryFilterData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((GlToolTipsItem) t).getText(), ((GlToolTipsItem) t2).getText());
                }
            });
        }
        String string = ResUtils.getString(R.string.collection_banner_all);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(0, new GlToolTipsItem(string, Integer.valueOf(R.drawable.icon_price_scale_global), Intrinsics.areEqual(ResUtils.getString(R.string.collection_banner_all), this.currentIssuer)));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void filter(List<SeriesItem> data, String issuer, Function2<? super List<SeriesItem>, ? super Continuation<? super Unit>, ? extends Object> onResult) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.singleThread), null, null, new MeCollectionOfficialSetsPageFragment$filter$1(data, issuer, this, onResult, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0099 -> B:20:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ba -> B:10:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateAdapter(java.util.List<com.glority.android.database.entities.SeriesItem> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment.updateAdapter(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sort(List<SeriesItem> list, SeriesSortType seriesSortType, Continuation<? super List<SeriesItem>> continuation) {
        return SeriesItemListExtKt.sortSeriesItemsBy(list, seriesSortType, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOfficialSetCardClick(SeriesItemWrapper seriesItem) {
        String indexListUid = seriesItem.getSeriesItem().getIndexListUid();
        logEvent(LogEvents.Me_Official_Item_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", indexListUid)));
        NavController findNavController = FragmentKt.findNavController(this);
        Uri parse = Uri.parse("coin://series/detail?indexListUid=" + indexListUid + "&amp;from=officialsetlist&amp;seriesId=" + seriesItem.getSeriesItem().getSeriesId());
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        findNavController.navigate(parse, NavigationAnimaUtils.INSTANCE.getSlideAnima(getActivity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exportOfficialSet(final View anchorView, final SeriesItemWrapper seriesItem) {
        if (isAdded()) {
            logEvent(LogEvents.Me_Official_More_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", seriesItem.getSeriesItem().getIndexListUid())));
            Context context = anchorView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GlToolTips.Builder showArrow = new GlToolTips.Builder(context).setSelectable(false).setShowArrow(false);
            String string = ResUtils.getString(R.string.collection_customsets_action_export);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            showArrow.setItems(CollectionsKt.listOf(new GlToolTipsItem(string, (Integer) null, false, 6, (DefaultConstructorMarker) null)), new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$exportOfficialSet$1
                @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                public void onClick(int position) {
                    MeCollectionOfficialSetsPageFragment.this.logEvent(LogEvents.Me_Official_Export_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", seriesItem.getSeriesItem().getIndexListUid())));
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(MeCollectionOfficialSetsPageFragment.this), null, null, new MeCollectionOfficialSetsPageFragment$exportOfficialSet$1$onClick$1(anchorView, seriesItem, MeCollectionOfficialSetsPageFragment.this, null), 3, null);
                }
            }).showLight(anchorView, GlToolTips.Alignment.BOTTOM);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        JobKt__JobKt.cancel$default((CoroutineContext) this.singleThread, (CancellationException) null, 1, (Object) null);
    }
}
