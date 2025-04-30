package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgpd {
    private static final zzgpd zza = new zzgpd();
    private final Map zzb = new HashMap();

    public static zzgpd zza() {
        return zza;
    }

    public final synchronized void zzb(zzgpc zzgpcVar, Class cls) throws GeneralSecurityException {
        try {
            zzgpc zzgpcVar2 = (zzgpc) this.zzb.get(cls);
            if (zzgpcVar2 != null && !zzgpcVar2.equals(zzgpcVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zzgpcVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
