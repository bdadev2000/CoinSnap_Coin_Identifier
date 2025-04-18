package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0604Ih {
    public final Handler A00;
    public final Ii A01;

    public C0604Ih(Handler handler, Ii ii) {
        this.A00 = ii != null ? (Handler) AbstractC0576Hf.A01(handler) : null;
        this.A01 = ii;
    }

    public final void A01(int i2, int i3, int i4, float f2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0601Ie(this, i2, i3, i4, f2));
        }
    }

    public final void A02(int i2, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0600Id(this, i2, j2));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0602If(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0599Ic(this, format));
        }
    }

    public final void A05(BH bh) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0603Ig(this, bh));
        }
    }

    public final void A06(BH bh) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0597Ia(this, bh));
        }
    }

    public final void A07(String str, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0598Ib(this, str, j2, j3));
        }
    }
}
