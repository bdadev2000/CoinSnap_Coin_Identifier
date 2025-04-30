package com.google.android.gms.internal.play_billing;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzad {
    public static void zza(Object obj, Object obj2) {
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
