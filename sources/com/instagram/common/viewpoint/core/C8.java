package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class C8 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C8(int i2, byte[] bArr, int i3, int i4) {
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = i3;
        this.A00 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8 c8 = (C8) obj;
        if (this.A01 == c8.A01 && this.A02 == c8.A02 && this.A00 == c8.A00 && Arrays.equals(this.A03, c8.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i2 = result * 31;
        int result2 = Arrays.hashCode(this.A03);
        int result3 = (((i2 + result2) * 31) + this.A02) * 31;
        int result4 = this.A00;
        return result3 + result4;
    }
}
