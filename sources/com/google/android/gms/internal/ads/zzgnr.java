package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgnr {
    private static final zzgnr zza = new zzgnr();
    private final Map zzb = new HashMap();

    public static zzgnr zza() {
        return zza;
    }

    public final synchronized void zzb(zzgnq zzgnqVar, Class cls) throws GeneralSecurityException {
        zzgnq zzgnqVar2 = (zzgnq) this.zzb.get(cls);
        if (zzgnqVar2 != null && !zzgnqVar2.equals(zzgnqVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.zzb.put(cls, zzgnqVar);
    }
}
