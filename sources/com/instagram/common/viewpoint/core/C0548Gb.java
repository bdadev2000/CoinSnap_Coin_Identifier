package com.instagram.common.viewpoint.core;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0548Gb {
    public final int A00;
    public final int A01;
    public final String A02;

    public C0548Gb(int i2, int i3, String str) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0548Gb c0548Gb = (C0548Gb) obj;
        if (this.A00 == c0548Gb.A00 && this.A01 == c0548Gb.A01 && TextUtils.equals(this.A02, c0548Gb.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i2 = result * 31;
        int result2 = this.A01;
        int result3 = (i2 + result2) * 31;
        int result4 = this.A02 != null ? this.A02.hashCode() : 0;
        return result3 + result4;
    }
}
