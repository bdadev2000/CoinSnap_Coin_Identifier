package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class dh extends gi {

    /* renamed from: c */
    public static final m2.a f4302c = new ss(12);

    /* renamed from: b */
    private final float f4303b;

    public dh() {
        this.f4303b = -1.0f;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static dh b(Bundle bundle) {
        boolean z10 = false;
        if (bundle.getInt(a(0), -1) == 1) {
            z10 = true;
        }
        a1.a(z10);
        float f10 = bundle.getFloat(a(1), -1.0f);
        if (f10 == -1.0f) {
            return new dh();
        }
        return new dh(f10);
    }

    public static /* synthetic */ dh d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dh) || this.f4303b != ((dh) obj).f4303b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f4303b));
    }

    public dh(float f10) {
        a1.a(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f4303b = f10;
    }
}
