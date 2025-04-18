package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzakp {
    public static void zza(zzakq zzakqVar, zzaku zzakuVar, zzdn zzdnVar) {
        if (zzakqVar.zza() != 0) {
            for (int i2 = 0; i2 < zzakqVar.zza(); i2++) {
                long zzb = zzakqVar.zzb(i2);
                List zzc = zzakqVar.zzc(zzb);
                if (!zzc.isEmpty()) {
                    if (i2 == zzakqVar.zza() - 1) {
                        throw new IllegalStateException();
                    }
                    long zzb2 = zzakqVar.zzb(i2 + 1) - zzakqVar.zzb(i2);
                    if (zzb2 > 0) {
                        zzdnVar.zza(new zzakn(zzc, zzb, zzb2));
                    }
                }
            }
        }
    }
}
