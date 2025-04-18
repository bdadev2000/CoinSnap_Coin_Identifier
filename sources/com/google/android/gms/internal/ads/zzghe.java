package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzghe {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzghb
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgvw.zzb((zzgha) zzgfwVar);
        }
    }, zzgha.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgfm.class, zzgty.SYMMETRIC, zzgrz.zzh());
    private static final zzgnq zzd = new zzgnq() { // from class: com.google.android.gms.internal.ads.zzghc
    };
    private static final zzgno zze = new zzgno() { // from class: com.google.android.gms.internal.ads.zzghd
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            zzghj zzghjVar = (zzghj) zzggjVar;
            int i10 = zzghe.zza;
            if (zzghjVar.zzb() != 16 && zzghjVar.zzb() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzggy zzggyVar = new zzggy(null);
            zzggyVar.zzd(zzghjVar);
            zzggyVar.zzc(num);
            zzggyVar.zza(zzgwv.zzc(zzghjVar.zzb()));
            zzggyVar.zzb(zzgwv.zzc(zzghjVar.zzc()));
            return zzggyVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzf;
        if (zzgmh.zza(i10)) {
            int i11 = zzgkr.zza;
            zzgkr.zze(zzgnz.zzc());
            zzgnw.zza().zze(zzb);
            zzgnv zzb2 = zzgnv.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", zzgkd.zze);
            zzghi zzghiVar = null;
            zzghf zzghfVar = new zzghf(zzghiVar);
            zzghfVar.zza(16);
            zzghfVar.zzc(32);
            zzghfVar.zze(16);
            zzghfVar.zzd(16);
            zzghg zzghgVar = zzghg.zzc;
            zzghfVar.zzb(zzghgVar);
            zzghh zzghhVar = zzghh.zzc;
            zzghfVar.zzf(zzghhVar);
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzghfVar.zzg());
            hashMap.put("AES256_CTR_HMAC_SHA256", zzgkd.zzf);
            zzghf zzghfVar2 = new zzghf(zzghiVar);
            zzghfVar2.zza(32);
            zzghfVar2.zzc(32);
            zzghfVar2.zze(32);
            zzghfVar2.zzd(16);
            zzghfVar2.zzb(zzghgVar);
            zzghfVar2.zzf(zzghhVar);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzghfVar2.zzg());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgnr.zza().zzb(zzd, zzghj.class);
            zzgnp.zzb().zzc(zze, zzghj.class);
            zzgmo.zzc().zzf(zzc, i10, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
