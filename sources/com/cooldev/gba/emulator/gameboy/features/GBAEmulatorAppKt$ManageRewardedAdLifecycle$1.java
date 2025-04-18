package com.cooldev.gba.emulator.gameboy.features;

import android.content.Context;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdState;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$ManageRewardedAdLifecycle$1", f = "GBAEmulatorApp.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$ManageRewardedAdLifecycle$1 extends i implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ RewardedAdState $rewardedAdState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$ManageRewardedAdLifecycle$1(RewardedAdState rewardedAdState, Context context, g gVar) {
        super(2, gVar);
        this.$rewardedAdState = rewardedAdState;
        this.$context = context;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GBAEmulatorAppKt$ManageRewardedAdLifecycle$1(this.$rewardedAdState, this.$context, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GBAEmulatorAppKt$ManageRewardedAdLifecycle$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        if (this.$rewardedAdState.isRewardedAdShowing()) {
            AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(this.$context, false);
        }
        return b0.f30125a;
    }
}
