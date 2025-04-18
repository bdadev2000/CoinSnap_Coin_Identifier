package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgms {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyx zzb;
    private static final zzgpz zzc;
    private static final zzgpv zzd;
    private static final zzgom zze;
    private static final zzgoi zzf;

    static {
        zzgyx zzb2 = zzgrg.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzc = zzgpz.zzb(new zzgpx() { // from class: com.google.android.gms.internal.ads.zzgmo
            @Override // com.google.android.gms.internal.ads.zzgpx
            public final zzgqw zza(zzghs zzghsVar) {
                return zzgms.zzd((zzgjt) zzghsVar);
            }
        }, zzgjt.class, zzgqs.class);
        zzd = zzgpv.zzb(new zzgpt() { // from class: com.google.android.gms.internal.ads.zzgmp
            @Override // com.google.android.gms.internal.ads.zzgpt
            public final zzghs zza(zzgqw zzgqwVar) {
                return zzgms.zzb((zzgqs) zzgqwVar);
            }
        }, zzb2, zzgqs.class);
        zze = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgmq
            @Override // com.google.android.gms.internal.ads.zzgok
            public final zzgqw zza(zzghd zzghdVar, zzghw zzghwVar) {
                return zzgms.zzc((zzgjk) zzghdVar, zzghwVar);
            }
        }, zzgjk.class, zzgqr.class);
        zzf = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgmr
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) {
                return zzgms.zza((zzgqr) zzgqwVar, zzghwVar);
            }
        }, zzb2, zzgqr.class);
    }

    public static /* synthetic */ zzgjk zza(zzgqr zzgqrVar, zzghw zzghwVar) {
        if (!zzgqrVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzguy zze2 = zzguy.zze(zzgqrVar.zze(), zzhao.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgjq zzc2 = zzgjt.zzc();
            zzc2.zzb(zze2.zzf().zzd());
            zzc2.zza(12);
            zzc2.zzc(16);
            zzc2.zzd(zzf(zzgqrVar.zzc()));
            zzgjt zze3 = zzc2.zze();
            zzgji zza2 = zzgjk.zza();
            zza2.zzc(zze3);
            zza2.zzb(zzgyy.zzb(zze2.zzf().zzA(), zzghwVar));
            zza2.zza(zzgqrVar.zzf());
            return zza2.zzd();
        } catch (zzhbt unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgjt zzb(zzgqs zzgqsVar) {
        if (!zzgqsVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqsVar.zzc().zzi())));
        }
        try {
            zzgvb zzf2 = zzgvb.zzf(zzgqsVar.zzc().zzh(), zzhao.zza());
            if (zzf2.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgjq zzc2 = zzgjt.zzc();
            zzc2.zzb(zzf2.zza());
            zzc2.zza(12);
            zzc2.zzc(16);
            zzc2.zzd(zzf(zzgqsVar.zzc().zzg()));
            return zzc2.zze();
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgqr zzc(zzgjk zzgjkVar, zzghw zzghwVar) {
        zzgux zzc2 = zzguy.zzc();
        byte[] zzd2 = zzgjkVar.zzd().zzd(zzghwVar);
        zzc2.zza(zzgzs.zzv(zzd2, 0, zzd2.length));
        return zzgqr.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzguy) zzc2.zzbr()).zzaN(), zzgwa.SYMMETRIC, zzg(zzgjkVar.zzb().zzd()), zzgjkVar.zze());
    }

    public static /* synthetic */ zzgqs zzd(zzgjt zzgjtVar) {
        zzgwe zza2 = zzgwf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgva zzd2 = zzgvb.zzd();
        zzd2.zza(zzgjtVar.zzb());
        zza2.zzc(((zzgvb) zzd2.zzbr()).zzaN());
        zza2.zza(zzg(zzgjtVar.zzd()));
        return zzgqs.zzb((zzgwf) zza2.zzbr());
    }

    public static void zze(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgpqVar.zzi(zzc);
        zzgpqVar.zzh(zzd);
        zzgpqVar.zzg(zze);
        zzgpqVar.zzf(zzf);
    }

    private static zzgjr zzf(zzgxf zzgxfVar) throws GeneralSecurityException {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 1) {
            return zzgjr.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgjr.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(d.i("Unable to parse OutputPrefixType: ", zzgxfVar.zza()));
            }
        }
        return zzgjr.zzb;
    }

    private static zzgxf zzg(zzgjr zzgjrVar) throws GeneralSecurityException {
        if (zzgjr.zza.equals(zzgjrVar)) {
            return zzgxf.TINK;
        }
        if (zzgjr.zzb.equals(zzgjrVar)) {
            return zzgxf.CRUNCHY;
        }
        if (zzgjr.zzc.equals(zzgjrVar)) {
            return zzgxf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgjrVar)));
    }
}
