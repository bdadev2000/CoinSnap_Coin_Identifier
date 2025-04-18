package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public final class X6 implements InterfaceC0565Gu, HL<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC0564Gt A07;
    public final InterfaceC0579Hi A08;
    public final IF A09;

    public X6() {
        this(null, null, 1000000L, AdError.SERVER_ERROR_CODE, InterfaceC0579Hi.A00);
    }

    public X6(Handler handler, InterfaceC0564Gt interfaceC0564Gt, long j2, int i2, InterfaceC0579Hi interfaceC0579Hi) {
        this.A06 = handler;
        this.A07 = interfaceC0564Gt;
        this.A09 = new IF(i2);
        this.A08 = interfaceC0579Hi;
        this.A01 = j2;
    }

    private void A01(int i2, long j2, long j3) {
        if (this.A06 != null && this.A07 != null) {
            this.A06.post(new H4(this, i2, j2, j3));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0565Gu
    public final synchronized long A6V() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.HL
    public final synchronized void ABS(Object obj, int i2) {
        this.A02 += i2;
    }

    @Override // com.instagram.common.viewpoint.core.HL
    public final synchronized void ADr(Object obj) {
        AbstractC0576Hf.A04(this.A00 > 0);
        long nowMs = this.A08.A5p();
        int i2 = (int) (nowMs - this.A03);
        this.A05 += i2;
        this.A04 += this.A02;
        if (i2 > 0) {
            this.A09.A03((int) Math.sqrt(this.A02), (float) ((this.A02 * 8000) / i2));
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                this.A01 = this.A09.A02(0.5f);
            }
        }
        A01(i2, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.HL
    public final synchronized void ADs(Object obj, H3 h3) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5p();
        }
        this.A00++;
    }
}
