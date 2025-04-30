package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgnb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgmx
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgnb.zzd((zzgkm) zzghxVar);
            }
        }, zzgkm.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgmy
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgnb.zzb((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgmz
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgnb.zzc((zzgkd) zzghiVar, zzgicVar);
            }
        }, zzgkd.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgna
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgnb.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgkd zza(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgvi zze2 = zzgvi.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    zzgkj zzc2 = zzgkm.zzc();
                    zzc2.zza(zze2.zzf().zzd());
                    zzc2.zzb(zzf(zzgqlVar.zzc()));
                    zzgkm zzc3 = zzc2.zzc();
                    zzgkb zza2 = zzgkd.zza();
                    zza2.zzc(zzc3);
                    zza2.zzb(zzgzf.zzb(zze2.zzf().zzB(), zzgicVar));
                    zza2.zza(zzgqlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgkm zzb(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgvl zzf2 = zzgvl.zzf(zzgqmVar.zzc().zzh(), zzhay.zza());
                if (zzf2.zzc() == 0) {
                    zzgkj zzc2 = zzgkm.zzc();
                    zzc2.zza(zzf2.zza());
                    zzc2.zzb(zzf(zzgqmVar.zzc().zzg()));
                    return zzc2.zzc();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgql zzc(zzgkd zzgkdVar, zzgic zzgicVar) {
        zzgvh zzc2 = zzgvi.zzc();
        byte[] zzd2 = zzgkdVar.zzd().zzd(zzgicVar);
        zzc2.zza(zzhac.zzv(zzd2, 0, zzd2.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgvi) zzc2.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzg(zzgkdVar.zzb().zzd()), zzgkdVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgkm zzgkmVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgvk zzd2 = zzgvl.zzd();
        zzd2.zza(zzgkmVar.zzb());
        zza2.zzc(((zzgvl) zzd2.zzbr()).zzaN());
        zza2.zza(zzg(zzgkmVar.zzd()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgkk zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return zzgkk.zzc;
                }
            }
            return zzgkk.zzb;
        }
        return zzgkk.zza;
    }

    private static zzgxn zzg(zzgkk zzgkkVar) throws GeneralSecurityException {
        if (zzgkk.zza.equals(zzgkkVar)) {
            return zzgxn.TINK;
        }
        if (zzgkk.zzb.equals(zzgkkVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgkk.zzc.equals(zzgkkVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgkkVar)));
    }
}
