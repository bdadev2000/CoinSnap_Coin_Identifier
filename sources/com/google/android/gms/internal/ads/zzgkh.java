package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public final class zzgkh {
    private static final zzgpy zza = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgke
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgob.zzb((zzgkd) zzghiVar);
        }
    }, zzgkd.class, zzggy.class);
    private static final zzgpa zzb = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgkf
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            zzgkm zzgkmVar = (zzgkm) zzghxVar;
            zzgkb zzgkbVar = new zzgkb(null);
            zzgkbVar.zzc(zzgkmVar);
            zzgkbVar.zza(num);
            zzgkbVar.zzb(zzgzf.zzc(zzgkmVar.zzb()));
            return zzgkbVar.zzd();
        }
    };
    private static final zzgpc zzc = new zzgpc() { // from class: com.google.android.gms.internal.ads.zzgkg
    };
    private static final zzghj zzd = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzggy.class, zzgwg.SYMMETRIC, zzgvi.zzg());

    public static void zza(boolean z8) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            int i9 = zzgnb.zza;
            zzgnb.zze(zzgpl.zzc());
            if (zzb()) {
                zzgpi.zza().zze(zza);
                zzgph zzb2 = zzgph.zzb();
                HashMap hashMap = new HashMap();
                zzgkj zzgkjVar = new zzgkj(null);
                zzgkjVar.zza(16);
                zzgkk zzgkkVar = zzgkk.zza;
                zzgkjVar.zzb(zzgkkVar);
                hashMap.put("AES128_GCM_SIV", zzgkjVar.zzc());
                zzgkj zzgkjVar2 = new zzgkj(null);
                zzgkjVar2.zza(16);
                zzgkk zzgkkVar2 = zzgkk.zzc;
                zzgkjVar2.zzb(zzgkkVar2);
                hashMap.put("AES128_GCM_SIV_RAW", zzgkjVar2.zzc());
                zzgkj zzgkjVar3 = new zzgkj(null);
                zzgkjVar3.zza(32);
                zzgkjVar3.zzb(zzgkkVar);
                hashMap.put("AES256_GCM_SIV", zzgkjVar3.zzc());
                zzgkj zzgkjVar4 = new zzgkj(null);
                zzgkjVar4.zza(32);
                zzgkjVar4.zzb(zzgkkVar2);
                hashMap.put("AES256_GCM_SIV_RAW", zzgkjVar4.zzc());
                zzb2.zzd(Collections.unmodifiableMap(hashMap));
                zzgpd.zza().zzb(zzc, zzgkm.class);
                zzgpb.zzb().zzc(zzb, zzgkm.class);
                zzgoj.zzc().zzd(zzd, true);
                return;
            }
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
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
