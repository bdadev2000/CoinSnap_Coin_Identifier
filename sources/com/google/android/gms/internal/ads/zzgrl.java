package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgrl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgmm zzc;
    private static final zzgmm zzd;
    private static final zzgoi zze;
    private static final zzgoe zzf;
    private static final zzgmw zzg;
    private static final zzgms zzh;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzgmk zza2 = zzgmm.zza();
        zza2.zza(zzgve.RAW, zzgqj.zzd);
        zza2.zza(zzgve.TINK, zzgqj.zza);
        zza2.zza(zzgve.LEGACY, zzgqj.zzc);
        zza2.zza(zzgve.CRUNCHY, zzgqj.zzb);
        zzc = zza2.zzb();
        zzgmk zza3 = zzgmm.zza();
        zza3.zza(zzgtn.SHA1, zzgqi.zza);
        zza3.zza(zzgtn.SHA224, zzgqi.zzb);
        zza3.zza(zzgtn.SHA256, zzgqi.zzc);
        zza3.zza(zzgtn.SHA384, zzgqi.zzd);
        zza3.zza(zzgtn.SHA512, zzgqi.zze);
        zzd = zza3.zzb();
        zze = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgrh
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgrl.zzb((zzgql) zzggjVar);
            }
        }, zzgql.class, zzgox.class);
        zzf = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgri
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgrl.zzd((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zzg = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgrj
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgrl.zza((zzgqb) zzgfwVar, zzggnVar);
            }
        }, zzgqb.class, zzgow.class);
        zzh = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgrk
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgrl.zzc((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzgow zza(zzgqb zzgqbVar, zzggn zzggnVar) {
        zzgto zzb2 = zzgtq.zzb();
        zzb2.zzb(zzf(zzgqbVar.zzb()));
        byte[] zzd2 = zzgqbVar.zzd().zzd(zzggnVar);
        zzb2.zza(zzgxp.zzv(zzd2, 0, zzd2.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgtq) zzb2.zzbr()).zzaN(), zzgty.SYMMETRIC, (zzgve) zzc.zzb(zzgqbVar.zzb().zzg()), zzgqbVar.zze());
    }

    public static /* synthetic */ zzgox zzb(zzgql zzgqlVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgtr zzc2 = zzgtt.zzc();
        zzc2.zzb(zzf(zzgqlVar));
        zzc2.zza(zzgqlVar.zzc());
        zza2.zzc(((zzgtt) zzc2.zzbr()).zzaN());
        zza2.zza((zzgve) zzc.zzb(zzgqlVar.zzg()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static /* synthetic */ zzgqb zzc(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgtq zzf2 = zzgtq.zzf(zzgowVar.zze(), zzgyh.zza());
                if (zzf2.zza() == 0) {
                    zzgqh zze2 = zzgql.zze();
                    zze2.zzb(zzf2.zzh().zzd());
                    zze2.zzc(zzf2.zzg().zza());
                    zze2.zza((zzgqi) zzd.zzc(zzf2.zzg().zzb()));
                    zze2.zzd((zzgqj) zzc.zzc(zzgowVar.zzc()));
                    zzgql zze3 = zze2.zze();
                    zzgpz zza2 = zzgqb.zza();
                    zza2.zzc(zze3);
                    zza2.zzb(zzgwv.zzb(zzf2.zzh().zzA(), zzggnVar));
                    zza2.zza(zzgowVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgql zzd(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgtt zzg2 = zzgtt.zzg(zzgoxVar.zzc().zzh(), zzgyh.zza());
                if (zzg2.zzb() == 0) {
                    zzgqh zze2 = zzgql.zze();
                    zze2.zzb(zzg2.zza());
                    zze2.zzc(zzg2.zzh().zza());
                    zze2.zza((zzgqi) zzd.zzc(zzg2.zzh().zzb()));
                    zze2.zzd((zzgqj) zzc.zzc(zzgoxVar.zzc().zzg()));
                    return zze2.zze();
                }
                throw new GeneralSecurityException(j.i("Parsing HmacParameters failed: unknown Version ", zzg2.zzb()));
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zze);
        zzgnzVar.zzh(zzf);
        zzgnzVar.zzg(zzg);
        zzgnzVar.zzf(zzh);
    }

    private static zzgtw zzf(zzgql zzgqlVar) throws GeneralSecurityException {
        zzgtu zzc2 = zzgtw.zzc();
        zzc2.zzb(zzgqlVar.zzb());
        zzc2.zza((zzgtn) zzd.zzb(zzgqlVar.zzf()));
        return (zzgtw) zzc2.zzbr();
    }
}
