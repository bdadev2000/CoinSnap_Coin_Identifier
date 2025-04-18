package com.cooldev.gba.emulator.gameboy.features.onboarding.logic;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.OnboardingEvents;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.FeatureFlagsConfig;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import d0.b0;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.TypeReference;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes2.dex */
public final class OnboardingViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final PaywallNavigationViewModel paywallNavigationViewModel;
    private boolean ratingInAppFirstOpenRemote;
    private boolean ratingOnboardingVisibleRemote;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    @e(c = "com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel$1", f = "OnboardingViewModel.kt", l = {TypeReference.EXCEPTION_PARAMETER}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel$1 */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;

        public AnonymousClass1(g gVar) {
            super(2, gVar);
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(gVar);
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
            return ((AnonymousClass1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f30806a;
            int i2 = this.label;
            if (i2 == 0) {
                q.m(obj);
                FeatureFlagsConfig featureFlagsConfig = OnboardingViewModel.this.remoteConfigService.getFeatureFlagsConfig();
                this.label = 1;
                obj = featureFlagsConfig.getAddGameNewFlow(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                OnboardingViewModel.this.addFirstGame();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService, @NotNull PaywallNavigationViewModel paywallNavigationViewModel) {
        super(application);
        p0.a.s(application, "application");
        p0.a.s(remoteConfigService, "remoteConfigService");
        p0.a.s(paywallNavigationViewModel, "paywallNavigationViewModel");
        this.remoteConfigService = remoteConfigService;
        this.paywallNavigationViewModel = paywallNavigationViewModel;
        this.context = application.getApplicationContext();
        i1 c2 = t0.c(new OnboardingState(null, false, 3, 0 == true ? 1 : 0));
        this._state = c2;
        this.state = new o0(c2);
        fetchDataRemoteConfig();
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new AnonymousClass1(null), 3);
    }

    public final void addFirstGame() {
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), b1.o0.f22356b, 0, new OnboardingViewModel$addFirstGame$1(this, null), 2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(7:10|11|12|13|14|(12:16|17|18|19|20|21|22|23|(1:25)|13|14|(0))|46)(2:47|48))(2:49|(1:51)(10:52|(2:55|53)|56|57|(3:59|(1:72)(2:61|(2:62|(2:64|(3:67|68|69)(1:66))(0)))|70)|73|74|14|(0)|46))))|77|6|7|(0)(0)|(3:(0)|(1:41)|(1:32))) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014c, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ea A[Catch: IOException -> 0x0046, TRY_LEAVE, TryCatch #0 {IOException -> 0x0046, blocks: (B:11:0x003c, B:13:0x012c, B:14:0x00e4, B:16:0x00ea, B:23:0x0108, B:44:0x0148, B:45:0x014b, B:74:0x00dc, B:40:0x0145, B:18:0x00f9, B:22:0x0105, B:35:0x0141, B:36:0x0144), top: B:7:0x0028, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0129 -> B:13:0x012c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object copyFile(h0.g r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel.copyFile(h0.g):java.lang.Object");
    }

    private final void fetchDataRemoteConfig() {
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new OnboardingViewModel$fetchDataRemoteConfig$1(this, null), 3);
    }

    public static final void firstlyAddGame$lambda$7(ReviewManager reviewManager, Activity activity, Task task) {
        p0.a.s(reviewManager, "$reviewManager");
        p0.a.s(activity, "$activity");
        p0.a.s(task, "it");
        Log.d("vuoncog", "In-app first add game: " + task.isSuccessful());
        if (task.isSuccessful()) {
            reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult());
        }
    }

    public final void handleFirstPage() {
        OnboardingEvents.INSTANCE.logClickOnboardingNext1();
        updateState(OnboardingViewModel$handleFirstPage$1.INSTANCE);
    }

    public final void handleSecondPage() {
        OnboardingEvents.INSTANCE.logClickOnboardingNext2();
        updateState(OnboardingViewModel$handleSecondPage$1.INSTANCE);
    }

    public final void handleThirdPage(boolean z2, boolean z3) {
        AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
        Context context = this.context;
        p0.a.r(context, "context");
        boolean z4 = appPrefUtils.getValueRatingHomeVisible(context) && this.ratingOnboardingVisibleRemote;
        OnboardingEvents.INSTANCE.logClickOnboardingNext3(z4);
        if (z4) {
            showRatingDialog();
        } else {
            navigateToDashboard(z2, z3);
        }
    }

    public static /* synthetic */ void hideRatingDialog$default(OnboardingViewModel onboardingViewModel, boolean z2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        onboardingViewModel.hideRatingDialog(z2, lVar);
    }

    private final void navigateToDashboard(boolean z2, boolean z3) {
        AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
        Context context = this.context;
        p0.a.r(context, "context");
        appPrefUtils.setValueOnboardingVisible(context, false);
        MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().navigateAndClearStack(RouterName.DASHBOARD);
        if (z2 && z3) {
            OnboardingEvents.INSTANCE.logOnboardingNavigateToPaywall();
            this.paywallNavigationViewModel.navigateToPaywall();
        }
    }

    private final void showRatingDialog() {
        updateState(OnboardingViewModel$showRatingDialog$1.INSTANCE);
    }

    private final void updateState(l lVar) {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, lVar.invoke(value)));
    }

    public final void firstlyAddGame(@NotNull Activity activity) {
        p0.a.s(activity, "activity");
        if (this.ratingInAppFirstOpenRemote) {
            ReviewManager create = ReviewManagerFactory.create(this.context);
            p0.a.r(create, "create(...)");
            create.requestReviewFlow().addOnCompleteListener(new com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.a(1, activity, create));
        }
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void hideRatingDialog(boolean z2, @NotNull l lVar) {
        p0.a.s(lVar, "ratingInApp");
        updateState(OnboardingViewModel$hideRatingDialog$1.INSTANCE);
        lVar.invoke(Boolean.valueOf(this.ratingInAppFirstOpenRemote));
        if (z2) {
            AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
            Context context = this.context;
            p0.a.r(context, "context");
            appPrefUtils.hideHomeRatingDialog(context);
            return;
        }
        AppPrefUtils appPrefUtils2 = AppPrefUtils.INSTANCE;
        Context context2 = this.context;
        p0.a.r(context2, "context");
        appPrefUtils2.setValueFirstOpen(context2);
    }

    public final void onNextPage(boolean z2, boolean z3) {
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new OnboardingViewModel$onNextPage$1(this, z2, z3, null), 3);
    }
}
