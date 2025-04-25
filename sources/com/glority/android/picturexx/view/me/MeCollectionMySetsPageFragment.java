package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.adapter.CustomSeriesCardAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionMySetPageBinding;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesTopBarNewBinding;
import com.glority.android.picturexx.business.databinding.LayoutNoneCustomSeriesEmptyViewBinding;
import com.glority.android.picturexx.definition.SelectableItem;
import com.glority.android.picturexx.repository.SeriesRepository;
import com.glority.android.picturexx.utils.PersistDataUtils;
import com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.CustomSeriesViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.tooltips.GlToolTips;
import com.glority.widget.tooltips.GlToolTipsItem;
import com.glority.widget.tooltips.GlToolTipsOnItemClickListener;
import com.picturecoin.generatedAPI.kotlinAPI.series.DeleteUserCustomSeriesMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserCustomSeries;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: MeCollectionMySetsPageFragment.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020\u0013H\u0014J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020.H\u0002J\u0010\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020\u0013H\u0002J\u0012\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u000105H\u0014J\b\u00106\u001a\u00020.H\u0002J\u0016\u00107\u001a\u00020.2\f\u00108\u001a\b\u0012\u0004\u0012\u00020)0%H\u0002J\b\u00109\u001a\u00020.H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u001e\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCollectionMySetsPageFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentMeCollectionMySetPageBinding;", "<init>", "()V", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "Lkotlin/Lazy;", "customSeriesVm", "Lcom/glority/android/picturexx/vm/CustomSeriesViewModel;", "getCustomSeriesVm", "()Lcom/glority/android/picturexx/vm/CustomSeriesViewModel;", "customSeriesVm$delegate", "adapter", "Lcom/glority/android/picturexx/adapter/CustomSeriesCardAdapter;", "currentSortType", "", "emptyViewBinding", "Lcom/glority/android/picturexx/business/databinding/LayoutNoneCustomSeriesEmptyViewBinding;", "getEmptyViewBinding", "()Lcom/glority/android/picturexx/business/databinding/LayoutNoneCustomSeriesEmptyViewBinding;", "emptyViewBinding$delegate", "headerBinding", "Lcom/glority/android/picturexx/business/databinding/ItemCustomSeriesTopBarNewBinding;", "getHeaderBinding", "()Lcom/glority/android/picturexx/business/databinding/ItemCustomSeriesTopBarNewBinding;", "headerBinding$delegate", "footerView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getFooterView", "()Landroid/view/View;", "footerView$delegate", "sortTypeList", "", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "originalCustomSeriesData", "", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "getLogPageName", "", "getLayoutId", "initView", "", "createSeries", "initData", "deleteItem", "itemId", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "updateAdapterData", "data", "addSeriesOrderView", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCollectionMySetsPageFragment extends BaseFragment<FragmentMeCollectionMySetPageBinding> {
    public static final int $stable = 8;

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;
    private int currentSortType;

    /* renamed from: customSeriesVm$delegate, reason: from kotlin metadata */
    private final Lazy customSeriesVm;
    private List<GlToolTipsItem> sortTypeList;
    private final CustomSeriesCardAdapter adapter = new CustomSeriesCardAdapter(true);

    /* renamed from: emptyViewBinding$delegate, reason: from kotlin metadata */
    private final Lazy emptyViewBinding = LazyKt.lazy(new MeCollectionMySetsPageFragment$emptyViewBinding$2(this));

    /* renamed from: headerBinding$delegate, reason: from kotlin metadata */
    private final Lazy headerBinding = LazyKt.lazy(new Function0<ItemCustomSeriesTopBarNewBinding>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$headerBinding$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ItemCustomSeriesTopBarNewBinding invoke() {
            ItemCustomSeriesTopBarNewBinding inflate = ItemCustomSeriesTopBarNewBinding.inflate(MeCollectionMySetsPageFragment.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return inflate;
        }
    });

    /* renamed from: footerView$delegate, reason: from kotlin metadata */
    private final Lazy footerView = LazyKt.lazy(new Function0<View>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$footerView$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return MeCollectionMySetsPageFragment.this.getLayoutInflater().inflate(R.layout.item_home_footer, (ViewGroup) null);
        }
    });
    private List<UserCustomSeriesItem> originalCustomSeriesData = new ArrayList();

    public MeCollectionMySetsPageFragment() {
        final MeCollectionMySetsPageFragment meCollectionMySetsPageFragment = this;
        final Function0 function0 = null;
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(meCollectionMySetsPageFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = meCollectionMySetsPageFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$special$$inlined$activityViewModels$default$3
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
        this.customSeriesVm = FragmentViewModelLazyKt.createViewModelLazy(meCollectionMySetsPageFragment, Reflection.getOrCreateKotlinClass(CustomSeriesViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = meCollectionMySetsPageFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$special$$inlined$activityViewModels$default$6
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

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomSeriesViewModel getCustomSeriesVm() {
        return (CustomSeriesViewModel) this.customSeriesVm.getValue();
    }

    private final LayoutNoneCustomSeriesEmptyViewBinding getEmptyViewBinding() {
        return (LayoutNoneCustomSeriesEmptyViewBinding) this.emptyViewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ItemCustomSeriesTopBarNewBinding getHeaderBinding() {
        return (ItemCustomSeriesTopBarNewBinding) this.headerBinding.getValue();
    }

    private final View getFooterView() {
        return (View) this.footerView.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return LogEvents.customseries;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_me_collection_my_set_page;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        CustomSeriesViewModel customSeriesVm = getCustomSeriesVm();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.sortTypeList = customSeriesVm.getFilterGlToolTipsItem(requireContext);
        ((FragmentMeCollectionMySetPageBinding) getBinding()).rv.setAdapter(this.adapter);
        RecyclerView recyclerView = ((FragmentMeCollectionMySetPageBinding) getBinding()).rv;
        final Context context = ((FragmentMeCollectionMySetPageBinding) getBinding()).rv.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$initView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                try {
                    super.onLayoutChildren(recycler, state);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        });
        addSeriesOrderView();
        CustomSeriesCardAdapter customSeriesCardAdapter = this.adapter;
        View root = getEmptyViewBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        customSeriesCardAdapter.setEmptyView(root);
        CustomSeriesCardAdapter customSeriesCardAdapter2 = this.adapter;
        View footerView = getFooterView();
        Intrinsics.checkNotNullExpressionValue(footerView, "<get-footerView>(...)");
        customSeriesCardAdapter2.setFooterView(footerView);
        CustomSeriesCardAdapter customSeriesCardAdapter3 = this.adapter;
        View root2 = getHeaderBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        customSeriesCardAdapter3.setHeaderView(root2);
        this.adapter.setHeaderFooterEmpty(false, false);
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$initView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i) {
                CustomSeriesCardAdapter customSeriesCardAdapter4;
                UserCustomSeriesItem userCustomSeriesItem;
                CustomSeriesCardAdapter customSeriesCardAdapter5;
                Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                customSeriesCardAdapter4 = MeCollectionMySetsPageFragment.this.adapter;
                SelectableItem selectableItem = (SelectableItem) CollectionsKt.getOrNull(customSeriesCardAdapter4.getData(), i);
                if (selectableItem == null || (userCustomSeriesItem = selectableItem.getUserCustomSeriesItem()) == null) {
                    return;
                }
                int customSeriesId = userCustomSeriesItem.getCustomSeriesId();
                MeCollectionMySetsPageFragment.this.logEvent(LogEvents.Me_My_Sets_Item_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", Integer.valueOf(customSeriesId))));
                MeCollectionMySetsPageFragment meCollectionMySetsPageFragment = MeCollectionMySetsPageFragment.this;
                int i2 = R.id.action_mainFragment_to_nav_graph_custom_set;
                Bundle bundle = new Bundle();
                MeCollectionMySetsPageFragment meCollectionMySetsPageFragment2 = MeCollectionMySetsPageFragment.this;
                bundle.putInt(Args.customSeriesId, customSeriesId);
                customSeriesCardAdapter5 = meCollectionMySetsPageFragment2.adapter;
                bundle.putString(Args.title, customSeriesCardAdapter5.getData().get(i).getUserCustomSeriesItem().getTitle());
                Unit unit = Unit.INSTANCE;
                ViewExtensionsKt.navigate$default(meCollectionMySetsPageFragment, i2, bundle, NavigationAnimaUtils.INSTANCE.getSlideAnima(MeCollectionMySetsPageFragment.this.getActivity()), null, 8, null);
            }
        });
        this.adapter.setOnItemChildClickListener(new MeCollectionMySetsPageFragment$initView$3(this));
        ((FragmentMeCollectionMySetPageBinding) getBinding()).rv.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$initView$4
            private boolean hasRecordedScroll;
            private boolean hasRecordedScrollToBottom;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                if (!this.hasRecordedScroll && newState == 1) {
                    this.hasRecordedScroll = true;
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionMySetsPageFragment.this, LogEvents.Me_Custom_Sets_List_Scroll, null, 2, null);
                }
                if (this.hasRecordedScrollToBottom || recyclerView2.canScrollVertically(1)) {
                    return;
                }
                this.hasRecordedScrollToBottom = true;
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionMySetsPageFragment.this, LogEvents.Me_Custom_Sets_List_Scroll_To_Bottom, null, 2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createSeries() {
        CreateCustomSeriesDialog.INSTANCE.open(getSupportFragmentManager(), getLogPageName(), new Function1<UserCustomSeries, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$createSeries$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserCustomSeries userCustomSeries) {
                invoke2(userCustomSeries);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserCustomSeries it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MeCollectionMySetsPageFragment meCollectionMySetsPageFragment = MeCollectionMySetsPageFragment.this;
                int i = R.id.action_mainFragment_to_nav_graph_custom_set;
                Bundle bundle = new Bundle();
                bundle.putInt(Args.customSeriesId, it.getCustomSeriesId());
                bundle.putString(Args.title, it.getTitle());
                Unit unit = Unit.INSTANCE;
                ViewExtensionsKt.navigate$default(meCollectionMySetsPageFragment, i, bundle, NavigationAnimaUtils.INSTANCE.getSlideAnima(MeCollectionMySetsPageFragment.this.getActivity()), null, 8, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initData() {
        SeriesRepository.INSTANCE.getUserCustomSeries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteItem(final int itemId) {
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
        SeriesRepository.INSTANCE.deleteUserCustomSeries(itemId).observe(this, new MeCollectionMySetsPageFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends DeleteUserCustomSeriesMessage>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$deleteItem$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends DeleteUserCustomSeriesMessage> resource) {
                invoke2((Resource<DeleteUserCustomSeriesMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<DeleteUserCustomSeriesMessage> resource) {
                MeCollectionMySetsPageFragment.this.hideProgress();
                if (resource.getStatus() == Status.ERROR) {
                    ToastUtils.showError(R.string.text_error, new Object[0]);
                    return;
                }
                Integer defaultCustomSeriesId = PersistDataUtils.INSTANCE.getDefaultCustomSeriesId();
                int i = itemId;
                if (defaultCustomSeriesId != null && defaultCustomSeriesId.intValue() == i) {
                    PersistDataUtils.INSTANCE.saveDefaultCustomSeriesId(null);
                }
            }
        }));
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initData();
        initObserver();
    }

    private final void initObserver() {
        MeCollectionMySetsPageFragment meCollectionMySetsPageFragment = this;
        DBManager.INSTANCE.getUserCustomSeriesItemDao().getAll().observe(meCollectionMySetsPageFragment, new MeCollectionMySetsPageFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends UserCustomSeriesItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$initObserver$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends UserCustomSeriesItem> list) {
                invoke2((List<UserCustomSeriesItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<UserCustomSeriesItem> list) {
                CustomSeriesViewModel customSeriesVm;
                CustomSeriesViewModel customSeriesVm2;
                int i;
                MeCollectionMySetsPageFragment meCollectionMySetsPageFragment2 = MeCollectionMySetsPageFragment.this;
                Intrinsics.checkNotNull(list);
                meCollectionMySetsPageFragment2.originalCustomSeriesData = CollectionsKt.toMutableList((Collection) list);
                MeCollectionMySetsPageFragment meCollectionMySetsPageFragment3 = MeCollectionMySetsPageFragment.this;
                customSeriesVm = meCollectionMySetsPageFragment3.getCustomSeriesVm();
                customSeriesVm2 = MeCollectionMySetsPageFragment.this.getCustomSeriesVm();
                List<CustomSeriesViewModel.SortType> sortList = customSeriesVm2.getSortList();
                i = MeCollectionMySetsPageFragment.this.currentSortType;
                meCollectionMySetsPageFragment3.updateAdapterData(customSeriesVm.sort(sortList.get(i), list));
            }
        }));
        GlobalLiveBus.INSTANCE.getCurrencyChangedLiveData().observe(meCollectionMySetsPageFragment, new MeCollectionMySetsPageFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$initObserver$2
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
                if (z) {
                    MeCollectionMySetsPageFragment.this.initData();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAdapterData(List<UserCustomSeriesItem> data) {
        CustomSeriesCardAdapter customSeriesCardAdapter = this.adapter;
        CustomSeriesViewModel customSeriesVm = getCustomSeriesVm();
        List<UserCustomSeriesItem> list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new SelectableItem((UserCustomSeriesItem) it.next(), false, 2, null));
        }
        customSeriesCardAdapter.setNewDiffData(customSeriesVm.getCustomSeriesDiff(arrayList));
    }

    private final void addSeriesOrderView() {
        AppCompatTextView filterTv = getHeaderBinding().filterTv;
        Intrinsics.checkNotNullExpressionValue(filterTv, "filterTv");
        ViewExtensionsKt.setSingleClickListener$default(filterTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$addSeriesOrderView$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                List<GlToolTipsItem> list;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder addDivider = new GlToolTips.Builder(context).setSelectable(true).setShowArrow(false).addDivider(true);
                list = MeCollectionMySetsPageFragment.this.sortTypeList;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sortTypeList");
                    list = null;
                }
                final MeCollectionMySetsPageFragment meCollectionMySetsPageFragment = MeCollectionMySetsPageFragment.this;
                addDivider.setItems(list, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$addSeriesOrderView$1.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        ItemCustomSeriesTopBarNewBinding headerBinding;
                        List list2;
                        List list3;
                        CustomSeriesViewModel customSeriesVm;
                        CustomSeriesViewModel customSeriesVm2;
                        List<UserCustomSeriesItem> list4;
                        headerBinding = MeCollectionMySetsPageFragment.this.getHeaderBinding();
                        AppCompatTextView appCompatTextView = headerBinding.filterTv;
                        list2 = MeCollectionMySetsPageFragment.this.sortTypeList;
                        List list5 = null;
                        if (list2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sortTypeList");
                            list2 = null;
                        }
                        appCompatTextView.setText(((GlToolTipsItem) list2.get(position)).getText());
                        list3 = MeCollectionMySetsPageFragment.this.sortTypeList;
                        if (list3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sortTypeList");
                        } else {
                            list5 = list3;
                        }
                        Iterator it2 = list5.iterator();
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
                        MeCollectionMySetsPageFragment.this.currentSortType = position;
                        MeCollectionMySetsPageFragment meCollectionMySetsPageFragment2 = MeCollectionMySetsPageFragment.this;
                        customSeriesVm = meCollectionMySetsPageFragment2.getCustomSeriesVm();
                        customSeriesVm2 = MeCollectionMySetsPageFragment.this.getCustomSeriesVm();
                        CustomSeriesViewModel.SortType sortType = customSeriesVm2.getSortList().get(position);
                        list4 = MeCollectionMySetsPageFragment.this.originalCustomSeriesData;
                        meCollectionMySetsPageFragment2.updateAdapterData(customSeriesVm.sort(sortType, list4));
                        String str = LogEvents.customseries_sortbyupdate;
                        if (position != 0) {
                            if (position == 1) {
                                str = LogEvents.customseries_sortbycreate;
                            } else if (position == 2) {
                                str = "count";
                            }
                        }
                        MeCollectionMySetsPageFragment.this.logEvent(LogEvents.Me_My_Sets_Order_By_Click, BundleKt.bundleOf(TuplesKt.to("type", str)));
                    }
                }).showLight(it, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
        LinearLayout createBt = getHeaderBinding().createBt;
        Intrinsics.checkNotNullExpressionValue(createBt, "createBt");
        ViewExtensionsKt.setSingleClickListener$default(createBt, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$addSeriesOrderView$2
            /* JADX INFO: Access modifiers changed from: package-private */
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
                Intrinsics.checkNotNullParameter(it, "it");
                MeCollectionMySetsPageFragment.this.logEvent(LogEvents.Me_My_Sets_Create_New_Click, BundleKt.bundleOf(TuplesKt.to("from", "regularcreate")));
                MeCollectionMySetsPageFragment.this.createSeries();
            }
        }, 1, (Object) null);
    }
}
