package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class AK {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public FU A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i2) {
        return this.A05.A04[i2].A00;
    }

    public final int A02(int i2) {
        return this.A05.A04[i2].A00();
    }

    public final int A03(int i2, int i3) {
        return this.A05.A04[i2].A01(i3);
    }

    public final int A04(long j2) {
        return this.A05.A00(j2);
    }

    public final int A05(long j2) {
        return this.A05.A01(j2);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return AbstractC03849b.A01(this.A04);
    }

    public final long A09(int i2) {
        return this.A05.A03[i2];
    }

    public final long A0A(int i2, int i3) {
        FS fs = this.A05.A04[i2];
        if (fs.A00 != -1) {
            return fs.A02[i3];
        }
        return -9223372036854775807L;
    }

    public final AK A0B(Object obj, Object obj2, int i2, long j2, long j3) {
        return A0C(obj, obj2, i2, j2, j3, FU.A06);
    }

    public final AK A0C(Object obj, Object obj2, int i2, long j2, long j3, FU fu) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i2;
        this.A01 = j2;
        this.A04 = j3;
        this.A05 = fu;
        return this;
    }

    public final boolean A0D(int i2) {
        return !this.A05.A04[i2].A02();
    }

    public final boolean A0E(int i2, int i3) {
        FS fs = this.A05.A04[i2];
        return (fs.A00 == -1 || fs.A01[i3] == 0) ? false : true;
    }
}
