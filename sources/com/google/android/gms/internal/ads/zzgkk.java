package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgkk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgkh
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            zzgkg zzgkgVar = (zzgkg) zzgfwVar;
            int i10 = zzgkk.zza;
            if (zzglz.zzc()) {
                return zzglz.zzb(zzgkgVar);
            }
            return zzgwt.zzb(zzgkgVar);
        }
    }, zzgkg.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgfm.class, zzgty.SYMMETRIC, zzgvk.zzg());
    private static final zzgnq zzd = new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgki
    };
    private static final zzgno zze = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgkj
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            int i10 = zzgkk.zza;
            return zzgkg.zza(((zzgkm) zzggjVar).zzb(), zzgwv.zzc(32), num);
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            int i10 = zzgme.zza;
            zzgme.zze(zzgnz.zzc());
            zzgnw.zza().zze(zzb);
            zzgnv zzb2 = zzgnv.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzgkm.zzc(zzgkl.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzgkm.zzc(zzgkl.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgnp.zzb().zzc(zze, zzgkm.class);
            zzgnr.zza().zzb(zzd, zzgkm.class);
            zzgmo.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
