package com.iab.omid.library.applovin.devicevolume;

/* loaded from: classes3.dex */
public class a {
    public float a(int i9, int i10) {
        if (i10 <= 0 || i9 <= 0) {
            return 0.0f;
        }
        float f9 = i9 / i10;
        if (f9 > 1.0f) {
            return 1.0f;
        }
        return f9;
    }
}
