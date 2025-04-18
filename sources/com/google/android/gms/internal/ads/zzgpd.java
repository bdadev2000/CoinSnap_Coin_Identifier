package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgpd {
    public static final zzgou zza = new zzgpc(null);

    public static zzgpa zza(zzgqp zzgqpVar) {
        zzghf zzghfVar;
        zzgow zzgowVar = new zzgow();
        zzgowVar.zzb(zzgqpVar.zza());
        Iterator it = zzgqpVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgqn zzgqnVar : (List) it.next()) {
                int zzf = zzgqnVar.zzf() - 2;
                if (zzf == 1) {
                    zzghfVar = zzghf.zza;
                } else if (zzf == 2) {
                    zzghfVar = zzghf.zzb;
                } else {
                    if (zzf != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzghfVar = zzghf.zzc;
                }
                int zza2 = zzgqnVar.zza();
                String zze = zzgqnVar.zze();
                if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                    zze = zze.substring(34);
                }
                zzgowVar.zza(zzghfVar, zza2, zze, zzgqnVar.zzb().name());
            }
        }
        if (zzgqpVar.zzc() != null) {
            zzgowVar.zzc(zzgqpVar.zzc().zza());
        }
        try {
            return zzgowVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
