package com.google.android.gms.internal.ads;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class zzgvt implements zzgfm {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgvt(byte[] bArr, zzgwu zzgwuVar) throws GeneralSecurityException {
        if (zzgmh.zza(2)) {
            int i10 = zzgky.zza;
            zzgws.zza(bArr.length);
            this.zza = new SecretKeySpec(bArr, "AES");
            this.zzb = zzgwuVar.zzc();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzgfm zzb(zzghw zzghwVar) throws GeneralSecurityException {
        return new zzgvt(zzghwVar.zzd().zzd(zzgfv.zza()), zzghwVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Integer valueOf;
        if (bArr != null) {
            byte[] bArr3 = this.zzb;
            if (bArr.length >= bArr3.length + 28) {
                if (zzgpj.zzc(bArr3, bArr)) {
                    byte[] bArr4 = this.zzb;
                    int i10 = zzgky.zza;
                    if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                    }
                    if (valueOf != null) {
                        valueOf.intValue();
                    }
                    GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, bArr4.length, 12);
                    SecretKey secretKey = this.zza;
                    Cipher zza = zzgky.zza();
                    zza.init(2, secretKey, gCMParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        zza.updateAAD(bArr2);
                    }
                    return zza.doFinal(bArr, this.zzb.length + 12, (r1 - r7) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
