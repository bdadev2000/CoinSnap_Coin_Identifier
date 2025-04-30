package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgjh {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgjf
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgyb.zzb((zzgje) zzghiVar);
        }
    }, zzgje.class, zzggy.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzggy.class, zzgwg.SYMMETRIC, zzgut.zzh());
    private static final zzgpa zzd = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgjg
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            zzgjm zzgjmVar = (zzgjm) zzghxVar;
            int i9 = zzgjh.zza;
            if (zzgjmVar.zzc() != 24) {
                zzgjc zzgjcVar = new zzgjc(null);
                zzgjcVar.zzc(zzgjmVar);
                zzgjcVar.zza(num);
                zzgjcVar.zzb(zzgzf.zzc(zzgjmVar.zzc()));
                return zzgjcVar.zzd();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };

    public static void zza(boolean z8) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            int i9 = zzgmr.zza;
            zzgmr.zze(zzgpl.zzc());
            zzgpi.zza().zze(zzb);
            zzgph zzb2 = zzgph.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzgma.zzc);
            zzgjj zzgjjVar = new zzgjj(null);
            zzgjjVar.zza(16);
            zzgjjVar.zzb(16);
            zzgjjVar.zzc(16);
            zzgjk zzgjkVar = zzgjk.zzc;
            zzgjjVar.zzd(zzgjkVar);
            hashMap.put("AES128_EAX_RAW", zzgjjVar.zze());
            hashMap.put("AES256_EAX", zzgma.zzd);
            zzgjj zzgjjVar2 = new zzgjj(null);
            zzgjjVar2.zza(16);
            zzgjjVar2.zzb(32);
            zzgjjVar2.zzc(16);
            zzgjjVar2.zzd(zzgjkVar);
            hashMap.put("AES256_EAX_RAW", zzgjjVar2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgpb.zzb().zzc(zzd, zzgjm.class);
            zzgoj.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
