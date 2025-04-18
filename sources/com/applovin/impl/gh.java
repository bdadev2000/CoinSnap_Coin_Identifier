package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;

/* loaded from: classes2.dex */
public final class gh extends ki {

    /* renamed from: c */
    public static final o2.a f24106c = new rs(20);

    /* renamed from: b */
    private final float f24107b;

    public gh() {
        this.f24107b = -1.0f;
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public static gh b(Bundle bundle) {
        b1.a(bundle.getInt(a(0), -1) == 1);
        float f2 = bundle.getFloat(a(1), -1.0f);
        return f2 == -1.0f ? new gh() : new gh(f2);
    }

    public static /* synthetic */ gh d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        return (obj instanceof gh) && this.f24107b == ((gh) obj).f24107b;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f24107b));
    }

    public gh(float f2) {
        b1.a(f2 >= 0.0f && f2 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f24107b = f2;
    }
}
