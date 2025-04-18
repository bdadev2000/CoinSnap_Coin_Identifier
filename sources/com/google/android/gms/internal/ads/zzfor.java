package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzfor {
    public static void zza() {
        if (!zzfmu.zzb()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void zzc(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void zzd(String str, int i10, String str2) {
        if (str.length() > 256) {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
    }
}
