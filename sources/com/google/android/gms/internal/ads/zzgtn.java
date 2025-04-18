package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgtn implements zzghr {
    private zzgtn(zzghr zzghrVar, zzgxf zzgxfVar, byte[] bArr) {
    }

    public static zzghr zza(zzgop zzgopVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgqr zza = zzgopVar.zza(zzghc.zza());
        zzgvz zza2 = zzgwb.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzghr zzghrVar = (zzghr) zzghv.zzb((zzgwb) zza2.zzbr(), zzghr.class);
        zzgxf zzc2 = zza.zzc();
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = zzgpr.zza.zzc();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            zzc = zzgpr.zza(zzgopVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgpr.zzb(zzgopVar.zzb().intValue()).zzc();
        }
        return new zzgtn(zzghrVar, zzc2, zzc);
    }
}
