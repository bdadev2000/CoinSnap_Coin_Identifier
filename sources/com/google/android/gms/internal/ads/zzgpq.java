package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgpq {
    private static final zzgno zza = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgpn
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            return zzgpq.zzb((zzgpu) zzggjVar, num);
        }
    };
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgpo
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgpq.zzc((zzgpm) zzgfwVar);
        }
    }, zzgpm.class, zzgpv.class);
    private static final zzgom zzc = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgpp
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgpq.zza((zzgpm) zzgfwVar);
        }
    }, zzgpm.class, zzggi.class);
    private static final zzgfx zzd = zzgmx.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzggi.class, zzgty.SYMMETRIC, zzgrq.zzh());

    public static /* synthetic */ zzggi zza(zzgpm zzgpmVar) {
        zze(zzgpmVar.zzb());
        return zzgwr.zza(zzgpmVar);
    }

    public static /* synthetic */ zzgpm zzb(zzgpu zzgpuVar, Integer num) {
        zze(zzgpuVar);
        zzgpk zzgpkVar = new zzgpk(null);
        zzgpkVar.zzc(zzgpuVar);
        zzgpkVar.zza(zzgwv.zzc(zzgpuVar.zzc()));
        zzgpkVar.zzb(num);
        return zzgpkVar.zzd();
    }

    public static /* synthetic */ zzgpv zzc(zzgpm zzgpmVar) {
        zze(zzgpmVar.zzb());
        return new zzgrf(zzgpmVar);
    }

    public static void zzd(boolean z10) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            int i10 = zzgrd.zza;
            zzgrd.zze(zzgnz.zzc());
            zzgnp.zzb().zzc(zza, zzgpu.class);
            zzgnw.zza().zze(zzb);
            zzgnw.zza().zze(zzc);
            zzgnv zzb2 = zzgnv.zzb();
            HashMap hashMap = new HashMap();
            zzgpu zzgpuVar = zzgqy.zzc;
            hashMap.put("AES_CMAC", zzgpuVar);
            hashMap.put("AES256_CMAC", zzgpuVar);
            zzgpr zzgprVar = new zzgpr(null);
            zzgprVar.zza(32);
            zzgprVar.zzb(16);
            zzgprVar.zzc(zzgps.zzd);
            hashMap.put("AES256_CMAC_RAW", zzgprVar.zzd());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmo.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    private static void zze(zzgpu zzgpuVar) throws GeneralSecurityException {
        if (zzgpuVar.zzc() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
