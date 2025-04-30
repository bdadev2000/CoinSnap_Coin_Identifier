package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgmm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgmm.zzd((zzgja) zzghxVar);
            }
        }, zzgja.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgmj
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgmm.zzb((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgmk
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgmm.zzc((zzgiq) zzghiVar, zzgicVar);
            }
        }, zzgiq.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgml
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgmm.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgiq zza(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgue zze2 = zzgue.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    if (zze2.zzf().zza() == 0) {
                        if (zze2.zzg().zza() == 0) {
                            zzgiw zzf2 = zzgja.zzf();
                            zzf2.zza(zze2.zzf().zzg().zzd());
                            zzf2.zzc(zze2.zzg().zzh().zzd());
                            zzf2.zzd(zze2.zzf().zzf().zza());
                            zzf2.zze(zze2.zzg().zzg().zza());
                            zzf2.zzb(zzf(zze2.zzg().zzg().zzc()));
                            zzf2.zzf(zzg(zzgqlVar.zzc()));
                            zzgja zzg = zzf2.zzg();
                            zzgio zza2 = zzgiq.zza();
                            zza2.zzd(zzg);
                            zza2.zza(zzgzf.zzb(zze2.zzf().zzg().zzB(), zzgicVar));
                            zza2.zzb(zzgzf.zzb(zze2.zzg().zzh().zzB(), zzgicVar));
                            zza2.zzc(zzgqlVar.zzf());
                            return zza2.zze();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgja zzb(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzguh zzd2 = zzguh.zzd(zzgqmVar.zzc().zzh(), zzhay.zza());
                if (zzd2.zzf().zzc() == 0) {
                    zzgiw zzf2 = zzgja.zzf();
                    zzf2.zza(zzd2.zze().zza());
                    zzf2.zzc(zzd2.zzf().zza());
                    zzf2.zzd(zzd2.zze().zzf().zza());
                    zzf2.zze(zzd2.zzf().zzh().zza());
                    zzf2.zzb(zzf(zzd2.zzf().zzh().zzc()));
                    zzf2.zzf(zzg(zzgqmVar.zzc().zzg()));
                    return zzf2.zzg();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgql zzc(zzgiq zzgiqVar, zzgic zzgicVar) {
        zzgud zzc2 = zzgue.zzc();
        zzguj zzc3 = zzguk.zzc();
        zzgup zzc4 = zzguq.zzc();
        zzc4.zza(zzgiqVar.zzb().zzd());
        zzc3.zzb((zzguq) zzc4.zzbr());
        byte[] zzd2 = zzgiqVar.zzd().zzd(zzgicVar);
        zzc3.zza(zzhac.zzv(zzd2, 0, zzd2.length));
        zzc2.zza((zzguk) zzc3.zzbr());
        zzgvv zzc5 = zzgvw.zzc();
        zzc5.zzb(zzh(zzgiqVar.zzb()));
        byte[] zzd3 = zzgiqVar.zze().zzd(zzgicVar);
        zzc5.zza(zzhac.zzv(zzd3, 0, zzd3.length));
        zzc2.zzb((zzgvw) zzc5.zzbr());
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgue) zzc2.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzi(zzgiqVar.zzb().zzh()), zzgiqVar.zzf());
    }

    public static /* synthetic */ zzgqm zzd(zzgja zzgjaVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgug zza3 = zzguh.zza();
        zzgum zzc2 = zzgun.zzc();
        zzgup zzc3 = zzguq.zzc();
        zzc3.zza(zzgjaVar.zzd());
        zzc2.zzb((zzguq) zzc3.zzbr());
        zzc2.zza(zzgjaVar.zzb());
        zza3.zza((zzgun) zzc2.zzbr());
        zzgvy zzd2 = zzgvz.zzd();
        zzd2.zzb(zzh(zzgjaVar));
        zzd2.zza(zzgjaVar.zzc());
        zza3.zzb((zzgvz) zzd2.zzbr());
        zza2.zzc(((zzguh) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzgjaVar.zzh()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgix zzf(zzgvt zzgvtVar) throws GeneralSecurityException {
        zzgvt zzgvtVar2 = zzgvt.UNKNOWN_HASH;
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgvtVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return zzgix.zzb;
                        }
                        throw new GeneralSecurityException(o.h(zzgvtVar.zza(), "Unable to parse HashType: "));
                    }
                    return zzgix.zze;
                }
                return zzgix.zzc;
            }
            return zzgix.zzd;
        }
        return zzgix.zza;
    }

    private static zzgiy zzg(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgvt zzgvtVar = zzgvt.UNKNOWN_HASH;
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return zzgiy.zzc;
                }
            }
            return zzgiy.zzb;
        }
        return zzgiy.zza;
    }

    private static zzgwc zzh(zzgja zzgjaVar) throws GeneralSecurityException {
        zzgvt zzgvtVar;
        zzgwb zzd2 = zzgwc.zzd();
        zzd2.zzb(zzgjaVar.zze());
        zzgix zzg = zzgjaVar.zzg();
        if (zzgix.zza.equals(zzg)) {
            zzgvtVar = zzgvt.SHA1;
        } else if (zzgix.zzb.equals(zzg)) {
            zzgvtVar = zzgvt.SHA224;
        } else if (zzgix.zzc.equals(zzg)) {
            zzgvtVar = zzgvt.SHA256;
        } else if (zzgix.zzd.equals(zzg)) {
            zzgvtVar = zzgvt.SHA384;
        } else if (zzgix.zze.equals(zzg)) {
            zzgvtVar = zzgvt.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
        }
        zzd2.zza(zzgvtVar);
        return (zzgwc) zzd2.zzbr();
    }

    private static zzgxn zzi(zzgiy zzgiyVar) throws GeneralSecurityException {
        if (zzgiy.zza.equals(zzgiyVar)) {
            return zzgxn.TINK;
        }
        if (zzgiy.zzb.equals(zzgiyVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgiy.zzc.equals(zzgiyVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgiyVar)));
    }
}
