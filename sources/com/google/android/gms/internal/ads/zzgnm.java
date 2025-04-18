package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgnm {
    public static final zzgne zza = new zzgnk(null);

    public static zzgnj zza(zzgou zzgouVar) {
        zzgfy zzgfyVar;
        zzgng zzgngVar = new zzgng();
        zzgngVar.zzb(zzgouVar.zza());
        Iterator it = zzgouVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgos zzgosVar : (List) it.next()) {
                int zzf = zzgosVar.zzf() - 2;
                if (zzf != 1) {
                    if (zzf != 2) {
                        if (zzf == 3) {
                            zzgfyVar = zzgfy.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzgfyVar = zzgfy.zzb;
                    }
                } else {
                    zzgfyVar = zzgfy.zza;
                }
                int zza2 = zzgosVar.zza();
                String zze = zzgosVar.zze();
                if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                    zze = zze.substring(34);
                }
                zzgngVar.zza(zzgfyVar, zza2, zze, zzgosVar.zzb().name());
            }
        }
        if (zzgouVar.zzc() != null) {
            zzgngVar.zzc(zzgouVar.zzc().zza());
        }
        try {
            return zzgngVar.zzd();
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
