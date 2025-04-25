package com.glority.android.picturexx.view.series;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.adapter.OfficialSeriesAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentRecommendSeriesBinding;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.entity.BaseMultiEntity;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.widget.GlLoadingLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: OfficialSeriesListFragment.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0002J$\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001dH\u0002J\b\u0010'\u001a\u00020(H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/glority/android/picturexx/view/series/OfficialSeriesListFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentRecommendSeriesBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "seriesVm", "Lcom/glority/android/picturexx/vm/SeriesViewModel;", "getSeriesVm", "()Lcom/glority/android/picturexx/vm/SeriesViewModel;", "seriesVm$delegate", "adapter", "Lcom/glority/android/picturexx/adapter/OfficialSeriesAdapter;", "createdItem", "", "Lcom/glority/android/database/entities/SeriesItem;", "unCreatedItem", "adapterData", "", "Lcom/glority/base/entity/BaseMultiEntity;", "originalData", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "isDiff", "", "list1", "list2", "initView", "initData", "getLogPageName", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OfficialSeriesListFragment extends BaseFragment<FragmentRecommendSeriesBinding> {
    public static final int $stable = 8;

    /* renamed from: seriesVm$delegate, reason: from kotlin metadata */
    private final Lazy seriesVm;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private final OfficialSeriesAdapter adapter = new OfficialSeriesAdapter();
    private List<SeriesItem> createdItem = CollectionsKt.emptyList();
    private List<SeriesItem> unCreatedItem = CollectionsKt.emptyList();
    private List<BaseMultiEntity> adapterData = new ArrayList();
    private List<SeriesItem> originalData = CollectionsKt.emptyList();

    public OfficialSeriesListFragment() {
        final OfficialSeriesListFragment officialSeriesListFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(officialSeriesListFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = officialSeriesListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.seriesVm = FragmentViewModelLazyKt.createViewModelLazy(officialSeriesListFragment, Reflection.getOrCreateKotlinClass(SeriesViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$special$$inlined$activityViewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = officialSeriesListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentRecommendSeriesBinding access$getBinding(OfficialSeriesListFragment officialSeriesListFragment) {
        return (FragmentRecommendSeriesBinding) officialSeriesListFragment.getBinding();
    }

    public final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    public final SeriesViewModel getSeriesVm() {
        return (SeriesViewModel) this.seriesVm.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_recommend_series;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initData();
        initObserver();
    }

    private final void initObserver() {
        OfficialSeriesListFragment officialSeriesListFragment = this;
        GlobalLiveBus.INSTANCE.getCollectionCountChanged().observe(officialSeriesListFragment, new OfficialSeriesListFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$initObserver$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                OfficialSeriesListFragment.this.getSeriesVm().getUserSeriesListMessage();
            }
        }));
        DBManager.INSTANCE.getSeriesItemDao().getAll().observe(officialSeriesListFragment, new OfficialSeriesListFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends SeriesItem>, Unit>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$initObserver$2
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
            public final void invoke2(List<SeriesItem> list) {
                List list2;
                boolean isDiff;
                List list3;
                List list4;
                List list5;
                List list6;
                OfficialSeriesAdapter officialSeriesAdapter;
                List list7;
                List list8;
                OfficialSeriesListFragment officialSeriesListFragment2 = OfficialSeriesListFragment.this;
                list2 = officialSeriesListFragment2.originalData;
                Intrinsics.checkNotNull(list);
                isDiff = officialSeriesListFragment2.isDiff(list2, list);
                if (isDiff) {
                    OfficialSeriesListFragment.this.originalData = list;
                    OfficialSeriesListFragment officialSeriesListFragment3 = OfficialSeriesListFragment.this;
                    List<SeriesItem> list9 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list9) {
                        if (((SeriesItem) obj).getCreated()) {
                            arrayList.add(obj);
                        }
                    }
                    officialSeriesListFragment3.createdItem = arrayList;
                    OfficialSeriesListFragment officialSeriesListFragment4 = OfficialSeriesListFragment.this;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list9) {
                        if (true ^ ((SeriesItem) obj2).getCreated()) {
                            arrayList2.add(obj2);
                        }
                    }
                    officialSeriesListFragment4.unCreatedItem = arrayList2;
                    ArrayList arrayList3 = new ArrayList();
                    list3 = OfficialSeriesListFragment.this.createdItem;
                    if (!list3.isEmpty()) {
                        int typeLabel = OfficialSeriesAdapter.INSTANCE.getTypeLabel();
                        int labelMySeries = OfficialSeriesAdapter.INSTANCE.getLabelMySeries();
                        String string = OfficialSeriesListFragment.this.getString(R.string.offseries_list_sort_title_my);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        arrayList3.add(new BaseMultiEntity(typeLabel, new OfficialSeriesAdapter.LabelItem(labelMySeries, string, true, null)));
                        list8 = OfficialSeriesListFragment.this.createdItem;
                        List list10 = list8;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
                        Iterator it = list10.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(new BaseMultiEntity(OfficialSeriesAdapter.INSTANCE.getTypeItemMySeries(), (SeriesItem) it.next()));
                        }
                        arrayList3.addAll(arrayList4);
                    }
                    int typeLabel2 = OfficialSeriesAdapter.INSTANCE.getTypeLabel();
                    int labelAvailableSeries = OfficialSeriesAdapter.INSTANCE.getLabelAvailableSeries();
                    String string2 = OfficialSeriesListFragment.this.getString(R.string.offseries_list_sort_title_all);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    list4 = OfficialSeriesListFragment.this.createdItem;
                    arrayList3.add(new BaseMultiEntity(typeLabel2, new OfficialSeriesAdapter.LabelItem(labelAvailableSeries, string2, null, list4.isEmpty() ? OfficialSeriesListFragment.this.getString(R.string.offseries_list_sort_title_tip) : null)));
                    list5 = OfficialSeriesListFragment.this.unCreatedItem;
                    if (!list5.isEmpty()) {
                        list6 = OfficialSeriesListFragment.this.unCreatedItem;
                        List list11 = list6;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11, 10));
                        Iterator it2 = list11.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(new BaseMultiEntity(OfficialSeriesAdapter.INSTANCE.getTypeItemAvailableSeries(), (SeriesItem) it2.next()));
                        }
                        arrayList3.addAll(arrayList5);
                    } else {
                        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(OfficialSeriesListFragment.this, LogEvents.emptyoffcialsets_show, null, 2, null);
                        arrayList3.add(new BaseMultiEntity(OfficialSeriesAdapter.INSTANCE.getTypeAvailableEmpty(), null));
                    }
                    OfficialSeriesListFragment.this.adapterData = arrayList3;
                    officialSeriesAdapter = OfficialSeriesListFragment.this.adapter;
                    list7 = OfficialSeriesListFragment.this.adapterData;
                    officialSeriesAdapter.setNewData(list7);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDiff(List<SeriesItem> list1, List<SeriesItem> list2) {
        if (list1.size() != list2.size()) {
            return true;
        }
        int i = 0;
        for (Object obj : list1) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SeriesItem seriesItem = (SeriesItem) obj;
            SeriesItem seriesItem2 = list2.get(i);
            if (!Intrinsics.areEqual(seriesItem.getIndexListUid(), seriesItem2.getIndexListUid()) || !Intrinsics.areEqual(seriesItem.getTitle(), seriesItem2.getTitle()) || !Intrinsics.areEqual(seriesItem.getImageUrl(), seriesItem2.getImageUrl()) || seriesItem.getTotalNum() != seriesItem2.getTotalNum() || seriesItem.getCreated() != seriesItem2.getCreated() || !Intrinsics.areEqual(seriesItem.getCurrentCount(), seriesItem2.getCurrentCount())) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        OfficialSeriesAdapter officialSeriesAdapter = this.adapter;
        View inflate = getLayoutInflater().inflate(R.layout.item_home_footer, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        BaseQuickAdapter.addFooterView$default(officialSeriesAdapter, inflate, 0, 0, 6, null);
        ((FragmentRecommendSeriesBinding) getBinding()).rv.setAdapter(this.adapter);
        ((FragmentRecommendSeriesBinding) getBinding()).naviBar.toolbar.setTitle(R.string.offseries_list_title);
        ((FragmentRecommendSeriesBinding) getBinding()).naviBar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfficialSeriesListFragment.initView$lambda$1(OfficialSeriesListFragment.this, view);
            }
        });
        this.adapter.setOnItemClickListener(new OfficialSeriesListFragment$initView$2(this));
        ((FragmentRecommendSeriesBinding) getBinding()).loadingView.setCallback(new GlLoadingLayout.Callback() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$initView$3
            @Override // com.glority.widget.GlLoadingLayout.Callback
            public void loadData() {
                OfficialSeriesListFragment.this.initData();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(OfficialSeriesListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initData() {
        ((FragmentRecommendSeriesBinding) getBinding()).loadingView.showLoading();
        getSeriesVm().getRecommendSeriesListMessage().observe(this, new OfficialSeriesListFragment$sam$androidx_lifecycle_Observer$0(new Function1<CacheThenNetworkRequest.ResultData<List<? extends SeriesItem>>, Unit>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CacheThenNetworkRequest.ResultData<List<? extends SeriesItem>> resultData) {
                invoke2((CacheThenNetworkRequest.ResultData<List<SeriesItem>>) resultData);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CacheThenNetworkRequest.ResultData<List<SeriesItem>> resultData) {
                OfficialSeriesListFragment.access$getBinding(OfficialSeriesListFragment.this).loadingView.hideLoadingView();
                if (resultData.getIsCache() || resultData.getResult() != null) {
                    return;
                }
                GlLoadingLayout.showError$default(OfficialSeriesListFragment.access$getBinding(OfficialSeriesListFragment.this).loadingView, null, 1, null);
            }
        }));
        getSeriesVm().getUserSeriesListMessage();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.serieslist;
    }
}
