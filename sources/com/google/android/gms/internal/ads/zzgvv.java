package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzgvv implements zzgfm {
    private final zzglt zza;
    private final byte[] zzb;

    private zzgvv(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzglt(bArr);
        this.zzb = bArr2;
    }

    public static zzgfm zzb(zzgiq zzgiqVar) throws GeneralSecurityException {
        return new zzgvv(zzgiqVar.zzd().zzd(zzgfv.zza()), zzgiqVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzgpj.zzc(bArr3, bArr)) {
            byte[] bArr4 = this.zzb;
            return zzc(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
