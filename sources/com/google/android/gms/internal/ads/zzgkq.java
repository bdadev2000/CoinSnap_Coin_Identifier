package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgkq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgko
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            zzgkn zzgknVar = (zzgkn) zzghiVar;
            int i9 = zzgkq.zza;
            if (zzgnd.zze()) {
                return zzgnd.zzb(zzgknVar);
            }
            return zzgye.zzb(zzgknVar);
        }
    }, zzgkn.class, zzggy.class);
    private static final zzgpa zzc = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgkp
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            int i9 = zzgkq.zza;
            return zzgkn.zza(((zzgks) zzghxVar).zzb(), zzgzf.zzc(32), num);
        }
    };
    private static final zzghj zzd = zzgos.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzggy.class, zzgwg.SYMMETRIC, zzgvo.zzg());

    public static void zza(boolean z8) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            int i9 = zzgni.zza;
            zzgni.zze(zzgpl.zzc());
            zzgpi.zza().zze(zzb);
            zzgpb.zzb().zzc(zzc, zzgks.class);
            zzgph zzb2 = zzgph.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzgks.zzc(zzgkr.zza));
            hashMap.put("CHACHA20_POLY1305_RAW", zzgks.zzc(zzgkr.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgoj.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
