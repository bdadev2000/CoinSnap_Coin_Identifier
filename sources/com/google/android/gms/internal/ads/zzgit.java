package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgit {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgir
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            zzgiq zzgiqVar = (zzgiq) zzgfwVar;
            int i10 = zzgit.zza;
            if (zzglk.zze()) {
                return zzglk.zzb(zzgiqVar);
            }
            return zzgvv.zzb(zzgiqVar);
        }
    }, zzgiq.class, zzgfm.class);
    private static final zzgno zzc = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgis
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            int i10 = zzgit.zza;
            return zzgiq.zza(((zzgiv) zzggjVar).zzb(), zzgwv.zzc(32), num);
        }
    };
    private static final zzgfx zzd = zzgmx.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgfm.class, zzgty.SYMMETRIC, zzgtj.zzg());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            int i10 = zzglp.zza;
            zzglp.zze(zzgnz.zzc());
            zzgnw.zza().zze(zzb);
            zzgnp.zzb().zzc(zzc, zzgiv.class);
            zzgnv zzb2 = zzgnv.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzgiv.zzc(zzgiu.zza));
            hashMap.put("CHACHA20_POLY1305_RAW", zzgiv.zzc(zzgiu.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmo.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
