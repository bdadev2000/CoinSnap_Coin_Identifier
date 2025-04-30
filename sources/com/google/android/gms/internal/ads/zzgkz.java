package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgkz {
    public static final /* synthetic */ int zza = 0;
    private static final zzghj zzb = zzgos.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzggy.class, zzgwg.SYMMETRIC, zzgxi.zzg());
    private static final zzgpa zzc = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgkx
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            return zzgli.zza((zzglo) zzghxVar, num);
        }
    };
    private static final zzgpy zzd = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgky
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            zzgli zzgliVar = (zzgli) zzghiVar;
            int i9 = zzgkz.zza;
            String zzd2 = zzgliVar.zzb().zzd();
            zzgii zzb2 = zzgliVar.zzb().zzb();
            zzggy zzb3 = zzghv.zza(zzd2).zzb();
            int i10 = zzgkw.zza;
            try {
                return zzgns.zzc(new zzgkw(zzgwm.zzf(zzgie.zzb(zzb2), zzhay.zza()), zzb3), zzgliVar.zzc());
            } catch (zzhcd e4) {
                throw new GeneralSecurityException(e4);
            }
        }
    }, zzgli.class, zzggy.class);

    public static void zza(boolean z8) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            int i9 = zzglt.zza;
            zzglt.zze(zzgpl.zzc());
            zzgpb.zzb().zzc(zzc, zzglo.class);
            zzgpi.zza().zze(zzd);
            zzgoj.zzc().zzd(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
