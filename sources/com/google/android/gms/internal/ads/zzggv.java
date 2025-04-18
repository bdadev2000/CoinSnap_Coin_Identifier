package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzggv implements zzgfm {
    private final zzgou zza;

    public /* synthetic */ zzggv(zzgou zzgouVar, zzggw zzggwVar) {
        this.zza = zzgouVar;
        if (zzgouVar.zzg()) {
            zzgnf zza = zzgnu.zzb().zza();
            zzgnj zza2 = zzgnm.zza(zzgouVar);
            zza.zza(zza2, "aead", "encrypt");
            zza.zza(zza2, "aead", "decrypt");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgos zzgosVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = ((zzgfm) zzgosVar.zzd()).zza(bArr, bArr2);
                    zzgosVar.zza();
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgos zzgosVar2 : this.zza.zzf(zzgfr.zza)) {
            try {
                byte[] zza2 = ((zzgfm) zzgosVar2.zzd()).zza(bArr, bArr2);
                zzgosVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
