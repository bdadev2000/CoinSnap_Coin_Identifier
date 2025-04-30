package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class p extends LruCache {
    public p(int i9) {
        super(i9);
    }

    @Override // android.util.LruCache
    public int sizeOf(String str, Bitmap bitmap) {
        G7.j.e(bitmap, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return bitmap.getByteCount() / 1024;
    }
}
