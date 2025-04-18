package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic;

import b1.s;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class RewardedAdViewModel$loadAd$3 extends r implements l {
    final /* synthetic */ b1.r $deferred;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdViewModel$loadAd$3(b1.r rVar) {
        super(1);
        this.$deferred = rVar;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull String str) {
        a.s(str, "it");
        ((s) this.$deferred).Z(Boolean.FALSE);
    }
}
