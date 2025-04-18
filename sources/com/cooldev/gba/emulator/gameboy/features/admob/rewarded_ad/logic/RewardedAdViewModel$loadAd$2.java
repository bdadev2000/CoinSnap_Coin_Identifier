package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic;

import b1.s;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class RewardedAdViewModel$loadAd$2 extends r implements a {
    final /* synthetic */ b1.r $deferred;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdViewModel$loadAd$2(b1.r rVar) {
        super(0);
        this.$deferred = rVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m100invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m100invoke() {
        ((s) this.$deferred).Z(Boolean.TRUE);
    }
}
