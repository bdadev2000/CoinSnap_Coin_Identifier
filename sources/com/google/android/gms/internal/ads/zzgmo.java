package com.google.android.gms.internal.ads;

import a4.j;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzgmo {
    private static final Logger zza = Logger.getLogger(zzgmo.class.getName());
    private static final zzgmo zzb = new zzgmo();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgmo zzc() {
        return zzb;
    }

    private final synchronized zzgfx zzg(String str) throws GeneralSecurityException {
        if (this.zzc.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgfx) this.zzc.get(str);
    }

    private final synchronized void zzh(zzgfx zzgfxVar, boolean z10, boolean z11) throws GeneralSecurityException {
        String str = ((zzgmx) zzgfxVar).zza;
        if (this.zzd.containsKey(str) && !((Boolean) this.zzd.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        zzgfx zzgfxVar2 = (zzgfx) this.zzc.get(str);
        if (zzgfxVar2 != null && !zzgfxVar2.getClass().equals(zzgfxVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzgfxVar2.getClass().getName(), zzgfxVar.getClass().getName()));
        }
        this.zzc.putIfAbsent(str, zzgfxVar);
        this.zzd.put(str, Boolean.TRUE);
    }

    public final zzgfx zza(String str, Class cls) throws GeneralSecurityException {
        zzgfx zzg = zzg(str);
        if (zzg.zzb().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzb().toString();
        StringBuilder p10 = j.p("Primitive type ", name, " not supported by key manager of type ", valueOf, ", which only supports: ");
        p10.append(obj);
        throw new GeneralSecurityException(p10.toString());
    }

    public final zzgfx zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzgfx zzgfxVar, boolean z10) throws GeneralSecurityException {
        zzf(zzgfxVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgfx zzgfxVar, int i10, boolean z10) throws GeneralSecurityException {
        if (zzgmh.zza(i10)) {
            zzh(zzgfxVar, false, true);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
