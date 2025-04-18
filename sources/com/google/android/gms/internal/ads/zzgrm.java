package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgrm implements zzggi {
    private zzgrm(zzggi zzggiVar, zzgve zzgveVar, byte[] bArr) {
    }

    public static zzggi zza(zzgmz zzgmzVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgow zza = zzgmzVar.zza(zzgfv.zza());
        zzgtx zza2 = zzgua.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzggi zzggiVar = (zzggi) zzggm.zzb((zzgua) zza2.zzbr(), zzggi.class);
        zzgve zzc2 = zza.zzc();
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                } else {
                    zzc = zzgoa.zza.zzc();
                }
            }
            zzc = zzgoa.zza(zzgmzVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgoa.zzb(zzgmzVar.zzb().intValue()).zzc();
        }
        return new zzgrm(zzggiVar, zzc2, zzc);
    }
}
