package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzgni extends zzgnj {
    public zzgni(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgnj
    public final zzgnh zza(byte[] bArr, int i2) throws InvalidKeyException {
        return new zzgng(bArr, i2);
    }
}
