package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgpb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpa zzb = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgoz
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            int i9 = zzgpb.zza;
            zzgwm zzc2 = ((zzgov) zzghxVar).zzb().zzc();
            zzghj zzb2 = zzgoj.zzc().zzb(zzc2.zzi());
            if (zzgoj.zzc().zze(zzc2.zzi())) {
                zzgwh zza2 = zzb2.zza(zzc2.zzh());
                return new zzgou(zzgql.zza(zza2.zzg(), zza2.zzf(), zza2.zzc(), zzc2.zzg(), num), zzghh.zza());
            }
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
    };
    private static final zzgpb zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgpb zzb() {
        return zzc;
    }

    private final synchronized zzghi zzd(zzghx zzghxVar, Integer num) throws GeneralSecurityException {
        zzgpa zzgpaVar;
        zzgpaVar = (zzgpa) this.zzd.get(zzghxVar.getClass());
        if (zzgpaVar != null) {
        } else {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + zzghxVar.toString() + ": no key creator for this class was registered.");
        }
        return zzgpaVar.zza(zzghxVar, num);
    }

    private static zzgpb zze() {
        zzgpb zzgpbVar = new zzgpb();
        try {
            zzgpbVar.zzc(zzb, zzgov.class);
            return zzgpbVar;
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException("unexpected error.", e4);
        }
    }

    public final zzghi zza(zzghx zzghxVar, Integer num) throws GeneralSecurityException {
        return zzd(zzghxVar, num);
    }

    public final synchronized void zzc(zzgpa zzgpaVar, Class cls) throws GeneralSecurityException {
        try {
            zzgpa zzgpaVar2 = (zzgpa) this.zzd.get(cls);
            if (zzgpaVar2 != null && !zzgpaVar2.equals(zzgpaVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.zzd.put(cls, zzgpaVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
