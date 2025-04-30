package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzglh {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzb2;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzglh.zzd((zzglc) zzghxVar);
            }
        }, zzglc.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgle
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzglh.zzb((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzglf
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzglh.zzc((zzgla) zzghiVar, zzgicVar);
            }
        }, zzgla.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzglh.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgla zza(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzgxc zze2 = zzgxc.zze(zzgqlVar.zze(), zzhay.zza());
                if (zze2.zza() == 0) {
                    return zzgla.zza(zzglc.zzc(zze2.zzf().zzf(), zzf(zzgqlVar.zzc())), zzgqlVar.zzf());
                }
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zze2)));
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzglc zzb(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzglc.zzc(zzgxf.zze(zzgqmVar.zzc().zzh(), zzhay.zza()).zzf(), zzf(zzgqmVar.zzc().zzg()));
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgql zzc(zzgla zzglaVar, zzgic zzgicVar) {
        zzgxb zzc2 = zzgxc.zzc();
        zzgxe zza2 = zzgxf.zza();
        zza2.zza(zzglaVar.zzb().zzd());
        zzc2.zza((zzgxf) zza2.zzbr());
        return zzgql.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgxc) zzc2.zzbr()).zzaN(), zzgwg.REMOTE, zzg(zzglaVar.zzb().zzb()), zzglaVar.zzd());
    }

    public static /* synthetic */ zzgqm zzd(zzglc zzglcVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzgxe zza3 = zzgxf.zza();
        zza3.zza(zzglcVar.zzd());
        zza2.zzc(((zzgxf) zza3.zzbr()).zzaN());
        zza2.zza(zzg(zzglcVar.zzb()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzglb zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int ordinal = zzgxnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return zzglb.zzb;
            }
            throw new GeneralSecurityException(o.h(zzgxnVar.zza(), "Unable to parse OutputPrefixType: "));
        }
        return zzglb.zza;
    }

    private static zzgxn zzg(zzglb zzglbVar) throws GeneralSecurityException {
        if (zzglb.zza.equals(zzglbVar)) {
            return zzgxn.TINK;
        }
        if (zzglb.zzb.equals(zzglbVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzglbVar.toString()));
    }
}
