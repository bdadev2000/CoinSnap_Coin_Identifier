package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzdb {
    public static int zza(int i10, int i11, int i12) {
        if (i10 < 0 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
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

    public static void zzd(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z10, Object obj) {
        if (z10) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzg(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
