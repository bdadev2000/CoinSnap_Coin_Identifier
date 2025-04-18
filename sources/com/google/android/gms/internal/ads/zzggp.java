package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzggp {
    public static zzggj zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgue zzf = zzgue.zzf(bArr, zzgyh.zza());
            zzgnz zzc = zzgnz.zzc();
            zzgox zza = zzgox.zza(zzf);
            if (!zzc.zzk(zza)) {
                return new zzgna(zza);
            }
            return zzc.zzb(zza);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static byte[] zzb(zzggj zzggjVar) throws GeneralSecurityException {
        return ((zzgox) zzgnz.zzc().zze(zzggjVar, zzgox.class)).zzc().zzaV();
    }
}
