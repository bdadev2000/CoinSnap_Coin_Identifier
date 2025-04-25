package com.glority.android.picturexx.view.me;

import android.R;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.databinding.FragmentCollectionSearchBinding;
import com.glority.android.picturexx.business.databinding.ItemCollectionSearchEmptyBinding;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.utils.stability.LogUtils;
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

/* compiled from: CollectionSearchFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectionSearchFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCollectionSearchBinding;", "<init>", "()V", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "Lkotlin/Lazy;", "simpleCollectionListFragment", "Lcom/glority/android/picturexx/view/me/SimpleCollectionListFragment;", "getSimpleCollectionListFragment", "()Lcom/glority/android/picturexx/view/me/SimpleCollectionListFragment;", "simpleCollectionListFragment$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "doCreateView", "initObserver", "onItemClick", "item", "Lcom/glority/android/database/entities/CollectionItem;", "initView", "getLogPageName", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionSearchFragment extends BaseFragment<FragmentCollectionSearchBinding> {
    public static final int $stable = 8;

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;

    /* renamed from: simpleCollectionListFragment$delegate, reason: from kotlin metadata */
    private final Lazy simpleCollectionListFragment = LazyKt.lazy(new Function0<SimpleCollectionListFragment>() { // from class: com.glority.android.picturexx.view.me.CollectionSearchFragment$simpleCollectionListFragment$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SimpleCollectionListFragment invoke() {
            SimpleCollectionListFragment simpleCollectionListFragment = new SimpleCollectionListFragment();
            final CollectionSearchFragment collectionSearchFragment = CollectionSearchFragment.this;
            simpleCollectionListFragment.initConfig(collectionSearchFragment.getPageName(), true, true, false, false, new Function2<View, CollectionItem, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionSearchFragment$simpleCollectionListFragment$2$1$1
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
                    CollectionSearchFragment.this.onItemClick(item);
                }
            });
            return simpleCollectionListFragment;
        }
    });

    public CollectionSearchFragment() {
        final CollectionSearchFragment collectionSearchFragment = this;
        final Function0 function0 = null;
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(collectionSearchFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.CollectionSearchFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.CollectionSearchFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = collectionSearchFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.CollectionSearchFragment$special$$inlined$activityViewModels$default$3
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

    private final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleCollectionListFragment getSimpleCollectionListFragment() {
        return (SimpleCollectionListFragment) this.simpleCollectionListFragment.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Transition inflateTransition = TransitionInflater.from(requireContext()).inflateTransition(R.transition.move);
        setSharedElementEnterTransition(inflateTransition);
        setSharedElementReturnTransition(inflateTransition);
        getSupportFragmentManager().beginTransaction().add(com.glority.android.picturexx.business.R.id.fcv, getSimpleCollectionListFragment()).commitAllowingStateLoss();
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return com.glority.android.picturexx.business.R.layout.fragment_collection_search;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initObserver();
    }

    private final void initObserver() {
        DBManager.INSTANCE.getCollectionItemDao().getAll().observe(this, new CollectionSearchFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionSearchFragment$initObserver$1
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
                simpleCollectionListFragment = CollectionSearchFragment.this.getSimpleCollectionListFragment();
                Intrinsics.checkNotNull(list);
                simpleCollectionListFragment.setData(list);
            }
        }));
        getSimpleCollectionListFragment().getAdapter().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.glority.android.picturexx.view.me.CollectionSearchFragment$initObserver$2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int positionStart, int itemCount) {
                SimpleCollectionListFragment simpleCollectionListFragment;
                super.onItemRangeInserted(positionStart, itemCount);
                try {
                    simpleCollectionListFragment = CollectionSearchFragment.this.getSimpleCollectionListFragment();
                    simpleCollectionListFragment.getRv().scrollToPosition(0);
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
    public final void onItemClick(CollectionItem item) {
        logEvent(LogEvents.collection_listitem_click, BundleKt.bundleOf(TuplesKt.to("from", getPageName())));
        getCollectionVm().setCurrentItem(item);
        ViewExtensionsKt.navigate$default(this, com.glority.android.picturexx.business.R.id.action_collectionSearchFragment_to_collectCmsDetailFragment, BundleKt.bundleOf(TuplesKt.to(Args.itemId, item.getItemId()), TuplesKt.to(Args.uid, item.getUid()), TuplesKt.to("from", getPageName()), TuplesKt.to(Args.collectionId, Integer.valueOf(item.getCollectionId())), TuplesKt.to(Args.speciesUid, item.getSpeciesUid()), TuplesKt.to(Args.varietyUid, item.getVarietyUid())), NavigationAnimaUtils.INSTANCE.getSlideAnima(getActivity()), null, 8, null);
    }

    private final void initView() {
        SimpleCollectionListFragment simpleCollectionListFragment = getSimpleCollectionListFragment();
        View root = ItemCollectionSearchEmptyBinding.inflate(getLayoutInflater()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        simpleCollectionListFragment.setEmptyView(root);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.collectionsearch;
    }
}
