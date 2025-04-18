package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
final class zzgwn extends ThreadLocal {
    public static final Cipher zza() {
        try {
            return (Cipher) zzgwc.zza.zza("AES/ECB/NoPadding");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
