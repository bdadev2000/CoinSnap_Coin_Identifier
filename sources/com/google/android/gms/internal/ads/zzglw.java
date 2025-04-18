package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzglw extends zzglu {
    public zzglw(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzglu
    public final zzgls zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzglv(bArr, i10);
    }
}
