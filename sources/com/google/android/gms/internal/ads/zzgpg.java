package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgpg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpf zzb = new zzgpf() { // from class: com.google.android.gms.internal.ads.zzgpe
        @Override // com.google.android.gms.internal.ads.zzgpf
        public final zzghd zza(zzghs zzghsVar, Integer num) {
            int i2 = zzgpg.zza;
            zzgwf zzc2 = ((zzgoq) zzghsVar).zzb().zzc();
            zzghe zzb2 = zzgoe.zzc().zzb(zzc2.zzi());
            if (!zzgoe.zzc().zze(zzc2.zzi())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            zzgwb zza2 = zzb2.zza(zzc2.zzh());
            return new zzgop(zzgqr.zza(zza2.zzg(), zza2.zzf(), zza2.zzc(), zzc2.zzg(), num), zzghc.zza());
        }
    };
    private static final zzgpg zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgpg zzb() {
        return zzc;
    }

    private final synchronized zzghd zzd(zzghs zzghsVar, Integer num) throws GeneralSecurityException {
        zzgpf zzgpfVar;
        zzgpfVar = (zzgpf) this.zzd.get(zzghsVar.getClass());
        if (zzgpfVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + zzghsVar.toString() + ": no key creator for this class was registered.");
        }
        return zzgpfVar.zza(zzghsVar, num);
    }

    private static zzgpg zze() {
        zzgpg zzgpgVar = new zzgpg();
        try {
            zzgpgVar.zzc(zzb, zzgoq.class);
            return zzgpgVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zzghd zza(zzghs zzghsVar, Integer num) throws GeneralSecurityException {
        return zzd(zzghsVar, num);
    }

    public final synchronized void zzc(zzgpf zzgpfVar, Class cls) throws GeneralSecurityException {
        try {
            zzgpf zzgpfVar2 = (zzgpf) this.zzd.get(cls);
            if (zzgpfVar2 != null && !zzgpfVar2.equals(zzgpfVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.zzd.put(cls, zzgpfVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
