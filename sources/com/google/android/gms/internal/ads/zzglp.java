package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzglp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgll
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzglp.zzd((zzgiv) zzggjVar);
            }
        }, zzgiv.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzglm
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzglp.zzb((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgln
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzglp.zzc((zzgiq) zzgfwVar, zzggnVar);
            }
        }, zzgiq.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzglo
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzglp.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzgiq zza(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgtj zzd2 = zzgtj.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    return zzgiq.zza(zzf(zzgowVar.zzc()), zzgwv.zzb(zzd2.zzf().zzA(), zzggnVar), zzgowVar.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgiv zzb(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgtm.zzc(zzgoxVar.zzc().zzh(), zzgyh.zza());
                return zzgiv.zzc(zzf(zzgoxVar.zzc().zzg()));
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgow zzc(zzgiq zzgiqVar, zzggn zzggnVar) {
        zzgth zzb2 = zzgtj.zzb();
        byte[] zzd2 = zzgiqVar.zzd().zzd(zzggnVar);
        zzb2.zza(zzgxp.zzv(zzd2, 0, zzd2.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgtj) zzb2.zzbr()).zzaN(), zzgty.SYMMETRIC, zzg(zzgiqVar.zzb().zzb()), zzgiqVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzgiv zzgivVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(zzgtm.zzb().zzaN());
        zza2.zza(zzg(zzgivVar.zzb()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgiu zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
                    }
                } else {
                    return zzgiu.zzc;
                }
            }
            return zzgiu.zzb;
        }
        return zzgiu.zza;
    }

    private static zzgve zzg(zzgiu zzgiuVar) throws GeneralSecurityException {
        if (zzgiu.zza.equals(zzgiuVar)) {
            return zzgve.TINK;
        }
        if (zzgiu.zzb.equals(zzgiuVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgiu.zzc.equals(zzgiuVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgiuVar.toString()));
    }
}
