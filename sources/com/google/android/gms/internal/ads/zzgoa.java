package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
final class zzgoa extends ThreadLocal {
    public static final Cipher zza() {
        boolean zze;
        try {
            Cipher cipher = (Cipher) zzgyn.zza.zza("AES/GCM-SIV/NoPadding");
            zze = zzgob.zze(cipher);
            if (!zze) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
