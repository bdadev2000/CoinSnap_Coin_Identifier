package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgph {
    private static final zzgph zza = new zzgph();
    private final Map zzb = new HashMap();

    public static zzgph zzb() {
        return zza;
    }

    public final synchronized zzghx zza(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey("AES128_GCM")) {
        } else {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzghx) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzghx zzghxVar) throws GeneralSecurityException {
        try {
            if (this.zzb.containsKey(str)) {
                if (((zzghx) this.zzb.get(str)).equals(zzghxVar)) {
                    return;
                }
                throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzghxVar));
            }
            this.zzb.put(str, zzghxVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzghx) entry.getValue());
        }
    }
}
