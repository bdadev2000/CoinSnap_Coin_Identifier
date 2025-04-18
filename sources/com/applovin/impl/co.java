package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;

/* loaded from: classes3.dex */
public final class co extends ki {
    public static final o2.a d = new rs(9);

    /* renamed from: b */
    private final boolean f23342b;

    /* renamed from: c */
    private final boolean f23343c;

    public co() {
        this.f23342b = false;
        this.f23343c = false;
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public static co b(Bundle bundle) {
        b1.a(bundle.getInt(a(0), -1) == 3);
        return bundle.getBoolean(a(1), false) ? new co(bundle.getBoolean(a(2), false)) : new co();
    }

    public static /* synthetic */ co d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return this.f23343c == coVar.f23343c && this.f23342b == coVar.f23342b;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f23342b), Boolean.valueOf(this.f23343c));
    }

    public co(boolean z2) {
        this.f23342b = true;
        this.f23343c = z2;
    }
}
