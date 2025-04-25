package com.glority.android.picturexx.splash.fragment.splash;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.Purchase;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.abtest.AbtestInitRequest;
import com.glority.android.core.route.agreement.EnableCookieControlRequest;
import com.glority.android.core.route.agreement.IsCookieControlEnabledRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.LogExceptionRequest;
import com.glority.android.core.route.billing.QueryHasActiveSubscribedRequest;
import com.glority.android.core.route.fileupload.InitFileUploadRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.livebus.LiveBus;
import com.glority.android.picturexx.splash.R;
import com.glority.android.picturexx.splash.SplashActivity;
import com.glority.android.picturexx.splash.SplashAutoRestoreActivity;
import com.glority.android.picturexx.splash.SplashController;
import com.glority.android.picturexx.splash.SplashManualRestoreActivity;
import com.glority.android.picturexx.splash.SplashOnboardingActivity;
import com.glority.android.picturexx.splash.databinding.FragmentSplashBinding;
import com.glority.android.picturexx.splash.dialog.ForceUpdateDialog;
import com.glority.android.picturexx.splash.logevents.SplashLogEvents;
import com.glority.android.picturexx.splash.vm.main.SplashViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.livebus.LiveBusKeyRefs;
import com.glority.base.manager.AppInstallQueryManager;
import com.glority.base.routers.HomePurchasePageShouldShowRequest;
import com.glority.base.routers.InitBillingSkuDataRequest;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.routers.StartPurchaseMemoReplacementRequest;
import com.glority.base.routers.business.AfterSplashAgreePolicyRequest;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.utils.GoogleBillingQuery;
import com.glority.base.utils.PrivacyPolicyUtil;
import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.billing.utils.OutAppSubscribe;
import com.glority.component.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.component.generatedAPI.kotlinAPI.user.AutoUpdate;
import com.glority.component.generatedAPI.kotlinAPI.user.ClientConfig;
import com.glority.component.generatedAPI.kotlinAPI.user.InitialiseMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.component.generatedAPI.kotlinAPI.user.UserAdditionalData;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.network.exception.NetworkException;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.UtilsApp;
import com.glority.utils.app.IntentUtils;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SplashFragment.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'H\u0002J-\u0010%\u001a\u00020\u00112\u001e\b\u0001\u0010&\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110)\u0012\u0006\u0012\u0004\u0018\u00010*0(H\u0003¢\u0006\u0002\u0010+J\u001a\u0010,\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010&\u001a\u00020'H\u0002J7\u0010,\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010.2\u001e\b\u0001\u0010&\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110)\u0012\u0006\u0012\u0004\u0018\u00010*0(H\u0003¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u0011H\u0002J\u0012\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u000f\u00104\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u00105J\b\u00106\u001a\u000207H\u0014J\b\u00108\u001a\u00020\u000eH\u0002J\u0010\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u000207H\u0002J\u000e\u0010;\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020\u0011H\u0002J\u0016\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@H\u0082@¢\u0006\u0002\u0010AJ\u0016\u0010B\u001a\u0002072\u0006\u0010?\u001a\u00020@H\u0082@¢\u0006\u0002\u0010AJ\b\u0010C\u001a\u00020\u000eH\u0002J\b\u0010D\u001a\u00020\u0011H\u0002J\u000e\u0010E\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010<J\u000e\u0010F\u001a\u00020\u0011H\u0083@¢\u0006\u0002\u0010<J\u001a\u0010G\u001a\u00020\u00112\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020\u001eH\u0002J\u001a\u0010K\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010J\u001a\u00020\u001eH\u0002J\u001a\u0010L\u001a\u00020\u00112\b\u0010H\u001a\u0004\u0018\u00010M2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u001a\u0010N\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010O\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010<J\u000e\u0010P\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010<R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R,\u0010\u0014\u001a \u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0018\u00010\u0015\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/glority/android/picturexx/splash/fragment/splash/SplashFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/splash/databinding/FragmentSplashBinding;", "<init>", "()V", "getLayoutId", "", "vm", "Lcom/glority/android/picturexx/splash/vm/main/SplashViewModel;", "getVm", "()Lcom/glority/android/picturexx/splash/vm/main/SplashViewModel;", "vm$delegate", "Lkotlin/Lazy;", "openedAgreementPage", "", "installReferrerJob", "Lkotlinx/coroutines/Deferred;", "", "outAppSubscribe", "Lcom/glority/billing/utils/OutAppSubscribe;", "billingQueryJob", "Lkotlin/Pair;", "", "Lcom/android/billingclient/api/Purchase;", "onboardingActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "splashRestoreLauncher", "timeVipStart", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initListener", "addSubscriptions", "setErrorView", "action", "Lio/reactivex/functions/Action;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "handlerError", "e", "", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "jumpAccordingly", "updateVipInfo", "vipInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo;", "checkUpdate", "()Ljava/lang/Boolean;", "getLogPageName", "", "checkToBillingPage", "isConversionPageExist", Args.pageName, "preInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOutPurchaseVipInfo", "getFirebaseSessionId", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirebaseAppInstanceId", "needQueryGoogleBilling", "queryGoogleBilling", "doAfterAgreement", "performInitializeRequest", "doAfterInitialiseSuccess", "data", "Lcom/glority/component/generatedAPI/kotlinAPI/user/InitialiseMessage;", "start", "doAfterInitialiseFailed", "doAfterGetVipCardMessageSuccess", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/GetVipCardMessage;", "doAfterGetVipCardMessageFailed", "startEvaluateDetectEfficiency", "queryHasActiveSubscriptionFromGooglePlay", "Companion", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashFragment extends BaseFragment<FragmentSplashBinding> {
    private static final String KEY_QUERY_GOOGLE_BILLING = "QUERY_GOOGLE_BILLING";
    private Deferred<? extends Pair<Boolean, ? extends List<Purchase>>> billingQueryJob;
    private Deferred<Unit> installReferrerJob;
    private final ActivityResultLauncher<Intent> onboardingActivityLauncher;
    private boolean openedAgreementPage;
    private OutAppSubscribe outAppSubscribe;
    private final ActivityResultLauncher<Intent> splashRestoreLauncher;
    private long timeVipStart;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    public static final int $stable = 8;

    /* compiled from: SplashFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCodes.values().length];
            try {
                iArr[ErrorCodes.AUTHORIZATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void initListener() {
    }

    public SplashFragment() {
        final SplashFragment splashFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(splashFragment, Reflection.getOrCreateKotlinClass(SplashViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = splashFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$special$$inlined$activityViewModels$default$3
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
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SplashFragment.onboardingActivityLauncher$lambda$0(SplashFragment.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.onboardingActivityLauncher = registerForActivityResult;
        ActivityResultLauncher<Intent> registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$$ExternalSyntheticLambda3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SplashFragment.splashRestoreLauncher$lambda$1(SplashFragment.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.splashRestoreLauncher = registerForActivityResult2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentSplashBinding access$getBinding(SplashFragment splashFragment) {
        return (FragmentSplashBinding) splashFragment.getBinding();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_splash;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SplashViewModel getVm() {
        return (SplashViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onboardingActivityLauncher$lambda$0(SplashFragment this$0, ActivityResult activityResult) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() != 100001 || (activity = this$0.getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void splashRestoreLauncher$lambda$1(SplashFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            Context context = this$0.getContext();
            SplashActivity splashActivity = context instanceof SplashActivity ? (SplashActivity) context : null;
            if (splashActivity == null) {
                return;
            }
            SplashActivity.INSTANCE.startMainActivity(splashActivity);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SplashLogEvents.Splash_Page, null, 2, null);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.outAppSubscribe = new OutAppSubscribe(requireContext, 0L, 2, null);
        initView();
        initListener();
        if (getVm().getIsOldUser()) {
            PersistData.INSTANCE.set(PersistKey.KEY_VIP_OPEN_COUNT, Integer.valueOf(((Number) PersistData.INSTANCE.get(PersistKey.KEY_VIP_OPEN_COUNT, 1)).intValue()));
        } else {
            PersistData.INSTANCE.set(PersistKey.KEY_VIP_OPEN_COUNT, 0);
        }
        if (getVm().getIsOldUser() && Intrinsics.areEqual((Object) PrivacyPolicyUtil.INSTANCE.getHasAgreed(), (Object) true)) {
            new EnableCookieControlRequest(!Intrinsics.areEqual((Object) new IsCookieControlEnabledRequest().toResult(), (Object) false)).post();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SplashFragment$doCreateView$1(this, null), 3, null);
        } else if (LiveBus.INSTANCE.get(LiveBusKeyRefs.INSTANCE.getAGREE_AGREEMENT_KEY_REF()).getValue() != 0) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SplashFragment$doCreateView$2(this, null), 3, null);
        } else {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            SplashOnboardingActivity.INSTANCE.start(activity, this.onboardingActivityLauncher);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SplashFragment$doCreateView$3(this, null), 3, null);
        }
        addSubscriptions();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((FragmentSplashBinding) getBinding()).icEmpty.root.setBackgroundColor(ResUtils.getColor(R.color.White));
    }

    private final void addSubscriptions() {
        long currentTimeMillis = System.currentTimeMillis();
        SplashFragment splashFragment = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(splashFragment), null, null, new SplashFragment$addSubscriptions$1(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(FlowLiveDataConversions.asFlow(getVm().getObservable(InitialiseMessage.class)))), this, currentTimeMillis, null), 3, null);
        getVm().getObservable(GetVipCardMessage.class).observe(splashFragment, new SplashFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetVipCardMessage>, Unit>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$addSubscriptions$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetVipCardMessage> resource) {
                invoke2((Resource<GetVipCardMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<GetVipCardMessage> resource) {
                ResponseUtil responseUtil = ResponseUtil.INSTANCE;
                Intrinsics.checkNotNull(resource);
                final SplashFragment splashFragment2 = SplashFragment.this;
                responseUtil.handleResult(resource, new DefaultResponseHandler<GetVipCardMessage>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$addSubscriptions$2.1
                    @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
                    public void success(GetVipCardMessage data) {
                        long j;
                        super.success((AnonymousClass1) data);
                        SplashFragment splashFragment3 = SplashFragment.this;
                        j = splashFragment3.timeVipStart;
                        splashFragment3.doAfterGetVipCardMessageSuccess(data, j);
                    }

                    @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
                    public void error(Throwable e) {
                        long j;
                        super.error(e);
                        SplashFragment splashFragment3 = SplashFragment.this;
                        j = splashFragment3.timeVipStart;
                        splashFragment3.doAfterGetVipCardMessageFailed(e, j);
                    }
                });
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setErrorView(final Action action) {
        ((FragmentSplashBinding) getBinding()).icEmpty.root.setVisibility(0);
        ((FragmentSplashBinding) getBinding()).icEmpty.btn.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplashFragment.setErrorView$lambda$2(Action.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setErrorView$lambda$2(Action action, SplashFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(action, "$action");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        action.run();
        ((FragmentSplashBinding) this$0.getBinding()).icEmpty.root.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setErrorView(final Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        ((FragmentSplashBinding) getBinding()).icEmpty.root.setVisibility(0);
        TextView textView = (TextView) ((FragmentSplashBinding) getBinding()).icEmpty.root.findViewById(R.id.btn);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SplashFragment.setErrorView$lambda$3(SplashFragment.this, action, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setErrorView$lambda$3(SplashFragment this$0, Function1 action, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "$action");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new SplashFragment$setErrorView$2$1(action, this$0, null), 3, null);
    }

    private final void handlerError(Throwable e, Action action) {
        if (e instanceof NetworkException) {
            new LogExceptionRequest(e).post();
            if (WhenMappings.$EnumSwitchMapping$0[ErrorCodes.INSTANCE.parse(((NetworkException) e).getCode()).ordinal()] == 1) {
                AppViewModel.INSTANCE.getInstance().clearSession();
                Application app = UtilsApp.getApp();
                Intent launchAppIntent = IntentUtils.getLaunchAppIntent(app.getPackageName());
                launchAppIntent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                app.startActivity(launchAppIntent);
                return;
            }
            setErrorView(action);
            return;
        }
        setErrorView(action);
        new LogExceptionRequest(e).post();
    }

    private final void handlerError(Throwable e, Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        if (e instanceof NetworkException) {
            new LogExceptionRequest(e).post();
            if (WhenMappings.$EnumSwitchMapping$0[ErrorCodes.INSTANCE.parse(((NetworkException) e).getCode()).ordinal()] == 1) {
                AppViewModel.INSTANCE.getInstance().clearSession();
                Application app = UtilsApp.getApp();
                Intent launchAppIntent = IntentUtils.getLaunchAppIntent(app.getPackageName());
                launchAppIntent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                app.startActivity(launchAppIntent);
                return;
            }
            setErrorView(action);
            return;
        }
        new LogExceptionRequest(e).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpAccordingly() {
        AppInstallQueryManager.queryAppIsInstalled$default(AppInstallQueryManager.INSTANCE, true, null, 2, null);
        Context context = getContext();
        final SplashActivity splashActivity = context instanceof SplashActivity ? (SplashActivity) context : null;
        if (splashActivity != null) {
            new AfterSplashAgreePolicyRequest(splashActivity, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$jumpAccordingly$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: SplashFragment.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$jumpAccordingly$1$1$1", f = "SplashFragment.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$jumpAccordingly$1$1$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SplashActivity $it;
                    int label;
                    final /* synthetic */ SplashFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SplashFragment splashFragment, SplashActivity splashActivity, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = splashFragment;
                        this.$it = splashActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$it, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        SplashViewModel vm;
                        ActivityResultLauncher<Intent> activityResultLauncher;
                        ActivityResultLauncher<Intent> activityResultLauncher2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            vm = this.this$0.getVm();
                            this.label = 1;
                            obj = vm.checkIfNeedManualRestoreDirect(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        boolean canStartManualRestore = SplashManualRestoreActivity.INSTANCE.canStartManualRestore();
                        if (!booleanValue) {
                            this.this$0.logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "canrestore"), TuplesKt.to("type", "auto")));
                            SplashAutoRestoreActivity.Companion companion = SplashAutoRestoreActivity.INSTANCE;
                            activityResultLauncher = this.this$0.splashRestoreLauncher;
                            companion.start(activityResultLauncher, this.$it);
                        } else if (canStartManualRestore) {
                            SplashManualRestoreActivity.INSTANCE.increaseManualRestoreCount();
                            this.this$0.logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "canrestore"), TuplesKt.to("type", "manual")));
                            SplashManualRestoreActivity.Companion companion2 = SplashManualRestoreActivity.INSTANCE;
                            activityResultLauncher2 = this.this$0.splashRestoreLauncher;
                            companion2.start(activityResultLauncher2, this.$it);
                        } else {
                            SplashActivity.INSTANCE.startMainActivity(this.$it);
                            this.$it.finish();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SplashViewModel vm;
                    boolean checkToBillingPage;
                    User value;
                    vm = SplashFragment.this.getVm();
                    if (vm.getHasActiveSubscription() && (value = AppViewModel.INSTANCE.getInstance().getUser().getValue()) != null && !value.getVip()) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(SplashFragment.this), null, null, new AnonymousClass1(SplashFragment.this, splashActivity, null), 3, null);
                        return;
                    }
                    checkToBillingPage = SplashFragment.this.checkToBillingPage();
                    if (checkToBillingPage) {
                        return;
                    }
                    SplashActivity.INSTANCE.startMainActivity(splashActivity);
                    FragmentActivity activity = SplashFragment.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }).post();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVipInfo(VipInfo vipInfo) {
        AppViewModel.INSTANCE.getInstance().updateUserVipInfo(vipInfo);
        if (Intrinsics.areEqual((Object) checkUpdate(), (Object) true)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SplashFragment$updateVipInfo$1(this, null), 3, null);
    }

    private final Boolean checkUpdate() {
        boolean booleanValue;
        AutoUpdate autoUpdate;
        ClientConfig clientConfig = AppViewModel.INSTANCE.getInstance().getClientConfig();
        Boolean valueOf = (clientConfig == null || (autoUpdate = clientConfig.getAutoUpdate()) == null) ? null : Boolean.valueOf(autoUpdate.getForceUpdate());
        if (valueOf != null && (booleanValue = valueOf.booleanValue())) {
            new ForceUpdateDialog().setForced(booleanValue).show(getSupportFragmentManager(), "force_update_dialog");
        }
        return valueOf;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return SplashLogEvents.Splash_Page;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkToBillingPage() {
        if (!(!Intrinsics.areEqual((Object) new HomePurchasePageShouldShowRequest().toResult(), (Object) false)) || AppViewModel.INSTANCE.isVip() || ((Boolean) PersistData.INSTANCE.get(PersistKey.KEY_FAKE_PURCHASE, false)).booleanValue()) {
            return false;
        }
        Integer intOrNull = StringsKt.toIntOrNull(AppContext.INSTANCE.getConfig("hardcodeFirstConversionPage"));
        String result = new StartPurchaseMemoReplacementRequest().toResult();
        if (intOrNull != null) {
            return new OpenBillingActivityRequest("start", String.valueOf(intOrNull), 20).toResult().booleanValue();
        }
        if (result != null && result.length() > 0) {
            return new OpenBillingActivityRequest("start", result, 20).toResult().booleanValue();
        }
        if (isConversionPageExist(String.valueOf(AbTestUtil.INSTANCE.getConversionPageId()))) {
            return new OpenBillingActivityRequest("start", String.valueOf(AbTestUtil.INSTANCE.getConversionPageId()), 20).toResult().booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isConversionPageExist(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.fragment.splash.SplashFragment.isConversionPageExist(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object preInit(Continuation<? super Unit> continuation) {
        Deferred<Unit> async$default;
        if (new IsCookieControlEnabledRequest().toResult() == null) {
            new EnableCookieControlRequest(true).post();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            new InitBillingSkuDataRequest(activity).post();
        }
        OutAppSubscribe outAppSubscribe = this.outAppSubscribe;
        if (outAppSubscribe == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outAppSubscribe");
            outAppSubscribe = null;
        }
        outAppSubscribe.preQueryUnAcknowledgedPurchase();
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SplashFragment$preInit$3(this, null), 3, null);
        this.installReferrerJob = async$default;
        queryGoogleBilling();
        new AbtestInitRequest().post();
        Object performInitializeRequest = performInitializeRequest(continuation);
        return performInitializeRequest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performInitializeRequest : Unit.INSTANCE;
    }

    private final void updateOutPurchaseVipInfo() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SplashFragment$updateOutPurchaseVipInfo$1(this, null), 3, null);
    }

    private final boolean needQueryGoogleBilling() {
        return !((Boolean) PersistData.INSTANCE.get(KEY_QUERY_GOOGLE_BILLING, false)).booleanValue() && Intrinsics.areEqual(AppContext.INSTANCE.getConfig("isAppFromOfflineToOnline"), "true");
    }

    private final void queryGoogleBilling() {
        Deferred<? extends Pair<Boolean, ? extends List<Purchase>>> async$default;
        if (needQueryGoogleBilling()) {
            GoogleBillingQuery googleBillingQuery = new GoogleBillingQuery();
            LogUtils.e("query purchase start");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SplashFragment$queryGoogleBilling$1(googleBillingQuery, null), 3, null);
            this.billingQueryJob = async$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doAfterAgreement(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterAgreement$1
            if (r0 == 0) goto L14
            r0 = r7
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterAgreement$1 r0 = (com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterAgreement$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterAgreement$1 r0 = new com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterAgreement$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            java.lang.Object r2 = r0.L$0
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment r2 = (com.glority.android.picturexx.splash.fragment.splash.SplashFragment) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5f
        L3e:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.openedAgreementPage = r5
            com.glority.base.utils.PrivacyPolicyUtil r7 = com.glority.base.utils.PrivacyPolicyUtil.INSTANCE
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            r7.setHasAgreed(r2)
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterAgreement$2 r7 = new com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterAgreement$2
            r7.<init>(r6, r3)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            r2 = r6
        L5f:
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r7 = r2.preInit(r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.fragment.splash.SplashFragment.doAfterAgreement(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object performInitializeRequest(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$1
            if (r0 == 0) goto L14
            r0 = r7
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$1 r0 = (com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$1 r0 = new com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment r0 = (com.glority.android.picturexx.splash.fragment.splash.SplashFragment) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L52
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            long r4 = java.lang.System.currentTimeMillis()
            com.glority.android.picturexx.splash.vm.main.SplashViewModel r7 = r6.getVm()
            r0.L$0 = r6
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.initializeAppSync(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r6
            r1 = r4
        L52:
            com.glority.network.model.Resource r7 = (com.glority.network.model.Resource) r7
            com.glority.network.model.Status r3 = r7.getStatus()
            com.glority.network.model.Status r4 = com.glority.network.model.Status.SUCCESS
            r5 = 0
            if (r3 != r4) goto L9a
            java.lang.Object r3 = r7.getData()
            com.glority.component.generatedAPI.kotlinAPI.user.InitialiseMessage r3 = (com.glority.component.generatedAPI.kotlinAPI.user.InitialiseMessage) r3
            if (r3 == 0) goto L69
            r0.doAfterInitialiseSuccess(r3, r1)
            goto Ldb
        L69:
            com.glority.android.picturexx.splash.SplashController r1 = com.glority.android.picturexx.splash.SplashController.INSTANCE
            androidx.lifecycle.MutableLiveData r1 = r1.getInitializeFinished()
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Initialize Failed: Data is null"
            r2.<init>(r3)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m8274constructorimpl(r2)
            kotlin.Result r2 = kotlin.Result.m8273boximpl(r2)
            r1.setValue(r2)
            com.glority.network.exception.NetworkException r7 = r7.getException()
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$2 r1 = new com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$2
            r1.<init>(r0, r5)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0.handlerError(r7, r1)
            goto Ldb
        L9a:
            com.glority.network.model.Status r1 = r7.getStatus()
            com.glority.network.model.Status r2 = com.glority.network.model.Status.ERROR
            if (r1 != r2) goto Ldb
            com.glority.android.picturexx.splash.SplashController r1 = com.glority.android.picturexx.splash.SplashController.INSTANCE
            androidx.lifecycle.MutableLiveData r1 = r1.getInitializeFinished()
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            com.glority.network.exception.NetworkException r2 = r7.getException()
            if (r2 == 0) goto Lb3
            java.lang.Exception r2 = (java.lang.Exception) r2
            goto Lba
        Lb3:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Initialize Failed"
            r2.<init>(r3)
        Lba:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m8274constructorimpl(r2)
            kotlin.Result r2 = kotlin.Result.m8273boximpl(r2)
            r1.setValue(r2)
            com.glority.network.exception.NetworkException r7 = r7.getException()
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$3 r1 = new com.glority.android.picturexx.splash.fragment.splash.SplashFragment$performInitializeRequest$3
            r1.<init>(r0, r5)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0.handlerError(r7, r1)
        Ldb:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.fragment.splash.SplashFragment.performInitializeRequest(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doAfterInitialiseSuccess(InitialiseMessage data, long start) {
        new LogEventRequest(SplashLogEvents.time_initapi_debug, BundleKt.bundleOf(TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - start)), TuplesKt.to("type", Status.SUCCESS))).post();
        LogUtils.d("InitialiseMessage Requested Successfully!");
        if (data == null) {
            return;
        }
        User user = data.getUser();
        UserAdditionalData userAdditionalData = data.getUserAdditionalData();
        String accessToken = data.getAccessToken();
        AppViewModel.INSTANCE.getInstance().setClientConfig(data.getConfig());
        AppViewModel.INSTANCE.getInstance().setOtherConfig(data.getOtherConfigs());
        AppViewModel.INSTANCE.getInstance().updateUserAndToken(user, accessToken, userAdditionalData);
        PersistData.INSTANCE.set(PersistKey.KEY_SERVER_CLIENT_TIME_OFFSET, Long.valueOf(System.currentTimeMillis() - data.getAppServerTime().getTime()));
        PersistData.INSTANCE.set(PersistKey.KEY_SERVER_TIME, Long.valueOf(data.getAppServerTime().getTime()));
        new InitFileUploadRequest().post();
        updateOutPurchaseVipInfo();
        MutableLiveData<Result<Boolean>> initializeFinished = SplashController.INSTANCE.getInitializeFinished();
        Result.Companion companion = Result.INSTANCE;
        initializeFinished.setValue(Result.m8273boximpl(Result.m8274constructorimpl(true)));
        this.timeVipStart = System.currentTimeMillis();
        getVm().getVipCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doAfterInitialiseFailed(Throwable e, long start) {
        new LogEventRequest(SplashLogEvents.time_initapi_debug, BundleKt.bundleOf(TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - start)), TuplesKt.to("type", Status.ERROR))).post();
        Object[] objArr = new Object[2];
        objArr[0] = "InitialiseMessage Requested Failed!";
        objArr[1] = e != null ? e.getMessage() : null;
        LogUtils.e(objArr);
        MutableLiveData<Result<Boolean>> initializeFinished = SplashController.INSTANCE.getInitializeFinished();
        Result.Companion companion = Result.INSTANCE;
        initializeFinished.setValue(Result.m8273boximpl(Result.m8274constructorimpl(ResultKt.createFailure(e == null ? new Exception("Unknown Error") : e))));
        if (e != null) {
            e.printStackTrace();
        }
        handlerError(e, new Action() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Action
            public final void run() {
                SplashFragment.doAfterInitialiseFailed$lambda$10(SplashFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doAfterInitialiseFailed$lambda$10(SplashFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVm().initializeApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doAfterGetVipCardMessageSuccess(GetVipCardMessage data, long timeVipStart) {
        new LogEventRequest(SplashLogEvents.time_vipapi_debug, BundleKt.bundleOf(TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - timeVipStart)), TuplesKt.to("type", Status.SUCCESS))).post();
        if (data == null) {
            return;
        }
        LogUtils.d("GetVipCardMessage Requested Successfully!");
        if (AppViewModel.INSTANCE.isDebugMode() && AppViewModel.INSTANCE.isVip()) {
            ToastUtils.showShort("Vip is Not pending vip", new Object[0]);
        }
        if (!data.getVipInfo().getIsVip() && needQueryGoogleBilling()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SplashFragment$doAfterGetVipCardMessageSuccess$1(this, data, null), 3, null);
        } else {
            updateVipInfo(data.getVipInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doAfterGetVipCardMessageFailed(Throwable e, long timeVipStart) {
        new LogEventRequest(SplashLogEvents.time_vipapi_debug, BundleKt.bundleOf(TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - timeVipStart)), TuplesKt.to("type", Status.ERROR))).post();
        Object[] objArr = new Object[2];
        objArr[0] = "GetVipCardMessage Requested Failed!";
        objArr[1] = e != null ? e.getMessage() : null;
        LogUtils.e(objArr);
        if (e != null) {
            e.printStackTrace();
        }
        handlerError(e, new Action() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Action
            public final void run() {
                SplashFragment.doAfterGetVipCardMessageFailed$lambda$11(SplashFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doAfterGetVipCardMessageFailed$lambda$11(SplashFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVm().getVipCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startEvaluateDetectEfficiency(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.glority.android.picturexx.splash.fragment.splash.SplashFragment$startEvaluateDetectEfficiency$1
            if (r0 == 0) goto L14
            r0 = r5
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$startEvaluateDetectEfficiency$1 r0 = (com.glority.android.picturexx.splash.fragment.splash.SplashFragment$startEvaluateDetectEfficiency$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.glority.android.picturexx.splash.fragment.splash.SplashFragment$startEvaluateDetectEfficiency$1 r0 = new com.glority.android.picturexx.splash.fragment.splash.SplashFragment$startEvaluateDetectEfficiency$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L51
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            android.content.Context r5 = r4.getContext()
            if (r5 != 0) goto L41
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        L41:
            com.glority.android.picturexx.splash.DetectionBenchMark r2 = com.glority.android.picturexx.splash.DetectionBenchMark.INSTANCE
            r2.initDetectAgent(r5)
            com.glority.android.picturexx.splash.DetectionBenchMark r2 = com.glority.android.picturexx.splash.DetectionBenchMark.INSTANCE
            r0.label = r3
            java.lang.Object r5 = r2.startEvaluate(r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.fragment.splash.SplashFragment.startEvaluateDetectEfficiency(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFirebaseSessionId(Context context, Continuation<? super Long> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        FirebaseAnalytics.getInstance(context).getSessionId().addOnSuccessListener(new SplashFragment$sam$com_google_android_gms_tasks_OnSuccessListener$0(new Function1<Long, Unit>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$getFirebaseSessionId$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke2(l);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Long l) {
                LogUtils.e("firebase session id " + l);
                if (!cancellableContinuationImpl2.isActive() || cancellableContinuationImpl2.isCancelled()) {
                    return;
                }
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(Long.valueOf(l != null ? l.longValue() : 0L)));
            }
        })).addOnFailureListener(new OnFailureListener() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$getFirebaseSessionId$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!cancellableContinuationImpl2.isActive() || cancellableContinuationImpl2.isCancelled()) {
                    return;
                }
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(0L));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFirebaseAppInstanceId(Context context, Continuation<? super String> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        FirebaseAnalytics.getInstance(context).getAppInstanceId().addOnSuccessListener(new SplashFragment$sam$com_google_android_gms_tasks_OnSuccessListener$0(new Function1<String, Unit>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$getFirebaseAppInstanceId$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                LogUtils.e("firebase app instance id " + str);
                if (!cancellableContinuationImpl2.isActive() || cancellableContinuationImpl2.isCancelled()) {
                    return;
                }
                CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                if (str == null) {
                    str = "";
                }
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(str));
            }
        })).addOnFailureListener(new OnFailureListener() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$getFirebaseAppInstanceId$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!cancellableContinuationImpl2.isActive() || cancellableContinuationImpl2.isCancelled()) {
                    return;
                }
                CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(""));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object queryHasActiveSubscriptionFromGooglePlay(Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        new QueryHasActiveSubscribedRequest().subscribe(new Consumer() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$queryHasActiveSubscriptionFromGooglePlay$2$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                if (!cancellableContinuationImpl2.isActive() || cancellableContinuationImpl2.isCancelled()) {
                    return;
                }
                CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
            }
        }, new Consumer() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$queryHasActiveSubscriptionFromGooglePlay$2$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                if (!cancellableContinuationImpl2.isActive() || cancellableContinuationImpl2.isCancelled()) {
                    return;
                }
                CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(false));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
