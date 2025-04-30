package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzalp {
    public static void zza(zzalq zzalqVar, zzalu zzaluVar, zzev zzevVar) {
        for (int i9 = 0; i9 < zzalqVar.zza(); i9++) {
            long zzb = zzalqVar.zzb(i9);
            List zzc = zzalqVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i9 != zzalqVar.zza() - 1) {
                    long zzb2 = zzalqVar.zzb(i9 + 1) - zzalqVar.zzb(i9);
                    if (zzb2 > 0) {
                        zzevVar.zza(new zzaln(zzc, zzb, zzb2));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
