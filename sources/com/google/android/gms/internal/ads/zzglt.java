package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzglt {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzglp
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzglt.zzd((zzglo) zzghxVar);
            }
        }, zzglo.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzglq
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzglt.zzb((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzglr
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzglt.zzc((zzgli) zzghiVar, zzgicVar);
            }
        }, zzgli.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgls
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzglt.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgli zza(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzgxi zze2 = zzgxi.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    return zzgli.zza(zzf(zze2.zzf(), zzgqlVar.zzc()), zzgqlVar.zzf());
                }
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zze2)));
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzglo zzb(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zzf(zzgxl.zzf(zzgqmVar.zzc().zzh(), zzhay.zza()), zzgqmVar.zzc().zzg());
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgql zzc(zzgli zzgliVar, zzgic zzgicVar) {
        zzgxh zzc2 = zzgxi.zzc();
        zzc2.zza(zzg(zzgliVar.zzb()));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgxi) zzc2.zzbr()).zzaN(), zzgwg.REMOTE, zzh(zzgliVar.zzb().zzc()), zzgliVar.zzd());
    }

    public static /* synthetic */ zzgqm zzd(zzglo zzgloVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzgloVar).zzaN());
        zza2.zza(zzh(zzgloVar.zzc()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzglo zzf(zzgxl zzgxlVar, zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgll zzgllVar;
        zzglm zzglmVar;
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb(zzgxlVar.zza().zzi());
        zza2.zzc(zzgxlVar.zza().zzh());
        zza2.zza(zzgxn.RAW);
        zzghx zza3 = zzgie.zza(((zzgwm) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzgjz) {
            zzgllVar = zzgll.zza;
        } else if (zza3 instanceof zzgks) {
            zzgllVar = zzgll.zzc;
        } else if (zza3 instanceof zzgmh) {
            zzgllVar = zzgll.zzb;
        } else if (zza3 instanceof zzgja) {
            zzgllVar = zzgll.zzd;
        } else if (zza3 instanceof zzgjm) {
            zzgllVar = zzgll.zze;
        } else if (zza3 instanceof zzgkm) {
            zzgllVar = zzgll.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
        }
        zzglk zzglkVar = new zzglk(null);
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                zzglmVar = zzglm.zzb;
            } else {
                throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        } else {
            zzglmVar = zzglm.zza;
        }
        zzglkVar.zzd(zzglmVar);
        zzglkVar.zzc(zzgxlVar.zzg());
        zzglkVar.zza((zzgii) zza3);
        zzglkVar.zzb(zzgllVar);
        return zzglkVar.zze();
    }

    private static zzgxl zzg(zzglo zzgloVar) throws GeneralSecurityException {
        try {
            zzgwm zzf2 = zzgwm.zzf(zzgie.zzb(zzgloVar.zzb()), zzhay.zza());
            zzgxk zzc2 = zzgxl.zzc();
            zzc2.zzb(zzgloVar.zzd());
            zzc2.zza(zzf2);
            return (zzgxl) zzc2.zzbr();
        } catch (zzhcd e4) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e4);
        }
    }

    private static zzgxn zzh(zzglm zzglmVar) throws GeneralSecurityException {
        if (zzglm.zza.equals(zzglmVar)) {
            return zzgxn.TINK;
        }
        if (zzglm.zzb.equals(zzglmVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzglmVar)));
    }
}
