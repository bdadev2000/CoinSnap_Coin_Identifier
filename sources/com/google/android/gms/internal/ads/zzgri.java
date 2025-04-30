package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgri {
    private static final zzgpa zza = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgrf
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            return zzgri.zzb((zzgrn) zzghxVar, num);
        }
    };
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgrg
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgri.zzc((zzgre) zzghiVar);
        }
    }, zzgre.class, zzgro.class);
    private static final zzgpy zzc = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgrh
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgri.zza((zzgre) zzghiVar);
        }
    }, zzgre.class, zzghw.class);
    private static final zzghj zzd = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzghw.class, zzgwg.SYMMETRIC, zzgtv.zzh());

    public static /* synthetic */ zzghw zza(zzgre zzgreVar) {
        zze(zzgreVar.zzb());
        return zzgzb.zza(zzgreVar);
    }

    public static /* synthetic */ zzgre zzb(zzgrn zzgrnVar, Integer num) {
        zze(zzgrnVar);
        zzgrc zzgrcVar = new zzgrc(null);
        zzgrcVar.zzc(zzgrnVar);
        zzgrcVar.zza(zzgzf.zzc(zzgrnVar.zzc()));
        zzgrcVar.zzb(num);
        return zzgrcVar.zzd();
    }

    public static /* synthetic */ zzgro zzc(zzgre zzgreVar) {
        zze(zzgreVar.zzb());
        return new zzgta(zzgreVar);
    }

    public static void zzd(boolean z8) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            int i9 = zzgsy.zza;
            zzgsy.zze(zzgpl.zzc());
            zzgpb.zzb().zzc(zza, zzgrn.class);
            zzgpi.zza().zze(zzb);
            zzgpi.zza().zze(zzc);
            zzgph zzb2 = zzgph.zzb();
            HashMap hashMap = new HashMap();
            zzgrn zzgrnVar = zzgst.zze;
            hashMap.put("AES_CMAC", zzgrnVar);
            hashMap.put("AES256_CMAC", zzgrnVar);
            zzgrk zzgrkVar = new zzgrk(null);
            zzgrkVar.zza(32);
            zzgrkVar.zzb(16);
            zzgrkVar.zzc(zzgrl.zzd);
            hashMap.put("AES256_CMAC_RAW", zzgrkVar.zzd());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgoj.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    private static void zze(zzgrn zzgrnVar) throws GeneralSecurityException {
        if (zzgrnVar.zzc() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
