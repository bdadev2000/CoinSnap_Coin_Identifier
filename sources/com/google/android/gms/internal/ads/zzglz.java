package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzglz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgqd zzb = zzgqd.zzb(new zzgqb() { // from class: com.google.android.gms.internal.ads.zzglw
        @Override // com.google.android.gms.internal.ads.zzgqb
        public final Object zza(zzghd zzghdVar) {
            zzglv zzglvVar = (zzglv) zzghdVar;
            int i2 = zzglz.zza;
            return zzgno.zzc() ? zzgno.zzb(zzglvVar) : zzgyw.zzb(zzglvVar);
        }
    }, zzglv.class, zzggt.class);
    private static final zzghe zzc = zzgon.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzggt.class, zzgwa.SYMMETRIC, zzgxl.zzg());
    private static final zzgph zzd = new zzgph() { // from class: com.google.android.gms.internal.ads.zzglx
    };
    private static final zzgpf zze = new zzgpf() { // from class: com.google.android.gms.internal.ads.zzgly
        @Override // com.google.android.gms.internal.ads.zzgpf
        public final zzghd zza(zzghs zzghsVar, Integer num) {
            int i2 = zzglz.zza;
            return zzglv.zza(((zzgmb) zzghsVar).zzb(), zzgyy.zzc(32), num);
        }
    };

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzgnw.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i2 = zzgnt.zza;
        zzgnt.zze(zzgpq.zzc());
        zzgpn.zza().zze(zzb);
        zzgpm zzb2 = zzgpm.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzgmb.zzc(zzgma.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzgmb.zzc(zzgma.zzc));
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgpg.zzb().zzc(zze, zzgmb.class);
        zzgpi.zza().zzb(zzd, zzgmb.class);
        zzgoe.zzc().zzd(zzc, true);
    }
}
