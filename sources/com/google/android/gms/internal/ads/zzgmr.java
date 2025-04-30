package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgmr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgmn
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgmr.zzd((zzgjm) zzghxVar);
            }
        }, zzgjm.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgmo
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgmr.zzb((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgmp
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgmr.zzc((zzgje) zzghiVar, zzgicVar);
            }
        }, zzgje.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgmq
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgmr.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgje zza(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgut zze2 = zzgut.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    zzgjj zzd2 = zzgjm.zzd();
                    zzd2.zzb(zze2.zzg().zzd());
                    zzd2.zza(zze2.zzf().zza());
                    zzd2.zzc(16);
                    zzd2.zzd(zzf(zzgqlVar.zzc()));
                    zzgjm zze3 = zzd2.zze();
                    zzgjc zza2 = zzgje.zza();
                    zza2.zzc(zze3);
                    zza2.zzb(zzgzf.zzb(zze2.zzg().zzB(), zzgicVar));
                    zza2.zza(zzgqlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgjm zzb(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzguw zze2 = zzguw.zze(zzgqmVar.zzc().zzh(), zzhay.zza());
                zzgjj zzd2 = zzgjm.zzd();
                zzd2.zzb(zze2.zza());
                zzd2.zza(zze2.zzf().zza());
                zzd2.zzc(16);
                zzd2.zzd(zzf(zzgqmVar.zzc().zzg()));
                return zzd2.zze();
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgql zzc(zzgje zzgjeVar, zzgic zzgicVar) {
        zzgus zzc2 = zzgut.zzc();
        zzc2.zzb(zzg(zzgjeVar.zzb()));
        byte[] zzd2 = zzgjeVar.zzd().zzd(zzgicVar);
        zzc2.zza(zzhac.zzv(zzd2, 0, zzd2.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgut) zzc2.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzh(zzgjeVar.zzb().zze()), zzgjeVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgjm zzgjmVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzguv zzc2 = zzguw.zzc();
        zzc2.zzb(zzg(zzgjmVar));
        zzc2.zza(zzgjmVar.zzc());
        zza2.zzc(((zzguw) zzc2.zzbr()).zzaN());
        zza2.zza(zzh(zzgjmVar.zze()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgjk zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return zzgjk.zzc;
                }
            }
            return zzgjk.zzb;
        }
        return zzgjk.zza;
    }

    private static zzguz zzg(zzgjm zzgjmVar) throws GeneralSecurityException {
        zzguy zzc2 = zzguz.zzc();
        zzc2.zza(zzgjmVar.zzb());
        return (zzguz) zzc2.zzbr();
    }

    private static zzgxn zzh(zzgjk zzgjkVar) throws GeneralSecurityException {
        if (zzgjk.zza.equals(zzgjkVar)) {
            return zzgxn.TINK;
        }
        if (zzgjk.zzb.equals(zzgjkVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgjk.zzc.equals(zzgjkVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgjkVar)));
    }
}
