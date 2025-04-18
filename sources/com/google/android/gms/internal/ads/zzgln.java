package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgln {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyx zzb;
    private static final zzgpz zzc;
    private static final zzgpv zzd;
    private static final zzgom zze;
    private static final zzgoi zzf;

    static {
        zzgyx zzb2 = zzgrg.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzc = zzgpz.zzb(new zzgpx() { // from class: com.google.android.gms.internal.ads.zzglj
            @Override // com.google.android.gms.internal.ads.zzgpx
            public final zzgqw zza(zzghs zzghsVar) {
                return zzgln.zzd((zzgli) zzghsVar);
            }
        }, zzgli.class, zzgqs.class);
        zzd = zzgpv.zzb(new zzgpt() { // from class: com.google.android.gms.internal.ads.zzglk
            @Override // com.google.android.gms.internal.ads.zzgpt
            public final zzghs zza(zzgqw zzgqwVar) {
                return zzgln.zzb((zzgqs) zzgqwVar);
            }
        }, zzb2, zzgqs.class);
        zze = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgll
            @Override // com.google.android.gms.internal.ads.zzgok
            public final zzgqw zza(zzghd zzghdVar, zzghw zzghwVar) {
                return zzgln.zzc((zzglc) zzghdVar, zzghwVar);
            }
        }, zzglc.class, zzgqr.class);
        zzf = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzglm
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) {
                return zzgln.zza((zzgqr) zzgqwVar, zzghwVar);
            }
        }, zzb2, zzgqr.class);
    }

    public static /* synthetic */ zzglc zza(zzgqr zzgqrVar, zzghw zzghwVar) {
        if (!zzgqrVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgxb zze2 = zzgxb.zze(zzgqrVar.zze(), zzhao.zza());
            if (zze2.zza() == 0) {
                return zzglc.zza(zzf(zze2.zzf(), zzgqrVar.zzc()), zzgqrVar.zzf());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zze2)));
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzgli zzb(zzgqs zzgqsVar) {
        if (!zzgqsVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqsVar.zzc().zzi())));
        }
        try {
            return zzf(zzgxe.zzf(zzgqsVar.zzc().zzh(), zzhao.zza()), zzgqsVar.zzc().zzg());
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgqr zzc(zzglc zzglcVar, zzghw zzghwVar) {
        zzgxa zzc2 = zzgxb.zzc();
        zzc2.zza(zzg(zzglcVar.zzb()));
        return zzgqr.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgxb) zzc2.zzbr()).zzaN(), zzgwa.REMOTE, zzh(zzglcVar.zzb().zzc()), zzglcVar.zzd());
    }

    public static /* synthetic */ zzgqs zzd(zzgli zzgliVar) {
        zzgwe zza2 = zzgwf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzgliVar).zzaN());
        zza2.zza(zzh(zzgliVar.zzc()));
        return zzgqs.zzb((zzgwf) zza2.zzbr());
    }

    public static void zze(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgpqVar.zzi(zzc);
        zzgpqVar.zzh(zzd);
        zzgpqVar.zzg(zze);
        zzgpqVar.zzf(zzf);
    }

    private static zzgli zzf(zzgxe zzgxeVar, zzgxf zzgxfVar) throws GeneralSecurityException {
        zzglf zzglfVar;
        zzglg zzglgVar;
        zzgwe zza2 = zzgwf.zza();
        zza2.zzb(zzgxeVar.zza().zzi());
        zza2.zzc(zzgxeVar.zza().zzh());
        zza2.zza(zzgxf.RAW);
        zzghs zza3 = zzghy.zza(((zzgwf) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzgjt) {
            zzglfVar = zzglf.zza;
        } else if (zza3 instanceof zzgkm) {
            zzglfVar = zzglf.zzc;
        } else if (zza3 instanceof zzgmb) {
            zzglfVar = zzglf.zzb;
        } else if (zza3 instanceof zzgiu) {
            zzglfVar = zzglf.zzd;
        } else if (zza3 instanceof zzgjg) {
            zzglfVar = zzglf.zze;
        } else {
            if (!(zza3 instanceof zzgkg)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
            }
            zzglfVar = zzglf.zzf;
        }
        zzgle zzgleVar = new zzgle(null);
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 1) {
            zzglgVar = zzglg.zza;
        } else {
            if (ordinal != 3) {
                throw new GeneralSecurityException(d.i("Unable to parse OutputPrefixType: ", zzgxfVar.zza()));
            }
            zzglgVar = zzglg.zzb;
        }
        zzgleVar.zzd(zzglgVar);
        zzgleVar.zzc(zzgxeVar.zzg());
        zzgleVar.zza((zzgic) zza3);
        zzgleVar.zzb(zzglfVar);
        return zzgleVar.zze();
    }

    private static zzgxe zzg(zzgli zzgliVar) throws GeneralSecurityException {
        try {
            zzgwf zzf2 = zzgwf.zzf(zzghy.zzb(zzgliVar.zzb()), zzhao.zza());
            zzgxd zzc2 = zzgxe.zzc();
            zzc2.zzb(zzgliVar.zzd());
            zzc2.zza(zzf2);
            return (zzgxe) zzc2.zzbr();
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzgxf zzh(zzglg zzglgVar) throws GeneralSecurityException {
        if (zzglg.zza.equals(zzglgVar)) {
            return zzgxf.TINK;
        }
        if (zzglg.zzb.equals(zzglgVar)) {
            return zzgxf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzglgVar)));
    }
}
