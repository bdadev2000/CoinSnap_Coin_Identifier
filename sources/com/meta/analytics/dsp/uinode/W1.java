package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC1182Gp, HG<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC1181Go A07;
    public final InterfaceC1195Hd A08;
    public final IA A09;

    public W1() {
        this(null, null, 1000000L, 2000, InterfaceC1195Hd.A00);
    }

    public W1(Handler handler, InterfaceC1181Go interfaceC1181Go, long j7, int i9, InterfaceC1195Hd interfaceC1195Hd) {
        this.A06 = handler;
        this.A07 = interfaceC1181Go;
        this.A09 = new IA(i9);
        this.A08 = interfaceC1195Hd;
        this.A01 = j7;
    }

    private void A01(int i9, long j7, long j9) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gz(this, i9, j7, j9));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1182Gp
    public final synchronized long A67() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void AB1(Object obj, int i9) {
        this.A02 += i9;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void ADO(Object obj) {
        AbstractC1192Ha.A04(this.A00 > 0);
        long nowMs = this.A08.A5T();
        int i9 = (int) (nowMs - this.A03);
        this.A05 += i9;
        long j7 = this.A04;
        long j9 = this.A02;
        this.A04 = j7 + j9;
        if (i9 > 0) {
            this.A09.A03((int) Math.sqrt(j9), (float) ((8000 * j9) / i9));
            if (this.A05 >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS || this.A04 >= 524288) {
                this.A01 = this.A09.A02(0.5f);
            }
        }
        A01(i9, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void ADP(Object obj, C1191Gy c1191Gy) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5T();
        }
        this.A00++;
    }
}
