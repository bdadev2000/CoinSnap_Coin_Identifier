package com.glority.android.picturexx.view.series;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.database.entities.RecommendSeriesItem;
import com.glority.android.picturexx.adapter.SeriesDetailAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentSeriesIntroduceBinding;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.ext.ViewExtensionsKt;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.widget.GlLoadingLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: SeriesIntroduceFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\bH\u0014J\b\u0010\"\u001a\u00020#H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/glority/android/picturexx/view/series/SeriesIntroduceFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentSeriesIntroduceBinding;", "<init>", "()V", "adapter", "Lcom/glority/android/picturexx/adapter/SeriesDetailAdapter;", Args.indexListUid, "", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "seriesVm", "Lcom/glority/android/picturexx/vm/SeriesViewModel;", "getSeriesVm", "()Lcom/glority/android/picturexx/vm/SeriesViewModel;", "seriesVm$delegate", "header", "Landroid/view/View;", Args.title, Args.showCreateView, "", "childType", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "loadingByIndexListUid", "initView", "getLogPageName", "getLayoutId", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SeriesIntroduceFragment extends BaseFragment<FragmentSeriesIntroduceBinding> {
    public static final int $stable = 8;
    private String childType;
    private View header;
    private String indexListUid;

    /* renamed from: seriesVm$delegate, reason: from kotlin metadata */
    private final Lazy seriesVm;
    private String title;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private final SeriesDetailAdapter adapter = new SeriesDetailAdapter();
    private boolean showCreateView = true;

    public SeriesIntroduceFragment() {
        final SeriesIntroduceFragment seriesIntroduceFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(seriesIntroduceFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = seriesIntroduceFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$special$$inlined$activityViewModels$default$3
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
        this.seriesVm = FragmentViewModelLazyKt.createViewModelLazy(seriesIntroduceFragment, Reflection.getOrCreateKotlinClass(SeriesViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = seriesIntroduceFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$special$$inlined$activityViewModels$default$6
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
    public static final /* synthetic */ FragmentSeriesIntroduceBinding access$getBinding(SeriesIntroduceFragment seriesIntroduceFragment) {
        return (FragmentSeriesIntroduceBinding) seriesIntroduceFragment.getBinding();
    }

    public final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    private final SeriesViewModel getSeriesVm() {
        return (SeriesViewModel) this.seriesVm.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        this.indexListUid = arguments != null ? arguments.getString(Args.indexListUid) : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("from") : null;
        Bundle arguments3 = getArguments();
        this.showCreateView = arguments3 != null ? arguments3.getBoolean(Args.showCreateView, true) : true;
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to(LogEventArguments.ARG_STRING_1, this.indexListUid);
        if (string == null) {
            string = "";
        }
        pairArr[1] = TuplesKt.to("from", string);
        updateCommonEventArgs(pairArr);
        initView();
        initData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initData() {
        String str = this.indexListUid;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            loadingByIndexListUid(str);
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadingByIndexListUid(String indexListUid) {
        ((FragmentSeriesIntroduceBinding) getBinding()).loadingLayout.showLoading();
        getSeriesVm().getRecommendSeriesByIndexListUidMessage(indexListUid).observe(this, new SeriesIntroduceFragment$sam$androidx_lifecycle_Observer$0(new Function1<CacheThenNetworkRequest.ResultData<RecommendSeriesItem>, Unit>() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$loadingByIndexListUid$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CacheThenNetworkRequest.ResultData<RecommendSeriesItem> resultData) {
                invoke2(resultData);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CacheThenNetworkRequest.ResultData<RecommendSeriesItem> resultData) {
                View view;
                View view2;
                SeriesDetailAdapter seriesDetailAdapter;
                View view3 = null;
                if (!resultData.getIsCache() && resultData.getResult() == null) {
                    GlLoadingLayout.showError$default(SeriesIntroduceFragment.access$getBinding(SeriesIntroduceFragment.this).loadingLayout, null, 1, null);
                    return;
                }
                SeriesIntroduceFragment.access$getBinding(SeriesIntroduceFragment.this).loadingLayout.loadingDone();
                RecommendSeriesItem result = resultData.getResult();
                if (result != null) {
                    SeriesIntroduceFragment seriesIntroduceFragment = SeriesIntroduceFragment.this;
                    seriesIntroduceFragment.childType = result.getChildType();
                    ImageView headerIv = SeriesIntroduceFragment.access$getBinding(seriesIntroduceFragment).headerIv;
                    Intrinsics.checkNotNullExpressionValue(headerIv, "headerIv");
                    ViewExtensionsKt.load(headerIv, result.getPageHearUrl());
                    seriesIntroduceFragment.title = result.getTitle();
                    view = seriesIntroduceFragment.header;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                        view = null;
                    }
                    ((TextView) view.findViewById(R.id.title_tv)).setText(result.getTitle());
                    view2 = seriesIntroduceFragment.header;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                    } else {
                        view3 = view2;
                    }
                    ((TextView) view3.findViewById(R.id.desc_tv)).setText(result.getSeriesDescription());
                    seriesDetailAdapter = seriesIntroduceFragment.adapter;
                    seriesDetailAdapter.setNewData(result.getDetails());
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        SeriesDetailAdapter seriesDetailAdapter = this.adapter;
        RecyclerView rv = ((FragmentSeriesIntroduceBinding) getBinding()).rv;
        Intrinsics.checkNotNullExpressionValue(rv, "rv");
        seriesDetailAdapter.bindToRecyclerView(rv);
        this.header = getLayoutInflater().inflate(R.layout.item_series_introduce_header, (ViewGroup) ((FragmentSeriesIntroduceBinding) getBinding()).rv, false);
        ((FragmentSeriesIntroduceBinding) getBinding()).toolBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeriesIntroduceFragment.initView$lambda$0(SeriesIntroduceFragment.this, view);
            }
        });
        SeriesDetailAdapter seriesDetailAdapter2 = this.adapter;
        View view = this.header;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            view = null;
        }
        seriesDetailAdapter2.setHeaderView(view);
        SeriesDetailAdapter seriesDetailAdapter3 = this.adapter;
        View inflate = getLayoutInflater().inflate(R.layout.item_home_footer, (ViewGroup) ((FragmentSeriesIntroduceBinding) getBinding()).rv, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        BaseQuickAdapter.addFooterView$default(seriesDetailAdapter3, inflate, 0, 0, 6, null);
        ((FragmentSeriesIntroduceBinding) getBinding()).loadingLayout.setCallback(new GlLoadingLayout.Callback() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$initView$2
            @Override // com.glority.widget.GlLoadingLayout.Callback
            public void loadData() {
                SeriesIntroduceFragment.this.initData();
            }
        });
        ((FragmentSeriesIntroduceBinding) getBinding()).appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$initView$3
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                String str;
                if (Math.abs(verticalOffset) >= SeriesIntroduceFragment.access$getBinding(SeriesIntroduceFragment.this).appBarLayout.getTotalScrollRange()) {
                    CollapsingToolbarLayout collapsingToolbarLayout = SeriesIntroduceFragment.access$getBinding(SeriesIntroduceFragment.this).collapsingToolbar;
                    str = SeriesIntroduceFragment.this.title;
                    collapsingToolbarLayout.setTitle(str);
                    SeriesIntroduceFragment.access$getBinding(SeriesIntroduceFragment.this).toolBar.setNavigationIcon(R.drawable.gl_icon_back);
                    return;
                }
                SeriesIntroduceFragment.access$getBinding(SeriesIntroduceFragment.this).collapsingToolbar.setTitle("");
                SeriesIntroduceFragment.access$getBinding(SeriesIntroduceFragment.this).toolBar.setNavigationIcon(R.drawable.icon_cms_detail_close);
            }
        });
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.series.SeriesIntroduceFragment$initView$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view2, Integer num) {
                invoke(baseQuickAdapter, view2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view2, int i) {
                SeriesDetailAdapter seriesDetailAdapter4;
                boolean z;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view2, "view");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SeriesIntroduceFragment.this, LogEvents.offseriesintropage_item_click, null, 2, null);
                seriesDetailAdapter4 = SeriesIntroduceFragment.this.adapter;
                RecommendSeriesDetail item = seriesDetailAdapter4.getItem(i);
                if (item == null) {
                    return;
                }
                SeriesIntroduceFragment seriesIntroduceFragment = SeriesIntroduceFragment.this;
                int i2 = R.id.action_seriesIntroduceFragment_to_searchCmsDetailFragment;
                Bundle bundle = new Bundle();
                SeriesIntroduceFragment seriesIntroduceFragment2 = SeriesIntroduceFragment.this;
                bundle.putString(Args.uid, item.getGenusUid());
                if (!Intrinsics.areEqual(item.getGenusUid(), item.getUid())) {
                    bundle.putString(Args.varietyUid, item.getUid());
                }
                z = seriesIntroduceFragment2.showCreateView;
                if (z) {
                    bundle.putString("from", "intropage");
                } else {
                    bundle.putString("from", "detailpage");
                }
                bundle.putString(Args.pageName, LogEvents.offseriesintroresult);
                Unit unit = Unit.INSTANCE;
                com.glority.android.core.ext.ViewExtensionsKt.navigate$default(seriesIntroduceFragment, i2, bundle, NavigationAnimaUtils.INSTANCE.getSlideAnima(SeriesIntroduceFragment.this.getActivity()), null, 8, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SeriesIntroduceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return LogEvents.seriesinfo;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_series_introduce;
    }
}
