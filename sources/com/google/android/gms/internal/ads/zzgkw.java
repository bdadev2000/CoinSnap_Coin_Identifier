package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgkw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgks
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgkw.zzd((zzght) zzggjVar);
            }
        }, zzght.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgkt
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgkw.zzb((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgku
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgkw.zzc((zzghm) zzgfwVar, zzggnVar);
            }
        }, zzghm.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgkv
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgkw.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzghm zza(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgso zzd2 = zzgso.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    zzghq zzd3 = zzght.zzd();
                    zzd3.zzb(zzd2.zzg().zzd());
                    zzd3.zza(zzd2.zzf().zza());
                    zzd3.zzc(16);
                    zzd3.zzd(zzf(zzgowVar.zzc()));
                    zzght zze2 = zzd3.zze();
                    zzghk zza2 = zzghm.zza();
                    zza2.zzc(zze2);
                    zza2.zzb(zzgwv.zzb(zzd2.zzg().zzA(), zzggnVar));
                    zza2.zza(zzgowVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzght zzb(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgsr zzd2 = zzgsr.zzd(zzgoxVar.zzc().zzh(), zzgyh.zza());
                zzghq zzd3 = zzght.zzd();
                zzd3.zzb(zzd2.zza());
                zzd3.zza(zzd2.zzf().zza());
                zzd3.zzc(16);
                zzd3.zzd(zzf(zzgoxVar.zzc().zzg()));
                return zzd3.zze();
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgow zzc(zzghm zzghmVar, zzggn zzggnVar) {
        zzgsm zzb2 = zzgso.zzb();
        zzb2.zzb(zzg(zzghmVar.zzb()));
        byte[] zzd2 = zzghmVar.zzd().zzd(zzggnVar);
        zzb2.zza(zzgxp.zzv(zzd2, 0, zzd2.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgso) zzb2.zzbr()).zzaN(), zzgty.SYMMETRIC, zzh(zzghmVar.zzb().zze()), zzghmVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzght zzghtVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgsp zzb2 = zzgsr.zzb();
        zzb2.zzb(zzg(zzghtVar));
        zzb2.zza(zzghtVar.zzc());
        zza2.zzc(((zzgsr) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzghtVar.zze()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzghr zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
                    }
                } else {
                    return zzghr.zzc;
                }
            }
            return zzghr.zzb;
        }
        return zzghr.zza;
    }

    private static zzgsu zzg(zzght zzghtVar) throws GeneralSecurityException {
        zzgss zzb2 = zzgsu.zzb();
        zzb2.zza(zzghtVar.zzb());
        return (zzgsu) zzb2.zzbr();
    }

    private static zzgve zzh(zzghr zzghrVar) throws GeneralSecurityException {
        if (zzghr.zza.equals(zzghrVar)) {
            return zzgve.TINK;
        }
        if (zzghr.zzb.equals(zzghrVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzghr.zzc.equals(zzghrVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzghrVar)));
    }
}
