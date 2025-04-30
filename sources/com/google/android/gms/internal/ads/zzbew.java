package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes2.dex */
public final class zzbew {
    public static boolean zza(@Nullable zzbfe zzbfeVar, @Nullable zzbfb zzbfbVar, String... strArr) {
        if (zzbfbVar == null) {
            return false;
        }
        zzbfeVar.zze(zzbfbVar, com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime(), strArr);
        return true;
    }
}
