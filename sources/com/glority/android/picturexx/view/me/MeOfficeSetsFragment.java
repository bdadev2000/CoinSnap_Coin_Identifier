package com.glority.android.picturexx.view.me;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.ViewKt;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.utils.data.EventLiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.adapter.MeOfficialSeriesAdapter;
import com.glority.android.picturexx.adapter.OfficialSeriesAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentMeOfficialSeriesBinding;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.entity.BaseMultiEntity;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: MeOfficeSetsFragment.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0002J$\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020(H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeOfficeSetsFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentMeOfficialSeriesBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "seriesVm", "Lcom/glority/android/picturexx/vm/SeriesViewModel;", "getSeriesVm", "()Lcom/glority/android/picturexx/vm/SeriesViewModel;", "seriesVm$delegate", "adapter", "Lcom/glority/android/picturexx/adapter/MeOfficialSeriesAdapter;", "createdItem", "", "Lcom/glority/android/database/entities/SeriesItem;", "unCreatedItem", "adapterData", "", "Lcom/glority/base/entity/BaseMultiEntity;", "originalData", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "isDiff", "", "list1", "list2", "initView", "initData", "getLayoutId", "", "getLogPageName", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeOfficeSetsFragment extends BaseFragment<FragmentMeOfficialSeriesBinding> {
    public static final int $stable = 8;

    /* renamed from: seriesVm$delegate, reason: from kotlin metadata */
    private final Lazy seriesVm;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private final MeOfficialSeriesAdapter adapter = new MeOfficialSeriesAdapter();
    private List<SeriesItem> createdItem = CollectionsKt.emptyList();
    private List<SeriesItem> unCreatedItem = CollectionsKt.emptyList();
    private List<BaseMultiEntity> adapterData = new ArrayList();
    private List<SeriesItem> originalData = CollectionsKt.emptyList();

    public MeOfficeSetsFragment() {
        final MeOfficeSetsFragment meOfficeSetsFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(meOfficeSetsFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = meOfficeSetsFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$special$$inlined$activityViewModels$default$3
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
        this.seriesVm = FragmentViewModelLazyKt.createViewModelLazy(meOfficeSetsFragment, Reflection.getOrCreateKotlinClass(SeriesViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = meOfficeSetsFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$special$$inlined$activityViewModels$default$6
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

    public final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    public final SeriesViewModel getSeriesVm() {
        return (SeriesViewModel) this.seriesVm.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initData();
        initObserver();
    }

    private final void initObserver() {
        EventLiveData<Boolean> collectionCountChanged = GlobalLiveBus.INSTANCE.getCollectionCountChanged();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        collectionCountChanged.observe(requireActivity, new MeOfficeSetsFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$initObserver$1
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
                MeOfficeSetsFragment.this.getSeriesVm().getUserSeriesListMessage();
            }
        }));
        DBManager.INSTANCE.getSeriesItemDao().getAll().observe(this, new MeOfficeSetsFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends SeriesItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$initObserver$2
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
                MeOfficialSeriesAdapter meOfficialSeriesAdapter;
                List list7;
                List list8;
                MeOfficeSetsFragment meOfficeSetsFragment = MeOfficeSetsFragment.this;
                list2 = meOfficeSetsFragment.originalData;
                Intrinsics.checkNotNull(list);
                isDiff = meOfficeSetsFragment.isDiff(list2, list);
                if (isDiff) {
                    MeOfficeSetsFragment.this.originalData = list;
                    MeOfficeSetsFragment meOfficeSetsFragment2 = MeOfficeSetsFragment.this;
                    List<SeriesItem> list9 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list9) {
                        if (((SeriesItem) obj).getCreated()) {
                            arrayList.add(obj);
                        }
                    }
                    meOfficeSetsFragment2.createdItem = arrayList;
                    MeOfficeSetsFragment meOfficeSetsFragment3 = MeOfficeSetsFragment.this;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list9) {
                        if (true ^ ((SeriesItem) obj2).getCreated()) {
                            arrayList2.add(obj2);
                        }
                    }
                    meOfficeSetsFragment3.unCreatedItem = arrayList2;
                    ArrayList arrayList3 = new ArrayList();
                    list3 = MeOfficeSetsFragment.this.createdItem;
                    if (!list3.isEmpty()) {
                        int typeLabel = MeOfficialSeriesAdapter.INSTANCE.getTypeLabel();
                        int labelMySeries = MeOfficialSeriesAdapter.INSTANCE.getLabelMySeries();
                        String string = MeOfficeSetsFragment.this.getString(R.string.offseries_list_sort_title_my);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        arrayList3.add(new BaseMultiEntity(typeLabel, new MeOfficialSeriesAdapter.LabelItem(labelMySeries, string, true, null)));
                        list8 = MeOfficeSetsFragment.this.createdItem;
                        List list10 = list8;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
                        Iterator it = list10.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(new BaseMultiEntity(MeOfficialSeriesAdapter.INSTANCE.getTypeItemMySeries(), (SeriesItem) it.next()));
                        }
                        arrayList3.addAll(arrayList4);
                    }
                    int typeLabel2 = MeOfficialSeriesAdapter.INSTANCE.getTypeLabel();
                    int labelAvailableSeries = MeOfficialSeriesAdapter.INSTANCE.getLabelAvailableSeries();
                    String string2 = MeOfficeSetsFragment.this.getString(R.string.offseries_list_sort_title_all);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    list4 = MeOfficeSetsFragment.this.createdItem;
                    arrayList3.add(new BaseMultiEntity(typeLabel2, new MeOfficialSeriesAdapter.LabelItem(labelAvailableSeries, string2, true, list4.isEmpty() ? MeOfficeSetsFragment.this.getString(R.string.offseries_list_sort_title_tip) : null)));
                    list5 = MeOfficeSetsFragment.this.unCreatedItem;
                    if (!list5.isEmpty()) {
                        list6 = MeOfficeSetsFragment.this.unCreatedItem;
                        List list11 = list6;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11, 10));
                        Iterator it2 = list11.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(new BaseMultiEntity(MeOfficialSeriesAdapter.INSTANCE.getTypeItemAvailableSeries(), (SeriesItem) it2.next()));
                        }
                        arrayList3.addAll(arrayList5);
                    } else {
                        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeOfficeSetsFragment.this, LogEvents.emptyoffcialsets_show, null, 2, null);
                        arrayList3.add(new BaseMultiEntity(MeOfficialSeriesAdapter.INSTANCE.getTypeAvailableEmpty(), null));
                    }
                    MeOfficeSetsFragment.this.adapterData = arrayList3;
                    meOfficialSeriesAdapter = MeOfficeSetsFragment.this.adapter;
                    list7 = MeOfficeSetsFragment.this.adapterData;
                    meOfficialSeriesAdapter.setNewData(list7);
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
        MeOfficialSeriesAdapter meOfficialSeriesAdapter = this.adapter;
        View inflate = getLayoutInflater().inflate(R.layout.item_home_footer, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        BaseQuickAdapter.addFooterView$default(meOfficialSeriesAdapter, inflate, 0, 0, 6, null);
        ((FragmentMeOfficialSeriesBinding) getBinding()).rv.setAdapter(this.adapter);
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.MeOfficeSetsFragment$initView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
                MeOfficialSeriesAdapter meOfficialSeriesAdapter2;
                int i2;
                List list;
                List list2;
                int size;
                List list3;
                List list4;
                int size2;
                List list5;
                List list6;
                List list7;
                List list8;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                meOfficialSeriesAdapter2 = MeOfficeSetsFragment.this.adapter;
                Object item = ((BaseMultiEntity) meOfficialSeriesAdapter2.getData().get(i)).getItem();
                if (item instanceof SeriesItem) {
                    SeriesItem seriesItem = (SeriesItem) item;
                    if (seriesItem.getCreated()) {
                        MeOfficeSetsFragment.this.logEvent(LogEvents.offseries_listitem_click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.my), TuplesKt.to("id", seriesItem.getIndexListUid())));
                        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.INSTANCE;
                        Uri parse = Uri.parse("coin://series/detail?indexListUid=" + seriesItem.getIndexListUid() + "&from=" + MeOfficeSetsFragment.this.getPageName() + "&seriesId=" + seriesItem.getSeriesId());
                        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                        ViewKt.findNavController(view).navigate(companion.fromUri(parse).build(), NavigationAnimaUtils.INSTANCE.getSlideAnima(MeOfficeSetsFragment.this.getActivity()));
                        return;
                    }
                    MeOfficeSetsFragment.this.logEvent(LogEvents.offseries_listitem_click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.available), TuplesKt.to("id", seriesItem.getIndexListUid())));
                    NavDeepLinkRequest.Builder.Companion companion2 = NavDeepLinkRequest.Builder.INSTANCE;
                    Uri parse2 = Uri.parse("coin://series/introduce?indexListUid=" + seriesItem.getIndexListUid() + "&from=" + MeOfficeSetsFragment.this.getPageName());
                    Intrinsics.checkNotNullExpressionValue(parse2, "parse(this)");
                    ViewKt.findNavController(view).navigate(companion2.fromUri(parse2).build(), NavigationAnimaUtils.INSTANCE.getSlideAnima(MeOfficeSetsFragment.this.getActivity()));
                    return;
                }
                if (item instanceof MeOfficialSeriesAdapter.LabelItem) {
                    MeOfficialSeriesAdapter.LabelItem labelItem = (MeOfficialSeriesAdapter.LabelItem) item;
                    labelItem.setExpand(!labelItem.getExpand());
                    MeOfficeSetsFragment meOfficeSetsFragment = MeOfficeSetsFragment.this;
                    Pair[] pairArr = new Pair[1];
                    pairArr[0] = TuplesKt.to("type", labelItem.getExpand() ? "show" : "hide");
                    meOfficeSetsFragment.logEvent(LogEvents.offseries_listfolder_click, BundleKt.bundleOf(pairArr));
                    if (labelItem.getType() == MeOfficialSeriesAdapter.INSTANCE.getLabelMySeries()) {
                        if (labelItem.getExpand()) {
                            list7 = MeOfficeSetsFragment.this.createdItem;
                            List list9 = list7;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
                            Iterator it = list9.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new BaseMultiEntity(OfficialSeriesAdapter.INSTANCE.getTypeItemMySeries(), (SeriesItem) it.next()));
                            }
                            ArrayList arrayList2 = arrayList;
                            list8 = MeOfficeSetsFragment.this.adapterData;
                            list8.addAll(i + 1, arrayList2);
                            size2 = arrayList2.size();
                            i2 = size2 + i;
                        } else {
                            list5 = MeOfficeSetsFragment.this.adapterData;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : list5) {
                                BaseMultiEntity baseMultiEntity = (BaseMultiEntity) obj;
                                if (baseMultiEntity.getItem() instanceof SeriesItem) {
                                    Object item2 = baseMultiEntity.getItem();
                                    Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.glority.android.database.entities.SeriesItem");
                                    if (((SeriesItem) item2).getCreated()) {
                                        arrayList3.add(obj);
                                    }
                                }
                            }
                            ArrayList arrayList4 = arrayList3;
                            list6 = MeOfficeSetsFragment.this.adapterData;
                            list6.removeAll(arrayList4);
                            size = arrayList4.size();
                            i2 = size + i;
                        }
                    } else if (labelItem.getType() != MeOfficialSeriesAdapter.INSTANCE.getLabelAvailableSeries()) {
                        i2 = i;
                    } else if (labelItem.getExpand()) {
                        list3 = MeOfficeSetsFragment.this.unCreatedItem;
                        List list10 = list3;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
                        Iterator it2 = list10.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(new BaseMultiEntity(OfficialSeriesAdapter.INSTANCE.getTypeItemAvailableSeries(), (SeriesItem) it2.next()));
                        }
                        ArrayList arrayList6 = arrayList5;
                        list4 = MeOfficeSetsFragment.this.adapterData;
                        list4.addAll(i + 1, arrayList6);
                        size2 = arrayList6.size();
                        i2 = size2 + i;
                    } else {
                        list = MeOfficeSetsFragment.this.adapterData;
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj2 : list) {
                            BaseMultiEntity baseMultiEntity2 = (BaseMultiEntity) obj2;
                            if (baseMultiEntity2.getItem() instanceof SeriesItem) {
                                Object item3 = baseMultiEntity2.getItem();
                                Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.glority.android.database.entities.SeriesItem");
                                if (!((SeriesItem) item3).getCreated()) {
                                    arrayList7.add(obj2);
                                }
                            }
                        }
                        ArrayList arrayList8 = arrayList7;
                        list2 = MeOfficeSetsFragment.this.adapterData;
                        list2.removeAll(arrayList8);
                        size = arrayList8.size();
                        i2 = size + i;
                    }
                    adapter.notifyItemChanged(i);
                    if (labelItem.getExpand()) {
                        adapter.notifyItemRangeInserted(i + 1, i2 - i);
                    } else {
                        adapter.notifyItemRangeRemoved(i + 1, i2 - i);
                    }
                }
            }
        });
    }

    private final void initData() {
        getSeriesVm().getUserSeriesListMessage();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_me_official_series;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return "meofficailsets";
    }
}
