package com.glority.android.picturexx.view.series;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCustomSeriesCollectionListBinding;
import com.glority.android.picturexx.business.databinding.ItemSeriesCollectionEmptyBinding;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.utils.PersistDataUtils;
import com.glority.android.picturexx.view.me.SimpleCollectionListFragment;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.utils.stability.LogUtils;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: CustomSeriesCollectionListFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0006H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/glority/android/picturexx/view/series/CustomSeriesCollectionListFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomSeriesCollectionListBinding;", "<init>", "()V", Args.customSeriesId, "", Args.title, "", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "Lkotlin/Lazy;", "billingRequestCode", "simpleCollectionListFragment", "Lcom/glority/android/picturexx/view/me/SimpleCollectionListFragment;", "getSimpleCollectionListFragment", "()Lcom/glority/android/picturexx/view/me/SimpleCollectionListFragment;", "simpleCollectionListFragment$delegate", "getLayoutId", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initListener", "initData", "initView", "toCamera", "onItemClick", "item", "Lcom/glority/android/database/entities/CollectionItem;", "getLogPageName", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CustomSeriesCollectionListFragment extends BaseFragment<FragmentCustomSeriesCollectionListBinding> {
    public static final int $stable = 8;

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;
    private int customSeriesId;
    private String title;
    private final int billingRequestCode = 1001;

    /* renamed from: simpleCollectionListFragment$delegate, reason: from kotlin metadata */
    private final Lazy simpleCollectionListFragment = LazyKt.lazy(new Function0<SimpleCollectionListFragment>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$simpleCollectionListFragment$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SimpleCollectionListFragment invoke() {
            SimpleCollectionListFragment simpleCollectionListFragment = new SimpleCollectionListFragment();
            final CustomSeriesCollectionListFragment customSeriesCollectionListFragment = CustomSeriesCollectionListFragment.this;
            simpleCollectionListFragment.initConfig(customSeriesCollectionListFragment.getPageName(), true, false, true, false, new Function2<View, CollectionItem, Unit>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$simpleCollectionListFragment$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(View view, CollectionItem collectionItem) {
                    invoke2(view, collectionItem);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View v, CollectionItem item) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(item, "item");
                    CustomSeriesCollectionListFragment.this.onItemClick(item);
                }
            });
            return simpleCollectionListFragment;
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentCustomSeriesCollectionListBinding access$getBinding(CustomSeriesCollectionListFragment customSeriesCollectionListFragment) {
        return (FragmentCustomSeriesCollectionListBinding) customSeriesCollectionListFragment.getBinding();
    }

    public CustomSeriesCollectionListFragment() {
        final CustomSeriesCollectionListFragment customSeriesCollectionListFragment = this;
        final Function0 function0 = null;
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(customSeriesCollectionListFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = customSeriesCollectionListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$special$$inlined$activityViewModels$default$3
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
    public final SimpleCollectionListFragment getSimpleCollectionListFragment() {
        return (SimpleCollectionListFragment) this.simpleCollectionListFragment.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_custom_series_collection_list;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        this.customSeriesId = arguments != null ? arguments.getInt(Args.customSeriesId) : 0;
        Bundle arguments2 = getArguments();
        this.title = arguments2 != null ? arguments2.getString(Args.title) : null;
        getSupportFragmentManager().beginTransaction().replace(R.id.fcv, getSimpleCollectionListFragment()).commitAllowingStateLoss();
        initView();
        initData();
        initListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        getSimpleCollectionListFragment().getAdapter().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$initListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int positionStart, int itemCount) {
                SimpleCollectionListFragment simpleCollectionListFragment;
                super.onItemRangeInserted(positionStart, itemCount);
                try {
                    simpleCollectionListFragment = CustomSeriesCollectionListFragment.this.getSimpleCollectionListFragment();
                    simpleCollectionListFragment.getRv().smoothScrollToPosition(positionStart);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        });
        LinearLayout exportLl = ((FragmentCustomSeriesCollectionListBinding) getBinding()).exportLl;
        Intrinsics.checkNotNullExpressionValue(exportLl, "exportLl");
        ViewExtensionsKt.setSingleClickListener$default(exportLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$initListener$2
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
                int i;
                CollectionViewModel collectionVm;
                SimpleCollectionListFragment simpleCollectionListFragment;
                int i2;
                Intrinsics.checkNotNullParameter(it, "it");
                CustomSeriesCollectionListFragment customSeriesCollectionListFragment = CustomSeriesCollectionListFragment.this;
                i = customSeriesCollectionListFragment.customSeriesId;
                customSeriesCollectionListFragment.logEvent(LogEvents.customseries_topexport_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(i))));
                collectionVm = CustomSeriesCollectionListFragment.this.getCollectionVm();
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                simpleCollectionListFragment = CustomSeriesCollectionListFragment.this.getSimpleCollectionListFragment();
                int size = simpleCollectionListFragment.getAdapter().getData().size();
                i2 = CustomSeriesCollectionListFragment.this.customSeriesId;
                collectionVm.exportSeriesCollection(context, size, i2, CustomSeriesCollectionListFragment.this);
            }
        }, 1, (Object) null);
    }

    private final void initData() {
        DBManager.INSTANCE.getCollectionItemDao().queryByCustomSeriesId(AppViewModel.INSTANCE.getUserId(), this.customSeriesId).observe(this, new CustomSeriesCollectionListFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionItem> list) {
                invoke2((List<CollectionItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<CollectionItem> list) {
                SimpleCollectionListFragment simpleCollectionListFragment;
                simpleCollectionListFragment = CustomSeriesCollectionListFragment.this.getSimpleCollectionListFragment();
                Intrinsics.checkNotNull(list);
                simpleCollectionListFragment.setData(list);
                MaterialButton addTv = CustomSeriesCollectionListFragment.access$getBinding(CustomSeriesCollectionListFragment.this).addTv;
                Intrinsics.checkNotNullExpressionValue(addTv, "addTv");
                addTv.setVisibility(list.isEmpty() ^ true ? 0 : 8);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ItemSeriesCollectionEmptyBinding inflate = ItemSeriesCollectionEmptyBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        SimpleCollectionListFragment simpleCollectionListFragment = getSimpleCollectionListFragment();
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        simpleCollectionListFragment.setEmptyView(root);
        LinearLayout toCameraLl = inflate.toCameraLl;
        Intrinsics.checkNotNullExpressionValue(toCameraLl, "toCameraLl");
        ViewExtensionsKt.setSingleClickListener$default(toCameraLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$initView$1
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
                CustomSeriesCollectionListFragment.this.logEvent(LogEvents.collection_add_click, BundleKt.bundleOf(TuplesKt.to("from", "emptycustomseriesfolder")));
                CustomSeriesCollectionListFragment.this.toCamera();
            }
        }, 1, (Object) null);
        ((FragmentCustomSeriesCollectionListBinding) getBinding()).titleTv.setText(this.title);
        ImageView backIv = ((FragmentCustomSeriesCollectionListBinding) getBinding()).backIv;
        Intrinsics.checkNotNullExpressionValue(backIv, "backIv");
        ViewExtensionsKt.setSingleClickListener$default(backIv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$initView$2
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
                FragmentActivity activity = CustomSeriesCollectionListFragment.this.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }, 1, (Object) null);
        MaterialButton addTv = ((FragmentCustomSeriesCollectionListBinding) getBinding()).addTv;
        Intrinsics.checkNotNullExpressionValue(addTv, "addTv");
        ViewExtensionsKt.setSingleClickListener$default(addTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.series.CustomSeriesCollectionListFragment$initView$3
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
                CustomSeriesCollectionListFragment.this.logEvent(LogEvents.collection_add_click, BundleKt.bundleOf(TuplesKt.to("from", "customseriesfoldertitle")));
                CustomSeriesCollectionListFragment.this.toCamera();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toCamera() {
        PersistDataUtils.INSTANCE.saveDefaultCustomSeriesId(Integer.valueOf(this.customSeriesId));
        CoreActivity.Companion companion = CoreActivity.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), (r17 & 4) != 0 ? 1 : 2, (r17 & 8) != 0 ? false : true, getPageName(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(CollectionItem item) {
        logEvent(LogEvents.collection_listitem_click, BundleKt.bundleOf(TuplesKt.to("from", getPageName())));
        getCollectionVm().setCurrentItem(item);
        ViewExtensionsKt.navigate$default(this, R.id.action_customSeriesCollectionListFragment2_to_collectDetailFragment3, BundleKt.bundleOf(TuplesKt.to("from", getPageName())), NavigationAnimaUtils.INSTANCE.getSlideAnima(getActivity()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.customseriesfolder;
    }
}
