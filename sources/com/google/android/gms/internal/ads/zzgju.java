package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgju {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgjr
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgyc.zzb((zzgjq) zzghiVar);
        }
    }, zzgjq.class, zzggy.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzggy.class, zzgwg.SYMMETRIC, zzgvc.zzg());
    private static final zzgpc zzd = new zzgpc() { // from class: com.google.android.gms.internal.ads.zzgjs
    };
    private static final zzgpa zze = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgjt
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            zzgjz zzgjzVar = (zzgjz) zzghxVar;
            int i9 = zzgju.zza;
            if (zzgjzVar.zzb() != 24) {
                zzgjo zzgjoVar = new zzgjo(null);
                zzgjoVar.zzc(zzgjzVar);
                zzgjoVar.zza(num);
                zzgjoVar.zzb(zzgzf.zzc(zzgjzVar.zzb()));
                return zzgjoVar.zzd();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z8) throws GeneralSecurityException {
        int i9 = zzf;
        if (zzgoc.zza(i9)) {
            int i10 = zzgmw.zza;
            zzgmw.zze(zzgpl.zzc());
            zzgpi.zza().zze(zzb);
            zzgph zzb2 = zzgph.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzgma.zza);
            zzgjw zzgjwVar = new zzgjw(null);
            zzgjwVar.zza(12);
            zzgjwVar.zzb(16);
            zzgjwVar.zzc(16);
            zzgjx zzgjxVar = zzgjx.zzc;
            zzgjwVar.zzd(zzgjxVar);
            hashMap.put("AES128_GCM_RAW", zzgjwVar.zze());
            hashMap.put("AES256_GCM", zzgma.zzb);
            zzgjw zzgjwVar2 = new zzgjw(null);
            zzgjwVar2.zza(12);
            zzgjwVar2.zzb(32);
            zzgjwVar2.zzc(16);
            zzgjwVar2.zzd(zzgjxVar);
            hashMap.put("AES256_GCM_RAW", zzgjwVar2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgpd.zza().zzb(zzd, zzgjz.class);
            zzgpb.zzb().zzc(zze, zzgjz.class);
            zzgoj.zzc().zzf(zzc, i9, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
