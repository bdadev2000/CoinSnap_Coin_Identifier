package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzhcc {
    public static final List zza(Object obj, long j2) {
        zzhbq zzhbqVar = (zzhbq) zzhef.zzh(obj, j2);
        if (zzhbqVar.zzc()) {
            return zzhbqVar;
        }
        int size = zzhbqVar.size();
        zzhbq zzf = zzhbqVar.zzf(size == 0 ? 10 : size + size);
        zzhef.zzv(obj, j2, zzf);
        return zzf;
    }
}
