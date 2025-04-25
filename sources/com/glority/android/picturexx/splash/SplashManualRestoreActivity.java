package com.glority.android.picturexx.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.payment.skumanager.SkuManager;
import com.glority.android.picturexx.splash.composables.splashrestore.RestoreState;
import com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt;
import com.glority.android.picturexx.splash.databinding.ActivitySplashRestoreBinding;
import com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialog;
import com.glority.android.picturexx.splash.logevents.SplashLogEvents;
import com.glority.android.picturexx.splash.restore.RestoreManager;
import com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel;
import com.glority.android.ui.base.v2.BaseActivity;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.network.util.HttpState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SplashManualRestoreActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashManualRestoreActivity;", "Lcom/glority/android/ui/base/v2/BaseActivity;", "Lcom/glority/android/picturexx/splash/databinding/ActivitySplashRestoreBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/splash/vm/main/SplashRestoreViewModel;", "getVm", "()Lcom/glority/android/picturexx/splash/vm/main/SplashRestoreViewModel;", "vm$delegate", "Lkotlin/Lazy;", "restoreManager", "Lcom/glority/android/picturexx/splash/restore/RestoreManager;", "getRestoreManager", "()Lcom/glority/android/picturexx/splash/restore/RestoreManager;", "restoreManager$delegate", "getLogPageName", "", "getViewBinding", "beforeCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "onEmailSend", "email", "onManualRestoreClick", "onSkipManualRestore", "onCloseClick", "onSkipFailRestore", "Companion", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashManualRestoreActivity extends BaseActivity<ActivitySplashRestoreBinding> {
    private static final String KEY_MANUAL_RESTORE = "__key_manual_restore_activity_count__";

    /* renamed from: restoreManager$delegate, reason: from kotlin metadata */
    private final Lazy restoreManager = LazyKt.lazy(new Function0<RestoreManager>() { // from class: com.glority.android.picturexx.splash.SplashManualRestoreActivity$restoreManager$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RestoreManager invoke() {
            return new RestoreManager();
        }
    });

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final boolean canStartManualRestore() {
        return INSTANCE.canStartManualRestore();
    }

    @JvmStatic
    public static final void increaseManualRestoreCount() {
        INSTANCE.increaseManualRestoreCount();
    }

    @JvmStatic
    public static final void start(ActivityResultLauncher<Intent> activityResultLauncher, Context context) {
        INSTANCE.start(activityResultLauncher, context);
    }

    public SplashManualRestoreActivity() {
        final SplashManualRestoreActivity splashManualRestoreActivity = this;
        final Function0 function0 = null;
        this.vm = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SplashRestoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.splash.SplashManualRestoreActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.splash.SplashManualRestoreActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.splash.SplashManualRestoreActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? splashManualRestoreActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* compiled from: SplashManualRestoreActivity.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashManualRestoreActivity$Companion;", "", "<init>", "()V", "KEY_MANUAL_RESTORE", "", "value", "", "manualRestoreCount", "getManualRestoreCount", "()I", "setManualRestoreCount", "(I)V", "canStartManualRestore", "", "increaseManualRestoreCount", "", "start", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final int getManualRestoreCount() {
            return ((Number) PersistData.INSTANCE.get(SplashManualRestoreActivity.KEY_MANUAL_RESTORE, 0)).intValue();
        }

        private final void setManualRestoreCount(int i) {
            PersistData.INSTANCE.set(SplashManualRestoreActivity.KEY_MANUAL_RESTORE, Integer.valueOf(i));
        }

        @JvmStatic
        public final boolean canStartManualRestore() {
            return getManualRestoreCount() == 0;
        }

        @JvmStatic
        public final void increaseManualRestoreCount() {
            setManualRestoreCount(getManualRestoreCount() + 1);
        }

        @JvmStatic
        public final void start(ActivityResultLauncher<Intent> launcher, Context context) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            if (context == null) {
                return;
            }
            launcher.launch(new Intent(context, (Class<?>) SplashManualRestoreActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SplashRestoreViewModel getVm() {
        return (SplashRestoreViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RestoreManager getRestoreManager() {
        return (RestoreManager) this.restoreManager.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected String getLogPageName() {
        return "manualrestore";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseActivity
    public ActivitySplashRestoreBinding getViewBinding() {
        ActivitySplashRestoreBinding inflate = ActivitySplashRestoreBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseActivity
    public void beforeCreate(Bundle savedInstanceState) {
        super.beforeCreate(savedInstanceState);
        getRestoreManager().init(this, SkuManager.INSTANCE.getAllSkus(), new Function2<Throwable, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.SplashManualRestoreActivity$beforeCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Integer num) {
                invoke2(th, num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th, Integer num) {
                SplashRestoreViewModel vm;
                SplashRestoreViewModel vm2;
                SplashManualRestoreActivity.this.hideProgress();
                SplashManualRestoreActivity splashManualRestoreActivity = SplashManualRestoreActivity.this;
                Pair[] pairArr = new Pair[1];
                pairArr[0] = TuplesKt.to("name", th != null ? HttpState.FAIL : "success");
                splashManualRestoreActivity.logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(pairArr));
                if (th == null) {
                    vm = SplashManualRestoreActivity.this.getVm();
                    vm.getRestoreState().setValue(RestoreState.DONE);
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(SplashManualRestoreActivity.this), null, null, new AnonymousClass1(SplashManualRestoreActivity.this, null), 3, null);
                } else if (num != null) {
                    if (num.intValue() != ErrorCodes.MIS_MATCHED_USER.getValue()) {
                        vm2 = SplashManualRestoreActivity.this.getVm();
                        vm2.getRestoreState().setValue(RestoreState.FAIL);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashManualRestoreActivity.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.splash.SplashManualRestoreActivity$beforeCreate$1$1", f = "SplashManualRestoreActivity.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.splash.SplashManualRestoreActivity$beforeCreate$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SplashManualRestoreActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SplashManualRestoreActivity splashManualRestoreActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = splashManualRestoreActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.setResult(-1);
                        this.label = 1;
                        if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.finish();
                    return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        getBinding().composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1623032417, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.SplashManualRestoreActivity$doCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashManualRestoreActivity.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.splash.SplashManualRestoreActivity$doCreateView$1$1", f = "SplashManualRestoreActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.splash.SplashManualRestoreActivity$doCreateView$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SplashManualRestoreActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SplashManualRestoreActivity splashManualRestoreActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = splashManualRestoreActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    SplashRestoreViewModel vm;
                    RestoreManager restoreManager;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        vm = this.this$0.getVm();
                        if (vm.getRestoreState().getValue() == RestoreState.LOADING) {
                            restoreManager = this.this$0.getRestoreManager();
                            restoreManager.startRestore();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                SplashRestoreViewModel vm;
                SplashRestoreViewModel vm2;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1623032417, i, -1, "com.glority.android.picturexx.splash.SplashManualRestoreActivity.doCreateView.<anonymous> (SplashManualRestoreActivity.kt:110)");
                    }
                    vm = SplashManualRestoreActivity.this.getVm();
                    EffectsKt.LaunchedEffect(vm.getRestoreState().getValue(), new AnonymousClass1(SplashManualRestoreActivity.this, null), composer, 64);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    vm2 = SplashManualRestoreActivity.this.getVm();
                    RestoreState value = vm2.getRestoreState().getValue();
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(SplashManualRestoreActivity.this);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(SplashManualRestoreActivity.this);
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(SplashManualRestoreActivity.this);
                    SplashRestoreScreenKt.SplashRestoreScreen(fillMaxSize$default, value, anonymousClass2, new AnonymousClass5(SplashManualRestoreActivity.this), new AnonymousClass6(SplashManualRestoreActivity.this), anonymousClass3, anonymousClass4, composer, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashManualRestoreActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.SplashManualRestoreActivity$doCreateView$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass2(Object obj) {
                    super(0, obj, SplashManualRestoreActivity.class, "onCloseClick", "onCloseClick()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((SplashManualRestoreActivity) this.receiver).onCloseClick();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashManualRestoreActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.SplashManualRestoreActivity$doCreateView$1$3, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass3(Object obj) {
                    super(0, obj, SplashManualRestoreActivity.class, "onSkipFailRestore", "onSkipFailRestore()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((SplashManualRestoreActivity) this.receiver).onSkipFailRestore();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashManualRestoreActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.SplashManualRestoreActivity$doCreateView$1$4, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass4(Object obj) {
                    super(0, obj, SplashManualRestoreActivity.class, "onManualRestoreClick", "onManualRestoreClick()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((SplashManualRestoreActivity) this.receiver).onManualRestoreClick();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashManualRestoreActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.SplashManualRestoreActivity$doCreateView$1$5, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<String, Unit> {
                AnonymousClass5(Object obj) {
                    super(1, obj, SplashManualRestoreActivity.class, "onEmailSend", "onEmailSend(Ljava/lang/String;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    ((SplashManualRestoreActivity) this.receiver).onEmailSend(p0);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashManualRestoreActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.SplashManualRestoreActivity$doCreateView$1$6, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass6(Object obj) {
                    super(0, obj, SplashManualRestoreActivity.class, "onSkipManualRestore", "onSkipManualRestore()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((SplashManualRestoreActivity) this.receiver).onSkipManualRestore();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEmailSend(String email) {
        logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "restoreFailsend"), TuplesKt.to("content", email)));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SplashManualRestoreActivity$onEmailSend$1(this, email, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onManualRestoreClick() {
        ManualRestoreConfirmDialog.INSTANCE.showDialog(getSupportFragmentManager(), new ManualRestoreConfirmDialog.ManualRestoreConfirmDialogListener() { // from class: com.glority.android.picturexx.splash.SplashManualRestoreActivity$onManualRestoreClick$1
            @Override // com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialog.ManualRestoreConfirmDialogListener
            public void onConfirm(DialogFragment dialog) {
                SplashRestoreViewModel vm;
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                dialog.dismissAllowingStateLoss();
                SplashManualRestoreActivity.this.logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "begin")));
                vm = SplashManualRestoreActivity.this.getVm();
                vm.getRestoreState().setValue(RestoreState.LOADING);
            }

            @Override // com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialog.ManualRestoreConfirmDialogListener
            public void onCancel(DialogFragment dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                dialog.dismissAllowingStateLoss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSkipManualRestore() {
        logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "skipRestore")));
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCloseClick() {
        logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "close")));
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSkipFailRestore() {
        logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "skipRestoreFail")));
        setResult(-1);
        finish();
    }
}
