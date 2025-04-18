package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0472Ai {
    public final Handler A00;
    public final InterfaceC0473Aj A01;

    public C0472Ai(Handler handler, InterfaceC0473Aj interfaceC0473Aj) {
        this.A00 = interfaceC0473Aj != null ? (Handler) AbstractC0626Ha.A01(handler) : null;
        this.A01 = interfaceC0473Aj;
    }

    public final void A01(int i10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0471Ah(this, i10));
        }
    }

    public final void A02(int i10, long j3, long j10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0469Af(this, i10, j3, j10));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0468Ae(this, format));
        }
    }

    public final void A04(BC bc2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0470Ag(this, bc2));
        }
    }

    public final void A05(BC bc2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0466Ac(this, bc2));
        }
    }

    public final void A06(String str, long j3, long j10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0467Ad(this, str, j3, j10));
        }
    }
}
