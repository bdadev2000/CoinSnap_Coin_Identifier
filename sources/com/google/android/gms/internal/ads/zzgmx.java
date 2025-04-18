package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgmx {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyx zzb;
    private static final zzgpz zzc;
    private static final zzgpv zzd;
    private static final zzgom zze;
    private static final zzgoi zzf;

    static {
        zzgyx zzb2 = zzgrg.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
        zzc = zzgpz.zzb(new zzgpx() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // com.google.android.gms.internal.ads.zzgpx
            public final zzgqw zza(zzghs zzghsVar) {
                return zzgmx.zzd((zzgkg) zzghsVar);
            }
        }, zzgkg.class, zzgqs.class);
        zzd = zzgpv.zzb(new zzgpt() { // from class: com.google.android.gms.internal.ads.zzgmu
            @Override // com.google.android.gms.internal.ads.zzgpt
            public final zzghs zza(zzgqw zzgqwVar) {
                return zzgmx.zzb((zzgqs) zzgqwVar);
            }
        }, zzb2, zzgqs.class);
        zze = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgmv
            @Override // com.google.android.gms.internal.ads.zzgok
            public final zzgqw zza(zzghd zzghdVar, zzghw zzghwVar) {
                return zzgmx.zzc((zzgjx) zzghdVar, zzghwVar);
            }
        }, zzgjx.class, zzgqr.class);
        zzf = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgmw
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) {
                return zzgmx.zza((zzgqr) zzgqwVar, zzghwVar);
            }
        }, zzb2, zzgqr.class);
    }

    public static /* synthetic */ zzgjx zza(zzgqr zzgqrVar, zzghw zzghwVar) {
        if (!zzgqrVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgve zze2 = zzgve.zze(zzgqrVar.zze(), zzhao.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgkd zzc2 = zzgkg.zzc();
            zzc2.zza(zze2.zzf().zzd());
            zzc2.zzb(zzf(zzgqrVar.zzc()));
            zzgkg zzc3 = zzc2.zzc();
            zzgjv zza2 = zzgjx.zza();
            zza2.zzc(zzc3);
            zza2.zzb(zzgyy.zzb(zze2.zzf().zzA(), zzghwVar));
            zza2.zza(zzgqrVar.zzf());
            return zza2.zzd();
        } catch (zzhbt unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgkg zzb(zzgqs zzgqsVar) {
        if (!zzgqsVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqsVar.zzc().zzi())));
        }
        try {
            zzgvh zzf2 = zzgvh.zzf(zzgqsVar.zzc().zzh(), zzhao.zza());
            if (zzf2.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgkd zzc2 = zzgkg.zzc();
            zzc2.zza(zzf2.zza());
            zzc2.zzb(zzf(zzgqsVar.zzc().zzg()));
            return zzc2.zzc();
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgqr zzc(zzgjx zzgjxVar, zzghw zzghwVar) {
        zzgvd zzc2 = zzgve.zzc();
        byte[] zzd2 = zzgjxVar.zzd().zzd(zzghwVar);
        zzc2.zza(zzgzs.zzv(zzd2, 0, zzd2.length));
        return zzgqr.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgve) zzc2.zzbr()).zzaN(), zzgwa.SYMMETRIC, zzg(zzgjxVar.zzb().zzd()), zzgjxVar.zze());
    }

    public static /* synthetic */ zzgqs zzd(zzgkg zzgkgVar) {
        zzgwe zza2 = zzgwf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgvg zzd2 = zzgvh.zzd();
        zzd2.zza(zzgkgVar.zzb());
        zza2.zzc(((zzgvh) zzd2.zzbr()).zzaN());
        zza2.zza(zzg(zzgkgVar.zzd()));
        return zzgqs.zzb((zzgwf) zza2.zzbr());
    }

    public static void zze(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgpqVar.zzi(zzc);
        zzgpqVar.zzh(zzd);
        zzgpqVar.zzg(zze);
        zzgpqVar.zzf(zzf);
    }

    private static zzgke zzf(zzgxf zzgxfVar) throws GeneralSecurityException {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 1) {
            return zzgke.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgke.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(d.i("Unable to parse OutputPrefixType: ", zzgxfVar.zza()));
            }
        }
        return zzgke.zzb;
    }

    private static zzgxf zzg(zzgke zzgkeVar) throws GeneralSecurityException {
        if (zzgke.zza.equals(zzgkeVar)) {
            return zzgxf.TINK;
        }
        if (zzgke.zzb.equals(zzgkeVar)) {
            return zzgxf.CRUNCHY;
        }
        if (zzgke.zzc.equals(zzgkeVar)) {
            return zzgxf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgkeVar)));
    }
}
