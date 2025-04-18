package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class mh implements m2 {

    /* renamed from: d, reason: collision with root package name */
    public static final mh f6271d = new mh(1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final m2.a f6272f = new ss(25);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6273b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6274c;

    public mh(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j3) {
        return j3 * this.f6274c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mh.class != obj.getClass()) {
            return false;
        }
        mh mhVar = (mh) obj;
        if (this.a == mhVar.a && this.f6273b == mhVar.f6273b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f6273b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public String toString() {
        return yp.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.f6273b));
    }

    public mh(float f10, float f11) {
        a1.a(f10 > 0.0f);
        a1.a(f11 > 0.0f);
        this.a = f10;
        this.f6273b = f11;
        this.f6274c = Math.round(f10 * 1000.0f);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ mh a(Bundle bundle) {
        return new mh(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    public mh a(float f10) {
        return new mh(f10, this.f6273b);
    }
}
