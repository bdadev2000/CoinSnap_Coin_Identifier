package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgpm {
    private static final zzgpm zza = new zzgpm();
    private final Map zzb = new HashMap();

    public static zzgpm zzb() {
        return zza;
    }

    public final synchronized zzghs zza(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzghs) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzghs zzghsVar) throws GeneralSecurityException {
        try {
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, zzghsVar);
                return;
            }
            if (((zzghs) this.zzb.get(str)).equals(zzghsVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzghsVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzghs) entry.getValue());
        }
    }
}
