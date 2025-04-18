package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzgoe {
    private static final Logger zza = Logger.getLogger(zzgoe.class.getName());
    private static final zzgoe zzb = new zzgoe();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgoe zzc() {
        return zzb;
    }

    private final synchronized zzghe zzg(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzghe) this.zzc.get(str);
    }

    private final synchronized void zzh(zzghe zzgheVar, boolean z2, boolean z3) throws GeneralSecurityException {
        try {
            String str = ((zzgon) zzgheVar).zza;
            if (this.zzd.containsKey(str) && !((Boolean) this.zzd.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            zzghe zzgheVar2 = (zzghe) this.zzc.get(str);
            if (zzgheVar2 != null && !zzgheVar2.getClass().equals(zzgheVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzgheVar2.getClass().getName(), zzgheVar.getClass().getName()));
            }
            this.zzc.putIfAbsent(str, zzgheVar);
            this.zzd.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzghe zza(String str, Class cls) throws GeneralSecurityException {
        zzghe zzg = zzg(str);
        if (zzg.zzb().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzb().toString();
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Primitive type ", name, " not supported by key manager of type ", valueOf, ", which only supports: ");
        t2.append(obj);
        throw new GeneralSecurityException(t2.toString());
    }

    public final zzghe zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzghe zzgheVar, boolean z2) throws GeneralSecurityException {
        zzf(zzgheVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzghe zzgheVar, int i2, boolean z2) throws GeneralSecurityException {
        if (!zzgnw.zza(i2)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgheVar, false, true);
    }
}
