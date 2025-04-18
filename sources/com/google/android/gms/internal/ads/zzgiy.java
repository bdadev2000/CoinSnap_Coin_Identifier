package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgiy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgiw
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            zzgjd zzgjdVar = (zzgjd) zzgfwVar;
            int i10 = zzgiy.zza;
            return zzglx.zzc(zzggh.zza(zzgjdVar.zzb().zzd()).zzb(), zzgjdVar.zzc());
        }
    }, zzgjd.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgfm.class, zzgty.REMOTE, zzguu.zzg());
    private static final zzgno zzd = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgix
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            return zzgjd.zza((zzgjf) zzggjVar, num);
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            int i10 = zzgjk.zza;
            zzgjk.zze(zzgnz.zzc());
            zzgnw.zza().zze(zzb);
            zzgnp.zzb().zzc(zzd, zzgjf.class);
            zzgmo.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
