package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;

/* loaded from: classes.dex */
public final class mh implements InterfaceC0725m2 {

    /* renamed from: d, reason: collision with root package name */
    public static final mh f9206d = new mh(1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC0725m2.a f9207f = new I(26);

    /* renamed from: a, reason: collision with root package name */
    public final float f9208a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9209c;

    public mh(float f9) {
        this(f9, 1.0f);
    }

    public long a(long j7) {
        return j7 * this.f9209c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mh.class != obj.getClass()) {
            return false;
        }
        mh mhVar = (mh) obj;
        if (this.f9208a == mhVar.f9208a && this.b == mhVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.f9208a) + 527) * 31);
    }

    public String toString() {
        return yp.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9208a), Float.valueOf(this.b));
    }

    public mh(float f9, float f10) {
        AbstractC0669a1.a(f9 > 0.0f);
        AbstractC0669a1.a(f10 > 0.0f);
        this.f9208a = f9;
        this.b = f10;
        this.f9209c = Math.round(f9 * 1000.0f);
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ mh a(Bundle bundle) {
        return new mh(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    public mh a(float f9) {
        return new mh(f9, this.b);
    }
}
