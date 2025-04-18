package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;

/* loaded from: classes.dex */
public final class na extends ki {
    public static final o2.a d = new rs(25);

    /* renamed from: b */
    private final boolean f25686b;

    /* renamed from: c */
    private final boolean f25687c;

    public na() {
        this.f25686b = false;
        this.f25687c = false;
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public static na b(Bundle bundle) {
        b1.a(bundle.getInt(a(0), -1) == 0);
        return bundle.getBoolean(a(1), false) ? new na(bundle.getBoolean(a(2), false)) : new na();
    }

    public static /* synthetic */ na d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return this.f25687c == naVar.f25687c && this.f25686b == naVar.f25686b;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f25686b), Boolean.valueOf(this.f25687c));
    }

    public na(boolean z2) {
        this.f25686b = true;
        this.f25687c = z2;
    }
}
