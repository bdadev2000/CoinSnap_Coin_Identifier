package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1038Ai {
    public final Handler A00;
    public final InterfaceC1039Aj A01;

    public C1038Ai(Handler handler, InterfaceC1039Aj interfaceC1039Aj) {
        this.A00 = interfaceC1039Aj != null ? (Handler) AbstractC1192Ha.A01(handler) : null;
        this.A01 = interfaceC1039Aj;
    }

    public final void A01(int i9) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1037Ah(this, i9));
        }
    }

    public final void A02(int i9, long j7, long j9) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1035Af(this, i9, j7, j9));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1034Ae(this, format));
        }
    }

    public final void A04(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1036Ag(this, bc));
        }
    }

    public final void A05(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1032Ac(this, bc));
        }
    }

    public final void A06(String str, long j7, long j9) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1033Ad(this, str, j7, j9));
        }
    }
}
