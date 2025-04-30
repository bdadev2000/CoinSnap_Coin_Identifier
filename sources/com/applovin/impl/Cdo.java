package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC0725m2;

/* renamed from: com.applovin.impl.do */
/* loaded from: classes.dex */
public final class Cdo extends gi {

    /* renamed from: d */
    public static final InterfaceC0725m2.a f7337d = new I(14);
    private final boolean b;

    /* renamed from: c */
    private final boolean f7338c;

    public Cdo() {
        this.b = false;
        this.f7338c = false;
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public static Cdo b(Bundle bundle) {
        boolean z8;
        if (bundle.getInt(a(0), -1) == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        if (bundle.getBoolean(a(1), false)) {
            return new Cdo(bundle.getBoolean(a(2), false));
        }
        return new Cdo();
    }

    public static /* synthetic */ Cdo d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cdo)) {
            return false;
        }
        Cdo cdo = (Cdo) obj;
        if (this.f7338c != cdo.f7338c || this.b != cdo.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.b), Boolean.valueOf(this.f7338c));
    }

    public Cdo(boolean z8) {
        this.b = true;
        this.f7338c = z8;
    }
}
