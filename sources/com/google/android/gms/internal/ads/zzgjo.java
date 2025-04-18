package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgjo {
    public static final /* synthetic */ int zza = 0;
    private static final zzgqd zzb = zzgqd.zzb(new zzgqb() { // from class: com.google.android.gms.internal.ads.zzgjl
        @Override // com.google.android.gms.internal.ads.zzgqb
        public final Object zza(zzghd zzghdVar) {
            return zzgxu.zzb((zzgjk) zzghdVar);
        }
    }, zzgjk.class, zzggt.class);
    private static final zzghe zzc = zzgon.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzggt.class, zzgwa.SYMMETRIC, zzguy.zzg());
    private static final zzgph zzd = new zzgph() { // from class: com.google.android.gms.internal.ads.zzgjm
    };
    private static final zzgpf zze = new zzgpf() { // from class: com.google.android.gms.internal.ads.zzgjn
        @Override // com.google.android.gms.internal.ads.zzgpf
        public final zzghd zza(zzghs zzghsVar, Integer num) {
            zzgjt zzgjtVar = (zzgjt) zzghsVar;
            int i2 = zzgjo.zza;
            if (zzgjtVar.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzgji zzgjiVar = new zzgji(null);
            zzgjiVar.zzc(zzgjtVar);
            zzgjiVar.zza(num);
            zzgjiVar.zzb(zzgyy.zzc(zzgjtVar.zzb()));
            return zzgjiVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzf;
        if (!zzgnw.zza(i2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzgms.zza;
        zzgms.zze(zzgpq.zzc());
        zzgpn.zza().zze(zzb);
        zzgpm zzb2 = zzgpm.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzglu.zza);
        zzgjq zzgjqVar = new zzgjq(null);
        zzgjqVar.zza(12);
        zzgjqVar.zzb(16);
        zzgjqVar.zzc(16);
        zzgjr zzgjrVar = zzgjr.zzc;
        zzgjqVar.zzd(zzgjrVar);
        hashMap.put("AES128_GCM_RAW", zzgjqVar.zze());
        hashMap.put("AES256_GCM", zzglu.zzb);
        zzgjq zzgjqVar2 = new zzgjq(null);
        zzgjqVar2.zza(12);
        zzgjqVar2.zzb(32);
        zzgjqVar2.zzc(16);
        zzgjqVar2.zzd(zzgjrVar);
        hashMap.put("AES256_GCM_RAW", zzgjqVar2.zze());
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgpi.zza().zzb(zzd, zzgjt.class);
        zzgpg.zzb().zzc(zze, zzgjt.class);
        zzgoe.zzc().zzf(zzc, i2, true);
    }
}
