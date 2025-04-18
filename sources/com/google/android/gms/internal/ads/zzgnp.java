package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgnp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgno zzb = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgnn
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            int i10 = zzgnp.zza;
            zzgue zzc2 = ((zzgna) zzggjVar).zzb().zzc();
            zzgfx zzb2 = zzgmo.zzc().zzb(zzc2.zzi());
            if (zzgmo.zzc().zze(zzc2.zzi())) {
                zzgua zza2 = zzb2.zza(zzc2.zzh());
                return new zzgmz(zzgow.zza(zza2.zzg(), zza2.zzf(), zza2.zzb(), zzc2.zzg(), num), zzgfv.zza());
            }
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
    };
    private static final zzgnp zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgnp zzb() {
        return zzc;
    }

    private final synchronized zzgfw zzd(zzggj zzggjVar, Integer num) throws GeneralSecurityException {
        zzgno zzgnoVar;
        zzgnoVar = (zzgno) this.zzd.get(zzggjVar.getClass());
        if (zzgnoVar != null) {
        } else {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + zzggjVar.toString() + ": no key creator for this class was registered.");
        }
        return zzgnoVar.zza(zzggjVar, num);
    }

    private static zzgnp zze() {
        zzgnp zzgnpVar = new zzgnp();
        try {
            zzgnpVar.zzc(zzb, zzgna.class);
            return zzgnpVar;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("unexpected error.", e2);
        }
    }

    public final zzgfw zza(zzggj zzggjVar, Integer num) throws GeneralSecurityException {
        return zzd(zzggjVar, num);
    }

    public final synchronized void zzc(zzgno zzgnoVar, Class cls) throws GeneralSecurityException {
        zzgno zzgnoVar2 = (zzgno) this.zzd.get(cls);
        if (zzgnoVar2 != null && !zzgnoVar2.equals(zzgnoVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
        }
        this.zzd.put(cls, zzgnoVar);
    }
}
