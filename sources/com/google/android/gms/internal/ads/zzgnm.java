package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzgnm implements zzggt {
    private final zzggt zza;
    private final byte[] zzb;

    private zzgnm(zzggt zzggtVar, byte[] bArr) {
        this.zza = zzggtVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzggt zzb(zzgop zzgopVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgqr zza = zzgopVar.zza(zzghc.zza());
        zzgvz zza2 = zzgwb.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzggt zzggtVar = (zzggt) zzghv.zzb((zzgwb) zza2.zzbr(), zzggt.class);
        zzgxf zzc2 = zza.zzc();
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = zzgpr.zza.zzc();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc2)));
                }
            }
            zzc = zzgpr.zza(zzgopVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgpr.zzb(zzgopVar.zzb().intValue()).zzc();
        }
        return new zzgnm(zzggtVar, zzc);
    }

    public static zzggt zzc(zzggt zzggtVar, zzgyx zzgyxVar) {
        return new zzgnm(zzggtVar, zzgyxVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgrg.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
