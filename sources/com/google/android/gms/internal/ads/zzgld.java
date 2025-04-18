package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgld {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgld.zzd((zzgie) zzggjVar);
            }
        }, zzgie.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgla
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgld.zzb((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgld.zzc((zzghw) zzgfwVar, zzggnVar);
            }
        }, zzghw.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgld.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzghw zza(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgsx zzd2 = zzgsx.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    zzgib zzc2 = zzgie.zzc();
                    zzc2.zzb(zzd2.zzf().zzd());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgowVar.zzc()));
                    zzgie zze2 = zzc2.zze();
                    zzghu zza2 = zzghw.zza();
                    zza2.zzc(zze2);
                    zza2.zzb(zzgwv.zzb(zzd2.zzf().zzA(), zzggnVar));
                    zza2.zza(zzgowVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgie zzb(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgta zzf2 = zzgta.zzf(zzgoxVar.zzc().zzh(), zzgyh.zza());
                if (zzf2.zzb() == 0) {
                    zzgib zzc2 = zzgie.zzc();
                    zzc2.zzb(zzf2.zza());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgoxVar.zzc().zzg()));
                    return zzc2.zze();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgow zzc(zzghw zzghwVar, zzggn zzggnVar) {
        zzgsv zzb2 = zzgsx.zzb();
        byte[] zzd2 = zzghwVar.zzd().zzd(zzggnVar);
        zzb2.zza(zzgxp.zzv(zzd2, 0, zzd2.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgsx) zzb2.zzbr()).zzaN(), zzgty.SYMMETRIC, zzg(zzghwVar.zzb().zzd()), zzghwVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzgie zzgieVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgsy zzc2 = zzgta.zzc();
        zzc2.zza(zzgieVar.zzb());
        zza2.zzc(((zzgta) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzgieVar.zzd()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgic zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
                    }
                } else {
                    return zzgic.zzc;
                }
            }
            return zzgic.zzb;
        }
        return zzgic.zza;
    }

    private static zzgve zzg(zzgic zzgicVar) throws GeneralSecurityException {
        if (zzgic.zza.equals(zzgicVar)) {
            return zzgve.TINK;
        }
        if (zzgic.zzb.equals(zzgicVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgic.zzc.equals(zzgicVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgicVar)));
    }
}
