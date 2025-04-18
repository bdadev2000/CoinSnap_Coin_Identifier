package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzglx implements zzgfm {
    private final zzgfm zza;
    private final byte[] zzb;

    private zzglx(zzgfm zzgfmVar, byte[] bArr) {
        this.zza = zzgfmVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgfm zzb(zzgmz zzgmzVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgow zza = zzgmzVar.zza(zzgfv.zza());
        zzgtx zza2 = zzgua.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzgfm zzgfmVar = (zzgfm) zzggm.zzb((zzgua) zza2.zzbr(), zzgfm.class);
        zzgve zzc2 = zza.zzc();
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc2)));
                    }
                } else {
                    zzc = zzgoa.zza.zzc();
                }
            }
            zzc = zzgoa.zza(zzgmzVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgoa.zzb(zzgmzVar.zzb().intValue()).zzc();
        }
        return new zzglx(zzgfmVar, zzc);
    }

    public static zzgfm zzc(zzgfm zzgfmVar, zzgwu zzgwuVar) {
        return new zzglx(zzgfmVar, zzgwuVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgpj.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
