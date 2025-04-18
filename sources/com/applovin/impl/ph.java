package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;

/* loaded from: classes2.dex */
public final class ph implements o2 {
    public static final ph d = new ph(1.0f);

    /* renamed from: f */
    public static final o2.a f26058f = new ru(0);

    /* renamed from: a */
    public final float f26059a;

    /* renamed from: b */
    public final float f26060b;

    /* renamed from: c */
    private final int f26061c;

    public ph(float f2) {
        this(f2, 1.0f);
    }

    public static /* synthetic */ ph b(Bundle bundle) {
        return a(bundle);
    }

    public long a(long j2) {
        return j2 * this.f26061c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ph.class != obj.getClass()) {
            return false;
        }
        ph phVar = (ph) obj;
        return this.f26059a == phVar.f26059a && this.f26060b == phVar.f26060b;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f26060b) + ((Float.floatToRawIntBits(this.f26059a) + 527) * 31);
    }

    public String toString() {
        return xp.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f26059a), Float.valueOf(this.f26060b));
    }

    public ph(float f2, float f3) {
        b1.a(f2 > 0.0f);
        b1.a(f3 > 0.0f);
        this.f26059a = f2;
        this.f26060b = f3;
        this.f26061c = Math.round(f2 * 1000.0f);
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public static /* synthetic */ ph a(Bundle bundle) {
        return new ph(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    public ph a(float f2) {
        return new ph(f2, this.f26060b);
    }
}
