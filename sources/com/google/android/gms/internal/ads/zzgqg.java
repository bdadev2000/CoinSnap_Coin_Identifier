package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgqg {
    private static final zzgom zza = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgqc
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return new zzgrg((zzgqb) zzgfwVar);
        }
    }, zzgqb.class, zzgpv.class);
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgqd
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgwr.zzb((zzgqb) zzgfwVar);
        }
    }, zzgqb.class, zzggi.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzggi.class, zzgty.SYMMETRIC, zzgtq.zzi());
    private static final zzgnq zzd = new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgqe
    };
    private static final zzgno zze = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgqf
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            zzgql zzgqlVar = (zzgql) zzggjVar;
            zzgpz zzgpzVar = new zzgpz(null);
            zzgpzVar.zzc(zzgqlVar);
            zzgpzVar.zzb(zzgwv.zzc(zzgqlVar.zzc()));
            zzgpzVar.zza(num);
            return zzgpzVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzf;
        if (zzgmh.zza(i10)) {
            int i11 = zzgrl.zza;
            zzgrl.zze(zzgnz.zzc());
            zzgnw.zza().zze(zza);
            zzgnw.zza().zze(zzb);
            zzgnv zzb2 = zzgnv.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzgqy.zza);
            zzgqk zzgqkVar = null;
            zzgqh zzgqhVar = new zzgqh(zzgqkVar);
            zzgqhVar.zzb(32);
            zzgqhVar.zzc(16);
            zzgqj zzgqjVar = zzgqj.zzd;
            zzgqhVar.zzd(zzgqjVar);
            zzgqi zzgqiVar = zzgqi.zzc;
            zzgqhVar.zza(zzgqiVar);
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgqhVar.zze());
            zzgqh zzgqhVar2 = new zzgqh(zzgqkVar);
            zzgqhVar2.zzb(32);
            zzgqhVar2.zzc(32);
            zzgqj zzgqjVar2 = zzgqj.zza;
            zzgqhVar2.zzd(zzgqjVar2);
            zzgqhVar2.zza(zzgqiVar);
            hashMap.put("HMAC_SHA256_256BITTAG", zzgqhVar2.zze());
            zzgqh zzgqhVar3 = new zzgqh(zzgqkVar);
            zzgqhVar3.zzb(32);
            zzgqhVar3.zzc(32);
            zzgqhVar3.zzd(zzgqjVar);
            zzgqhVar3.zza(zzgqiVar);
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgqhVar3.zze());
            zzgqh zzgqhVar4 = new zzgqh(zzgqkVar);
            zzgqhVar4.zzb(64);
            zzgqhVar4.zzc(16);
            zzgqhVar4.zzd(zzgqjVar2);
            zzgqi zzgqiVar2 = zzgqi.zze;
            zzgqhVar4.zza(zzgqiVar2);
            hashMap.put("HMAC_SHA512_128BITTAG", zzgqhVar4.zze());
            zzgqh zzgqhVar5 = new zzgqh(zzgqkVar);
            zzgqhVar5.zzb(64);
            zzgqhVar5.zzc(16);
            zzgqhVar5.zzd(zzgqjVar);
            zzgqhVar5.zza(zzgqiVar2);
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgqhVar5.zze());
            zzgqh zzgqhVar6 = new zzgqh(zzgqkVar);
            zzgqhVar6.zzb(64);
            zzgqhVar6.zzc(32);
            zzgqhVar6.zzd(zzgqjVar2);
            zzgqhVar6.zza(zzgqiVar2);
            hashMap.put("HMAC_SHA512_256BITTAG", zzgqhVar6.zze());
            zzgqh zzgqhVar7 = new zzgqh(zzgqkVar);
            zzgqhVar7.zzb(64);
            zzgqhVar7.zzc(32);
            zzgqhVar7.zzd(zzgqjVar);
            zzgqhVar7.zza(zzgqiVar2);
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgqhVar7.zze());
            hashMap.put("HMAC_SHA512_512BITTAG", zzgqy.zzb);
            zzgqh zzgqhVar8 = new zzgqh(zzgqkVar);
            zzgqhVar8.zzb(64);
            zzgqhVar8.zzc(64);
            zzgqhVar8.zzd(zzgqjVar);
            zzgqhVar8.zza(zzgqiVar2);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgqhVar8.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgnp.zzb().zzc(zze, zzgql.class);
            zzgnr.zza().zzb(zzd, zzgql.class);
            zzgmo.zzc().zzf(zzc, i10, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
