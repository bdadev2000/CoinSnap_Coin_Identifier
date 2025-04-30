package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class g extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f13023a;

    public g(String str) {
        this.f13023a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f13023a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f13023a;
        String str2 = ((g) obj).f13023a;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f13023a);
    }

    public final int hashCode() {
        return this.f13023a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f13023a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f13023a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f13023a);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f13023a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f13023a).longValue();
        }
    }

    public final String toString() {
        return this.f13023a;
    }
}
