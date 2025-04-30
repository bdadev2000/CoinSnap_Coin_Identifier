package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC0725m2;

/* loaded from: classes.dex */
public final class zk extends gi {

    /* renamed from: d */
    public static final InterfaceC0725m2.a f12661d = new C1(20);
    private final int b;

    /* renamed from: c */
    private final float f12662c;

    public zk(int i9) {
        AbstractC0669a1.a(i9 > 0, "maxStars must be a positive integer");
        this.b = i9;
        this.f12662c = -1.0f;
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public static zk b(Bundle bundle) {
        boolean z8 = false;
        if (bundle.getInt(a(0), -1) == 2) {
            z8 = true;
        }
        AbstractC0669a1.a(z8);
        int i9 = bundle.getInt(a(1), 5);
        float f9 = bundle.getFloat(a(2), -1.0f);
        if (f9 == -1.0f) {
            return new zk(i9);
        }
        return new zk(i9, f9);
    }

    public static /* synthetic */ zk d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        if (this.b != zkVar.b || this.f12662c != zkVar.f12662c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), Float.valueOf(this.f12662c));
    }

    public zk(int i9, float f9) {
        boolean z8 = false;
        AbstractC0669a1.a(i9 > 0, "maxStars must be a positive integer");
        if (f9 >= 0.0f && f9 <= i9) {
            z8 = true;
        }
        AbstractC0669a1.a(z8, "starRating is out of range [0, maxStars]");
        this.b = i9;
        this.f12662c = f9;
    }
}
