package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgsy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgsu
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgsy.zzb((zzgrn) zzghxVar);
            }
        }, zzgrn.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgsv
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgsy.zzd((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgsw
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgsy.zza((zzgre) zzghiVar, zzgicVar);
            }
        }, zzgre.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgsx
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgsy.zzc((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgql zza(zzgre zzgreVar, zzgic zzgicVar) {
        zzgtu zzc2 = zzgtv.zzc();
        zzc2.zzb(zzg(zzgreVar.zzb()));
        byte[] zzd2 = zzgreVar.zzd().zzd(zzgicVar);
        zzc2.zza(zzhac.zzv(zzd2, 0, zzd2.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgtv) zzc2.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzh(zzgreVar.zzb().zzf()), zzgreVar.zze());
    }

    public static /* synthetic */ zzgqm zzb(zzgrn zzgrnVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgtx zzc2 = zzgty.zzc();
        zzc2.zzb(zzg(zzgrnVar));
        zzc2.zza(zzgrnVar.zzc());
        zza2.zzc(((zzgty) zzc2.zzbr()).zzaN());
        zza2.zza(zzh(zzgrnVar.zzf()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static /* synthetic */ zzgre zzc(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgtv zze2 = zzgtv.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    zzgrk zze3 = zzgrn.zze();
                    zze3.zza(zze2.zzg().zzd());
                    zze3.zzb(zze2.zzf().zza());
                    zze3.zzc(zzf(zzgqlVar.zzc()));
                    zzgrn zzd2 = zze3.zzd();
                    zzgrc zza2 = zzgre.zza();
                    zza2.zzc(zzd2);
                    zza2.zza(zzgzf.zzb(zze2.zzg().zzB(), zzgicVar));
                    zza2.zzb(zzgqlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgrn zzd(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgty zze2 = zzgty.zze(zzgqmVar.zzc().zzh(), zzhay.zza());
                zzgrk zze3 = zzgrn.zze();
                zze3.zza(zze2.zza());
                zze3.zzb(zze2.zzf().zza());
                zze3.zzc(zzf(zzgqmVar.zzc().zzg()));
                return zze3.zzd();
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgrl zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return zzgrl.zzb;
                    }
                    throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
                }
                return zzgrl.zzd;
            }
            return zzgrl.zzc;
        }
        return zzgrl.zza;
    }

    private static zzgub zzg(zzgrn zzgrnVar) {
        zzgua zzc2 = zzgub.zzc();
        zzc2.zza(zzgrnVar.zzb());
        return (zzgub) zzc2.zzbr();
    }

    private static zzgxn zzh(zzgrl zzgrlVar) throws GeneralSecurityException {
        if (zzgrl.zza.equals(zzgrlVar)) {
            return zzgxn.TINK;
        }
        if (zzgrl.zzb.equals(zzgrlVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgrl.zzd.equals(zzgrlVar)) {
            return zzgxn.RAW;
        }
        if (zzgrl.zzc.equals(zzgrlVar)) {
            return zzgxn.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgrlVar)));
    }
}
