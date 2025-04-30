package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1220Ic {
    public final Handler A00;
    public final InterfaceC1221Id A01;

    public C1220Ic(Handler handler, InterfaceC1221Id interfaceC1221Id) {
        this.A00 = interfaceC1221Id != null ? (Handler) AbstractC1192Ha.A01(handler) : null;
        this.A01 = interfaceC1221Id;
    }

    public final void A01(int i9, int i10, int i11, float f9) {
        if (this.A01 != null) {
            this.A00.post(new IZ(this, i9, i10, i11, f9));
        }
    }

    public final void A02(int i9, long j7) {
        if (this.A01 != null) {
            this.A00.post(new IY(this, i9, j7));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1218Ia(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new IX(this, format));
        }
    }

    public final void A05(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1219Ib(this, bc));
        }
    }

    public final void A06(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new IV(this, bc));
        }
    }

    public final void A07(String str, long j7, long j9) {
        if (this.A01 != null) {
            this.A00.post(new IW(this, str, j7, j9));
        }
    }
}
