package com.vungle.ads.internal.ui;

import bh.x3;
import kotlin.Lazy;

/* loaded from: classes4.dex */
public final class f implements hh.a {
    final /* synthetic */ Lazy<com.vungle.ads.internal.signals.j> $signalManager$delegate;
    final /* synthetic */ i this$0;

    public f(i iVar, Lazy<com.vungle.ads.internal.signals.j> lazy) {
        this.this$0 = iVar;
        this.$signalManager$delegate = lazy;
    }

    @Override // hh.a
    public void close() {
        x3 x3Var;
        com.vungle.ads.internal.signals.j m62onCreate$lambda2;
        x3Var = this.this$0.unclosedAd;
        if (x3Var != null) {
            m62onCreate$lambda2 = i.m62onCreate$lambda2(this.$signalManager$delegate);
            m62onCreate$lambda2.removeUnclosedAd(x3Var);
        }
        this.this$0.finish();
    }
}
