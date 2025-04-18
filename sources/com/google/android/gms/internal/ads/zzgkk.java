package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgkk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgqd zzb = zzgqd.zzb(new zzgqb() { // from class: com.google.android.gms.internal.ads.zzgki
        @Override // com.google.android.gms.internal.ads.zzgqb
        public final Object zza(zzghd zzghdVar) {
            zzgkh zzgkhVar = (zzgkh) zzghdVar;
            int i2 = zzgkk.zza;
            return zzgmz.zze() ? zzgmz.zzb(zzgkhVar) : zzgxw.zzb(zzgkhVar);
        }
    }, zzgkh.class, zzggt.class);
    private static final zzgpf zzc = new zzgpf() { // from class: com.google.android.gms.internal.ads.zzgkj
        @Override // com.google.android.gms.internal.ads.zzgpf
        public final zzghd zza(zzghs zzghsVar, Integer num) {
            int i2 = zzgkk.zza;
            return zzgkh.zza(((zzgkm) zzghsVar).zzb(), zzgyy.zzc(32), num);
        }
    };
    private static final zzghe zzd = zzgon.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzggt.class, zzgwa.SYMMETRIC, zzgvk.zzg());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzgnw.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i2 = zzgne.zza;
        zzgne.zze(zzgpq.zzc());
        zzgpn.zza().zze(zzb);
        zzgpg.zzb().zzc(zzc, zzgkm.class);
        zzgpm zzb2 = zzgpm.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzgkm.zzc(zzgkl.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzgkm.zzc(zzgkl.zzc));
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgoe.zzc().zzd(zzd, true);
    }
}
