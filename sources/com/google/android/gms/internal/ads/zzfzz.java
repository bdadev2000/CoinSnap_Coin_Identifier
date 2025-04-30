package com.google.android.gms.internal.ads;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzfzz {
    public static int zza(int i9, String str) {
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i9);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            } else {
                throw new NullPointerException(AbstractC2914a.e("null value in entry: ", obj.toString(), "=null"));
            }
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
