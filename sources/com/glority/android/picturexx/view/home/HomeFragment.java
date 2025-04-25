package com.glority.android.picturexx.view.home;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.ArticleNewEntity;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.adapter.CoinTalkAdapter;
import com.glority.android.picturexx.adapter.ExpertPickItemWrapper;
import com.glority.android.picturexx.adapter.ExpertPicksAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentHomeBinding;
import com.glority.android.picturexx.business.databinding.ItemCoinTalkRvBinding;
import com.glority.android.picturexx.business.databinding.ItemHomeBannerVipBinding;
import com.glority.android.picturexx.business.databinding.ItemHomeCollectionDeBinding;
import com.glority.android.picturexx.business.databinding.ItemHomeCollectionEmptyDeBinding;
import com.glority.android.picturexx.business.databinding.ItemHomeGradeCardDeBinding;
import com.glority.android.picturexx.business.databinding.ItemHomeOptionCardDeBinding;
import com.glority.android.picturexx.constants.BusinessConstants;
import com.glority.android.picturexx.definition.MeTab;
import com.glority.android.picturexx.extensions.UserCustomSeriesItemExtKt;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.repository.HomeRepository;
import com.glority.android.picturexx.skins.SkinResourceManager;
import com.glority.android.picturexx.splash.SplashGlobalLiveData;
import com.glority.android.picturexx.utils.CoinSPUtils;
import com.glority.android.picturexx.utils.JumpUtils;
import com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog;
import com.glority.android.picturexx.vm.HomeViewModel;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.picturexx.vm.NoteSnapViewModel;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.KeyLogEvents;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.entity.OnActivityResultEntity;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.fragment.WebViewFragment;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.utils.stability.LogUtils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.picturecoin.generatedAPI.kotlinAPI.article.ExpertPick;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserCustomSeries;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: HomeFragment.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0018\u001a\u00020\fH\u0014J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\"\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002J\b\u0010)\u001a\u00020\u001aH\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\b\u0010+\u001a\u00020\u001aH\u0002J\b\u0010,\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u000200H\u0014J\u001c\u00101\u001a\b\u0012\u0004\u0012\u000203022\f\u00104\u001a\b\u0012\u0004\u0012\u0002050'H\u0002J\b\u00106\u001a\u00020\u001aH\u0002J\u0006\u00107\u001a\u00020\u001aJ\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020;H\u0002J \u0010<\u001a\u00020=2\u0006\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020\u0015H\u0002J\b\u0010A\u001a\u00020\u0015H\u0002J\u0016\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0'H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/glority/android/picturexx/view/home/HomeFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentHomeBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/HomeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/HomeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "headerViewCount", "", "noteSnapViewModel", "Lcom/glority/android/picturexx/vm/NoteSnapViewModel;", "getNoteSnapViewModel", "()Lcom/glority/android/picturexx/vm/NoteSnapViewModel;", "noteSnapViewModel$delegate", "adapter", "Lcom/glority/android/picturexx/adapter/ExpertPicksAdapter;", "maskView", "Landroid/view/View;", "expertPicksTitleView", "billingRequestCode", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showScrollMask", "doCreateView", "initObserver", "initView", "initHeader", "initOptionHeader", "updateCollectionCard", "nearestUpdateItem", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "collectionItems", "", "Lcom/glority/android/database/entities/CollectionItem;", "initGradingBar", "initBanner", "initCoinTalk", "initCollectionCard", "toCustomSetsTab", "initListener", "getLogPageName", "", "wrapExpertPicksData", "", "Lcom/glority/android/picturexx/adapter/ExpertPickItemWrapper;", "mutableList", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "initHeaderHolder", "scrollToTop", "getHomeOptionCardDE", "Lcom/glority/android/picturexx/business/databinding/ItemHomeOptionCardDeBinding;", "getItemHomeCollectionEmptyDe", "Lcom/glority/android/picturexx/business/databinding/ItemHomeCollectionEmptyDeBinding;", "getItemHomeCollectionDe", "Lcom/glority/android/picturexx/business/databinding/ItemHomeCollectionDeBinding;", "getItemHomeGradeCardDe", "Lcom/glority/android/picturexx/business/databinding/ItemHomeGradeCardDeBinding;", "getBanknoteOfferView", "getVipBanner", "getCoinTalkSection", "Lcom/glority/android/picturexx/business/databinding/ItemCoinTalkRvBinding;", "coinTalkArticleList", "Lcom/glority/android/database/entities/ArticleNewEntity;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class HomeFragment extends BaseFragment<FragmentHomeBinding> {
    public static final int $stable = 8;
    private ExpertPicksAdapter adapter;
    private View expertPicksTitleView;
    private View maskView;

    /* renamed from: noteSnapViewModel$delegate, reason: from kotlin metadata */
    private final Lazy noteSnapViewModel;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm = LazyKt.lazy(new Function0<HomeViewModel>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$vm$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HomeViewModel invoke() {
            ViewModel viewModel;
            viewModel = HomeFragment.this.getViewModel(HomeViewModel.class);
            return (HomeViewModel) viewModel;
        }
    });
    private final int headerViewCount = 5;
    private int billingRequestCode = 21;

    public HomeFragment() {
        final HomeFragment homeFragment = this;
        final Function0 function0 = null;
        this.noteSnapViewModel = FragmentViewModelLazyKt.createViewModelLazy(homeFragment, Reflection.getOrCreateKotlinClass(NoteSnapViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = homeFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$special$$inlined$activityViewModels$default$3
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
    public static final /* synthetic */ FragmentHomeBinding access$getBinding(HomeFragment homeFragment) {
        return (FragmentHomeBinding) homeFragment.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeViewModel getVm() {
        return (HomeViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NoteSnapViewModel getNoteSnapViewModel() {
        return (NoteSnapViewModel) this.noteSnapViewModel.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            CoinSPUtils.INSTANCE.setHomeExposureCount(CoinSPUtils.INSTANCE.getHomeExposureCount() + 1);
        }
    }

    private final void showScrollMask() {
        this.maskView = getLayoutInflater().inflate(R.layout.item_scroll_tips_mask, (ViewGroup) null);
        View decorView = requireActivity().getWindow().getDecorView();
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        View view = this.maskView;
        Intrinsics.checkNotNull(view);
        ((ViewGroup) decorView).addView(view, -1, -1);
        new LogEventRequest(LogEvents.experkpicksmask_show, null, 2, null).post();
        View view2 = this.maskView;
        if (view2 != null) {
            ViewExtensionsKt.setSingleClickListener$default(view2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$showScrollMask$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view3) {
                    invoke2(view3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    View view3;
                    Intrinsics.checkNotNullParameter(it, "it");
                    view3 = HomeFragment.this.maskView;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    new LogEventRequest(LogEvents.experkpicksmask_swipe_click, null, 2, null).post();
                    CoinSPUtils.INSTANCE.setExpertPicksScrolled(true);
                }
            }, 1, (Object) null);
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initListener();
        initObserver();
        if (CoinSPUtils.INSTANCE.getHomeExposureCount() != 2 || CoinSPUtils.INSTANCE.getExpertPicksScrolled()) {
            return;
        }
        showScrollMask();
    }

    private final void initObserver() {
        HomeFragment homeFragment = this;
        SplashGlobalLiveData.INSTANCE.getOnMainActivityResult().observe(homeFragment, new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<OnActivityResultEntity, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initObserver$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnActivityResultEntity onActivityResultEntity) {
                invoke2(onActivityResultEntity);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnActivityResultEntity it) {
                int i;
                HomeViewModel vm;
                ExpertPicksAdapter expertPicksAdapter;
                Intrinsics.checkNotNullParameter(it, "it");
                int requestCode = it.getRequestCode();
                i = HomeFragment.this.billingRequestCode;
                if (requestCode == i && AppViewModel.INSTANCE.isVip()) {
                    vm = HomeFragment.this.getVm();
                    Iterator<T> it2 = vm.getExpertPicksData().iterator();
                    while (it2.hasNext()) {
                        ((ExpertPickItemWrapper) it2.next()).setExpand(true);
                    }
                    expertPicksAdapter = HomeFragment.this.adapter;
                    if (expertPicksAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        expertPicksAdapter = null;
                    }
                    expertPicksAdapter.notifyDataSetChanged();
                }
            }
        }));
        HomeRepository.INSTANCE.getExpertPicksMessage().observe(homeFragment, new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<CacheThenNetworkRequest.ResultData<List<? extends ExpertPick>>, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initObserver$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CacheThenNetworkRequest.ResultData<List<? extends ExpertPick>> resultData) {
                invoke2((CacheThenNetworkRequest.ResultData<List<ExpertPick>>) resultData);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CacheThenNetworkRequest.ResultData<List<ExpertPick>> resultData) {
                HomeViewModel vm;
                HomeViewModel vm2;
                List wrapExpertPicksData;
                ExpertPicksAdapter expertPicksAdapter;
                HomeViewModel vm3;
                View view;
                ExpertPicksAdapter expertPicksAdapter2;
                View view2;
                int i;
                ExpertPicksAdapter expertPicksAdapter3;
                TextView textView;
                List<ExpertPick> result = resultData.getResult();
                ExpertPicksAdapter expertPicksAdapter4 = null;
                if (result != null && !result.isEmpty()) {
                    HomeFragment homeFragment2 = HomeFragment.this;
                    homeFragment2.expertPicksTitleView = homeFragment2.getLayoutInflater().inflate(R.layout.item_home_header_expert_picks, (ViewGroup) null);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());
                    Date expertPickListUpdateTime = CoinSPUtils.INSTANCE.getExpertPickListUpdateTime();
                    if (expertPickListUpdateTime == null) {
                        expertPickListUpdateTime = new Date();
                    }
                    String format = simpleDateFormat.format(expertPickListUpdateTime);
                    view = HomeFragment.this.expertPicksTitleView;
                    if (view != null && (textView = (TextView) view.findViewById(R.id.date_tv)) != null) {
                        textView.setText(format);
                    }
                    expertPicksAdapter2 = HomeFragment.this.adapter;
                    if (expertPicksAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        expertPicksAdapter2 = null;
                    }
                    view2 = HomeFragment.this.expertPicksTitleView;
                    Intrinsics.checkNotNull(view2);
                    i = HomeFragment.this.headerViewCount;
                    expertPicksAdapter2.setHeaderView(view2, i);
                    View inflate = HomeFragment.this.getLayoutInflater().inflate(R.layout.item_back_to_top, (ViewGroup) null);
                    View findViewById = inflate.findViewById(R.id.totop_ll);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    final HomeFragment homeFragment3 = HomeFragment.this;
                    ViewExtensionsKt.setSingleClickListener$default(findViewById, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initObserver$2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(View view3) {
                            invoke2(view3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            com.glority.android.ui.base.v2.BaseFragment.logEvent$default(HomeFragment.this, LogEvents.experkpicks_bottomscrolltotop_click, null, 2, null);
                            HomeFragment.this.scrollToTop();
                        }
                    }, 1, (Object) null);
                    expertPicksAdapter3 = HomeFragment.this.adapter;
                    if (expertPicksAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        expertPicksAdapter3 = null;
                    }
                    Intrinsics.checkNotNull(inflate);
                    BaseQuickAdapter.addFooterView$default(expertPicksAdapter3, inflate, 0, 0, 6, null);
                }
                vm = HomeFragment.this.getVm();
                vm.getExpertPicksData().clear();
                vm2 = HomeFragment.this.getVm();
                List<ExpertPickItemWrapper> expertPicksData = vm2.getExpertPicksData();
                HomeFragment homeFragment4 = HomeFragment.this;
                ArrayList result2 = resultData.getResult();
                if (result2 == null) {
                    result2 = new ArrayList();
                }
                wrapExpertPicksData = homeFragment4.wrapExpertPicksData(result2);
                expertPicksData.addAll(wrapExpertPicksData);
                expertPicksAdapter = HomeFragment.this.adapter;
                if (expertPicksAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    expertPicksAdapter4 = expertPicksAdapter;
                }
                vm3 = HomeFragment.this.getVm();
                expertPicksAdapter4.setNewData(vm3.getExpertPicksData());
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        RecyclerView rv = ((FragmentHomeBinding) getBinding()).rv;
        Intrinsics.checkNotNullExpressionValue(rv, "rv");
        this.adapter = new ExpertPicksAdapter(rv, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initView$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                int i;
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(HomeFragment.this, LogEvents.experkpicks_unlock_click, null, 2, null);
                i = HomeFragment.this.billingRequestCode;
                new OpenBillingActivityRequest("expertpicks", String.valueOf(AbTestUtil.INSTANCE.getConversionPageId()), Integer.valueOf(i)).post();
            }
        });
        RecyclerView recyclerView = ((FragmentHomeBinding) getBinding()).rv;
        ExpertPicksAdapter expertPicksAdapter = this.adapter;
        if (expertPicksAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            expertPicksAdapter = null;
        }
        recyclerView.setAdapter(expertPicksAdapter);
        initHeader();
    }

    private final void initHeader() {
        initHeaderHolder();
        initOptionHeader();
        initCollectionCard();
        if (CoinAbTestUtils.INSTANCE.visibleHomeGrade()) {
            initGradingBar();
        }
        initBanner();
        initCoinTalk();
    }

    private final void initOptionHeader() {
        View root = getHomeOptionCardDE().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ExpertPicksAdapter expertPicksAdapter = this.adapter;
        if (expertPicksAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            expertPicksAdapter = null;
        }
        expertPicksAdapter.setHeaderView(root, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCollectionCard(UserCustomSeriesItem nearestUpdateItem, List<CollectionItem> collectionItems) {
        ExpertPicksAdapter expertPicksAdapter = null;
        if (nearestUpdateItem == null) {
            ItemHomeCollectionEmptyDeBinding itemHomeCollectionEmptyDe = getItemHomeCollectionEmptyDe();
            ExpertPicksAdapter expertPicksAdapter2 = this.adapter;
            if (expertPicksAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                expertPicksAdapter = expertPicksAdapter2;
            }
            View root = itemHomeCollectionEmptyDe.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            expertPicksAdapter.setHeaderView(root, 1);
            return;
        }
        ItemHomeCollectionDeBinding itemHomeCollectionDe = getItemHomeCollectionDe(nearestUpdateItem, collectionItems);
        ExpertPicksAdapter expertPicksAdapter3 = this.adapter;
        if (expertPicksAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            expertPicksAdapter = expertPicksAdapter3;
        }
        View root2 = itemHomeCollectionDe.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        expertPicksAdapter.setHeaderView(root2, 1);
    }

    private final void initGradingBar() {
        ItemHomeGradeCardDeBinding itemHomeGradeCardDe = getItemHomeGradeCardDe();
        ExpertPicksAdapter expertPicksAdapter = this.adapter;
        if (expertPicksAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            expertPicksAdapter = null;
        }
        View root = itemHomeGradeCardDe.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        expertPicksAdapter.setHeaderView(root, 2);
    }

    private final void initBanner() {
        ExpertPicksAdapter expertPicksAdapter = null;
        final int i = 3;
        if (Intrinsics.areEqual((Object) NoteSnapViewModel.INSTANCE.getHomeNoteSnapBannerVisibleLiveData().getValue(), (Object) true)) {
            View banknoteOfferView = getBanknoteOfferView();
            ExpertPicksAdapter expertPicksAdapter2 = this.adapter;
            if (expertPicksAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                expertPicksAdapter = expertPicksAdapter2;
            }
            expertPicksAdapter.setHeaderView(banknoteOfferView, 3);
            NoteSnapViewModel.INSTANCE.getHomeNoteSnapBannerVisibleLiveData().observe(this, new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initBanner$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    ExpertPicksAdapter expertPicksAdapter3;
                    View vipBanner;
                    if (bool.booleanValue()) {
                        return;
                    }
                    expertPicksAdapter3 = HomeFragment.this.adapter;
                    if (expertPicksAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        expertPicksAdapter3 = null;
                    }
                    vipBanner = HomeFragment.this.getVipBanner();
                    expertPicksAdapter3.setHeaderView(vipBanner, i);
                }
            }));
            return;
        }
        if (AppViewModel.INSTANCE.isVip()) {
            return;
        }
        View vipBanner = getVipBanner();
        ExpertPicksAdapter expertPicksAdapter3 = this.adapter;
        if (expertPicksAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            expertPicksAdapter = expertPicksAdapter3;
        }
        expertPicksAdapter.setHeaderView(vipBanner, 3);
    }

    private final void initCoinTalk() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeFragment$initCoinTalk$1(this, null), 3, null);
    }

    private final void initCollectionCard() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        HomeFragment homeFragment = this;
        DBManager.INSTANCE.getUserCustomSeriesItemDao().getAll().observe(homeFragment, new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends UserCustomSeriesItem>, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initCollectionCard$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends UserCustomSeriesItem> list) {
                invoke2((List<UserCustomSeriesItem>) list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Object] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<UserCustomSeriesItem> list) {
                Ref.ObjectRef<UserCustomSeriesItem> objectRef3 = objectRef;
                Intrinsics.checkNotNull(list);
                objectRef3.element = CollectionsKt.lastOrNull(CollectionsKt.sortedWith(list, new Comparator() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initCollectionCard$1$invoke$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Long.valueOf(((UserCustomSeriesItem) t).getUpdatedAt().getTime()), Long.valueOf(((UserCustomSeriesItem) t2).getUpdatedAt().getTime()));
                    }
                }));
                HomeFragment homeFragment2 = this;
                UserCustomSeriesItem userCustomSeriesItem = objectRef.element;
                List<CollectionItem> list2 = objectRef2.element;
                ArrayList arrayList = null;
                if (list2 != null) {
                    Ref.ObjectRef<UserCustomSeriesItem> objectRef4 = objectRef;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        Integer customSeriesId = ((CollectionItem) obj).getCustomSeriesId();
                        UserCustomSeriesItem userCustomSeriesItem2 = objectRef4.element;
                        if (Intrinsics.areEqual(customSeriesId, userCustomSeriesItem2 != null ? Integer.valueOf(userCustomSeriesItem2.getCustomSeriesId()) : null)) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = arrayList2;
                }
                homeFragment2.updateCollectionCard(userCustomSeriesItem, arrayList);
            }
        }));
        DBManager.INSTANCE.getCollectionItemDao().getAllNoOrder(AppViewModel.INSTANCE.getUserId()).observe(homeFragment, new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initCollectionCard$2
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

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<CollectionItem> list) {
                objectRef2.element = list;
                if (objectRef.element != null) {
                    HomeFragment homeFragment2 = this;
                    UserCustomSeriesItem userCustomSeriesItem = objectRef.element;
                    Intrinsics.checkNotNull(list);
                    Ref.ObjectRef<UserCustomSeriesItem> objectRef3 = objectRef;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        Integer customSeriesId = ((CollectionItem) obj).getCustomSeriesId();
                        UserCustomSeriesItem userCustomSeriesItem2 = objectRef3.element;
                        Intrinsics.checkNotNull(userCustomSeriesItem2);
                        int customSeriesId2 = userCustomSeriesItem2.getCustomSeriesId();
                        if (customSeriesId != null && customSeriesId.intValue() == customSeriesId2) {
                            arrayList.add(obj);
                        }
                    }
                    homeFragment2.updateCollectionCard(userCustomSeriesItem, arrayList);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toCustomSetsTab() {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.home_collectionseeall_click, null, 2, null);
        GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(MeTab.INSTANCE);
        GlobalLiveBus.INSTANCE.getChangeMeTab().setValue(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        ((FragmentHomeBinding) getBinding()).searchIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.home.HomeFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.initListener$lambda$0(HomeFragment.this, view);
            }
        });
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = CoinSPUtils.INSTANCE.getExpertPicksScrolled();
        final Ref.IntRef intRef = new Ref.IntRef();
        ((FragmentHomeBinding) getBinding()).rv.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initListener$2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                View view;
                View view2;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                Ref.IntRef.this.element += dy;
                if (dy > 0) {
                    if (!booleanRef.element) {
                        CoinSPUtils.INSTANCE.setExpertPicksScrolled(true);
                    }
                    view2 = this.maskView;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    booleanRef.element = true;
                }
                view = this.expertPicksTitleView;
                if (view != null) {
                    HomeFragment homeFragment = this;
                    Ref.IntRef intRef2 = Ref.IntRef.this;
                    LinearLayout backToTopLl = HomeFragment.access$getBinding(homeFragment).backToTopLl;
                    Intrinsics.checkNotNullExpressionValue(backToTopLl, "backToTopLl");
                    backToTopLl.setVisibility(view.getY() + ((float) (view.getHeight() / 2)) < ((float) intRef2.element) ? 0 : 8);
                }
            }
        });
        LinearLayout backToTopLl = ((FragmentHomeBinding) getBinding()).backToTopLl;
        Intrinsics.checkNotNullExpressionValue(backToTopLl, "backToTopLl");
        ViewExtensionsKt.setSingleClickListener$default(backToTopLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$initListener$3
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(HomeFragment.this, LogEvents.experkpicks_topscrolltotop_click, null, 2, null);
                HomeFragment.this.scrollToTop();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$0(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, LogEvents.home_search_click, null, 2, null);
        ViewExtensionsKt.navigate$default(this$0, R.id.action_mainFragment_to_searchFragment, null, null, null, 14, null);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "home";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ExpertPickItemWrapper> wrapExpertPicksData(List<ExpertPick> mutableList) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : mutableList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new ExpertPickItemWrapper((ExpertPick) obj, i < 3 || AppViewModel.INSTANCE.isVip()));
            i = i2;
        }
        return arrayList;
    }

    private final void initHeaderHolder() {
        int i = this.headerViewCount;
        for (int i2 = 0; i2 < i; i2++) {
            ExpertPicksAdapter expertPicksAdapter = this.adapter;
            if (expertPicksAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                expertPicksAdapter = null;
            }
            View inflate = getLayoutInflater().inflate(R.layout.item_header_holder, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            BaseQuickAdapter.addHeaderView$default(expertPicksAdapter, inflate, 0, 0, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void scrollToTop() {
        try {
            ((FragmentHomeBinding) getBinding()).rv.smoothScrollToPosition(0);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final ItemHomeOptionCardDeBinding getHomeOptionCardDE() {
        ItemHomeOptionCardDeBinding inflate = ItemHomeOptionCardDeBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        ConstraintLayout idenfityLl = inflate.idenfityLl;
        Intrinsics.checkNotNullExpressionValue(idenfityLl, "idenfityLl");
        ViewExtensionsKt.setSingleClickListener$default(idenfityLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getHomeOptionCardDE$1
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
                Bundle newUserIdentifyA = KeyLogEvents.INSTANCE.newUserIdentifyA();
                HomeFragment.this.logEvent(LogEvents.home_identify_click, newUserIdentifyA);
                CoreActivity.Companion companion = CoreActivity.INSTANCE;
                FragmentActivity requireActivity = HomeFragment.this.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), 2, true, LogEvents.home_center_capture, "ll_capture", newUserIdentifyA);
            }
        }, 1, (Object) null);
        inflate.identifyIv.setImageResource(SkinResourceManager.INSTANCE.getHomeIdentifyBg());
        inflate.scanIv.setImageResource(SkinResourceManager.INSTANCE.getHomeIdentifyScanIcon());
        return inflate;
    }

    private final ItemHomeCollectionEmptyDeBinding getItemHomeCollectionEmptyDe() {
        ItemHomeCollectionEmptyDeBinding inflate = ItemHomeCollectionEmptyDeBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        MaterialButton createBt = inflate.createBt;
        Intrinsics.checkNotNullExpressionValue(createBt, "createBt");
        ViewExtensionsKt.setSingleClickListener$default(createBt, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getItemHomeCollectionEmptyDe$1
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(HomeFragment.this, LogEvents.home_createset_click, null, 2, null);
                CreateCustomSeriesDialog.Companion companion = CreateCustomSeriesDialog.INSTANCE;
                FragmentManager parentFragmentManager = HomeFragment.this.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                final HomeFragment homeFragment = HomeFragment.this;
                companion.open(parentFragmentManager, "110264", new Function1<UserCustomSeries, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getItemHomeCollectionEmptyDe$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UserCustomSeries userCustomSeries) {
                        invoke2(userCustomSeries);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(UserCustomSeries it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        HomeFragment homeFragment2 = HomeFragment.this;
                        int i = R.id.action_mainFragment_to_nav_graph_custom_set;
                        Bundle bundle = new Bundle();
                        bundle.putInt(Args.customSeriesId, it2.getCustomSeriesId());
                        bundle.putString(Args.title, it2.getTitle());
                        Unit unit = Unit.INSTANCE;
                        ViewExtensionsKt.navigate$default(homeFragment2, i, bundle, NavigationAnimaUtils.INSTANCE.getSlideAnima(HomeFragment.this.getActivity()), null, 8, null);
                    }
                });
            }
        }, 1, (Object) null);
        return inflate;
    }

    private final ItemHomeCollectionDeBinding getItemHomeCollectionDe(final UserCustomSeriesItem nearestUpdateItem, List<CollectionItem> collectionItems) {
        int i;
        String str;
        int i2;
        ItemHomeCollectionDeBinding inflate = ItemHomeCollectionDeBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        int i3 = 0;
        for (Object obj : nearestUpdateItem.getLatestCollectionUrlList()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if (i3 == 0) {
                ShapeableImageView iv1 = inflate.iv1;
                Intrinsics.checkNotNullExpressionValue(iv1, "iv1");
                com.glority.base.ext.ViewExtensionsKt.load(iv1, str2);
            } else if (i3 == 1) {
                ShapeableImageView iv2 = inflate.iv2;
                Intrinsics.checkNotNullExpressionValue(iv2, "iv2");
                com.glority.base.ext.ViewExtensionsKt.load(iv2, str2);
            } else if (i3 == 2) {
                ShapeableImageView iv3 = inflate.iv3;
                Intrinsics.checkNotNullExpressionValue(iv3, "iv3");
                com.glority.base.ext.ViewExtensionsKt.load(iv3, str2);
            }
            i3 = i4;
        }
        if (collectionItems != null) {
            if (nearestUpdateItem.getTotalPrice() != null) {
                String displayPrice = UserCustomSeriesItemExtKt.getDisplayPrice(nearestUpdateItem);
                int collectionCount = nearestUpdateItem.getCollectionCount();
                if (nearestUpdateItem.getCollectionCount() > 1) {
                    i2 = R.string.collection_customsets_caption_coins;
                } else {
                    i2 = R.string.collection_customsets_caption_coin;
                }
                str = displayPrice + " | " + collectionCount + " " + getString(i2, String.valueOf(nearestUpdateItem.getCollectionCount()));
            } else {
                int collectionCount2 = nearestUpdateItem.getCollectionCount();
                if (nearestUpdateItem.getCollectionCount() > 1) {
                    i = R.string.collection_customsets_caption_coins;
                } else {
                    i = R.string.collection_customsets_caption_coin;
                }
                str = collectionCount2 + " " + getString(i, String.valueOf(nearestUpdateItem.getCollectionCount()));
            }
            inflate.countTv.setText(str);
        }
        inflate.updateTv.setText(getString(R.string.Customseries_update, new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(nearestUpdateItem.getUpdatedAt())));
        inflate.tvMeSeriesName.setText(nearestUpdateItem.getTitle());
        LinearLayout collectionMoreLl = inflate.collectionMoreLl;
        Intrinsics.checkNotNullExpressionValue(collectionMoreLl, "collectionMoreLl");
        ViewExtensionsKt.setSingleClickListener$default(collectionMoreLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getItemHomeCollectionDe$2
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
                HomeFragment.this.toCustomSetsTab();
            }
        }, 1, (Object) null);
        ConstraintLayout seriesCard = inflate.seriesCard;
        Intrinsics.checkNotNullExpressionValue(seriesCard, "seriesCard");
        ViewExtensionsKt.setSingleClickListener$default(seriesCard, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getItemHomeCollectionDe$3
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
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                HomeFragment.this.logEvent(LogEvents.home_customset_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, String.valueOf(nearestUpdateItem.getCustomSeriesId()))));
                HomeFragment homeFragment = HomeFragment.this;
                int i5 = R.id.action_mainFragment_to_nav_graph_custom_set;
                Bundle bundle = new Bundle();
                UserCustomSeriesItem userCustomSeriesItem = nearestUpdateItem;
                bundle.putInt(Args.customSeriesId, userCustomSeriesItem.getCustomSeriesId());
                bundle.putString(Args.title, userCustomSeriesItem.getTitle());
                Unit unit = Unit.INSTANCE;
                ViewExtensionsKt.navigate$default(homeFragment, i5, bundle, NavigationAnimaUtils.INSTANCE.getSlideAnima(HomeFragment.this.getActivity()), null, 8, null);
            }
        }, 1, (Object) null);
        return inflate;
    }

    private final ItemHomeGradeCardDeBinding getItemHomeGradeCardDe() {
        ItemHomeGradeCardDeBinding inflate = ItemHomeGradeCardDeBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        LinearLayout gradingLl = inflate.gradingLl;
        Intrinsics.checkNotNullExpressionValue(gradingLl, "gradingLl");
        ViewExtensionsKt.setSingleClickListener$default(gradingLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getItemHomeGradeCardDe$1
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
                Bundle newUserGrading = KeyLogEvents.INSTANCE.newUserGrading();
                HomeFragment.this.logEvent(LogEvents.home_grade_click, newUserGrading);
                FragmentActivity activity = HomeFragment.this.getActivity();
                if (activity != null) {
                    JumpUtils.INSTANCE.toGradeCapture(activity, LogEvents.home_grading, HomeFragment.this.getRootView(), "ll_share", newUserGrading);
                }
            }
        }, 1, (Object) null);
        return inflate;
    }

    private final View getBanknoteOfferView() {
        View inflate = getLayoutInflater().inflate(R.layout.item_home_banknotes, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate);
        ViewExtensionsKt.setSingleClickListener$default(inflate, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getBanknoteOfferView$1
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
                NoteSnapViewModel noteSnapViewModel;
                Intrinsics.checkNotNullParameter(it, "it");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(HomeFragment.this, LogEvents.notesnapoffer_envelop_click, null, 2, null);
                PersistData.INSTANCE.set(BusinessConstants.INSTANCE.getNOTE_SNAP_BANNER_CLICKED(), true);
                NoteSnapViewModel.INSTANCE.getHomeNoteSnapBannerVisibleLiveData().setValue(false);
                noteSnapViewModel = HomeFragment.this.getNoteSnapViewModel();
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                noteSnapViewModel.openConvertPage(context, LogEvents.notesnapoffer, new Function1<NoteSnapViewModel.DismissType, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getBanknoteOfferView$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(NoteSnapViewModel.DismissType it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NoteSnapViewModel.DismissType dismissType) {
                        invoke2(dismissType);
                        return Unit.INSTANCE;
                    }
                });
            }
        }, 1, (Object) null);
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getVipBanner() {
        final ItemHomeBannerVipBinding inflate = ItemHomeBannerVipBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        if (AppViewModel.INSTANCE.getInstance().isVipInHistory()) {
            inflate.tipsTv.setText(R.string.home_conversion_button_title_ever);
        } else {
            inflate.tipsTv.setText(R.string.home_conversion_button_title);
        }
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtensionsKt.setSingleClickListener$default(root, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getVipBanner$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                new OpenBillingActivityRequest("home_envelope", String.valueOf(AbTestUtil.INSTANCE.getConversionPageId()), null, 4, null).post();
            }
        }, 1, (Object) null);
        AppViewModel.INSTANCE.getInstance().getVipInfo().observe(this, new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<VipInfo, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getVipBanner$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VipInfo vipInfo) {
                invoke2(vipInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(VipInfo vipInfo) {
                View root2 = ItemHomeBannerVipBinding.this.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                root2.setVisibility(AppViewModel.INSTANCE.isVip() ^ true ? 0 : 8);
            }
        }));
        View root2 = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ItemCoinTalkRvBinding getCoinTalkSection(final List<ArticleNewEntity> coinTalkArticleList) {
        ItemCoinTalkRvBinding inflate = ItemCoinTalkRvBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(coinTalkArticleList.isEmpty() ^ true ? 0 : 8);
        if (!r2.isEmpty()) {
            CoinTalkAdapter coinTalkAdapter = new CoinTalkAdapter();
            coinTalkAdapter.setNewData(coinTalkArticleList);
            coinTalkAdapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getCoinTalkSection$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                    invoke(baseQuickAdapter, view, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
                    CoinTag coinTag;
                    CoinTag coinTag2;
                    Intrinsics.checkNotNullParameter(adapter, "adapter");
                    Intrinsics.checkNotNullParameter(view, "view");
                    ArticleNewEntity articleNewEntity = coinTalkArticleList.get(i);
                    HomeFragment homeFragment = this;
                    Pair[] pairArr = new Pair[4];
                    pairArr[0] = TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(i));
                    pairArr[1] = TuplesKt.to(LogEventArguments.ARG_STRING_1, articleNewEntity.getUrl());
                    pairArr[2] = TuplesKt.to(LogEventArguments.ARG_STRING_2, articleNewEntity.getTitle());
                    List<CoinTag> tags = articleNewEntity.getTags();
                    String str = null;
                    pairArr[3] = TuplesKt.to(LogEventArguments.ARG_STRING_3, (tags == null || (coinTag2 = (CoinTag) CollectionsKt.firstOrNull((List) tags)) == null) ? null : coinTag2.getName());
                    homeFragment.logEvent(LogEvents.home_cointalk_click, BundleKt.bundleOf(pairArr));
                    FragmentActivity activity = this.getActivity();
                    if (activity != null) {
                        WebViewFragment.Companion companion = WebViewFragment.INSTANCE;
                        String url = articleNewEntity.getUrl();
                        String title = articleNewEntity.getTitle();
                        Pair[] pairArr2 = new Pair[4];
                        pairArr2[0] = TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(i));
                        pairArr2[1] = TuplesKt.to(LogEventArguments.ARG_STRING_1, articleNewEntity.getUrl());
                        pairArr2[2] = TuplesKt.to(LogEventArguments.ARG_STRING_2, articleNewEntity.getTitle());
                        List<CoinTag> tags2 = articleNewEntity.getTags();
                        if (tags2 != null && (coinTag = (CoinTag) CollectionsKt.firstOrNull((List) tags2)) != null) {
                            str = coinTag.getName();
                        }
                        pairArr2[3] = TuplesKt.to(LogEventArguments.ARG_STRING_3, str);
                        companion.open(activity, url, title, LogEvents.cointalk, BundleKt.bundleOf(pairArr2), false);
                    }
                }
            });
            inflate.coinTalkRv.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.glority.android.picturexx.view.home.HomeFragment$getCoinTalkSection$2
                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                    Intrinsics.checkNotNullParameter(outRect, "outRect");
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(state, "state");
                    outRect.left = parent.getResources().getDimensionPixelOffset(R.dimen.x12);
                }
            });
            inflate.coinTalkRv.setAdapter(coinTalkAdapter);
        }
        return inflate;
    }
}
