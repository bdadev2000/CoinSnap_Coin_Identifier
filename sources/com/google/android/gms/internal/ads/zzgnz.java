package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgnz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgnv
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgnz.zzd((zzgmh) zzghxVar);
            }
        }, zzgmh.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgnw
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgnz.zzb((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgnx
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgnz.zzc((zzgmb) zzghiVar, zzgicVar);
            }
        }, zzgmb.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgny
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgnz.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgmb zza(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzgxt zze2 = zzgxt.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    return zzgmb.zza(zzf(zzgqlVar.zzc()), zzgzf.zzb(zze2.zzf().zzB(), zzgicVar), zzgqlVar.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgmh zzb(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzgxw.zze(zzgqmVar.zzc().zzh(), zzhay.zza()).zza() == 0) {
                    return zzgmh.zzc(zzf(zzgqmVar.zzc().zzg()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgql zzc(zzgmb zzgmbVar, zzgic zzgicVar) {
        zzgxs zzc2 = zzgxt.zzc();
        byte[] zzd2 = zzgmbVar.zzd().zzd(zzgicVar);
        zzc2.zza(zzhac.zzv(zzd2, 0, zzd2.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgxt) zzc2.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzg(zzgmbVar.zzb().zzb()), zzgmbVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgmh zzgmhVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza2.zzc(zzgxw.zzd().zzaN());
        zza2.zza(zzg(zzgmhVar.zzb()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgmg zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return zzgmg.zzc;
                }
            }
            return zzgmg.zzb;
        }
        return zzgmg.zza;
    }

    private static zzgxn zzg(zzgmg zzgmgVar) throws GeneralSecurityException {
        if (zzgmg.zza.equals(zzgmgVar)) {
            return zzgxn.TINK;
        }
        if (zzgmg.zzb.equals(zzgmgVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgmg.zzc.equals(zzgmgVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgmgVar.toString()));
    }
}
