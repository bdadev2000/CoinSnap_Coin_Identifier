package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
final class zzgnc extends ThreadLocal {
    public static final Cipher zza() {
        boolean zzf;
        try {
            Cipher cipher = (Cipher) zzgyn.zza.zza("ChaCha20-Poly1305");
            zzf = zzgnd.zzf(cipher);
            if (!zzf) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
