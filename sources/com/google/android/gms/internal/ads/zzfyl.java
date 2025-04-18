package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfyl {
    public static int zza(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            } else {
                throw new NullPointerException(e.f("null value in entry: ", obj.toString(), "=null"));
            }
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
