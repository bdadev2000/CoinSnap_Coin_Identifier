package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzgwt implements zzgfm {
    private final zzglw zza;
    private final byte[] zzb;

    private zzgwt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzglw(bArr);
        this.zzb = bArr2;
    }

    public static zzgfm zzb(zzgkg zzgkgVar) throws GeneralSecurityException {
        return new zzgwt(zzgkgVar.zzd().zzd(zzgfv.zza()), zzgkgVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            return this.zza.zzb(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
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
