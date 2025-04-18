package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public final class zzbcu {
    public static boolean zza(@Nullable zzbdc zzbdcVar, @Nullable zzbcz zzbczVar, String... strArr) {
        if (zzbczVar == null) {
            return false;
        }
        zzbdcVar.zze(zzbczVar, com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), strArr);
        return true;
    }
}
