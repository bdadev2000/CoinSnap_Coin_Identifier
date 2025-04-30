package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgmf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgmc
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            zzgmb zzgmbVar = (zzgmb) zzghiVar;
            int i9 = zzgmf.zza;
            if (zzgnu.zzc()) {
                return zzgnu.zzb(zzgmbVar);
            }
            return zzgzd.zzb(zzgmbVar);
        }
    }, zzgmb.class, zzggy.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzggy.class, zzgwg.SYMMETRIC, zzgxt.zzg());
    private static final zzgpc zzd = new zzgpc() { // from class: com.google.android.gms.internal.ads.zzgmd
    };
    private static final zzgpa zze = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgme
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            int i9 = zzgmf.zza;
            return zzgmb.zza(((zzgmh) zzghxVar).zzb(), zzgzf.zzc(32), num);
        }
    };

    public static void zza(boolean z8) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            int i9 = zzgnz.zza;
            zzgnz.zze(zzgpl.zzc());
            zzgpi.zza().zze(zzb);
            zzgph zzb2 = zzgph.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzgmh.zzc(zzgmg.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzgmh.zzc(zzgmg.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgpb.zzb().zzc(zze, zzgmh.class);
            zzgpd.zza().zzb(zzd, zzgmh.class);
            zzgoj.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
