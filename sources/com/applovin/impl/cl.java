package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;

/* loaded from: classes3.dex */
public final class cl extends ki {
    public static final o2.a d = new rs(8);

    /* renamed from: b */
    private final int f23333b;

    /* renamed from: c */
    private final float f23334c;

    public cl(int i2) {
        b1.a(i2 > 0, "maxStars must be a positive integer");
        this.f23333b = i2;
        this.f23334c = -1.0f;
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public static cl b(Bundle bundle) {
        b1.a(bundle.getInt(a(0), -1) == 2);
        int i2 = bundle.getInt(a(1), 5);
        float f2 = bundle.getFloat(a(2), -1.0f);
        return f2 == -1.0f ? new cl(i2) : new cl(i2, f2);
    }

    public static /* synthetic */ cl d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cl)) {
            return false;
        }
        cl clVar = (cl) obj;
        return this.f23333b == clVar.f23333b && this.f23334c == clVar.f23334c;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f23333b), Float.valueOf(this.f23334c));
    }

    public cl(int i2, float f2) {
        b1.a(i2 > 0, "maxStars must be a positive integer");
        b1.a(f2 >= 0.0f && f2 <= ((float) i2), "starRating is out of range [0, maxStars]");
        this.f23333b = i2;
        this.f23334c = f2;
    }
}
