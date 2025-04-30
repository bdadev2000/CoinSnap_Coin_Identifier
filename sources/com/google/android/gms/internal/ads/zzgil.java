package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzgil implements zzggy {
    private final zzgqk zza;
    private final zzgtl zzb;
    private final zzgtl zzc;

    public /* synthetic */ zzgil(zzgqk zzgqkVar, zzgik zzgikVar) {
        zzgtl zzgtlVar;
        this.zza = zzgqkVar;
        if (zzgqkVar.zzg()) {
            zzgtm zzb = zzgpg.zza().zzb();
            zzgtr zza = zzgoy.zza(zzgqkVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzgtlVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzgtlVar = zzgoy.zza;
            this.zzb = zzgtlVar;
        }
        this.zzc = zzgtlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgqi zzgqiVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = ((zzggy) zzgqiVar.zze()).zza(bArr, bArr2);
                    zzgqiVar.zza();
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgqi zzgqiVar2 : this.zza.zzf(zzghd.zza)) {
            try {
                byte[] zza2 = ((zzggy) zzgqiVar2.zze()).zza(bArr, bArr2);
                zzgqiVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
