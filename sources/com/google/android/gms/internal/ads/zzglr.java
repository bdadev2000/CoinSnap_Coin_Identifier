package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzglr extends zzgls {
    public zzglr(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgls
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzgls
    public final int[] zzb(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzglq.zzb(iArr2, this.zza);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
