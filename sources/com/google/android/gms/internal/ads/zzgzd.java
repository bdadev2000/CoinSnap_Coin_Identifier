package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgzd implements zzggy {
    private final zzgnr zza;
    private final byte[] zzb;

    private zzgzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzgnr(bArr);
        this.zzb = bArr2;
    }

    public static zzggy zzb(zzgmb zzgmbVar) throws GeneralSecurityException {
        return new zzgzd(zzgmbVar.zzd().zzd(zzghh.zza()), zzgmbVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            return this.zza.zzb(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzgra.zzc(bArr3, bArr)) {
            byte[] bArr4 = this.zzb;
            return zzc(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
