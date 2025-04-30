package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgoy {
    public static final zzgtl zza = new zzgox(null);

    public static zzgtr zza(zzgqk zzgqkVar) {
        zzghk zzghkVar;
        zzgtn zzgtnVar = new zzgtn();
        zzgtnVar.zzb(zzgqkVar.zzc());
        Iterator it = zzgqkVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgqi zzgqiVar : (List) it.next()) {
                zzgwj zzb = zzgqiVar.zzb();
                zzgwj zzgwjVar = zzgwj.UNKNOWN_STATUS;
                int ordinal = zzb.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            zzghkVar = zzghk.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzghkVar = zzghk.zzb;
                    }
                } else {
                    zzghkVar = zzghk.zza;
                }
                int zza2 = zzgqiVar.zza();
                String zzf = zzgqiVar.zzf();
                if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                    zzf = zzf.substring(34);
                }
                zzgtnVar.zza(zzghkVar, zza2, zzf, zzgqiVar.zzc().name());
            }
        }
        if (zzgqkVar.zzb() != null) {
            zzgtnVar.zzc(zzgqkVar.zzb().zza());
        }
        try {
            return zzgtnVar.zzd();
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }
}
