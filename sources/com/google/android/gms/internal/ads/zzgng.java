package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzgng extends zzgnh {
    public zzgng(byte[] bArr, int i2) throws InvalidKeyException {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final int[] zzb(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzgnf.zzb(iArr2, this.zza);
        iArr2[12] = i2;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
