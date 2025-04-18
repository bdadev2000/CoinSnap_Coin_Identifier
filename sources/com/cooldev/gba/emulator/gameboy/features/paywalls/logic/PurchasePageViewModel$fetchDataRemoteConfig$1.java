package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.PaywallSettingsConfig;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageViewModel$fetchDataRemoteConfig$1", f = "PurchasePageViewModel.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PurchasePageViewModel$fetchDataRemoteConfig$1 extends i implements p {
    int label;
    final /* synthetic */ PurchasePageViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageViewModel$fetchDataRemoteConfig$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$value = str;
        }

        @Override // q0.l
        @NotNull
        public final PurchasePageState invoke(@NotNull PurchasePageState purchasePageState) {
            a.s(purchasePageState, "it");
            return purchasePageState.copy(this.$value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasePageViewModel$fetchDataRemoteConfig$1(PurchasePageViewModel purchasePageViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = purchasePageViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new PurchasePageViewModel$fetchDataRemoteConfig$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((PurchasePageViewModel$fetchDataRemoteConfig$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RemoteConfigService remoteConfigService;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            remoteConfigService = this.this$0.remoteConfigService;
            PaywallSettingsConfig paywallSettingsConfig = remoteConfigService.getPaywallSettingsConfig();
            this.label = 1;
            obj = paywallSettingsConfig.getSubscriptionPolicyInfo(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        this.this$0.updateState(new AnonymousClass1((String) obj));
        return b0.f30125a;
    }
}
