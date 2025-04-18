package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class g extends Number {
    private final String a;

    public g(String str) {
        this.a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.a;
        String str2 = ((g) obj).a;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.a);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.a).longValue();
        }
    }

    public final String toString() {
        return this.a;
    }
}
