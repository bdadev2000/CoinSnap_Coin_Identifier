package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
final class zzgnk extends ThreadLocal {
    public static final Cipher zza() {
        try {
            return (Cipher) zzgyn.zza.zza("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
