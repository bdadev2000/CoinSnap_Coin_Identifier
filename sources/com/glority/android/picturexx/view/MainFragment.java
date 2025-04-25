package com.glority.android.picturexx.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.utils.data.EventLiveData;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCustomHomeContainerBinding;
import com.glority.android.picturexx.constants.ShortcutConstants;
import com.glority.android.picturexx.definition.CatalogTab;
import com.glority.android.picturexx.definition.HomeTab;
import com.glority.android.picturexx.definition.MainTabSelector;
import com.glority.android.picturexx.definition.MeTab;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.recognize.analyzer.BlurSingleton;
import com.glority.android.picturexx.recognize.analyzer.DetSingleton;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.android.picturexx.repository.SeriesRepository;
import com.glority.android.picturexx.splash.vm.main.MainViewModel;
import com.glority.android.picturexx.utils.JumpUtils;
import com.glority.android.picturexx.utils.ShortcutUtils;
import com.glority.android.picturexx.view.catalog.CatalogFragment;
import com.glority.android.picturexx.view.home.HomeFragment;
import com.glority.android.picturexx.view.me.MeCollectionFragment;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.picturexx.vm.NoteSnapViewModel;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Constants;
import com.glority.android.xx.constants.KeyLogEvents;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.i.OnNewIntentInterface;
import com.glority.base.share.ShareUtil;
import com.glority.base.widget.ScrollControlViewPager;
import com.glority.billing.utils.InAppMessageUtils;
import com.glority.utils.stability.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: MainFragment.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020\u0018H\u0016J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020\u0018H\u0002J\u0012\u0010*\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006-"}, d2 = {"Lcom/glority/android/picturexx/view/MainFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomHomeContainerBinding;", "Lcom/glority/base/i/OnNewIntentInterface;", "<init>", "()V", "homeFragmentNew", "Lcom/glority/android/picturexx/view/home/HomeFragment;", "catalogFragment", "Lcom/glority/android/picturexx/view/catalog/CatalogFragment;", "meCollectionFragment", "Lcom/glority/android/picturexx/view/me/MeCollectionFragment;", "fragments", "", "Landroidx/fragment/app/Fragment;", "mainVm", "Lcom/glority/android/picturexx/splash/vm/main/MainViewModel;", "getMainVm", "()Lcom/glority/android/picturexx/splash/vm/main/MainViewModel;", "mainVm$delegate", "Lkotlin/Lazy;", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "preLoadData", "dispatchShortcutsUri", "uri", "Landroid/net/Uri;", "showPaidTroubleNotice", "initView", "initListener", "selectedHome", "selectedMe", "selectedCategory", "getLogPageName", "", "onDestroy", "removeFreeTryShortcut", "addStableShortcut", "onNewIntent", "intent", "Landroid/content/Intent;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MainFragment extends BaseFragment<FragmentCustomHomeContainerBinding> implements OnNewIntentInterface {
    public static final int $stable = 8;
    private CatalogFragment catalogFragment;
    private List<Fragment> fragments = new ArrayList();
    private HomeFragment homeFragmentNew;

    /* renamed from: mainVm$delegate, reason: from kotlin metadata */
    private final Lazy mainVm;
    private MeCollectionFragment meCollectionFragment;

    public MainFragment() {
        final MainFragment mainFragment = this;
        final Function0 function0 = null;
        this.mainVm = FragmentViewModelLazyKt.createViewModelLazy(mainFragment, Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.MainFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.MainFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = mainFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.MainFragment$special$$inlined$activityViewModels$default$3
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
    public static final /* synthetic */ FragmentCustomHomeContainerBinding access$getBinding(MainFragment mainFragment) {
        return (FragmentCustomHomeContainerBinding) mainFragment.getBinding();
    }

    private final MainViewModel getMainVm() {
        return (MainViewModel) this.mainVm.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_custom_home_container;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        Intent intent;
        Uri data;
        this.homeFragmentNew = new HomeFragment();
        this.catalogFragment = new CatalogFragment();
        this.meCollectionFragment = new MeCollectionFragment();
        List<Fragment> list = this.fragments;
        HomeFragment homeFragment = this.homeFragmentNew;
        Intrinsics.checkNotNull(homeFragment);
        list.add(homeFragment);
        List<Fragment> list2 = this.fragments;
        CatalogFragment catalogFragment = this.catalogFragment;
        Intrinsics.checkNotNull(catalogFragment);
        list2.add(catalogFragment);
        List<Fragment> list3 = this.fragments;
        MeCollectionFragment meCollectionFragment = this.meCollectionFragment;
        Intrinsics.checkNotNull(meCollectionFragment);
        list3.add(meCollectionFragment);
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && (data = intent.getData()) != null) {
            dispatchShortcutsUri(data);
        }
        initView();
        initListener();
        preLoadData();
        showPaidTroubleNotice();
        removeFreeTryShortcut();
        addStableShortcut();
        EventLiveData<MainTabSelector> changeMainTab = GlobalLiveBus.INSTANCE.getChangeMainTab();
        HomeTab value = GlobalLiveBus.INSTANCE.getChangeMainTab().getValue();
        if (value == null) {
            value = HomeTab.INSTANCE;
        }
        changeMainTab.setValue(value);
    }

    private final void preLoadData() {
        SeriesRepository.INSTANCE.getRecommendSeriesListMessage();
    }

    private final void dispatchShortcutsUri(Uri uri) {
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                List<String> pathSegments = uri.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                String str = (String) CollectionsKt.last((List) pathSegments);
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1741312354:
                            if (!str.equals("collection")) {
                                break;
                            } else {
                                GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(MeTab.INSTANCE);
                                GlobalLiveBus.INSTANCE.getChangeMeTab().setValue(0);
                                break;
                            }
                        case -191501435:
                            if (!str.equals(ShortcutConstants.FEEDBACK_SHORTCUT_ID)) {
                                break;
                            } else {
                                ShareUtil.INSTANCE.sendEmail(activity);
                                break;
                            }
                        case -135762164:
                            if (!str.equals("identify")) {
                                break;
                            } else {
                                CoreActivity.Companion companion = CoreActivity.INSTANCE;
                                FragmentActivity requireActivity = requireActivity();
                                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                                companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), 2, true, "shortcut", RecognizeLogEvents.camera, null);
                                break;
                            }
                        case 98615255:
                            if (!str.equals("grade")) {
                                break;
                            } else {
                                JumpUtils.INSTANCE.toGradeCapture(activity, "shortcut", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                                break;
                            }
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final void showPaidTroubleNotice() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            try {
                InAppMessageUtils.INSTANCE.showPurchaseNoticeInApp(activity, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.MainFragment$showPaidTroubleNotice$1$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.MainFragment$showPaidTroubleNotice$1$2
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        PersistData.INSTANCE.set(Constants.key_paid_trouble_notice_time, Long.valueOf(System.currentTimeMillis()));
                    }
                });
                Unit unit = Unit.INSTANCE;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((FragmentCustomHomeContainerBinding) getBinding()).vp.setNoScroll(true);
        ((FragmentCustomHomeContainerBinding) getBinding()).vp.setOffscreenPageLimit(3);
        ScrollControlViewPager scrollControlViewPager = ((FragmentCustomHomeContainerBinding) getBinding()).vp;
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        scrollControlViewPager.setAdapter(new FragmentPagerAdapter(supportFragmentManager) { // from class: com.glority.android.picturexx.view.MainFragment$initView$1
            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int position) {
                List list;
                list = MainFragment.this.fragments;
                return (Fragment) list.get(position);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                List list;
                list = MainFragment.this.fragments;
                return list.size();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab0.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.MainFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainFragment.initListener$lambda$5(MainFragment.this, view);
            }
        });
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab1.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.MainFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainFragment.initListener$lambda$6(MainFragment.this, view);
            }
        });
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.MainFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainFragment.initListener$lambda$7(MainFragment.this, view);
            }
        });
        FrameLayout camera = ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.camera;
        Intrinsics.checkNotNullExpressionValue(camera, "camera");
        ViewExtensionsKt.setSingleClickListener(camera, 1000L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.MainFragment$initListener$4
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
                MainFragment.this.logEvent(LogEvents.tabbarv2_camera_click, newUserIdentifyA);
                CoreActivity.Companion companion = CoreActivity.INSTANCE;
                FragmentActivity requireActivity = MainFragment.this.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), 2, true, "camera tab v2", RecognizeLogEvents.camera, newUserIdentifyA);
            }
        });
        MainFragment mainFragment = this;
        getMainVm().getChangePageLifeData().observe(mainFragment, new MainFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.MainFragment$initListener$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (Intrinsics.areEqual(it, LogEvents.me)) {
                    GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(CatalogTab.INSTANCE);
                } else if (Intrinsics.areEqual(it, "home")) {
                    GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(HomeTab.INSTANCE);
                }
            }
        }));
        GlobalLiveBus.INSTANCE.getChangeMainTab().observe(mainFragment, new MainFragment$sam$androidx_lifecycle_Observer$0(new Function1<MainTabSelector, Unit>() { // from class: com.glority.android.picturexx.view.MainFragment$initListener$6
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MainTabSelector mainTabSelector) {
                invoke2(mainTabSelector);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(MainTabSelector tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                int index = tab.getIndex();
                if (index == 0) {
                    MainFragment.this.selectedHome();
                    return;
                }
                if (index == 1) {
                    MainFragment.this.selectedCategory();
                } else if (index != 2) {
                    MainFragment.this.selectedHome();
                } else {
                    MainFragment.this.selectedMe();
                }
            }
        }));
        NoteSnapViewModel.INSTANCE.getNoteSnapRedDotVisibleLiveData().observe(mainFragment, new MainFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.MainFragment$initListener$7
            /* JADX INFO: Access modifiers changed from: package-private */
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
                View meRedDot = MainFragment.access$getBinding(MainFragment.this).menuBar.meRedDot;
                Intrinsics.checkNotNullExpressionValue(meRedDot, "meRedDot");
                meRedDot.setVisibility(bool.booleanValue() ? 0 : 8);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$5(MainFragment this$0, View view) {
        HomeFragment homeFragment;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MainFragment mainFragment = this$0;
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(mainFragment, LogEvents.tabbarv2_home_click, null, 2, null);
        if (Intrinsics.areEqual(GlobalLiveBus.INSTANCE.getChangeMainTab().getValue(), HomeTab.INSTANCE) && (homeFragment = this$0.homeFragmentNew) != null) {
            com.glority.android.ui.base.v2.BaseFragment.logEvent$default(mainFragment, LogEvents.experkpicks_homescrolltotop_click, null, 2, null);
            homeFragment.scrollToTop();
        }
        GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(HomeTab.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$6(MainFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, LogEvents.tabbarv2_catalog_click, null, 2, null);
        GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(CatalogTab.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$7(MainFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, LogEvents.tabbarv2_collection_click, null, 2, null);
        GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(MeTab.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void selectedHome() {
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab0.setSelected(true);
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab1.setSelected(false);
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab2.setSelected(false);
        ((FragmentCustomHomeContainerBinding) getBinding()).vp.setCurrentItem(0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void selectedMe() {
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab0.setSelected(false);
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab1.setSelected(false);
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab2.setSelected(true);
        ((FragmentCustomHomeContainerBinding) getBinding()).vp.setCurrentItem(2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void selectedCategory() {
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab0.setSelected(false);
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab1.setSelected(true);
        ((FragmentCustomHomeContainerBinding) getBinding()).menuBar.tab2.setSelected(false);
        ((FragmentCustomHomeContainerBinding) getBinding()).vp.setCurrentItem(1, false);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return LogEvents.main;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DetSingleton.INSTANCE.getInstance().release();
        BlurSingleton.INSTANCE.getInstance().release();
    }

    private final void removeFreeTryShortcut() {
        Object obj;
        try {
            Context context = getContext();
            if (context != null) {
                List<ShortcutInfoCompat> shortcuts = ShortcutManagerCompat.getShortcuts(context, 2);
                Intrinsics.checkNotNullExpressionValue(shortcuts, "getShortcuts(...)");
                Iterator<T> it = shortcuts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((ShortcutInfoCompat) obj).getId(), ShortcutConstants.ONE_DAY_FREE_SHORTCUT_ID)) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.remove_onedayfreeshorcut_debug, null, 2, null);
                    LogUtils.d(LogEvents.remove_onedayfreeshorcut_debug);
                    ShortcutManagerCompat.removeDynamicShortcuts(context, ShortcutConstants.INSTANCE.getONE_DAY_FREE_LIST());
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final void addStableShortcut() {
        try {
            Context context = getContext();
            if (context != null) {
                List<ShortcutInfoCompat> shortcuts = ShortcutManagerCompat.getShortcuts(context, 2);
                Intrinsics.checkNotNullExpressionValue(shortcuts, "getShortcuts(...)");
                if (shortcuts.isEmpty()) {
                    ShortcutUtils.INSTANCE.setStableShortcuts(context);
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // com.glority.base.i.OnNewIntentInterface
    public void onNewIntent(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        dispatchShortcutsUri(data);
    }
}
