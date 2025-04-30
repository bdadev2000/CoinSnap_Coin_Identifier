package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgqr {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgqr() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgqr zza(zzgon zzgonVar) throws GeneralSecurityException {
        zzgqt zzgqtVar = new zzgqt(zzgonVar.zzd(), zzgonVar.zzc(), null);
        if (this.zzb.containsKey(zzgqtVar)) {
            zzgon zzgonVar2 = (zzgon) this.zzb.get(zzgqtVar);
            if (!zzgonVar2.equals(zzgonVar) || !zzgonVar.equals(zzgonVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgqtVar.toString()));
            }
        } else {
            this.zzb.put(zzgqtVar, zzgonVar);
        }
        return this;
    }

    public final zzgqr zzb(zzgor zzgorVar) throws GeneralSecurityException {
        zzgqv zzgqvVar = new zzgqv(zzgorVar.zzc(), zzgorVar.zzd(), null);
        if (this.zza.containsKey(zzgqvVar)) {
            zzgor zzgorVar2 = (zzgor) this.zza.get(zzgqvVar);
            if (!zzgorVar2.equals(zzgorVar) || !zzgorVar.equals(zzgorVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgqvVar.toString()));
            }
        } else {
            this.zza.put(zzgqvVar, zzgorVar);
        }
        return this;
    }

    public final zzgqr zzc(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgqt zzgqtVar = new zzgqt(zzgpqVar.zzd(), zzgpqVar.zzc(), null);
        if (this.zzd.containsKey(zzgqtVar)) {
            zzgpq zzgpqVar2 = (zzgpq) this.zzd.get(zzgqtVar);
            if (!zzgpqVar2.equals(zzgpqVar) || !zzgpqVar.equals(zzgpqVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgqtVar.toString()));
            }
        } else {
            this.zzd.put(zzgqtVar, zzgpqVar);
        }
        return this;
    }

    public final zzgqr zzd(zzgpu zzgpuVar) throws GeneralSecurityException {
        zzgqv zzgqvVar = new zzgqv(zzgpuVar.zzc(), zzgpuVar.zzd(), null);
        if (this.zzc.containsKey(zzgqvVar)) {
            zzgpu zzgpuVar2 = (zzgpu) this.zzc.get(zzgqvVar);
            if (!zzgpuVar2.equals(zzgpuVar) || !zzgpuVar.equals(zzgpuVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgqvVar.toString()));
            }
        } else {
            this.zzc.put(zzgqvVar, zzgpuVar);
        }
        return this;
    }

    public zzgqr(zzgqx zzgqxVar) {
        this.zza = new HashMap(zzgqx.zzf(zzgqxVar));
        this.zzb = new HashMap(zzgqx.zze(zzgqxVar));
        this.zzc = new HashMap(zzgqx.zzh(zzgqxVar));
        this.zzd = new HashMap(zzgqx.zzg(zzgqxVar));
    }
}
