package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC0725m2;

/* loaded from: classes.dex */
public final class dh extends gi {

    /* renamed from: c */
    public static final InterfaceC0725m2.a f7297c = new I(13);
    private final float b;

    public dh() {
        this.b = -1.0f;
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public static dh b(Bundle bundle) {
        boolean z8 = false;
        if (bundle.getInt(a(0), -1) == 1) {
            z8 = true;
        }
        AbstractC0669a1.a(z8);
        float f9 = bundle.getFloat(a(1), -1.0f);
        if (f9 == -1.0f) {
            return new dh();
        }
        return new dh(f9);
    }

    public static /* synthetic */ dh d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dh) || this.b != ((dh) obj).b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.b));
    }

    public dh(float f9) {
        AbstractC0669a1.a(f9 >= 0.0f && f9 <= 100.0f, "percent must be in the range of [0, 100]");
        this.b = f9;
    }
}
