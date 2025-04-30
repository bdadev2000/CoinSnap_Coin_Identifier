package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgth implements zzghw {
    private final zzghw zza;
    private final zzgxn zzb;
    private final byte[] zzc;

    private zzgth(zzghw zzghwVar, zzgxn zzgxnVar, byte[] bArr) {
        this.zza = zzghwVar;
        this.zzb = zzgxnVar;
        this.zzc = bArr;
    }

    public static zzghw zza(zzgou zzgouVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgql zza = zzgouVar.zza(zzghh.zza());
        zzgwe zza2 = zzgwh.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzghw zzghwVar = (zzghw) zzgib.zzb((zzgwh) zza2.zzbr(), zzghw.class);
        zzgxn zzc2 = zza.zzc();
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                } else {
                    zzc = zzgpm.zza.zzc();
                }
            }
            zzc = zzgpm.zza(zzgouVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgpm.zzb(zzgouVar.zzb().intValue()).zzc();
        }
        return new zzgth(zzghwVar, zzc2, zzc);
    }
}
