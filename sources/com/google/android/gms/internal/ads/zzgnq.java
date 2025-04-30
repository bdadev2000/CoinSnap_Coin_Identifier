package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public final class zzgnq extends zzgnn {
    public zzgnq(byte[] bArr, int i9) throws InvalidKeyException {
        super(bArr, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int[] zzb(int[] iArr, int i9) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            zzgnj.zzb(iArr2, zzgnj.zzd(this.zza, iArr));
            iArr2[12] = i9;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
