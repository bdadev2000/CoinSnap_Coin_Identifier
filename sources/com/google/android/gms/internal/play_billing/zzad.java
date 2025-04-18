package com.google.android.gms.internal.play_billing;

import com.applovin.impl.mediation.ads.e;

/* loaded from: classes3.dex */
final class zzad {
    public static void zza(Object obj, Object obj2) {
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
