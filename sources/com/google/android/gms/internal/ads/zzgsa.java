package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgsa {
    private static final zzgpy zza = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgrw
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return new zzgtb((zzgrv) zzghiVar);
        }
    }, zzgrv.class, zzgro.class);
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgrx
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgzb.zzb((zzgrv) zzghiVar);
        }
    }, zzgrv.class, zzghw.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzghw.class, zzgwg.SYMMETRIC, zzgvw.zzi());
    private static final zzgpc zzd = new zzgpc() { // from class: com.google.android.gms.internal.ads.zzgry
    };
    private static final zzgpa zze = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgrz
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            zzgsg zzgsgVar = (zzgsg) zzghxVar;
            zzgrt zzgrtVar = new zzgrt(null);
            zzgrtVar.zzc(zzgsgVar);
            zzgrtVar.zzb(zzgzf.zzc(zzgsgVar.zzc()));
            zzgrtVar.zza(num);
            return zzgrtVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z8) throws GeneralSecurityException {
        int i9 = zzf;
        if (zzgoc.zza(i9)) {
            int i10 = zzgtg.zza;
            zzgtg.zze(zzgpl.zzc());
            zzgpi.zza().zze(zza);
            zzgpi.zza().zze(zzb);
            zzgph zzb2 = zzgph.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzgst.zza);
            zzgsc zzgscVar = new zzgsc(null);
            zzgscVar.zzb(32);
            zzgscVar.zzc(16);
            zzgse zzgseVar = zzgse.zzd;
            zzgscVar.zzd(zzgseVar);
            zzgsd zzgsdVar = zzgsd.zzc;
            zzgscVar.zza(zzgsdVar);
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgscVar.zze());
            zzgsc zzgscVar2 = new zzgsc(null);
            zzgscVar2.zzb(32);
            zzgscVar2.zzc(32);
            zzgse zzgseVar2 = zzgse.zza;
            zzgscVar2.zzd(zzgseVar2);
            zzgscVar2.zza(zzgsdVar);
            hashMap.put("HMAC_SHA256_256BITTAG", zzgscVar2.zze());
            zzgsc zzgscVar3 = new zzgsc(null);
            zzgscVar3.zzb(32);
            zzgscVar3.zzc(32);
            zzgscVar3.zzd(zzgseVar);
            zzgscVar3.zza(zzgsdVar);
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgscVar3.zze());
            zzgsc zzgscVar4 = new zzgsc(null);
            zzgscVar4.zzb(64);
            zzgscVar4.zzc(16);
            zzgscVar4.zzd(zzgseVar2);
            zzgsd zzgsdVar2 = zzgsd.zze;
            zzgscVar4.zza(zzgsdVar2);
            hashMap.put("HMAC_SHA512_128BITTAG", zzgscVar4.zze());
            zzgsc zzgscVar5 = new zzgsc(null);
            zzgscVar5.zzb(64);
            zzgscVar5.zzc(16);
            zzgscVar5.zzd(zzgseVar);
            zzgscVar5.zza(zzgsdVar2);
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgscVar5.zze());
            zzgsc zzgscVar6 = new zzgsc(null);
            zzgscVar6.zzb(64);
            zzgscVar6.zzc(32);
            zzgscVar6.zzd(zzgseVar2);
            zzgscVar6.zza(zzgsdVar2);
            hashMap.put("HMAC_SHA512_256BITTAG", zzgscVar6.zze());
            zzgsc zzgscVar7 = new zzgsc(null);
            zzgscVar7.zzb(64);
            zzgscVar7.zzc(32);
            zzgscVar7.zzd(zzgseVar);
            zzgscVar7.zza(zzgsdVar2);
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgscVar7.zze());
            hashMap.put("HMAC_SHA512_512BITTAG", zzgst.zzd);
            zzgsc zzgscVar8 = new zzgsc(null);
            zzgscVar8.zzb(64);
            zzgscVar8.zzc(64);
            zzgscVar8.zzd(zzgseVar);
            zzgscVar8.zza(zzgsdVar2);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgscVar8.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgpb.zzb().zzc(zze, zzgsg.class);
            zzgpd.zza().zzb(zzd, zzgsg.class);
            zzgoj.zzc().zzf(zzc, i9, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
