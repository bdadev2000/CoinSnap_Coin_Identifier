package com.google.android.gms.internal.ads;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgxu implements zzggt {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgxu(byte[] bArr, zzgyx zzgyxVar) throws GeneralSecurityException {
        if (!zzgnw.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgmn.zza;
        zzgyv.zza(bArr.length);
        this.zza = new SecretKeySpec(bArr, "AES");
        this.zzb = zzgyxVar.zzc();
    }

    public static zzggt zzb(zzgjk zzgjkVar) throws GeneralSecurityException {
        return new zzgxu(zzgjkVar.zzd().zzd(zzghc.zza()), zzgjkVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgrg.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzb;
        int i2 = zzgmn.zza;
        Integer valueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        if (valueOf != null) {
            valueOf.intValue();
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, bArr4.length, 12);
        SecretKey secretKey = this.zza;
        Cipher zza = zzgmn.zza();
        zza.init(2, secretKey, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            zza.updateAAD(bArr2);
        }
        return zza.doFinal(bArr, this.zzb.length + 12, (r1 - r7) - 12);
    }
}
