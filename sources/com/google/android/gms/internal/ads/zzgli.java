package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgli {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgle
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgli.zzd((zzgip) zzggjVar);
            }
        }, zzgip.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzglf
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgli.zzb((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgli.zzc((zzgih) zzgfwVar, zzggnVar);
            }
        }, zzgih.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgli.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzgih zza(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgtd zzd2 = zzgtd.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    zzgim zzc2 = zzgip.zzc();
                    zzc2.zza(zzd2.zzf().zzd());
                    zzc2.zzb(zzf(zzgowVar.zzc()));
                    zzgip zzc3 = zzc2.zzc();
                    zzgif zza2 = zzgih.zza();
                    zza2.zzc(zzc3);
                    zza2.zzb(zzgwv.zzb(zzd2.zzf().zzA(), zzggnVar));
                    zza2.zza(zzgowVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgip zzb(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgtg zzf2 = zzgtg.zzf(zzgoxVar.zzc().zzh(), zzgyh.zza());
                if (zzf2.zzb() == 0) {
                    zzgim zzc2 = zzgip.zzc();
                    zzc2.zza(zzf2.zza());
                    zzc2.zzb(zzf(zzgoxVar.zzc().zzg()));
                    return zzc2.zzc();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgow zzc(zzgih zzgihVar, zzggn zzggnVar) {
        zzgtb zzb2 = zzgtd.zzb();
        byte[] zzd2 = zzgihVar.zzd().zzd(zzggnVar);
        zzb2.zza(zzgxp.zzv(zzd2, 0, zzd2.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgtd) zzb2.zzbr()).zzaN(), zzgty.SYMMETRIC, zzg(zzgihVar.zzb().zzd()), zzgihVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzgip zzgipVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgte zzc2 = zzgtg.zzc();
        zzc2.zza(zzgipVar.zzb());
        zza2.zzc(((zzgtg) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzgipVar.zzd()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgin zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
                    }
                } else {
                    return zzgin.zzc;
                }
            }
            return zzgin.zzb;
        }
        return zzgin.zza;
    }

    private static zzgve zzg(zzgin zzginVar) throws GeneralSecurityException {
        if (zzgin.zza.equals(zzginVar)) {
            return zzgve.TINK;
        }
        if (zzgin.zzb.equals(zzginVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgin.zzc.equals(zzginVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzginVar)));
    }
}
