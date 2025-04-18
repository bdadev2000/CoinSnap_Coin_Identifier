package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzghy {
    public static zzghs zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgwf zzf = zzgwf.zzf(bArr, zzhao.zza());
            zzgpq zzc = zzgpq.zzc();
            zzgqs zza = zzgqs.zza(zzf);
            return !zzc.zzk(zza) ? new zzgoq(zza) : zzc.zzb(zza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzghs zzghsVar) throws GeneralSecurityException {
        return ((zzgqs) zzgpq.zzc().zze(zzghsVar, zzgqs.class)).zzc().zzaV();
    }
}
