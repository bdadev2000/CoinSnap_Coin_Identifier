package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgia {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzghx
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgvt.zzb((zzghw) zzgfwVar);
        }
    }, zzghw.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgfm.class, zzgty.SYMMETRIC, zzgsx.zzg());
    private static final zzgnq zzd = new zzgnq() { // from class: com.google.android.gms.internal.ads.zzghy
    };
    private static final zzgno zze = new zzgno() { // from class: com.google.android.gms.internal.ads.zzghz
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            zzgie zzgieVar = (zzgie) zzggjVar;
            int i10 = zzgia.zza;
            if (zzgieVar.zzb() != 24) {
                zzghu zzghuVar = new zzghu(null);
                zzghuVar.zzc(zzgieVar);
                zzghuVar.zza(num);
                zzghuVar.zzb(zzgwv.zzc(zzgieVar.zzb()));
                return zzghuVar.zzd();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzf;
        if (zzgmh.zza(i10)) {
            int i11 = zzgld.zza;
            zzgld.zze(zzgnz.zzc());
            zzgnw.zza().zze(zzb);
            zzgnv zzb2 = zzgnv.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzgkd.zza);
            zzgid zzgidVar = null;
            zzgib zzgibVar = new zzgib(zzgidVar);
            zzgibVar.zza(12);
            zzgibVar.zzb(16);
            zzgibVar.zzc(16);
            zzgic zzgicVar = zzgic.zzc;
            zzgibVar.zzd(zzgicVar);
            hashMap.put("AES128_GCM_RAW", zzgibVar.zze());
            hashMap.put("AES256_GCM", zzgkd.zzb);
            zzgib zzgibVar2 = new zzgib(zzgidVar);
            zzgibVar2.zza(12);
            zzgibVar2.zzb(32);
            zzgibVar2.zzc(16);
            zzgibVar2.zzd(zzgicVar);
            hashMap.put("AES256_GCM_RAW", zzgibVar2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgnr.zza().zzb(zzd, zzgie.class);
            zzgnp.zzb().zzc(zze, zzgie.class);
            zzgmo.zzc().zzf(zzc, i10, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
