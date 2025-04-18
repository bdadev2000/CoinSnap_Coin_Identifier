package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class A2 {
    public static String[] A04 = {"", "VtJRvyPxmOImdsyLi4M2", "Gm1PRIYmvz", "uPcs22Bv4Ecng1eDU86bpHQLBlw1u", "FddESRKU", "iRaMLR8dbHBCXOgyzzarEjyYAsYlFtS", "", "bNCmKEz4NkHWTfLh0ykYoXiICiHkm4jm"};
    public static final A2 A05 = new A2(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public A2(float f2) {
        this(f2, 1.0f, false);
    }

    public A2(float f2, float f3, boolean z2) {
        AbstractC0576Hf.A03(f2 > 0.0f);
        AbstractC0576Hf.A03(f3 > 0.0f);
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = z2;
        this.A03 = Math.round(1000.0f * f2);
    }

    public final long A00(long j2) {
        return this.A03 * j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        A2 a2 = (A2) obj;
        if (this.A01 == a2.A01) {
            float f2 = this.A00;
            if (A04[6].length() == 0) {
                String[] strArr = A04;
                strArr[5] = "hwWatJQYKhKE8FUxymmZjRx10ScAWIj";
                strArr[3] = "Hxeg71DMLMKL7cxntL9BIHkxZ6VOo";
                if (f2 == a2.A00) {
                    boolean z2 = this.A02;
                    boolean z3 = a2.A02;
                    if (A04[7].charAt(4) != 'a') {
                        A04[6] = "";
                        if (z2 == z3) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
