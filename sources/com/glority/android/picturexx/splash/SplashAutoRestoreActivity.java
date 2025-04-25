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
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.picturexx.payment.skumanager.SkuManager;
import com.glority.android.picturexx.splash.composables.splashrestore.RestoreState;
import com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt;
import com.glority.android.picturexx.splash.databinding.ActivitySplashRestoreBinding;
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

/* compiled from: SplashAutoRestoreActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashAutoRestoreActivity;", "Lcom/glority/android/ui/base/v2/BaseActivity;", "Lcom/glority/android/picturexx/splash/databinding/ActivitySplashRestoreBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/splash/vm/main/SplashRestoreViewModel;", "getVm", "()Lcom/glority/android/picturexx/splash/vm/main/SplashRestoreViewModel;", "vm$delegate", "Lkotlin/Lazy;", "restoreManager", "Lcom/glority/android/picturexx/splash/restore/RestoreManager;", "getRestoreManager", "()Lcom/glority/android/picturexx/splash/restore/RestoreManager;", "restoreManager$delegate", "getLogPageName", "", "getViewBinding", "beforeCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "onEmailSend", "email", "onCloseClick", "onSkipFailRestore", "Companion", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashAutoRestoreActivity extends BaseActivity<ActivitySplashRestoreBinding> {

    /* renamed from: restoreManager$delegate, reason: from kotlin metadata */
    private final Lazy restoreManager = LazyKt.lazy(new Function0<RestoreManager>() { // from class: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$restoreManager$2
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
    public static final void start(ActivityResultLauncher<Intent> activityResultLauncher, Context context) {
        INSTANCE.start(activityResultLauncher, context);
    }

    public SplashAutoRestoreActivity() {
        final SplashAutoRestoreActivity splashAutoRestoreActivity = this;
        final Function0 function0 = null;
        this.vm = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SplashRestoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? splashAutoRestoreActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* compiled from: SplashAutoRestoreActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashAutoRestoreActivity$Companion;", "", "<init>", "()V", "start", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void start(ActivityResultLauncher<Intent> launcher, Context context) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            if (context == null) {
                return;
            }
            launcher.launch(new Intent(context, (Class<?>) SplashAutoRestoreActivity.class));
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
        return "autorestore";
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
        getRestoreManager().init(this, SkuManager.INSTANCE.getAllSkus(), new Function2<Throwable, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$beforeCreate$1
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
                SplashAutoRestoreActivity.this.hideProgress();
                SplashAutoRestoreActivity splashAutoRestoreActivity = SplashAutoRestoreActivity.this;
                Pair[] pairArr = new Pair[1];
                pairArr[0] = TuplesKt.to("name", th != null ? HttpState.FAIL : "success");
                splashAutoRestoreActivity.logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(pairArr));
                if (th == null) {
                    vm = SplashAutoRestoreActivity.this.getVm();
                    vm.getRestoreState().setValue(RestoreState.DONE);
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(SplashAutoRestoreActivity.this), null, null, new AnonymousClass1(SplashAutoRestoreActivity.this, null), 3, null);
                } else if (num != null) {
                    if (num.intValue() != ErrorCodes.MIS_MATCHED_USER.getValue()) {
                        vm2 = SplashAutoRestoreActivity.this.getVm();
                        vm2.getRestoreState().setValue(RestoreState.FAIL);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashAutoRestoreActivity.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.splash.SplashAutoRestoreActivity$beforeCreate$1$1", f = "SplashAutoRestoreActivity.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$beforeCreate$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SplashAutoRestoreActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SplashAutoRestoreActivity splashAutoRestoreActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = splashAutoRestoreActivity;
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
        getBinding().composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-94156751, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$doCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashAutoRestoreActivity.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.splash.SplashAutoRestoreActivity$doCreateView$1$1", f = "SplashAutoRestoreActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$doCreateView$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SplashAutoRestoreActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SplashAutoRestoreActivity splashAutoRestoreActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = splashAutoRestoreActivity;
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
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        vm = this.this$0.getVm();
                        vm.getRestoreState().setValue(RestoreState.LOADING);
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
                        ComposerKt.traceEventStart(-94156751, i, -1, "com.glority.android.picturexx.splash.SplashAutoRestoreActivity.doCreateView.<anonymous> (SplashAutoRestoreActivity.kt:85)");
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new AnonymousClass1(SplashAutoRestoreActivity.this, null), composer, 70);
                    vm = SplashAutoRestoreActivity.this.getVm();
                    EffectsKt.LaunchedEffect(vm.getRestoreState().getValue(), new AnonymousClass2(SplashAutoRestoreActivity.this, null), composer, 64);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    vm2 = SplashAutoRestoreActivity.this.getVm();
                    SplashRestoreScreenKt.SplashRestoreScreen(fillMaxSize$default, vm2.getRestoreState().getValue(), new AnonymousClass3(SplashAutoRestoreActivity.this), new AnonymousClass5(SplashAutoRestoreActivity.this), null, new AnonymousClass4(SplashAutoRestoreActivity.this), null, composer, 6, 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashAutoRestoreActivity.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.splash.SplashAutoRestoreActivity$doCreateView$1$2", f = "SplashAutoRestoreActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$doCreateView$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SplashAutoRestoreActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SplashAutoRestoreActivity splashAutoRestoreActivity, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = splashAutoRestoreActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashAutoRestoreActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$doCreateView$1$3, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass3(Object obj) {
                    super(0, obj, SplashAutoRestoreActivity.class, "onCloseClick", "onCloseClick()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((SplashAutoRestoreActivity) this.receiver).onCloseClick();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashAutoRestoreActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$doCreateView$1$4, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass4(Object obj) {
                    super(0, obj, SplashAutoRestoreActivity.class, "onSkipFailRestore", "onSkipFailRestore()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((SplashAutoRestoreActivity) this.receiver).onSkipFailRestore();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashAutoRestoreActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.SplashAutoRestoreActivity$doCreateView$1$5, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<String, Unit> {
                AnonymousClass5(Object obj) {
                    super(1, obj, SplashAutoRestoreActivity.class, "onEmailSend", "onEmailSend(Ljava/lang/String;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    ((SplashAutoRestoreActivity) this.receiver).onEmailSend(p0);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEmailSend(String email) {
        logEvent(SplashLogEvents.Auto_Restore_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "restoreFailsend"), TuplesKt.to("content", email)));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SplashAutoRestoreActivity$onEmailSend$1(this, email, null), 3, null);
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
