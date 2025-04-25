package com.glority.android.picturexx.view.series;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.diff.BaseQuickDiffCallback;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.adapter.MeCollectionItemAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentSeriesCoinListBinding;
import com.glority.android.picturexx.view.dialog.CollectionMorePopup;
import com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: SeriesCoinCollectionListFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00152\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0014J\b\u0010#\u001a\u00020!H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/glority/android/picturexx/view/series/SeriesCoinCollectionListFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentSeriesCoinListBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", Args.title, "", "adapter", "Lcom/glority/android/picturexx/adapter/MeCollectionItemAdapter;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "initData", "updateAdapterData", LogEvents.result, "", "Lcom/glority/android/database/entities/CollectionItem;", "initView", "deleteItem", "collectionId", "", "getLogPageName", "getLayoutId", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SeriesCoinCollectionListFragment extends BaseFragment<FragmentSeriesCoinListBinding> {
    public static final int $stable = 8;
    private final MeCollectionItemAdapter adapter = new MeCollectionItemAdapter();

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;
    private String title;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    private final void initData() {
    }

    public SeriesCoinCollectionListFragment() {
        final SeriesCoinCollectionListFragment seriesCoinCollectionListFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(seriesCoinCollectionListFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = seriesCoinCollectionListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$special$$inlined$activityViewModels$default$3
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
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(seriesCoinCollectionListFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = seriesCoinCollectionListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$special$$inlined$activityViewModels$default$6
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

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(Args.title)) == null) {
            str = "";
        }
        this.title = str;
        initView();
        initData();
        initObserver();
    }

    private final void initObserver() {
        updateAdapterData(getCollectionVm().getSelectedOfficialCollections());
    }

    private final void updateAdapterData(final List<CollectionItem> result) {
        List<CollectionItem> list = result;
        if (list == null || list.isEmpty()) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
                return;
            }
            return;
        }
        this.adapter.setNewDiffData(new BaseQuickDiffCallback<CollectionItem>(result) { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$updateAdapterData$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areContentsTheSame(CollectionItem oldItem, CollectionItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem.getGrade(), newItem.getGrade()) && Intrinsics.areEqual(oldItem.getName(), newItem.getName()) && Intrinsics.areEqual(oldItem.getAcquisitionPrice(), newItem.getAcquisitionPrice());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areItemsTheSame(CollectionItem oldItem, CollectionItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getCollectionId() == newItem.getCollectionId();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        MeCollectionItemAdapter meCollectionItemAdapter = this.adapter;
        RecyclerView rv = ((FragmentSeriesCoinListBinding) getBinding()).rv;
        Intrinsics.checkNotNullExpressionValue(rv, "rv");
        meCollectionItemAdapter.bindToRecyclerView(rv);
        MaterialToolbar materialToolbar = ((FragmentSeriesCoinListBinding) getBinding()).toolBar;
        String str = this.title;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Args.title);
            str = null;
        }
        materialToolbar.setTitle(str);
        ((FragmentSeriesCoinListBinding) getBinding()).toolBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeriesCoinCollectionListFragment.initView$lambda$0(SeriesCoinCollectionListFragment.this, view);
            }
        });
        this.adapter.setOnItemChildClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$initView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, final View view, final int i) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.getId() == R.id.iv_me_collection_more) {
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SeriesCoinCollectionListFragment.this, LogEvents.multicoin_itemmore_click, null, 2, null);
                    CollectionMorePopup collectionMorePopup = CollectionMorePopup.INSTANCE;
                    final SeriesCoinCollectionListFragment seriesCoinCollectionListFragment = SeriesCoinCollectionListFragment.this;
                    collectionMorePopup.show(view, new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$initView$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i2) {
                            if (i2 == R.id.option_delete) {
                                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SeriesCoinCollectionListFragment.this, LogEvents.multicoin_delete_click, null, 2, null);
                                ConfirmDeleteDialog confirmDeleteDialog = ConfirmDeleteDialog.INSTANCE;
                                Context context = view.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                final SeriesCoinCollectionListFragment seriesCoinCollectionListFragment2 = SeriesCoinCollectionListFragment.this;
                                final int i3 = i;
                                confirmDeleteDialog.openFromSeries(context, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment.initView.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        MeCollectionItemAdapter meCollectionItemAdapter2;
                                        MeCollectionItemAdapter meCollectionItemAdapter3;
                                        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SeriesCoinCollectionListFragment.this, LogEvents.collectionlist_deleteconfirm_click, null, 2, null);
                                        meCollectionItemAdapter2 = SeriesCoinCollectionListFragment.this.adapter;
                                        if (meCollectionItemAdapter2.getData().size() > i3) {
                                            SeriesCoinCollectionListFragment seriesCoinCollectionListFragment3 = SeriesCoinCollectionListFragment.this;
                                            meCollectionItemAdapter3 = seriesCoinCollectionListFragment3.adapter;
                                            seriesCoinCollectionListFragment3.deleteItem(meCollectionItemAdapter3.getData().get(i3).getCollectionId());
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        });
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$initView$3
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
                MeCollectionItemAdapter meCollectionItemAdapter2;
                CollectionViewModel collectionVm;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                SeriesCoinCollectionListFragment seriesCoinCollectionListFragment = SeriesCoinCollectionListFragment.this;
                try {
                    meCollectionItemAdapter2 = seriesCoinCollectionListFragment.adapter;
                    CollectionItem item = meCollectionItemAdapter2.getItem(i);
                    collectionVm = seriesCoinCollectionListFragment.getCollectionVm();
                    collectionVm.setCurrentItem(item);
                    ViewExtensionsKt.navigate$default(seriesCoinCollectionListFragment, R.id.action_seriesCoinListFragment_to_collectDetailFragment2, BundleKt.bundleOf(TuplesKt.to("from", seriesCoinCollectionListFragment.getPageName())), NavigationAnimaUtils.INSTANCE.getSlideAnima(seriesCoinCollectionListFragment.getActivity()), null, 8, null);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SeriesCoinCollectionListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteItem(int collectionId) {
        SeriesCoinCollectionListFragment seriesCoinCollectionListFragment = this;
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(seriesCoinCollectionListFragment, LogEvents.multicoin_deleteconfirm_click, null, 2, null);
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(seriesCoinCollectionListFragment, null, false, 3, null);
        getVm().deleteCollectionItem(collectionId).observe(this, new SeriesCoinCollectionListFragment$sam$androidx_lifecycle_Observer$0(new Function1<Status, Unit>() { // from class: com.glority.android.picturexx.view.series.SeriesCoinCollectionListFragment$deleteItem$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Status status) {
                invoke2(status);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Status status) {
                SeriesCoinCollectionListFragment.this.hideProgress();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.multicoin;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_series_coin_list;
    }
}
