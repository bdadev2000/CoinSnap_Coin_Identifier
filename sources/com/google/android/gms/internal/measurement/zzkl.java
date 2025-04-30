package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzkl<K, V> {
    public static <K, V> int zza(zzkk<K, V> zzkkVar, K k6, V v6) {
        return zzjd.zza(zzkkVar.zza, 1, k6) + zzjd.zza(zzkkVar.zzc, 2, v6);
    }

    public static <K, V> void zza(zzit zzitVar, zzkk<K, V> zzkkVar, K k6, V v6) throws IOException {
        zzjd.zza(zzitVar, zzkkVar.zza, 1, k6);
        zzjd.zza(zzitVar, zzkkVar.zzc, 2, v6);
    }
}
