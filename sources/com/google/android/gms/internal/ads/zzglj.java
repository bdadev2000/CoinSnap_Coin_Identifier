package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
final class zzglj extends ThreadLocal {
    public static final Cipher zza() {
        boolean zzf;
        try {
            Cipher cipher = (Cipher) zzgwc.zza.zza("ChaCha20-Poly1305");
            zzf = zzglk.zzf(cipher);
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
