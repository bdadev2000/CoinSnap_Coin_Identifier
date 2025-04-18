package com.cooldev.gba.emulator.gameboy.features.app.logic;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AppViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService) {
        super(application);
        a.s(application, "application");
        a.s(remoteConfigService, "remoteConfigService");
        this.remoteConfigService = remoteConfigService;
        i1 c2 = t0.c(new AppState(false, 0, 0, 7, null));
        this._state = c2;
        this.state = new o0(c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchNumberCodePaywall(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchNumberCodePaywall$1
            if (r0 == 0) goto L13
            r0 = r5
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchNumberCodePaywall$1 r0 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchNumberCodePaywall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchNumberCodePaywall$1 r0 = new com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchNumberCodePaywall$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel) r0
            kotlin.jvm.internal.q.m(r5)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r5)
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r5 = r4.remoteConfigService
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.PaywallSettingsConfig r5 = r5.getPaywallSettingsConfig()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getNumberCodePaywall(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchNumberCodePaywall$2 r1 = new com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchNumberCodePaywall$2
            r1.<init>(r5)
            r0.updateState(r1)
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel.fetchNumberCodePaywall(h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchShouldShowPurchase(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchShouldShowPurchase$1
            if (r0 == 0) goto L13
            r0 = r5
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchShouldShowPurchase$1 r0 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchShouldShowPurchase$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchShouldShowPurchase$1 r0 = new com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchShouldShowPurchase$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel) r0
            kotlin.jvm.internal.q.m(r5)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r5)
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r5 = r4.remoteConfigService
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.PaywallSettingsConfig r5 = r5.getPaywallSettingsConfig()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getValueIsDirectStore(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchShouldShowPurchase$2 r1 = new com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchShouldShowPurchase$2
            r1.<init>(r5)
            r0.updateState(r1)
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel.fetchShouldShowPurchase(h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchUpdateMode(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchUpdateMode$1
            if (r0 == 0) goto L13
            r0 = r5
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchUpdateMode$1 r0 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchUpdateMode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchUpdateMode$1 r0 = new com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchUpdateMode$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel) r0
            kotlin.jvm.internal.q.m(r5)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r5)
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r5 = r4.remoteConfigService
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.FeatureFlagsConfig r5 = r5.getFeatureFlagsConfig()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.fetchInAppUpdateRequirement(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchUpdateMode$2 r1 = new com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchUpdateMode$2
            r1.<init>(r5)
            r0.updateState(r1)
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel.fetchUpdateMode(h0.g):java.lang.Object");
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchDataRemoteConfig(@org.jetbrains.annotations.NotNull h0.g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchDataRemoteConfig$1
            if (r0 == 0) goto L13
            r0 = r7
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchDataRemoteConfig$1 r0 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchDataRemoteConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchDataRemoteConfig$1 r0 = new com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel$fetchDataRemoteConfig$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.q.m(r7)
            goto L6b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel r2 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel) r2
            kotlin.jvm.internal.q.m(r7)
            goto L5f
        L3d:
            java.lang.Object r2 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel r2 = (com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel) r2
            kotlin.jvm.internal.q.m(r7)
            goto L54
        L45:
            kotlin.jvm.internal.q.m(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fetchShouldShowPurchase(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r2 = r6
        L54:
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r2.fetchUpdateMode(r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fetchNumberCodePaywall(r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            d0.b0 r7 = d0.b0.f30125a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel.fetchDataRemoteConfig(h0.g):java.lang.Object");
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }
}
