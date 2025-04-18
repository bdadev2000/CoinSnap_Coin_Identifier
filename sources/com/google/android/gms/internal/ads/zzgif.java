package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzgif implements zzggt {
    private final zzgqp zza;

    public /* synthetic */ zzgif(zzgqp zzgqpVar, zzgie zzgieVar) {
        this.zza = zzgqpVar;
        if (zzgqpVar.zzg()) {
            zzgov zza = zzgpl.zzb().zza();
            zzgpa zza2 = zzgpd.zza(zzgqpVar);
            zza.zza(zza2, "aead", "encrypt");
            zza.zza(zza2, "aead", "decrypt");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgqn zzgqnVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = ((zzggt) zzgqnVar.zzd()).zza(bArr, bArr2);
                    zzgqnVar.zza();
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgqn zzgqnVar2 : this.zza.zzf(zzggy.zza)) {
            try {
                byte[] zza2 = ((zzggt) zzgqnVar2.zzd()).zza(bArr, bArr2);
                zzgqnVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
