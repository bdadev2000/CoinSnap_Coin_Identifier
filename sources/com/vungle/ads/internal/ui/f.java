package com.vungle.ads.internal.ui;

import c7.y1;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class f implements i7.a {
    final /* synthetic */ InterfaceC2717f $signalManager$delegate;
    final /* synthetic */ i this$0;

    public f(i iVar, InterfaceC2717f interfaceC2717f) {
        this.this$0 = iVar;
        this.$signalManager$delegate = interfaceC2717f;
    }

    @Override // i7.a
    public void close() {
        y1 y1Var;
        com.vungle.ads.internal.signals.j m82onCreate$lambda2;
        y1Var = this.this$0.unclosedAd;
        if (y1Var != null) {
            m82onCreate$lambda2 = i.m82onCreate$lambda2(this.$signalManager$delegate);
            m82onCreate$lambda2.removeUnclosedAd(y1Var);
        }
        this.this$0.finish();
    }
}
