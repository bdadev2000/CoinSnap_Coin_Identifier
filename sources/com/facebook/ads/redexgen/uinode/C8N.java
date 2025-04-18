package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8N extends MX {
    public final /* synthetic */ LX A00;

    public C8N(LX lx) {
        this.A00 = lx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MY my) {
        SA sa2;
        boolean z10;
        Handler handler;
        boolean A0D;
        boolean z11;
        Handler handler2;
        int i10;
        sa2 = this.A00.A01;
        if (sa2 == null) {
            return;
        }
        z10 = this.A00.A03;
        if (z10 || my.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(EnumC0861Qi.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z11 = this.A00.A02;
        if (!z11) {
            return;
        }
        handler2 = this.A00.A05;
        C0730Lh c0730Lh = new C0730Lh(this);
        i10 = this.A00.A00;
        handler2.postDelayed(c0730Lh, i10);
    }
}
