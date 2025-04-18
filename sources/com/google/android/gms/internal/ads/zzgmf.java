package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
final class zzgmf extends ThreadLocal {
    public static final Cipher zza() {
        boolean zzd;
        try {
            Cipher cipher = (Cipher) zzgwc.zza.zza("AES/GCM-SIV/NoPadding");
            zzd = zzgmg.zzd(cipher);
            if (!zzd) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
