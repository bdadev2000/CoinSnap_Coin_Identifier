package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgns implements zzggy {
    private final zzggy zza;
    private final byte[] zzb;

    private zzgns(zzggy zzggyVar, byte[] bArr) {
        this.zza = zzggyVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzggy zzb(zzgou zzgouVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgql zza = zzgouVar.zza(zzghh.zza());
        zzgwe zza2 = zzgwh.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzggy zzggyVar = (zzggy) zzgib.zzb((zzgwh) zza2.zzbr(), zzggy.class);
        zzgxn zzc2 = zza.zzc();
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc2)));
                    }
                } else {
                    zzc = zzgpm.zza.zzc();
                }
            }
            zzc = zzgpm.zza(zzgouVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgpm.zzb(zzgouVar.zzb().intValue()).zzc();
        }
        return new zzgns(zzggyVar, zzc);
    }

    public static zzggy zzc(zzggy zzggyVar, zzgze zzgzeVar) {
        return new zzgns(zzggyVar, zzgzeVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgra.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
