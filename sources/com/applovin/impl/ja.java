package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class ja extends gi {

    /* renamed from: d */
    public static final m2.a f5463d = new ss(18);

    /* renamed from: b */
    private final boolean f5464b;

    /* renamed from: c */
    private final boolean f5465c;

    public ja() {
        this.f5464b = false;
        this.f5465c = false;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static ja b(Bundle bundle) {
        boolean z10;
        if (bundle.getInt(a(0), -1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        if (bundle.getBoolean(a(1), false)) {
            return new ja(bundle.getBoolean(a(2), false));
        }
        return new ja();
    }

    public static /* synthetic */ ja d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        if (this.f5465c != jaVar.f5465c || this.f5464b != jaVar.f5464b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f5464b), Boolean.valueOf(this.f5465c));
    }

    public ja(boolean z10) {
        this.f5464b = true;
        this.f5465c = z10;
    }
}
