package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public final class zzgnm extends zzgnn {
    public zzgnm(byte[] bArr, int i9) throws InvalidKeyException {
        super(bArr, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int[] zzb(int[] iArr, int i9) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzgnj.zzb(iArr2, this.zza);
            iArr2[12] = i9;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
