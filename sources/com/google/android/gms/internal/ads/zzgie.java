package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgie {
    public static zzghx zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgwm zzf = zzgwm.zzf(bArr, zzhay.zza());
            zzgpl zzc = zzgpl.zzc();
            zzgqm zza = zzgqm.zza(zzf);
            if (!zzc.zzk(zza)) {
                return new zzgov(zza);
            }
            return zzc.zzb(zza);
        } catch (IOException e4) {
            throw new GeneralSecurityException("Failed to parse proto", e4);
        }
    }

    public static byte[] zzb(zzghx zzghxVar) throws GeneralSecurityException {
        return ((zzgqm) zzgpl.zzc().zze(zzghxVar, zzgqm.class)).zzc().zzaV();
    }
}
