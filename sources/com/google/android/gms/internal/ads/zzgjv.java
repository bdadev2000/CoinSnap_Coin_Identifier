package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgjv {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgjr
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgjv.zzd((zzgjq) zzggjVar);
            }
        }, zzgjq.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgjv.zzb((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgjv.zzc((zzgjl) zzgfwVar, zzggnVar);
            }
        }, zzgjl.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgju
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgjv.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzgjl zza(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzgva zzd2 = zzgva.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    return zzgjl.zza(zzf(zzd2.zzf(), zzgowVar.zzc()), zzgowVar.zzf());
                }
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zzd2)));
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgjq zzb(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zzf(zzgvd.zzf(zzgoxVar.zzc().zzh(), zzgyh.zza()), zzgoxVar.zzc().zzg());
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgow zzc(zzgjl zzgjlVar, zzggn zzggnVar) {
        zzguy zzb2 = zzgva.zzb();
        zzb2.zza(zzg(zzgjlVar.zzb()));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgva) zzb2.zzbr()).zzaN(), zzgty.REMOTE, zzh(zzgjlVar.zzb().zzc()), zzgjlVar.zzd());
    }

    public static /* synthetic */ zzgox zzd(zzgjq zzgjqVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzgjqVar).zzaN());
        zza2.zza(zzh(zzgjqVar.zzc()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgjq zzf(zzgvd zzgvdVar, zzgve zzgveVar) throws GeneralSecurityException {
        zzgjn zzgjnVar;
        zzgjo zzgjoVar;
        zzguc zza2 = zzgue.zza();
        zza2.zzb(zzgvdVar.zza().zzi());
        zza2.zzc(zzgvdVar.zza().zzh());
        zza2.zza(zzgve.RAW);
        zzggj zza3 = zzggp.zza(((zzgue) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzgie) {
            zzgjnVar = zzgjn.zza;
        } else if (zza3 instanceof zzgiv) {
            zzgjnVar = zzgjn.zzc;
        } else if (zza3 instanceof zzgkm) {
            zzgjnVar = zzgjn.zzb;
        } else if (zza3 instanceof zzghj) {
            zzgjnVar = zzgjn.zzd;
        } else if (zza3 instanceof zzght) {
            zzgjnVar = zzgjn.zze;
        } else if (zza3 instanceof zzgip) {
            zzgjnVar = zzgjn.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
        }
        zzgjm zzgjmVar = new zzgjm(null);
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                zzgjoVar = zzgjo.zzb;
            } else {
                throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
            }
        } else {
            zzgjoVar = zzgjo.zza;
        }
        zzgjmVar.zzd(zzgjoVar);
        zzgjmVar.zzc(zzgvdVar.zzg());
        zzgjmVar.zza((zzggt) zza3);
        zzgjmVar.zzb(zzgjnVar);
        return zzgjmVar.zze();
    }

    private static zzgvd zzg(zzgjq zzgjqVar) throws GeneralSecurityException {
        try {
            zzgue zzf2 = zzgue.zzf(zzggp.zzb(zzgjqVar.zzb()), zzgyh.zza());
            zzgvb zzb2 = zzgvd.zzb();
            zzb2.zzb(zzgjqVar.zzd());
            zzb2.zza(zzf2);
            return (zzgvd) zzb2.zzbr();
        } catch (zzgzm e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    private static zzgve zzh(zzgjo zzgjoVar) throws GeneralSecurityException {
        if (zzgjo.zza.equals(zzgjoVar)) {
            return zzgve.TINK;
        }
        if (zzgjo.zzb.equals(zzgjoVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgjoVar)));
    }
}
