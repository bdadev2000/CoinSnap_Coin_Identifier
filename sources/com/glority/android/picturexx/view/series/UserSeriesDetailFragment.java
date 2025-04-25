package com.glority.android.picturexx.view.series;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.diff.BaseQuickDiffCallback;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.UserSeriesDetailItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.adapter.UserSeriesDetailAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentSeriesDetailBinding;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.repository.SeriesRepository;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsImage;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlLoadingLayout;
import com.glority.widget.tooltips.GlToolTips;
import com.glority.widget.tooltips.GlToolTipsItem;
import com.glority.widget.tooltips.GlToolTipsOnItemClickListener;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.appbar.MaterialToolbar;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: UserSeriesDetailFragment.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\u0018\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\nH\u0014J\b\u00104\u001a\u000205H\u0014J\u0016\u00106\u001a\u00020&2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010#¨\u00069"}, d2 = {"Lcom/glority/android/picturexx/view/series/UserSeriesDetailFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentSeriesDetailBinding;", "<init>", "()V", "adapter", "Lcom/glority/android/picturexx/adapter/UserSeriesDetailAdapter;", Args.seriesId, "", Args.indexListUid, "", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "seriesVm", "Lcom/glority/android/picturexx/vm/SeriesViewModel;", "getSeriesVm", "()Lcom/glority/android/picturexx/vm/SeriesViewModel;", "seriesVm$delegate", "originalAdapterData", "", "Lcom/glority/android/picturexx/adapter/UserSeriesDetailAdapter$UserSeriesDetailData;", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "userSeriesDetailItem", "Lcom/glority/android/database/entities/UserSeriesDetailItem;", "filterItems", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "getFilterItems", "()Ljava/util/List;", "filterItems$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "initObserver", "initData", "initView", "toCoinList", Args.uid, "name", "addCollection", "userSeriesDetail", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;", "getLogPageName", "getLayoutId", "", "setNewDiffData", "data", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class UserSeriesDetailFragment extends BaseFragment<FragmentSeriesDetailBinding> {
    private static final String GOT_IT_CLICKED = "GOT_IT_CLICKED";

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;
    private long seriesId;

    /* renamed from: seriesVm$delegate, reason: from kotlin metadata */
    private final Lazy seriesVm;
    private UserSeriesDetailItem userSeriesDetailItem;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    public static final int $stable = 8;
    private final UserSeriesDetailAdapter adapter = new UserSeriesDetailAdapter();
    private String indexListUid = "";
    private List<UserSeriesDetailAdapter.UserSeriesDetailData> originalAdapterData = CollectionsKt.emptyList();

    /* renamed from: filterItems$delegate, reason: from kotlin metadata */
    private final Lazy filterItems = LazyKt.lazy(new Function0<List<? extends GlToolTipsItem>>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$filterItems$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends GlToolTipsItem> invoke() {
            String string = UserSeriesDetailFragment.this.getString(R.string.offseries_detail_filter_all);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            GlToolTipsItem glToolTipsItem = new GlToolTipsItem(string, (Integer) null, true);
            String string2 = UserSeriesDetailFragment.this.getString(R.string.offseries_detail_filter_added);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            GlToolTipsItem glToolTipsItem2 = new GlToolTipsItem(string2, (Integer) null, false);
            String string3 = UserSeriesDetailFragment.this.getString(R.string.offseries_detail_filter_notyet);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return CollectionsKt.listOf((Object[]) new GlToolTipsItem[]{glToolTipsItem, glToolTipsItem2, new GlToolTipsItem(string3, (Integer) null, false)});
        }
    });

    public UserSeriesDetailFragment() {
        final UserSeriesDetailFragment userSeriesDetailFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(userSeriesDetailFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = userSeriesDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.seriesVm = FragmentViewModelLazyKt.createViewModelLazy(userSeriesDetailFragment, Reflection.getOrCreateKotlinClass(SeriesViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = userSeriesDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$6
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
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(userSeriesDetailFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$8
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
                CreationExtras defaultViewModelCreationExtras = userSeriesDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$special$$inlined$activityViewModels$default$9
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
    public static final /* synthetic */ FragmentSeriesDetailBinding access$getBinding(UserSeriesDetailFragment userSeriesDetailFragment) {
        return (FragmentSeriesDetailBinding) userSeriesDetailFragment.getBinding();
    }

    public final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    public final SeriesViewModel getSeriesVm() {
        return (SeriesViewModel) this.seriesVm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GlToolTipsItem> getFilterItems() {
        return (List) this.filterItems.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("from") : null;
        if (string != null) {
            updateCommonEventArgs(new Pair("from", string));
        }
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        String str;
        Bundle arguments = getArguments();
        this.seriesId = arguments != null ? arguments.getLong(Args.seriesId) : 0L;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString(Args.indexListUid)) == null) {
            str = "";
        }
        this.indexListUid = str;
        if (this.seriesId == 0 && str.length() > 0) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new UserSeriesDetailFragment$doCreateView$1(this, null), 2, null);
            return;
        }
        initView();
        initData();
        initObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initObserver() {
        GlobalLiveBus.INSTANCE.getCollectionCountChanged().observe(this, new UserSeriesDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$initObserver$1
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
                UserSeriesDetailFragment.this.getSeriesVm().getUserSeriesListMessage();
                UserSeriesDetailFragment.this.initData();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initData() {
        ((FragmentSeriesDetailBinding) getBinding()).loadingView.showLoading();
        getSeriesVm().getUserSeriesDetail(this.seriesId).observe(this, new UserSeriesDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<CacheThenNetworkRequest.ResultData<UserSeriesDetailItem>, Unit>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CacheThenNetworkRequest.ResultData<UserSeriesDetailItem> resultData) {
                invoke2(resultData);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CacheThenNetworkRequest.ResultData<UserSeriesDetailItem> resultData) {
                ArrayList arrayList;
                List list;
                UserSeriesDetailAdapter userSeriesDetailAdapter;
                List<UserSeriesDetail> seriesDetailList;
                if (resultData.getError()) {
                    GlLoadingLayout.showError$default(UserSeriesDetailFragment.access$getBinding(UserSeriesDetailFragment.this).loadingView, null, 1, null);
                    return;
                }
                UserSeriesDetailFragment.access$getBinding(UserSeriesDetailFragment.this).loadingView.loadingDone();
                MaterialToolbar materialToolbar = UserSeriesDetailFragment.access$getBinding(UserSeriesDetailFragment.this).toolBar;
                UserSeriesDetailItem result = resultData.getResult();
                materialToolbar.setTitle(result != null ? result.getTitle() : null);
                UserSeriesDetailFragment.this.userSeriesDetailItem = resultData.getResult();
                UserSeriesDetailFragment userSeriesDetailFragment = UserSeriesDetailFragment.this;
                UserSeriesDetailItem result2 = resultData.getResult();
                if (result2 == null || (seriesDetailList = result2.getSeriesDetailList()) == null) {
                    arrayList = new ArrayList();
                } else {
                    List<UserSeriesDetail> list2 = seriesDetailList;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new UserSeriesDetailAdapter.UserSeriesDetailData((UserSeriesDetail) it.next(), true, true));
                    }
                    arrayList = arrayList2;
                }
                userSeriesDetailFragment.originalAdapterData = arrayList;
                UserSeriesDetailFragment userSeriesDetailFragment2 = UserSeriesDetailFragment.this;
                list = userSeriesDetailFragment2.originalAdapterData;
                userSeriesDetailFragment2.setNewDiffData(list);
                userSeriesDetailAdapter = UserSeriesDetailFragment.this.adapter;
                View inflate = UserSeriesDetailFragment.this.getLayoutInflater().inflate(R.layout.item_home_footer, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                userSeriesDetailAdapter.setFooterView(inflate);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initView() {
        UserSeriesDetailAdapter userSeriesDetailAdapter = this.adapter;
        RecyclerView rv = ((FragmentSeriesDetailBinding) getBinding()).rv;
        Intrinsics.checkNotNullExpressionValue(rv, "rv");
        userSeriesDetailAdapter.bindToRecyclerView(rv);
        UserSeriesDetailAdapter userSeriesDetailAdapter2 = this.adapter;
        View inflate = getLayoutInflater().inflate(R.layout.item_collection_already_added_empty, (ViewGroup) ((FragmentSeriesDetailBinding) getBinding()).rv, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        userSeriesDetailAdapter2.setEmptyView(inflate);
        this.adapter.isUseEmpty(false);
        ((FragmentSeriesDetailBinding) getBinding()).rv.setItemAnimator(null);
        ((FragmentSeriesDetailBinding) getBinding()).toolBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserSeriesDetailFragment.initView$lambda$1(UserSeriesDetailFragment.this, view);
            }
        });
        ((FragmentSeriesDetailBinding) getBinding()).toolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$$ExternalSyntheticLambda1
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean initView$lambda$2;
                initView$lambda$2 = UserSeriesDetailFragment.initView$lambda$2(UserSeriesDetailFragment.this, menuItem);
                return initView$lambda$2;
            }
        });
        ((FragmentSeriesDetailBinding) getBinding()).gotItTv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserSeriesDetailFragment.initView$lambda$3(UserSeriesDetailFragment.this, view);
            }
        });
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$initView$4
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
                UserSeriesDetailAdapter userSeriesDetailAdapter3;
                String str;
                UserSeriesDetailAdapter userSeriesDetailAdapter4;
                UserSeriesDetailAdapter userSeriesDetailAdapter5;
                UserSeriesDetailAdapter userSeriesDetailAdapter6;
                UserSeriesDetailAdapter userSeriesDetailAdapter7;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                userSeriesDetailAdapter3 = UserSeriesDetailFragment.this.adapter;
                UserSeriesDetail userSeriesDetail = userSeriesDetailAdapter3.getData().get(i).getUserSeriesDetail();
                UserSeriesDetailFragment userSeriesDetailFragment = UserSeriesDetailFragment.this;
                Pair pair = TuplesKt.to(LogEventArguments.ARG_STRING_1, userSeriesDetail.getUid());
                str = UserSeriesDetailFragment.this.indexListUid;
                userSeriesDetailFragment.logEvent(LogEvents.seriesdetail_item_click, BundleKt.bundleOf(pair, TuplesKt.to(LogEventArguments.ARG_STRING_2, str), TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(userSeriesDetail.getIsCollected()))));
                userSeriesDetailAdapter4 = UserSeriesDetailFragment.this.adapter;
                if (userSeriesDetailAdapter4.getData().get(i).getUserSeriesDetail().getIsCollected() == 1) {
                    UserSeriesDetailFragment userSeriesDetailFragment2 = UserSeriesDetailFragment.this;
                    userSeriesDetailAdapter6 = userSeriesDetailFragment2.adapter;
                    String uid = userSeriesDetailAdapter6.getData().get(i).getUserSeriesDetail().getUid();
                    userSeriesDetailAdapter7 = UserSeriesDetailFragment.this.adapter;
                    userSeriesDetailFragment2.toCoinList(uid, userSeriesDetailAdapter7.getData().get(i).getUserSeriesDetail().getName());
                    return;
                }
                UserSeriesDetailFragment userSeriesDetailFragment3 = UserSeriesDetailFragment.this;
                userSeriesDetailAdapter5 = userSeriesDetailFragment3.adapter;
                userSeriesDetailFragment3.addCollection(userSeriesDetailAdapter5.getData().get(i).getUserSeriesDetail());
            }
        });
        if (!((Boolean) PersistData.INSTANCE.get(GOT_IT_CLICKED, false)).booleanValue()) {
            ViewParent parent = ((FragmentSeriesDetailBinding) getBinding()).gotItTv.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).getLayoutTransition().enableTransitionType(0);
            LinearLayout gotItTv = ((FragmentSeriesDetailBinding) getBinding()).gotItTv;
            Intrinsics.checkNotNullExpressionValue(gotItTv, "gotItTv");
            gotItTv.setVisibility(0);
        }
        ((FragmentSeriesDetailBinding) getBinding()).loadingView.setCallback(new GlLoadingLayout.Callback() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$initView$5
            @Override // com.glority.widget.GlLoadingLayout.Callback
            public void loadData() {
                UserSeriesDetailFragment.this.initData();
            }
        });
        TextView textView = (TextView) ((FragmentSeriesDetailBinding) getBinding()).getRoot().findViewById(R.id.turn_over_tv);
        final TextView textView2 = (TextView) ((FragmentSeriesDetailBinding) getBinding()).getRoot().findViewById(R.id.filter_tv);
        Intrinsics.checkNotNull(textView);
        ViewExtensionsKt.setSingleClickListener$default(textView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$initView$6
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
                UserSeriesDetailAdapter userSeriesDetailAdapter3;
                Intrinsics.checkNotNullParameter(it, "it");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(UserSeriesDetailFragment.this, LogEvents.seriesdetail_turnover_click, null, 2, null);
                userSeriesDetailAdapter3 = UserSeriesDetailFragment.this.adapter;
                List<UserSeriesDetailAdapter.UserSeriesDetailData> data = userSeriesDetailAdapter3.getData();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
                for (UserSeriesDetailAdapter.UserSeriesDetailData userSeriesDetailData : data) {
                    arrayList.add(new UserSeriesDetailAdapter.UserSeriesDetailData(userSeriesDetailData.getUserSeriesDetail(), userSeriesDetailData.getCurrentSide(), !userSeriesDetailData.getNextSide()));
                }
                UserSeriesDetailFragment.this.setNewDiffData(arrayList);
            }
        }, 1, (Object) null);
        Intrinsics.checkNotNull(textView2);
        ViewExtensionsKt.setSingleClickListener$default(textView2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$initView$7
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
            public final void invoke2(View v) {
                List<GlToolTipsItem> filterItems;
                Intrinsics.checkNotNullParameter(v, "v");
                Context context = v.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder builder = new GlToolTips.Builder(context);
                filterItems = UserSeriesDetailFragment.this.getFilterItems();
                final UserSeriesDetailFragment userSeriesDetailFragment = UserSeriesDetailFragment.this;
                final TextView textView3 = textView2;
                builder.setItems(filterItems, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$initView$7.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        List filterItems2;
                        List filterItems3;
                        UserSeriesDetailAdapter userSeriesDetailAdapter3;
                        List list;
                        String str;
                        List list2;
                        List list3;
                        filterItems2 = UserSeriesDetailFragment.this.getFilterItems();
                        Iterator it = filterItems2.iterator();
                        int i = 0;
                        while (true) {
                            boolean z = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            GlToolTipsItem glToolTipsItem = (GlToolTipsItem) next;
                            if (position != i) {
                                z = false;
                            }
                            glToolTipsItem.setSelected(z);
                            i = i2;
                        }
                        TextView textView4 = textView3;
                        filterItems3 = UserSeriesDetailFragment.this.getFilterItems();
                        textView4.setText(((GlToolTipsItem) filterItems3.get(position)).getText());
                        userSeriesDetailAdapter3 = UserSeriesDetailFragment.this.adapter;
                        userSeriesDetailAdapter3.isUseEmpty(position == 1);
                        if (position == 0) {
                            UserSeriesDetailFragment userSeriesDetailFragment2 = UserSeriesDetailFragment.this;
                            list = userSeriesDetailFragment2.originalAdapterData;
                            userSeriesDetailFragment2.setNewDiffData(list);
                            str = TtmlNode.COMBINE_ALL;
                        } else if (position == 1) {
                            UserSeriesDetailFragment userSeriesDetailFragment3 = UserSeriesDetailFragment.this;
                            list2 = userSeriesDetailFragment3.originalAdapterData;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list2) {
                                if (((UserSeriesDetailAdapter.UserSeriesDetailData) obj).getUserSeriesDetail().getIsCollected() == 1) {
                                    arrayList.add(obj);
                                }
                            }
                            userSeriesDetailFragment3.setNewDiffData(arrayList);
                            str = "added";
                        } else if (position != 2) {
                            str = "";
                        } else {
                            UserSeriesDetailFragment userSeriesDetailFragment4 = UserSeriesDetailFragment.this;
                            list3 = userSeriesDetailFragment4.originalAdapterData;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list3) {
                                if (((UserSeriesDetailAdapter.UserSeriesDetailData) obj2).getUserSeriesDetail().getIsCollected() == 0) {
                                    arrayList2.add(obj2);
                                }
                            }
                            userSeriesDetailFragment4.setNewDiffData(arrayList2);
                            str = "notyet";
                        }
                        UserSeriesDetailFragment.this.logEvent(LogEvents.seriesdetail_filter_click, BundleKt.bundleOf(TuplesKt.to("type", str)));
                        UserSeriesDetailFragment.access$getBinding(UserSeriesDetailFragment.this).rv.scrollToPosition(0);
                    }
                }).setSelectable(true).setShowArrow(false).addDivider(true).showLight(v, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(UserSeriesDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$2(UserSeriesDetailFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() != R.id.option_to_introduction) {
            return true;
        }
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, LogEvents.seriesdetail_introduce_click, null, 2, null);
        ViewExtensionsKt.navigate$default(this$0, R.id.action_seriesDetailFragment_to_seriesIntroduceFragment, BundleKt.bundleOf(TuplesKt.to(Args.indexListUid, this$0.indexListUid), TuplesKt.to(Args.showCreateView, false), TuplesKt.to("from", this$0.getPageName())), NavigationAnimaUtils.INSTANCE.getSlideAnima(this$0.getActivity()), null, 8, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$3(UserSeriesDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, LogEvents.seriesdetail_tip_click, null, 2, null);
        PersistData.INSTANCE.set(GOT_IT_CLICKED, true);
        LinearLayout gotItTv = ((FragmentSeriesDetailBinding) this$0.getBinding()).gotItTv;
        Intrinsics.checkNotNullExpressionValue(gotItTv, "gotItTv");
        gotItTv.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toCoinList(String uid, final String name) {
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
        SeriesRepository.INSTANCE.getCollectionItemBySeriesId(this.indexListUid, uid).observe(this, new UserSeriesDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$toCoinList$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                CollectionViewModel collectionVm;
                CollectionViewModel collectionVm2;
                NavController findNavController;
                UserSeriesDetailFragment.this.hideProgress();
                if (list == null) {
                    ToastUtils.showError(R.string.text_error, new Object[0]);
                    return;
                }
                if (list.size() != 1) {
                    collectionVm = UserSeriesDetailFragment.this.getCollectionVm();
                    collectionVm.setSelectedOfficialCollections(list);
                    ViewExtensionsKt.navigate$default(UserSeriesDetailFragment.this, R.id.action_seriesDetailFragment_to_seriesCoinListFragment, BundleKt.bundleOf(TuplesKt.to(Args.title, name)), NavigationAnimaUtils.INSTANCE.getSlideAnima(UserSeriesDetailFragment.this.getActivity()), null, 8, null);
                    return;
                }
                UserSeriesDetailFragment userSeriesDetailFragment = UserSeriesDetailFragment.this;
                try {
                    CollectionItem collectionItem = (CollectionItem) CollectionsKt.first((List) list);
                    collectionVm2 = userSeriesDetailFragment.getCollectionVm();
                    collectionVm2.setCurrentItem(collectionItem);
                    Uri.Builder authority = new Uri.Builder().scheme(BuildConfig.APP_NAME).authority(LogEvents.collectiondetail);
                    Long itemId = collectionItem.getItemId();
                    Uri build = authority.appendQueryParameter(Args.itemId, itemId != null ? itemId.toString() : null).appendQueryParameter(Args.uid, collectionItem.getUid()).appendQueryParameter("from", userSeriesDetailFragment.getPageName()).appendQueryParameter(Args.collectionId, String.valueOf(collectionItem.getCollectionId())).build();
                    View view = userSeriesDetailFragment.getRootView();
                    if (view == null || (findNavController = ViewKt.findNavController(view)) == null) {
                        return;
                    }
                    Intrinsics.checkNotNull(build);
                    findNavController.navigate(build, NavigationAnimaUtils.INSTANCE.getSlideAnima(userSeriesDetailFragment.getActivity()));
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addCollection(final UserSeriesDetail userSeriesDetail) {
        LanguageCode languageCode = AppViewModel.INSTANCE.getInstance().getLanguageCode();
        String countryCode = AppViewModel.INSTANCE.getInstance().getCountryCode();
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
        CmsRepository.INSTANCE.getCmsName(userSeriesDetail.getGenusUid(), languageCode, countryCode).observe(this, new UserSeriesDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetCmsNameMessage>, Unit>() { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$addCollection$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetCmsNameMessage> resource) {
                invoke2((Resource<GetCmsNameMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<GetCmsNameMessage> resource) {
                CmsName cmsName;
                String str;
                String str2;
                UserSeriesDetailItem userSeriesDetailItem;
                CmsName cmsName2;
                CmsImage mainImage;
                if (resource.getStatus() == Status.SUCCESS) {
                    UserSeriesDetailFragment.this.hideProgress();
                    GetCmsNameMessage data = resource.getData();
                    if (data == null || (cmsName = data.getCmsName()) == null) {
                        return;
                    }
                    UserSeriesDetailFragment userSeriesDetailFragment = UserSeriesDetailFragment.this;
                    UserSeriesDetail userSeriesDetail2 = userSeriesDetail;
                    CollectionDetailEditDialogFragment.Companion companion = CollectionDetailEditDialogFragment.INSTANCE;
                    FragmentManager supportFragmentManager = userSeriesDetailFragment.getSupportFragmentManager();
                    String uid = cmsName.getUid();
                    String[] strArr = new String[1];
                    GetCmsNameMessage data2 = resource.getData();
                    if (data2 == null || (cmsName2 = data2.getCmsName()) == null || (mainImage = cmsName2.getMainImage()) == null || (str = mainImage.getImageUrl()) == null) {
                        str = "";
                    }
                    strArr[0] = str;
                    List<String> mutableListOf = CollectionsKt.mutableListOf(strArr);
                    String pageName = userSeriesDetailFragment.getPageName();
                    str2 = userSeriesDetailFragment.indexListUid;
                    String uid2 = userSeriesDetail2.getUid();
                    userSeriesDetailItem = userSeriesDetailFragment.userSeriesDetailItem;
                    companion.createFromSeries(supportFragmentManager, uid, mutableListOf, 0, pageName, cmsName, str2, uid2, userSeriesDetailItem != null ? userSeriesDetailItem.getChildType() : null);
                    return;
                }
                if (resource.getStatus() == Status.ERROR) {
                    UserSeriesDetailFragment.this.hideProgress();
                    ToastUtils.showError(R.string.text_error, new Object[0]);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.seriesdetail;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_series_detail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNewDiffData(final List<UserSeriesDetailAdapter.UserSeriesDetailData> data) {
        this.adapter.setNewDiffData(new BaseQuickDiffCallback<UserSeriesDetailAdapter.UserSeriesDetailData>(data) { // from class: com.glority.android.picturexx.view.series.UserSeriesDetailFragment$setNewDiffData$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areContentsTheSame(UserSeriesDetailAdapter.UserSeriesDetailData oldItem, UserSeriesDetailAdapter.UserSeriesDetailData newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getNextSide() == newItem.getNextSide() && oldItem.getCurrentSide() == newItem.getCurrentSide() && oldItem.getUserSeriesDetail().getIsCollected() == newItem.getUserSeriesDetail().getIsCollected() && Intrinsics.areEqual(oldItem.getUserSeriesDetail().getSubjectSideUrl(), newItem.getUserSeriesDetail().getSubjectSideUrl()) && Intrinsics.areEqual(oldItem.getUserSeriesDetail().getDenominationUrl(), newItem.getUserSeriesDetail().getDenominationUrl()) && Intrinsics.areEqual(oldItem.getUserSeriesDetail().getUid(), newItem.getUserSeriesDetail().getUid()) && Intrinsics.areEqual(oldItem.getUserSeriesDetail().getGenusUid(), newItem.getUserSeriesDetail().getGenusUid()) && Intrinsics.areEqual(oldItem.getUserSeriesDetail().getName(), newItem.getUserSeriesDetail().getName());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areItemsTheSame(UserSeriesDetailAdapter.UserSeriesDetailData oldItem, UserSeriesDetailAdapter.UserSeriesDetailData newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem.getUserSeriesDetail().getUid(), newItem.getUserSeriesDetail().getUid()) || Intrinsics.areEqual(oldItem, newItem) || Intrinsics.areEqual(oldItem.getUserSeriesDetail(), newItem.getUserSeriesDetail());
            }
        });
    }
}
