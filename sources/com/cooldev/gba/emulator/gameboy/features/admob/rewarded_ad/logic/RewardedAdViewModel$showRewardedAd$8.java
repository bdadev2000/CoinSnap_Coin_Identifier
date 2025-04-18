package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic;

import android.content.Context;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class RewardedAdViewModel$showRewardedAd$8 extends r implements a {
    final /* synthetic */ a $onAdNotReady;
    final /* synthetic */ RewardedAdViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$showRewardedAd$8$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        @NotNull
        public final RewardedAdState invoke(@NotNull RewardedAdState rewardedAdState) {
            p0.a.s(rewardedAdState, "it");
            return RewardedAdState.copy$default(rewardedAdState, false, false, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdViewModel$showRewardedAd$8(RewardedAdViewModel rewardedAdViewModel, a aVar) {
        super(0);
        this.this$0 = rewardedAdViewModel;
        this.$onAdNotReady = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m107invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m107invoke() {
        Context context;
        this.this$0.updateState(AnonymousClass1.INSTANCE);
        this.$onAdNotReady.invoke();
        context = this.this$0.context;
        b0.a.b(context, "The requested feature is currently unavailable. Please try again later.").show();
    }
}
