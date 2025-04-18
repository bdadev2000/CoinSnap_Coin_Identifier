package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0616Gp, HG<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC0615Go A07;
    public final InterfaceC0629Hd A08;
    public final IA A09;

    public W1() {
        this(null, null, 1000000L, 2000, InterfaceC0629Hd.A00);
    }

    public W1(Handler handler, InterfaceC0615Go interfaceC0615Go, long j3, int i10, InterfaceC0629Hd interfaceC0629Hd) {
        this.A06 = handler;
        this.A07 = interfaceC0615Go;
        this.A09 = new IA(i10);
        this.A08 = interfaceC0629Hd;
        this.A01 = j3;
    }

    private void A01(int i10, long j3, long j10) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gz(this, i10, j3, j10));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0616Gp
    public final synchronized long A67() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.HG
    public final synchronized void AB1(Object obj, int i10) {
        this.A02 += i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.HG
    public final synchronized void ADO(Object obj) {
        AbstractC0626Ha.A04(this.A00 > 0);
        long nowMs = this.A08.A5T();
        int i10 = (int) (nowMs - this.A03);
        this.A05 += i10;
        long j3 = this.A04;
        long j10 = this.A02;
        this.A04 = j3 + j10;
        if (i10 > 0) {
            this.A09.A03((int) Math.sqrt(j10), (float) ((8000 * j10) / i10));
            if (this.A05 >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS || this.A04 >= 524288) {
                this.A01 = this.A09.A02(0.5f);
            }
        }
        A01(i10, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.HG
    public final synchronized void ADP(Object obj, C0625Gy c0625Gy) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5T();
        }
        this.A00++;
    }
}
