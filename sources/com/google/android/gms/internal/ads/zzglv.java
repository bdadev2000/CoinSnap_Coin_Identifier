package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzglv extends zzgls {
    public zzglv(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgls
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzgls
    public final int[] zzb(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            zzglq.zzb(iArr2, zzglq.zzd(this.zza, iArr));
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
