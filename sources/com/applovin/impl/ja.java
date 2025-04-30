package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC0725m2;

/* loaded from: classes.dex */
public final class ja extends gi {

    /* renamed from: d */
    public static final InterfaceC0725m2.a f8421d = new I(19);
    private final boolean b;

    /* renamed from: c */
    private final boolean f8422c;

    public ja() {
        this.b = false;
        this.f8422c = false;
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public static ja b(Bundle bundle) {
        boolean z8;
        if (bundle.getInt(a(0), -1) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
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
        if (this.f8422c != jaVar.f8422c || this.b != jaVar.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.b), Boolean.valueOf(this.f8422c));
    }

    public ja(boolean z8) {
        this.b = true;
        this.f8422c = z8;
    }
}
