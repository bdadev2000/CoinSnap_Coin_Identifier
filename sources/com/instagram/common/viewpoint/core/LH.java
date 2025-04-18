package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class LH {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final LG A06;

    public LH(int i2, float f2, long j2, Handler handler, LG lg) {
        this(i2, lg, handler);
        this.A02 = j2;
        this.A01 = f2;
    }

    public LH(int i2, LG lg) {
        this(i2, lg, new Handler());
    }

    public LH(int i2, LG lg, Handler handler) {
        this.A04 = false;
        this.A00 = i2;
        this.A06 = lg;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        this.A00 -= this.A01;
        this.A06.ADF(this.A00);
        if (this.A00 <= 0.0f && !this.A03) {
            this.A03 = true;
            this.A06.ABb();
            this.A04 = false;
        }
    }

    public final boolean A04() {
        return this.A00 <= 0.0f;
    }

    public final boolean A05() {
        return this.A04;
    }

    public final boolean A06() {
        if (!A05()) {
            return false;
        }
        this.A04 = false;
        return true;
    }

    public final boolean A07() {
        if (A04() && !this.A03) {
            this.A03 = true;
            this.A06.ABb();
        }
        if (A04() || A05()) {
            return false;
        }
        this.A04 = true;
        this.A06.ADF(this.A00);
        this.A05.postDelayed(new C0941Vo(this), this.A02);
        return true;
    }
}
