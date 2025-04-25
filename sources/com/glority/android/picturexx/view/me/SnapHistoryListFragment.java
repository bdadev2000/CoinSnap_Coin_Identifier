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
import com.glority.android.database.entities.HistoryItem;
import com.glority.android.picturexx.adapter.MeHistoryItemAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCustomSnapHistoryBinding;
import com.glority.android.picturexx.business.databinding.ItemMeHistoryEmptyBinding;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: SnapHistoryListFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/glority/android/picturexx/view/me/SnapHistoryListFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomSnapHistoryBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/glority/android/picturexx/adapter/MeHistoryItemAdapter;", "getLayoutId", "", "initView", "", "initData", "getLogPageName", "", "deleteItem", "itemId", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SnapHistoryListFragment extends BaseFragment<FragmentCustomSnapHistoryBinding> {
    public static final int $stable = 8;
    private final MeHistoryItemAdapter adapter = new MeHistoryItemAdapter();

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    public SnapHistoryListFragment() {
        final SnapHistoryListFragment snapHistoryListFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(snapHistoryListFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = snapHistoryListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$special$$inlined$activityViewModels$default$3
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
    public static final /* synthetic */ FragmentCustomSnapHistoryBinding access$getBinding(SnapHistoryListFragment snapHistoryListFragment) {
        return (FragmentCustomSnapHistoryBinding) snapHistoryListFragment.getBinding();
    }

    public final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_custom_snap_history;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((FragmentCustomSnapHistoryBinding) getBinding()).toolBar.toolbar.setTitle(R.string.me_history);
        ((FragmentCustomSnapHistoryBinding) getBinding()).toolBar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnapHistoryListFragment.initView$lambda$0(SnapHistoryListFragment.this, view);
            }
        });
        ((FragmentCustomSnapHistoryBinding) getBinding()).rv.setAdapter(this.adapter);
        ItemMeHistoryEmptyBinding inflate = ItemMeHistoryEmptyBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        MeHistoryItemAdapter meHistoryItemAdapter = this.adapter;
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        meHistoryItemAdapter.setEmptyView(root);
        MeHistoryItemAdapter meHistoryItemAdapter2 = this.adapter;
        View inflate2 = getLayoutInflater().inflate(R.layout.item_home_footer, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        BaseQuickAdapter.addFooterView$default(meHistoryItemAdapter2, inflate2, 0, 0, 6, null);
        inflate.cpBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnapHistoryListFragment.initView$lambda$1(SnapHistoryListFragment.this, view);
            }
        });
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$initView$3
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
                MeHistoryItemAdapter meHistoryItemAdapter3;
                Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SnapHistoryListFragment.this, LogEvents.historylist_item_click, null, 2, null);
                meHistoryItemAdapter3 = SnapHistoryListFragment.this.adapter;
                HistoryItem historyItem = meHistoryItemAdapter3.getData().get(i);
                SnapHistoryListFragment.this.getVm().setClickItemDrawable(((ImageView) view.findViewById(R.id.iv_me_collection_picture)).getDrawable());
                ViewExtensionsKt.navigate$default(SnapHistoryListFragment.this, R.id.action_snapHistoryListFragment_to_meCmsDetailFragment, BundleKt.bundleOf(TuplesKt.to(Args.itemId, Long.valueOf(historyItem.getItemId())), TuplesKt.to("from", SnapHistoryListFragment.this.getLogPageName()), TuplesKt.to(Args.uid, historyItem.getUid()), TuplesKt.to("name", historyItem.getName()), TuplesKt.to(Args.imageUrls, historyItem.getImageUrl())), NavigationAnimaUtils.INSTANCE.getSlideAnima(SnapHistoryListFragment.this.getActivity()), null, 8, null);
            }
        });
        this.adapter.setOnItemChildClickListener(new SnapHistoryListFragment$initView$4(this));
        this.adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$initView$5
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int positionStart, int itemCount) {
                super.onItemRangeInserted(positionStart, itemCount);
                try {
                    SnapHistoryListFragment.access$getBinding(SnapHistoryListFragment.this).rv.smoothScrollToPosition(positionStart);
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
    public static final void initView$lambda$0(SnapHistoryListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SnapHistoryListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, LogEvents.historylist_add_click, null, 2, null);
        CoreActivity.Companion companion = CoreActivity.INSTANCE;
        FragmentActivity requireActivity = this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), (r17 & 4) != 0 ? 1 : 2, (r17 & 8) != 0 ? false : true, this$0.getLogPageName(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
    }

    private final void initData() {
        getVm().getHistoryItems().observe(this, new SnapHistoryListFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends HistoryItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends HistoryItem> list) {
                invoke2((List<HistoryItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<HistoryItem> list) {
                MeHistoryItemAdapter meHistoryItemAdapter;
                MeHistoryItemAdapter meHistoryItemAdapter2;
                MeHistoryItemAdapter meHistoryItemAdapter3;
                Object obj;
                meHistoryItemAdapter = SnapHistoryListFragment.this.adapter;
                if (!meHistoryItemAdapter.getData().isEmpty()) {
                    Intrinsics.checkNotNull(list);
                    SnapHistoryListFragment snapHistoryListFragment = SnapHistoryListFragment.this;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        HistoryItem historyItem = (HistoryItem) obj2;
                        meHistoryItemAdapter3 = snapHistoryListFragment.adapter;
                        Iterator<T> it = meHistoryItemAdapter3.getData().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((HistoryItem) obj).getItemId() == historyItem.getItemId()) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (obj == null) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((HistoryItem) it2.next()).setNewAdd(true);
                    }
                }
                meHistoryItemAdapter2 = SnapHistoryListFragment.this.adapter;
                meHistoryItemAdapter2.setNewDiffData((BaseQuickDiffCallback) new BaseQuickDiffCallback<HistoryItem>(list) { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$initData$1.2
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
                    public boolean areContentsTheSame(HistoryItem oldItem, HistoryItem newItem) {
                        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                        Intrinsics.checkNotNullParameter(newItem, "newItem");
                        return oldItem.getItemId() == newItem.getItemId() && Intrinsics.areEqual(oldItem.getName(), newItem.getName());
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
                    public boolean areItemsTheSame(HistoryItem oldItem, HistoryItem newItem) {
                        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                        Intrinsics.checkNotNullParameter(newItem, "newItem");
                        return oldItem.getItemId() == newItem.getItemId();
                    }
                }, true);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public String getLogPageName() {
        return LogEvents.historylist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteItem(long itemId) {
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
        getVm().deleteHistoryItem(itemId).observe(this, new SnapHistoryListFragment$sam$androidx_lifecycle_Observer$0(new Function1<Status, Unit>() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$deleteItem$1
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
                SnapHistoryListFragment.this.hideProgress();
            }
        }));
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initData();
    }
}
