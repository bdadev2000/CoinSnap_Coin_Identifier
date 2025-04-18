package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class zzgjk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgjg
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgjk.zzd((zzgjf) zzggjVar);
            }
        }, zzgjf.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgjh
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgjk.zzb((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgji
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgjk.zzc((zzgjd) zzgfwVar, zzggnVar);
            }
        }, zzgjd.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgjj
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgjk.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzgjd zza(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzguu zzd2 = zzguu.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    return zzgjd.zza(zzgjf.zzc(zzd2.zzf().zzf(), zzf(zzgowVar.zzc())), zzgowVar.zzf());
                }
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzd2)));
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgjf zzb(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzgjf.zzc(zzgux.zzd(zzgoxVar.zzc().zzh(), zzgyh.zza()).zzf(), zzf(zzgoxVar.zzc().zzg()));
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgow zzc(zzgjd zzgjdVar, zzggn zzggnVar) {
        zzgus zzb2 = zzguu.zzb();
        zzguv zza2 = zzgux.zza();
        zza2.zza(zzgjdVar.zzb().zzd());
        zzb2.zza((zzgux) zza2.zzbr());
        return zzgow.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzguu) zzb2.zzbr()).zzaN(), zzgty.REMOTE, zzg(zzgjdVar.zzb().zzb()), zzgjdVar.zzd());
    }

    public static /* synthetic */ zzgox zzd(zzgjf zzgjfVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzguv zza3 = zzgux.zza();
        zza3.zza(zzgjfVar.zzd());
        zza2.zzc(((zzgux) zza3.zzbr()).zzaN());
        zza2.zza(zzg(zzgjfVar.zzb()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgje zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return zzgje.zzb;
            }
            throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
        }
        return zzgje.zza;
    }

    private static zzgve zzg(zzgje zzgjeVar) throws GeneralSecurityException {
        if (zzgje.zza.equals(zzgjeVar)) {
            return zzgve.TINK;
        }
        if (zzgje.zzb.equals(zzgjeVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjeVar.toString()));
    }
}
