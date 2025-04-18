package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class XS extends AM {
    public static final Object A09 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public XS(long j2, long j3, long j4, long j5, long j6, long j7, boolean z2, boolean z3, Object obj) {
        this.A01 = j2;
        this.A05 = j3;
        this.A00 = j4;
        this.A03 = j5;
        this.A04 = j6;
        this.A02 = j7;
        this.A08 = z2;
        this.A07 = z3;
        this.A06 = obj;
    }

    public XS(long j2, long j3, long j4, long j5, boolean z2, boolean z3, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z2, z3, obj);
    }

    public XS(long j2, boolean z2, boolean z3, Object obj) {
        this(j2, j2, 0L, 0L, z2, z3, obj);
    }

    @Override // com.instagram.common.viewpoint.core.AM
    public final int A00() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.AM
    public final int A01() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.AM
    public final int A04(Object obj) {
        return A09.equals(obj) ? 0 : -1;
    }

    @Override // com.instagram.common.viewpoint.core.AM
    public final AK A0A(int i2, AK ak, boolean z2) {
        AbstractC0576Hf.A00(i2, 0, 1);
        return ak.A0B(null, z2 ? A09 : null, 0, this.A00, -this.A04);
    }

    @Override // com.instagram.common.viewpoint.core.AM
    public final AL A0D(int i2, AL al, boolean z2, long j2) {
        Object obj;
        AbstractC0576Hf.A00(i2, 0, 1);
        if (z2) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j3 = this.A02;
        if (this.A07 && j2 != 0) {
            if (this.A03 == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j3 += j2;
                if (j3 > this.A03) {
                    j3 = -9223372036854775807L;
                }
            }
        }
        return al.A04(obj, this.A01, this.A05, this.A08, this.A07, j3, this.A03, 0, 0, this.A04);
    }
}
