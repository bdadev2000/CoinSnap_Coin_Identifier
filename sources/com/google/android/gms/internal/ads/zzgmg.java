package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgmg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyx zzb;
    private static final zzgpz zzc;
    private static final zzgpv zzd;
    private static final zzgom zze;
    private static final zzgoi zzf;

    static {
        zzgyx zzb2 = zzgrg.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
        zzc = zzgpz.zzb(new zzgpx() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // com.google.android.gms.internal.ads.zzgpx
            public final zzgqw zza(zzghs zzghsVar) {
                return zzgmg.zzd((zzgiu) zzghsVar);
            }
        }, zzgiu.class, zzgqs.class);
        zzd = zzgpv.zzb(new zzgpt() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // com.google.android.gms.internal.ads.zzgpt
            public final zzghs zza(zzgqw zzgqwVar) {
                return zzgmg.zzb((zzgqs) zzgqwVar);
            }
        }, zzb2, zzgqs.class);
        zze = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgme
            @Override // com.google.android.gms.internal.ads.zzgok
            public final zzgqw zza(zzghd zzghdVar, zzghw zzghwVar) {
                return zzgmg.zzc((zzgik) zzghdVar, zzghwVar);
            }
        }, zzgik.class, zzgqr.class);
        zzf = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgmf
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) {
                return zzgmg.zza((zzgqr) zzgqwVar, zzghwVar);
            }
        }, zzb2, zzgqr.class);
    }

    public static /* synthetic */ zzgik zza(zzgqr zzgqrVar, zzghw zzghwVar) {
        if (!zzgqrVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgua zze2 = zzgua.zze(zzgqrVar.zze(), zzhao.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zze2.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zze2.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgiq zzf2 = zzgiu.zzf();
            zzf2.zza(zze2.zzf().zzg().zzd());
            zzf2.zzc(zze2.zzg().zzh().zzd());
            zzf2.zzd(zze2.zzf().zzf().zza());
            zzf2.zze(zze2.zzg().zzg().zza());
            zzf2.zzb(zzf(zze2.zzg().zzg().zzc()));
            zzf2.zzf(zzg(zzgqrVar.zzc()));
            zzgiu zzg = zzf2.zzg();
            zzgii zza2 = zzgik.zza();
            zza2.zzd(zzg);
            zza2.zza(zzgyy.zzb(zze2.zzf().zzg().zzA(), zzghwVar));
            zza2.zzb(zzgyy.zzb(zze2.zzg().zzh().zzA(), zzghwVar));
            zza2.zzc(zzgqrVar.zzf());
            return zza2.zze();
        } catch (zzhbt unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzgiu zzb(zzgqs zzgqsVar) {
        if (!zzgqsVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqsVar.zzc().zzi())));
        }
        try {
            zzgud zzd2 = zzgud.zzd(zzgqsVar.zzc().zzh(), zzhao.zza());
            if (zzd2.zzf().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgiq zzf2 = zzgiu.zzf();
            zzf2.zza(zzd2.zze().zza());
            zzf2.zzc(zzd2.zzf().zza());
            zzf2.zzd(zzd2.zze().zzf().zza());
            zzf2.zze(zzd2.zzf().zzh().zza());
            zzf2.zzb(zzf(zzd2.zzf().zzh().zzc()));
            zzf2.zzf(zzg(zzgqsVar.zzc().zzg()));
            return zzf2.zzg();
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgqr zzc(zzgik zzgikVar, zzghw zzghwVar) {
        zzgtz zzc2 = zzgua.zzc();
        zzguf zzc3 = zzgug.zzc();
        zzgul zzc4 = zzgum.zzc();
        zzc4.zza(zzgikVar.zzb().zzd());
        zzc3.zzb((zzgum) zzc4.zzbr());
        byte[] zzd2 = zzgikVar.zzd().zzd(zzghwVar);
        zzc3.zza(zzgzs.zzv(zzd2, 0, zzd2.length));
        zzc2.zza((zzgug) zzc3.zzbr());
        zzgvq zzc5 = zzgvr.zzc();
        zzc5.zzb(zzh(zzgikVar.zzb()));
        byte[] zzd3 = zzgikVar.zze().zzd(zzghwVar);
        zzc5.zza(zzgzs.zzv(zzd3, 0, zzd3.length));
        zzc2.zzb((zzgvr) zzc5.zzbr());
        return zzgqr.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgua) zzc2.zzbr()).zzaN(), zzgwa.SYMMETRIC, zzi(zzgikVar.zzb().zzh()), zzgikVar.zzf());
    }

    public static /* synthetic */ zzgqs zzd(zzgiu zzgiuVar) {
        zzgwe zza2 = zzgwf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzguc zza3 = zzgud.zza();
        zzgui zzc2 = zzguj.zzc();
        zzgul zzc3 = zzgum.zzc();
        zzc3.zza(zzgiuVar.zzd());
        zzc2.zzb((zzgum) zzc3.zzbr());
        zzc2.zza(zzgiuVar.zzb());
        zza3.zza((zzguj) zzc2.zzbr());
        zzgvt zzd2 = zzgvu.zzd();
        zzd2.zzb(zzh(zzgiuVar));
        zzd2.zza(zzgiuVar.zzc());
        zza3.zzb((zzgvu) zzd2.zzbr());
        zza2.zzc(((zzgud) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzgiuVar.zzh()));
        return zzgqs.zzb((zzgwf) zza2.zzbr());
    }

    public static void zze(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgpqVar.zzi(zzc);
        zzgpqVar.zzh(zzd);
        zzgpqVar.zzg(zze);
        zzgpqVar.zzf(zzf);
    }

    private static zzgir zzf(zzgvo zzgvoVar) throws GeneralSecurityException {
        int ordinal = zzgvoVar.ordinal();
        if (ordinal == 1) {
            return zzgir.zza;
        }
        if (ordinal == 2) {
            return zzgir.zzd;
        }
        if (ordinal == 3) {
            return zzgir.zzc;
        }
        if (ordinal == 4) {
            return zzgir.zze;
        }
        if (ordinal == 5) {
            return zzgir.zzb;
        }
        throw new GeneralSecurityException(d.i("Unable to parse HashType: ", zzgvoVar.zza()));
    }

    private static zzgis zzg(zzgxf zzgxfVar) throws GeneralSecurityException {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 1) {
            return zzgis.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgis.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(d.i("Unable to parse OutputPrefixType: ", zzgxfVar.zza()));
            }
        }
        return zzgis.zzb;
    }

    private static zzgvx zzh(zzgiu zzgiuVar) throws GeneralSecurityException {
        zzgvo zzgvoVar;
        zzgvw zzd2 = zzgvx.zzd();
        zzd2.zzb(zzgiuVar.zze());
        zzgir zzg = zzgiuVar.zzg();
        if (zzgir.zza.equals(zzg)) {
            zzgvoVar = zzgvo.SHA1;
        } else if (zzgir.zzb.equals(zzg)) {
            zzgvoVar = zzgvo.SHA224;
        } else if (zzgir.zzc.equals(zzg)) {
            zzgvoVar = zzgvo.SHA256;
        } else if (zzgir.zzd.equals(zzg)) {
            zzgvoVar = zzgvo.SHA384;
        } else {
            if (!zzgir.zze.equals(zzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
            }
            zzgvoVar = zzgvo.SHA512;
        }
        zzd2.zza(zzgvoVar);
        return (zzgvx) zzd2.zzbr();
    }

    private static zzgxf zzi(zzgis zzgisVar) throws GeneralSecurityException {
        if (zzgis.zza.equals(zzgisVar)) {
            return zzgxf.TINK;
        }
        if (zzgis.zzb.equals(zzgisVar)) {
            return zzgxf.CRUNCHY;
        }
        if (zzgis.zzc.equals(zzgisVar)) {
            return zzgxf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgisVar)));
    }
}
