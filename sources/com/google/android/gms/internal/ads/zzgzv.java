package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzgzv {
    public static final List zza(Object obj, long j3) {
        int i10;
        zzgzj zzgzjVar = (zzgzj) zzhbu.zzh(obj, j3);
        if (!zzgzjVar.zzc()) {
            int size = zzgzjVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzgzj zzf = zzgzjVar.zzf(i10);
            zzhbu.zzv(obj, j3, zzf);
            return zzf;
        }
        return zzgzjVar;
    }
}
