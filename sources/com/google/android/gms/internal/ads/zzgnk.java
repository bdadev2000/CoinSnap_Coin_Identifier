package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzgnk extends zzgnh {
    public zzgnk(byte[] bArr, int i2) throws InvalidKeyException {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final int[] zzb(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzgnf.zzb(iArr2, zzgnf.zzd(this.zza, iArr));
        iArr2[12] = i2;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
