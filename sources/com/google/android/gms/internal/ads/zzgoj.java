package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzgoj {
    private static final Logger zza = Logger.getLogger(zzgoj.class.getName());
    private static final zzgoj zzb = new zzgoj();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgoj zzc() {
        return zzb;
    }

    private final synchronized zzghj zzg(String str) throws GeneralSecurityException {
        if (this.zzc.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzghj) this.zzc.get(str);
    }

    private final synchronized void zzh(zzghj zzghjVar, boolean z8, boolean z9) throws GeneralSecurityException {
        try {
            String str = ((zzgos) zzghjVar).zza;
            if (this.zzd.containsKey(str) && !((Boolean) this.zzd.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            zzghj zzghjVar2 = (zzghj) this.zzc.get(str);
            if (zzghjVar2 != null && !zzghjVar2.getClass().equals(zzghjVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + zzghjVar2.getClass().getName() + ", cannot be re-registered with " + zzghjVar.getClass().getName());
            }
            this.zzc.putIfAbsent(str, zzghjVar);
            this.zzd.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzghj zza(String str, Class cls) throws GeneralSecurityException {
        zzghj zzg = zzg(str);
        if (zzg.zzb().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzb().toString();
        StringBuilder o3 = o.o("Primitive type ", name, " not supported by key manager of type ", valueOf, ", which only supports: ");
        o3.append(obj);
        throw new GeneralSecurityException(o3.toString());
    }

    public final zzghj zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzghj zzghjVar, boolean z8) throws GeneralSecurityException {
        zzf(zzghjVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzghj zzghjVar, int i9, boolean z8) throws GeneralSecurityException {
        if (zzgoc.zza(i9)) {
            zzh(zzghjVar, false, true);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
