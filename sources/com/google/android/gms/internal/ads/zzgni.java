package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgni {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgne
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgni.zzd((zzgks) zzghxVar);
            }
        }, zzgks.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgnf
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgni.zzb((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgng
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgni.zzc((zzgkn) zzghiVar, zzgicVar);
            }
        }, zzgkn.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgnh
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgni.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgkn zza(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgvo zze2 = zzgvo.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    return zzgkn.zza(zzf(zzgqlVar.zzc()), zzgzf.zzb(zze2.zzf().zzB(), zzgicVar), zzgqlVar.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgks zzb(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgvr.zzd(zzgqmVar.zzc().zzh(), zzhay.zza());
                return zzgks.zzc(zzf(zzgqmVar.zzc().zzg()));
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgql zzc(zzgkn zzgknVar, zzgic zzgicVar) {
        zzgvn zzc2 = zzgvo.zzc();
        byte[] zzd2 = zzgknVar.zzd().zzd(zzgicVar);
        zzc2.zza(zzhac.zzv(zzd2, 0, zzd2.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgvo) zzc2.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzg(zzgknVar.zzb().zzb()), zzgknVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgks zzgksVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(zzgvr.zzc().zzaN());
        zza2.zza(zzg(zzgksVar.zzb()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgkr zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return zzgkr.zzc;
                }
            }
            return zzgkr.zzb;
        }
        return zzgkr.zza;
    }

    private static zzgxn zzg(zzgkr zzgkrVar) throws GeneralSecurityException {
        if (zzgkr.zza.equals(zzgkrVar)) {
            return zzgxn.TINK;
        }
        if (zzgkr.zzb.equals(zzgkrVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgkr.zzc.equals(zzgkrVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgkrVar.toString()));
    }
}
