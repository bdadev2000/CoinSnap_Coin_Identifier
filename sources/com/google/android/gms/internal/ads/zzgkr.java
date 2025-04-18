package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgkr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgkr.zzd((zzghj) zzggjVar);
            }
        }, zzghj.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgko
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgkr.zzb((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgkp
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgkr.zzc((zzgha) zzgfwVar, zzggnVar);
            }
        }, zzgha.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgkr.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzgha zza(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgrz zzd2 = zzgrz.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    if (zzd2.zzf().zza() == 0) {
                        if (zzd2.zzg().zza() == 0) {
                            zzghf zzf2 = zzghj.zzf();
                            zzf2.zza(zzd2.zzf().zzg().zzd());
                            zzf2.zzc(zzd2.zzg().zzh().zzd());
                            zzf2.zzd(zzd2.zzf().zzf().zza());
                            zzf2.zze(zzd2.zzg().zzg().zza());
                            zzf2.zzb(zzf(zzd2.zzg().zzg().zzb()));
                            zzf2.zzf(zzg(zzgowVar.zzc()));
                            zzghj zzg = zzf2.zzg();
                            zzggy zza2 = zzgha.zza();
                            zza2.zzd(zzg);
                            zza2.zza(zzgwv.zzb(zzd2.zzf().zzg().zzA(), zzggnVar));
                            zza2.zzb(zzgwv.zzb(zzd2.zzg().zzh().zzA(), zzggnVar));
                            zza2.zzc(zzgowVar.zzf());
                            return zza2.zze();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzghj zzb(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgsc zzc2 = zzgsc.zzc(zzgoxVar.zzc().zzh(), zzgyh.zza());
                if (zzc2.zzf().zzb() == 0) {
                    zzghf zzf2 = zzghj.zzf();
                    zzf2.zza(zzc2.zzd().zza());
                    zzf2.zzc(zzc2.zzf().zza());
                    zzf2.zzd(zzc2.zzd().zzf().zza());
                    zzf2.zze(zzc2.zzf().zzh().zza());
                    zzf2.zzb(zzf(zzc2.zzf().zzh().zzb()));
                    zzf2.zzf(zzg(zzgoxVar.zzc().zzg()));
                    return zzf2.zzg();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgow zzc(zzgha zzghaVar, zzggn zzggnVar) {
        zzgrx zzb2 = zzgrz.zzb();
        zzgsd zzb3 = zzgsf.zzb();
        zzgsj zzb4 = zzgsl.zzb();
        zzb4.zza(zzghaVar.zzb().zzd());
        zzb3.zzb((zzgsl) zzb4.zzbr());
        byte[] zzd2 = zzghaVar.zzd().zzd(zzggnVar);
        zzb3.zza(zzgxp.zzv(zzd2, 0, zzd2.length));
        zzb2.zza((zzgsf) zzb3.zzbr());
        zzgto zzb5 = zzgtq.zzb();
        zzb5.zzb(zzh(zzghaVar.zzb()));
        byte[] zzd3 = zzghaVar.zze().zzd(zzggnVar);
        zzb5.zza(zzgxp.zzv(zzd3, 0, zzd3.length));
        zzb2.zzb((zzgtq) zzb5.zzbr());
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgrz) zzb2.zzbr()).zzaN(), zzgty.SYMMETRIC, zzi(zzghaVar.zzb().zzh()), zzghaVar.zzf());
    }

    public static /* synthetic */ zzgox zzd(zzghj zzghjVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgsa zza3 = zzgsc.zza();
        zzgsg zzb2 = zzgsi.zzb();
        zzgsj zzb3 = zzgsl.zzb();
        zzb3.zza(zzghjVar.zzd());
        zzb2.zzb((zzgsl) zzb3.zzbr());
        zzb2.zza(zzghjVar.zzb());
        zza3.zza((zzgsi) zzb2.zzbr());
        zzgtr zzc2 = zzgtt.zzc();
        zzc2.zzb(zzh(zzghjVar));
        zzc2.zza(zzghjVar.zzc());
        zza3.zzb((zzgtt) zzc2.zzbr());
        zza2.zzc(((zzgsc) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzghjVar.zzh()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzghg zzf(zzgtn zzgtnVar) throws GeneralSecurityException {
        int ordinal = zzgtnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return zzghg.zzb;
                        }
                        throw new GeneralSecurityException(j.i("Unable to parse HashType: ", zzgtnVar.zza()));
                    }
                    return zzghg.zze;
                }
                return zzghg.zzc;
            }
            return zzghg.zzd;
        }
        return zzghg.zza;
    }

    private static zzghh zzg(zzgve zzgveVar) throws GeneralSecurityException {
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
                    }
                } else {
                    return zzghh.zzc;
                }
            }
            return zzghh.zzb;
        }
        return zzghh.zza;
    }

    private static zzgtw zzh(zzghj zzghjVar) throws GeneralSecurityException {
        zzgtn zzgtnVar;
        zzgtu zzc2 = zzgtw.zzc();
        zzc2.zzb(zzghjVar.zze());
        zzghg zzg = zzghjVar.zzg();
        if (zzghg.zza.equals(zzg)) {
            zzgtnVar = zzgtn.SHA1;
        } else if (zzghg.zzb.equals(zzg)) {
            zzgtnVar = zzgtn.SHA224;
        } else if (zzghg.zzc.equals(zzg)) {
            zzgtnVar = zzgtn.SHA256;
        } else if (zzghg.zzd.equals(zzg)) {
            zzgtnVar = zzgtn.SHA384;
        } else if (zzghg.zze.equals(zzg)) {
            zzgtnVar = zzgtn.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
        }
        zzc2.zza(zzgtnVar);
        return (zzgtw) zzc2.zzbr();
    }

    private static zzgve zzi(zzghh zzghhVar) throws GeneralSecurityException {
        if (zzghh.zza.equals(zzghhVar)) {
            return zzgve.TINK;
        }
        if (zzghh.zzb.equals(zzghhVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzghh.zzc.equals(zzghhVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzghhVar)));
    }
}
