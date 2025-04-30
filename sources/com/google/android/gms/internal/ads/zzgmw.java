package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgmw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgms
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgmw.zzd((zzgjz) zzghxVar);
            }
        }, zzgjz.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgmw.zzb((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgmu
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgmw.zzc((zzgjq) zzghiVar, zzgicVar);
            }
        }, zzgjq.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgmv
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgmw.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgjq zza(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgvc zze2 = zzgvc.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    zzgjw zzc2 = zzgjz.zzc();
                    zzc2.zzb(zze2.zzf().zzd());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgqlVar.zzc()));
                    zzgjz zze3 = zzc2.zze();
                    zzgjo zza2 = zzgjq.zza();
                    zza2.zzc(zze3);
                    zza2.zzb(zzgzf.zzb(zze2.zzf().zzB(), zzgicVar));
                    zza2.zza(zzgqlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgjz zzb(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgvf zzf2 = zzgvf.zzf(zzgqmVar.zzc().zzh(), zzhay.zza());
                if (zzf2.zzc() == 0) {
                    zzgjw zzc2 = zzgjz.zzc();
                    zzc2.zzb(zzf2.zza());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgqmVar.zzc().zzg()));
                    return zzc2.zze();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgql zzc(zzgjq zzgjqVar, zzgic zzgicVar) {
        zzgvb zzc2 = zzgvc.zzc();
        byte[] zzd2 = zzgjqVar.zzd().zzd(zzgicVar);
        zzc2.zza(zzhac.zzv(zzd2, 0, zzd2.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgvc) zzc2.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzg(zzgjqVar.zzb().zzd()), zzgjqVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgjz zzgjzVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgve zzd2 = zzgvf.zzd();
        zzd2.zza(zzgjzVar.zzb());
        zza2.zzc(((zzgvf) zzd2.zzbr()).zzaN());
        zza2.zza(zzg(zzgjzVar.zzd()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgjx zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return zzgjx.zzc;
                }
            }
            return zzgjx.zzb;
        }
        return zzgjx.zza;
    }

    private static zzgxn zzg(zzgjx zzgjxVar) throws GeneralSecurityException {
        if (zzgjx.zza.equals(zzgjxVar)) {
            return zzgxn.TINK;
        }
        if (zzgjx.zzb.equals(zzgjxVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgjx.zzc.equals(zzgjxVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgjxVar)));
    }
}
