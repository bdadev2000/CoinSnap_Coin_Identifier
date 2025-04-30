package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzeq {
    public static int zza(int i9, int i10, int i11) {
        if (i9 >= 0 && i9 < i11) {
            return i9;
        }
        throw new IndexOutOfBoundsException();
    }

    public static Object zzb(@Nullable Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static String zzc(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static void zzd(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void zzg(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }
}
