package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* renamed from: com.applovin.impl.do */
/* loaded from: classes.dex */
public final class Cdo extends gi {

    /* renamed from: d */
    public static final m2.a f4347d = new ss(13);

    /* renamed from: b */
    private final boolean f4348b;

    /* renamed from: c */
    private final boolean f4349c;

    public Cdo() {
        this.f4348b = false;
        this.f4349c = false;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static Cdo b(Bundle bundle) {
        boolean z10;
        if (bundle.getInt(a(0), -1) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
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
        if (this.f4349c != cdo.f4349c || this.f4348b != cdo.f4348b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f4348b), Boolean.valueOf(this.f4349c));
    }

    public Cdo(boolean z10) {
        this.f4348b = true;
        this.f4349c = z10;
    }
}
