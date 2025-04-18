package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgme {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgme.zzd((zzgkm) zzggjVar);
            }
        }, zzgkm.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgme.zzb((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgme.zzc((zzgkg) zzgfwVar, zzggnVar);
            }
        }, zzgkg.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgme.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzgkg zza(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzgvk zzd2 = zzgvk.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    return zzgkg.zza(zzf(zzgowVar.zzc()), zzgwv.zzb(zzd2.zzf().zzA(), zzggnVar), zzgowVar.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgkm zzb(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzgvn.zzd(zzgoxVar.zzc().zzh(), zzgyh.zza()).zza() == 0) {
                    return zzgkm.zzc(zzf(zzgoxVar.zzc().zzg()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgow zzc(zzgkg zzgkgVar, zzggn zzggnVar) {
        zzgvi zzb2 = zzgvk.zzb();
        byte[] zzd2 = zzgkgVar.zzd().zzd(zzggnVar);
        zzb2.zza(zzgxp.zzv(zzd2, 0, zzd2.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgvk) zzb2.zzbr()).zzaN(), zzgty.SYMMETRIC, zzg(zzgkgVar.zzb().zzb()), zzgkgVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzgkm zzgkmVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza2.zzc(zzgvn.zzc().zzaN());
        zza2.zza(zzg(zzgkmVar.zzb()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgkl zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
                    }
                } else {
                    return zzgkl.zzc;
                }
            }
            return zzgkl.zzb;
        }
        return zzgkl.zza;
    }

    private static zzgve zzg(zzgkl zzgklVar) throws GeneralSecurityException {
        if (zzgkl.zza.equals(zzgklVar)) {
            return zzgve.TINK;
        }
        if (zzgkl.zzb.equals(zzgklVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgkl.zzc.equals(zzgklVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgklVar.toString()));
    }
}
