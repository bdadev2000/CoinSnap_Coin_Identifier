package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgnv {
    private static final zzgnv zza = new zzgnv();
    private final Map zzb = new HashMap();

    public static zzgnv zzb() {
        return zza;
    }

    public final synchronized zzggj zza(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey("AES128_GCM")) {
        } else {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzggj) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzggj zzggjVar) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
            if (((zzggj) this.zzb.get(str)).equals(zzggjVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzggjVar));
        }
        this.zzb.put(str, zzggjVar);
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzggj) entry.getValue());
        }
    }
}
