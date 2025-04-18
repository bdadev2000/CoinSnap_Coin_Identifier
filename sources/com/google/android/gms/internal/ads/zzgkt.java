package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgkt {
    public static final /* synthetic */ int zza = 0;
    private static final zzghe zzb = zzgon.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzggt.class, zzgwa.SYMMETRIC, zzgxb.zzg());
    private static final zzgpf zzc = new zzgpf() { // from class: com.google.android.gms.internal.ads.zzgkr
        @Override // com.google.android.gms.internal.ads.zzgpf
        public final zzghd zza(zzghs zzghsVar, Integer num) {
            return zzglc.zza((zzgli) zzghsVar, num);
        }
    };
    private static final zzgqd zzd = zzgqd.zzb(new zzgqb() { // from class: com.google.android.gms.internal.ads.zzgks
        @Override // com.google.android.gms.internal.ads.zzgqb
        public final Object zza(zzghd zzghdVar) {
            zzglc zzglcVar = (zzglc) zzghdVar;
            int i2 = zzgkt.zza;
            String zzd2 = zzglcVar.zzb().zzd();
            zzgic zzb2 = zzglcVar.zzb().zzb();
            zzggt zzb3 = zzghq.zza(zzd2).zzb();
            int i3 = zzgkq.zza;
            try {
                return zzgnm.zzc(new zzgkq(zzgwf.zzf(zzghy.zzb(zzb2), zzhao.zza()), zzb3), zzglcVar.zzc());
            } catch (zzhbt e) {
                throw new GeneralSecurityException(e);
            }
        }
    }, zzglc.class, zzggt.class);

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzgnw.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i2 = zzgln.zza;
        zzgln.zze(zzgpq.zzc());
        zzgpg.zzb().zzc(zzc, zzgli.class);
        zzgpn.zza().zze(zzd);
        zzgoe.zzc().zzd(zzb, true);
    }
}
