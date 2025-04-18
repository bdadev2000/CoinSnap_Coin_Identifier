package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgml {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyx zzb;
    private static final zzgpz zzc;
    private static final zzgpv zzd;
    private static final zzgom zze;
    private static final zzgoi zzf;

    static {
        zzgyx zzb2 = zzgrg.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzc = zzgpz.zzb(new zzgpx() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgpx
            public final zzgqw zza(zzghs zzghsVar) {
                return zzgml.zzd((zzgjg) zzghsVar);
            }
        }, zzgjg.class, zzgqs.class);
        zzd = zzgpv.zzb(new zzgpt() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgpt
            public final zzghs zza(zzgqw zzgqwVar) {
                return zzgml.zzb((zzgqs) zzgqwVar);
            }
        }, zzb2, zzgqs.class);
        zze = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgmj
            @Override // com.google.android.gms.internal.ads.zzgok
            public final zzgqw zza(zzghd zzghdVar, zzghw zzghwVar) {
                return zzgml.zzc((zzgiy) zzghdVar, zzghwVar);
            }
        }, zzgiy.class, zzgqr.class);
        zzf = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgmk
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) {
                return zzgml.zza((zzgqr) zzgqwVar, zzghwVar);
            }
        }, zzb2, zzgqr.class);
    }

    public static /* synthetic */ zzgiy zza(zzgqr zzgqrVar, zzghw zzghwVar) {
        if (!zzgqrVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgup zze2 = zzgup.zze(zzgqrVar.zze(), zzhao.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgjd zzd2 = zzgjg.zzd();
            zzd2.zzb(zze2.zzg().zzd());
            zzd2.zza(zze2.zzf().zza());
            zzd2.zzc(16);
            zzd2.zzd(zzf(zzgqrVar.zzc()));
            zzgjg zze3 = zzd2.zze();
            zzgiw zza2 = zzgiy.zza();
            zza2.zzc(zze3);
            zza2.zzb(zzgyy.zzb(zze2.zzg().zzA(), zzghwVar));
            zza2.zza(zzgqrVar.zzf());
            return zza2.zzd();
        } catch (zzhbt unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzgjg zzb(zzgqs zzgqsVar) {
        if (!zzgqsVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqsVar.zzc().zzi())));
        }
        try {
            zzgus zze2 = zzgus.zze(zzgqsVar.zzc().zzh(), zzhao.zza());
            zzgjd zzd2 = zzgjg.zzd();
            zzd2.zzb(zze2.zza());
            zzd2.zza(zze2.zzf().zza());
            zzd2.zzc(16);
            zzd2.zzd(zzf(zzgqsVar.zzc().zzg()));
            return zzd2.zze();
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgqr zzc(zzgiy zzgiyVar, zzghw zzghwVar) {
        zzguo zzc2 = zzgup.zzc();
        zzc2.zzb(zzg(zzgiyVar.zzb()));
        byte[] zzd2 = zzgiyVar.zzd().zzd(zzghwVar);
        zzc2.zza(zzgzs.zzv(zzd2, 0, zzd2.length));
        return zzgqr.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgup) zzc2.zzbr()).zzaN(), zzgwa.SYMMETRIC, zzh(zzgiyVar.zzb().zze()), zzgiyVar.zze());
    }

    public static /* synthetic */ zzgqs zzd(zzgjg zzgjgVar) {
        zzgwe zza2 = zzgwf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgur zzc2 = zzgus.zzc();
        zzc2.zzb(zzg(zzgjgVar));
        zzc2.zza(zzgjgVar.zzc());
        zza2.zzc(((zzgus) zzc2.zzbr()).zzaN());
        zza2.zza(zzh(zzgjgVar.zze()));
        return zzgqs.zzb((zzgwf) zza2.zzbr());
    }

    public static void zze(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgpqVar.zzi(zzc);
        zzgpqVar.zzh(zzd);
        zzgpqVar.zzg(zze);
        zzgpqVar.zzf(zzf);
    }

    private static zzgje zzf(zzgxf zzgxfVar) throws GeneralSecurityException {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 1) {
            return zzgje.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgje.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(d.i("Unable to parse OutputPrefixType: ", zzgxfVar.zza()));
            }
        }
        return zzgje.zzb;
    }

    private static zzguv zzg(zzgjg zzgjgVar) throws GeneralSecurityException {
        zzguu zzc2 = zzguv.zzc();
        zzc2.zza(zzgjgVar.zzb());
        return (zzguv) zzc2.zzbr();
    }

    private static zzgxf zzh(zzgje zzgjeVar) throws GeneralSecurityException {
        if (zzgje.zza.equals(zzgjeVar)) {
            return zzgxf.TINK;
        }
        if (zzgje.zzb.equals(zzgjeVar)) {
            return zzgxf.CRUNCHY;
        }
        if (zzgje.zzc.equals(zzgjeVar)) {
            return zzgxf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgjeVar)));
    }
}
