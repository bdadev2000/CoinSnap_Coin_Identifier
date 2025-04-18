package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes3.dex */
public final class zzgkb {
    private static final zzgqd zza = zzgqd.zzb(new zzgqb() { // from class: com.google.android.gms.internal.ads.zzgjy
        @Override // com.google.android.gms.internal.ads.zzgqb
        public final Object zza(zzghd zzghdVar) {
            return zzgnv.zzb((zzgjx) zzghdVar);
        }
    }, zzgjx.class, zzggt.class);
    private static final zzgpf zzb = new zzgpf() { // from class: com.google.android.gms.internal.ads.zzgjz
        @Override // com.google.android.gms.internal.ads.zzgpf
        public final zzghd zza(zzghs zzghsVar, Integer num) {
            zzgkg zzgkgVar = (zzgkg) zzghsVar;
            zzgjv zzgjvVar = new zzgjv(null);
            zzgjvVar.zzc(zzgkgVar);
            zzgjvVar.zza(num);
            zzgjvVar.zzb(zzgyy.zzc(zzgkgVar.zzb()));
            return zzgjvVar.zzd();
        }
    };
    private static final zzgph zzc = new zzgph() { // from class: com.google.android.gms.internal.ads.zzgka
    };
    private static final zzghe zzd = zzgon.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzggt.class, zzgwa.SYMMETRIC, zzgve.zzg());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzgnw.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i2 = zzgmx.zza;
        zzgmx.zze(zzgpq.zzc());
        if (zzb()) {
            zzgpn.zza().zze(zza);
            zzgpm zzb2 = zzgpm.zzb();
            HashMap hashMap = new HashMap();
            zzgkd zzgkdVar = new zzgkd(null);
            zzgkdVar.zza(16);
            zzgke zzgkeVar = zzgke.zza;
            zzgkdVar.zzb(zzgkeVar);
            hashMap.put("AES128_GCM_SIV", zzgkdVar.zzc());
            zzgkd zzgkdVar2 = new zzgkd(null);
            zzgkdVar2.zza(16);
            zzgke zzgkeVar2 = zzgke.zzc;
            zzgkdVar2.zzb(zzgkeVar2);
            hashMap.put("AES128_GCM_SIV_RAW", zzgkdVar2.zzc());
            zzgkd zzgkdVar3 = new zzgkd(null);
            zzgkdVar3.zza(32);
            zzgkdVar3.zzb(zzgkeVar);
            hashMap.put("AES256_GCM_SIV", zzgkdVar3.zzc());
            zzgkd zzgkdVar4 = new zzgkd(null);
            zzgkdVar4.zza(32);
            zzgkdVar4.zzb(zzgkeVar2);
            hashMap.put("AES256_GCM_SIV_RAW", zzgkdVar4.zzc());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgpi.zza().zzb(zzc, zzgkg.class);
            zzgpg.zzb().zzc(zzb, zzgkg.class);
            zzgoe.zzc().zzd(zzd, true);
        }
    }

    private static boolean zzb() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
