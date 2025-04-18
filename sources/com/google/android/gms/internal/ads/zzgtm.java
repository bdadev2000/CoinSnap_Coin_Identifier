package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgtm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyx zzb;
    private static final zzgoc zzc;
    private static final zzgoc zzd;
    private static final zzgpz zze;
    private static final zzgpv zzf;
    private static final zzgom zzg;
    private static final zzgoi zzh;

    static {
        zzgyx zzb2 = zzgrg.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzgoa zza2 = zzgoc.zza();
        zza2.zza(zzgxf.RAW, zzgsk.zzd);
        zza2.zza(zzgxf.TINK, zzgsk.zza);
        zza2.zza(zzgxf.LEGACY, zzgsk.zzc);
        zza2.zza(zzgxf.CRUNCHY, zzgsk.zzb);
        zzc = zza2.zzb();
        zzgoa zza3 = zzgoc.zza();
        zza3.zza(zzgvo.SHA1, zzgsj.zza);
        zza3.zza(zzgvo.SHA224, zzgsj.zzb);
        zza3.zza(zzgvo.SHA256, zzgsj.zzc);
        zza3.zza(zzgvo.SHA384, zzgsj.zzd);
        zza3.zza(zzgvo.SHA512, zzgsj.zze);
        zzd = zza3.zzb();
        zze = zzgpz.zzb(new zzgpx() { // from class: com.google.android.gms.internal.ads.zzgti
            @Override // com.google.android.gms.internal.ads.zzgpx
            public final zzgqw zza(zzghs zzghsVar) {
                return zzgtm.zzb((zzgsm) zzghsVar);
            }
        }, zzgsm.class, zzgqs.class);
        zzf = zzgpv.zzb(new zzgpt() { // from class: com.google.android.gms.internal.ads.zzgtj
            @Override // com.google.android.gms.internal.ads.zzgpt
            public final zzghs zza(zzgqw zzgqwVar) {
                return zzgtm.zzd((zzgqs) zzgqwVar);
            }
        }, zzb2, zzgqs.class);
        zzg = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgtk
            @Override // com.google.android.gms.internal.ads.zzgok
            public final zzgqw zza(zzghd zzghdVar, zzghw zzghwVar) {
                return zzgtm.zza((zzgsb) zzghdVar, zzghwVar);
            }
        }, zzgsb.class, zzgqr.class);
        zzh = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgtl
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) {
                return zzgtm.zzc((zzgqr) zzgqwVar, zzghwVar);
            }
        }, zzb2, zzgqr.class);
    }

    public static /* synthetic */ zzgqr zza(zzgsb zzgsbVar, zzghw zzghwVar) {
        zzgvq zzc2 = zzgvr.zzc();
        zzc2.zzb(zzf(zzgsbVar.zzb()));
        byte[] zzd2 = zzgsbVar.zzd().zzd(zzghwVar);
        zzc2.zza(zzgzs.zzv(zzd2, 0, zzd2.length));
        return zzgqr.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgvr) zzc2.zzbr()).zzaN(), zzgwa.SYMMETRIC, (zzgxf) zzc.zzb(zzgsbVar.zzb().zzg()), zzgsbVar.zze());
    }

    public static /* synthetic */ zzgqs zzb(zzgsm zzgsmVar) {
        zzgwe zza2 = zzgwf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgvt zzd2 = zzgvu.zzd();
        zzd2.zzb(zzf(zzgsmVar));
        zzd2.zza(zzgsmVar.zzc());
        zza2.zzc(((zzgvu) zzd2.zzbr()).zzaN());
        zza2.zza((zzgxf) zzc.zzb(zzgsmVar.zzg()));
        return zzgqs.zzb((zzgwf) zza2.zzbr());
    }

    public static /* synthetic */ zzgsb zzc(zzgqr zzgqrVar, zzghw zzghwVar) {
        if (!zzgqrVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgvr zzf2 = zzgvr.zzf(zzgqrVar.zze(), zzhao.zza());
            if (zzf2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgsi zze2 = zzgsm.zze();
            zze2.zzb(zzf2.zzh().zzd());
            zze2.zzc(zzf2.zzg().zza());
            zze2.zza((zzgsj) zzd.zzc(zzf2.zzg().zzc()));
            zze2.zzd((zzgsk) zzc.zzc(zzgqrVar.zzc()));
            zzgsm zze3 = zze2.zze();
            zzgrz zza2 = zzgsb.zza();
            zza2.zzc(zze3);
            zza2.zzb(zzgyy.zzb(zzf2.zzh().zzA(), zzghwVar));
            zza2.zza(zzgqrVar.zzf());
            return zza2.zzd();
        } catch (zzhbt | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgsm zzd(zzgqs zzgqsVar) {
        if (!zzgqsVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqsVar.zzc().zzi())));
        }
        try {
            zzgvu zzg2 = zzgvu.zzg(zzgqsVar.zzc().zzh(), zzhao.zza());
            if (zzg2.zzc() != 0) {
                throw new GeneralSecurityException(d.i("Parsing HmacParameters failed: unknown Version ", zzg2.zzc()));
            }
            zzgsi zze2 = zzgsm.zze();
            zze2.zzb(zzg2.zza());
            zze2.zzc(zzg2.zzh().zza());
            zze2.zza((zzgsj) zzd.zzc(zzg2.zzh().zzc()));
            zze2.zzd((zzgsk) zzc.zzc(zzgqsVar.zzc().zzg()));
            return zze2.zze();
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zze(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgpqVar.zzi(zze);
        zzgpqVar.zzh(zzf);
        zzgpqVar.zzg(zzg);
        zzgpqVar.zzf(zzh);
    }

    private static zzgvx zzf(zzgsm zzgsmVar) throws GeneralSecurityException {
        zzgvw zzd2 = zzgvx.zzd();
        zzd2.zzb(zzgsmVar.zzb());
        zzd2.zza((zzgvo) zzd.zzb(zzgsmVar.zzf()));
        return (zzgvx) zzd2.zzbr();
    }
}
