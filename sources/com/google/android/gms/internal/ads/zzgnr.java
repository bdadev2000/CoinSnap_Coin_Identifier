package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public final class zzgnr extends zzgnp {
    public zzgnr(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgnp
    public final zzgnn zza(byte[] bArr, int i9) throws InvalidKeyException {
        return new zzgnq(bArr, i9);
    }
}
