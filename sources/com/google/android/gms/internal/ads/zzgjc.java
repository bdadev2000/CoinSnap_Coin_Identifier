package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgjc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgfx zzb = zzgmx.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgfm.class, zzgty.SYMMETRIC, zzgva.zzg());
    private static final zzgno zzc = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgja
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            return zzgjl.zza((zzgjq) zzggjVar, num);
        }
    };
    private static final zzgom zzd = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgjb
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            zzgjl zzgjlVar = (zzgjl) zzgfwVar;
            int i10 = zzgjc.zza;
            String zzd2 = zzgjlVar.zzb().zzd();
            zzggt zzb2 = zzgjlVar.zzb().zzb();
            zzgfm zzb3 = zzggh.zza(zzd2).zzb();
            int i11 = zzgiz.zza;
            try {
                return zzglx.zzc(new zzgiz(zzgue.zzf(zzggp.zzb(zzb2), zzgyh.zza()), zzb3), zzgjlVar.zzc());
            } catch (zzgzm e2) {
                throw new GeneralSecurityException(e2);
            }
        }
    }, zzgjl.class, zzgfm.class);

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            int i10 = zzgjv.zza;
            zzgjv.zze(zzgnz.zzc());
            zzgnp.zzb().zzc(zzc, zzgjq.class);
            zzgnw.zza().zze(zzd);
            zzgmo.zzc().zzd(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
