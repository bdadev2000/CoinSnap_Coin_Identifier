package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.ktx.AppUpdateResult;
import d0.b0;
import d1.q;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

@e(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", f = "AppUpdateManagerKtx.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppUpdateManagerKtxKt$requestUpdateFlow$1 extends i implements p {
    final /* synthetic */ AppUpdateManager $this_requestUpdateFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends r implements a {
        final /* synthetic */ AppUpdatePassthroughListener $globalUpdateListener;
        final /* synthetic */ AppUpdateManager $this_requestUpdateFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AppUpdateManager appUpdateManager, AppUpdatePassthroughListener appUpdatePassthroughListener) {
            super(0);
            this.$this_requestUpdateFlow = appUpdateManager;
            this.$globalUpdateListener = appUpdatePassthroughListener;
        }

        @Override // q0.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            m599invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m599invoke() {
            this.$this_requestUpdateFlow.unregisterListener(this.$globalUpdateListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1(AppUpdateManager appUpdateManager, g gVar) {
        super(2, gVar);
        this.$this_requestUpdateFlow = appUpdateManager;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        AppUpdateManagerKtxKt$requestUpdateFlow$1 appUpdateManagerKtxKt$requestUpdateFlow$1 = new AppUpdateManagerKtxKt$requestUpdateFlow$1(this.$this_requestUpdateFlow, gVar);
        appUpdateManagerKtxKt$requestUpdateFlow$1.L$0 = obj;
        return appUpdateManagerKtxKt$requestUpdateFlow$1;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull q qVar, @Nullable g gVar) {
        return ((AppUpdateManagerKtxKt$requestUpdateFlow$1) create(qVar, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            final q qVar = (q) this.L$0;
            final AppUpdateManager appUpdateManager = this.$this_requestUpdateFlow;
            final AppUpdatePassthroughListener appUpdatePassthroughListener = new AppUpdatePassthroughListener(new InstallStateUpdatedListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$1
                @Override // com.google.android.play.core.listener.StateUpdatedListener
                public final void onStateUpdate(@NotNull InstallState installState) {
                    p0.a.s(installState, "installState");
                    if (installState.installStatus() == 11) {
                        AppUpdateManagerKtxKt.tryOffer(q.this, new AppUpdateResult.Downloaded(appUpdateManager));
                    } else {
                        AppUpdateManagerKtxKt.tryOffer(q.this, new AppUpdateResult.InProgress(installState));
                    }
                }
            }, new AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(qVar));
            Task<AppUpdateInfo> appUpdateInfo = this.$this_requestUpdateFlow.getAppUpdateInfo();
            final AppUpdateManager appUpdateManager2 = this.$this_requestUpdateFlow;
            appUpdateInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1.1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(AppUpdateInfo appUpdateInfo2) {
                    int updateAvailability = appUpdateInfo2.updateAvailability();
                    if (updateAvailability == 0) {
                        ((d1.p) q.this).f(new InstallException(-2));
                    } else if (updateAvailability == 1) {
                        AppUpdateManagerKtxKt.tryOffer(q.this, AppUpdateResult.NotAvailable.INSTANCE);
                        ((d1.p) q.this).f(null);
                    } else if (updateAvailability == 2 || updateAvailability == 3) {
                        if (appUpdateInfo2.installStatus() == 11) {
                            AppUpdateManagerKtxKt.tryOffer(q.this, new AppUpdateResult.Downloaded(appUpdateManager2));
                            ((d1.p) q.this).f(null);
                        } else {
                            appUpdateManager2.registerListener(appUpdatePassthroughListener);
                            AppUpdateManagerKtxKt.tryOffer(q.this, new AppUpdateResult.Available(appUpdateManager2, appUpdateInfo2));
                        }
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1.2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(@NotNull Exception exc) {
                    p0.a.s(exc, "exception");
                    ((d1.p) q.this).f(exc);
                }
            });
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_requestUpdateFlow, appUpdatePassthroughListener);
            this.label = 1;
            if (p0.a.j(qVar, anonymousClass3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
