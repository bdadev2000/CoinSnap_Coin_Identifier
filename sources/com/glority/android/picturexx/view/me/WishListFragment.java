package com.glority.android.picturexx.view.me;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.glority.android.database.entities.WishItem;
import com.glority.android.picturexx.adapter.MeWishItemAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCustomWishListBinding;
import com.glority.android.picturexx.business.databinding.ItemMeWishEmptyBinding;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
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

/* compiled from: WishListFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/view/me/WishListFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomWishListBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/glority/android/picturexx/adapter/MeWishItemAdapter;", "getLayoutId", "", "initView", "", "initData", "getLogPageName", "", "deleteItem", Args.wishId, "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class WishListFragment extends BaseFragment<FragmentCustomWishListBinding> {
    public static final int $stable = 8;
    private final MeWishItemAdapter adapter = new MeWishItemAdapter();

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    public WishListFragment() {
        final WishListFragment wishListFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(wishListFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.WishListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.WishListFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = wishListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.WishListFragment$special$$inlined$activityViewModels$default$3
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
    public static final /* synthetic */ FragmentCustomWishListBinding access$getBinding(WishListFragment wishListFragment) {
        return (FragmentCustomWishListBinding) wishListFragment.getBinding();
    }

    public final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_custom_wish_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((FragmentCustomWishListBinding) getBinding()).toolBar.toolbar.setTitle(R.string.me_tab_wishlist);
        ((FragmentCustomWishListBinding) getBinding()).toolBar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.me.WishListFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishListFragment.initView$lambda$0(WishListFragment.this, view);
            }
        });
        ((FragmentCustomWishListBinding) getBinding()).rv.setAdapter(this.adapter);
        ItemMeWishEmptyBinding inflate = ItemMeWishEmptyBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        MeWishItemAdapter meWishItemAdapter = this.adapter;
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        meWishItemAdapter.setEmptyView(root);
        MeWishItemAdapter meWishItemAdapter2 = this.adapter;
        View inflate2 = getLayoutInflater().inflate(R.layout.item_home_footer, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        BaseQuickAdapter.addFooterView$default(meWishItemAdapter2, inflate2, 0, 0, 6, null);
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.WishListFragment$initView$2
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
                MeWishItemAdapter meWishItemAdapter3;
                Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(WishListFragment.this, LogEvents.wish_item_click, null, 2, null);
                meWishItemAdapter3 = WishListFragment.this.adapter;
                WishItem wishItem = meWishItemAdapter3.getData().get(i);
                WishListFragment.this.getVm().setClickItemDrawable(((ImageView) view.findViewById(R.id.iv_me_collection_picture)).getDrawable());
                ViewExtensionsKt.navigate$default(WishListFragment.this, R.id.action_wishListFragment_to_wishInfoFragment, BundleKt.bundleOf(TuplesKt.to(Args.uid, wishItem.getUid()), TuplesKt.to("from", WishListFragment.this.getLogPageName()), TuplesKt.to("name", wishItem.getName()), TuplesKt.to(Args.imageUrls, wishItem.getOriginalImageUrl())), NavigationAnimaUtils.INSTANCE.getSlideAnima(WishListFragment.this.getActivity()), null, 8, null);
            }
        });
        this.adapter.setOnItemChildClickListener(new WishListFragment$initView$3(this));
        this.adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.glority.android.picturexx.view.me.WishListFragment$initView$4
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int positionStart, int itemCount) {
                super.onItemRangeInserted(positionStart, itemCount);
                try {
                    WishListFragment.access$getBinding(WishListFragment.this).rv.smoothScrollToPosition(positionStart);
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
    public static final void initView$lambda$0(WishListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    private final void initData() {
        getVm().getWishItems().observe(this, new WishListFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends WishItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.WishListFragment$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends WishItem> list) {
                invoke2((List<WishItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<WishItem> list) {
                MeWishItemAdapter meWishItemAdapter;
                meWishItemAdapter = WishListFragment.this.adapter;
                meWishItemAdapter.setNewDiffData((BaseQuickDiffCallback) new BaseQuickDiffCallback<WishItem>(list) { // from class: com.glority.android.picturexx.view.me.WishListFragment$initData$1.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
                    public boolean areContentsTheSame(WishItem oldItem, WishItem newItem) {
                        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                        Intrinsics.checkNotNullParameter(newItem, "newItem");
                        return Intrinsics.areEqual(oldItem.getPrice(), newItem.getPrice()) && Intrinsics.areEqual(oldItem.getName(), newItem.getName());
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
                    public boolean areItemsTheSame(WishItem oldItem, WishItem newItem) {
                        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                        Intrinsics.checkNotNullParameter(newItem, "newItem");
                        return oldItem.getWishId() == newItem.getWishId();
                    }
                }, true);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public String getLogPageName() {
        return LogEvents.wishList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteItem(int wishId) {
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
        getVm().deleteWish(wishId).observe(this, new WishListFragment$sam$androidx_lifecycle_Observer$0(new Function1<Status, Unit>() { // from class: com.glority.android.picturexx.view.me.WishListFragment$deleteItem$1
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
                WishListFragment.this.hideProgress();
            }
        }));
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initData();
    }
}
