package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzghp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzghn
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgvs.zzb((zzghm) zzgfwVar);
        }
    }, zzghm.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgfm.class, zzgty.SYMMETRIC, zzgso.zzh());
    private static final zzgno zzd = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgho
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            zzght zzghtVar = (zzght) zzggjVar;
            int i10 = zzghp.zza;
            if (zzghtVar.zzc() != 24) {
                zzghk zzghkVar = new zzghk(null);
                zzghkVar.zzc(zzghtVar);
                zzghkVar.zza(num);
                zzghkVar.zzb(zzgwv.zzc(zzghtVar.zzc()));
                return zzghkVar.zzd();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            int i10 = zzgkw.zza;
            zzgkw.zze(zzgnz.zzc());
            zzgnw.zza().zze(zzb);
            zzgnv zzb2 = zzgnv.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzgkd.zzc);
            zzghs zzghsVar = null;
            zzghq zzghqVar = new zzghq(zzghsVar);
            zzghqVar.zza(16);
            zzghqVar.zzb(16);
            zzghqVar.zzc(16);
            zzghr zzghrVar = zzghr.zzc;
            zzghqVar.zzd(zzghrVar);
            hashMap.put("AES128_EAX_RAW", zzghqVar.zze());
            hashMap.put("AES256_EAX", zzgkd.zzd);
            zzghq zzghqVar2 = new zzghq(zzghsVar);
            zzghqVar2.zza(16);
            zzghqVar2.zzb(32);
            zzghqVar2.zzc(16);
            zzghqVar2.zzd(zzghrVar);
            hashMap.put("AES256_EAX_RAW", zzghqVar2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgnp.zzb().zzc(zzd, zzght.class);
            zzgmo.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
