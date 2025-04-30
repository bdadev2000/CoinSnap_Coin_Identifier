package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgkv {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgkt
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            zzgla zzglaVar = (zzgla) zzghiVar;
            int i9 = zzgkv.zza;
            return zzgns.zzc(zzghv.zza(zzglaVar.zzb().zzd()).zzb(), zzglaVar.zzc());
        }
    }, zzgla.class, zzggy.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzggy.class, zzgwg.REMOTE, zzgxc.zzg());
    private static final zzgpa zzd = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgku
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            return zzgla.zza((zzglc) zzghxVar, num);
        }
    };

    public static void zza(boolean z8) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            int i9 = zzglh.zza;
            zzglh.zze(zzgpl.zzc());
            zzgpi.zza().zze(zzb);
            zzgpb.zzb().zzc(zzd, zzglc.class);
            zzgoj.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
