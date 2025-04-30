package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgtg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgoh zzc;
    private static final zzgoh zzd;
    private static final zzgpu zze;
    private static final zzgpq zzf;
    private static final zzgor zzg;
    private static final zzgon zzh;

    static {
        zzgze zzb2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzgof zza2 = zzgoh.zza();
        zza2.zza(zzgxn.RAW, zzgse.zzd);
        zza2.zza(zzgxn.TINK, zzgse.zza);
        zza2.zza(zzgxn.LEGACY, zzgse.zzc);
        zza2.zza(zzgxn.CRUNCHY, zzgse.zzb);
        zzc = zza2.zzb();
        zzgof zza3 = zzgoh.zza();
        zza3.zza(zzgvt.SHA1, zzgsd.zza);
        zza3.zza(zzgvt.SHA224, zzgsd.zzb);
        zza3.zza(zzgvt.SHA256, zzgsd.zzc);
        zza3.zza(zzgvt.SHA384, zzgsd.zzd);
        zza3.zza(zzgvt.SHA512, zzgsd.zze);
        zzd = zza3.zzb();
        zze = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgtc
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgtg.zzb((zzgsg) zzghxVar);
            }
        }, zzgsg.class, zzgqm.class);
        zzf = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgtd
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgtg.zzd((zzgqm) zzgqqVar);
            }
        }, zzb2, zzgqm.class);
        zzg = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgte
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgtg.zza((zzgrv) zzghiVar, zzgicVar);
            }
        }, zzgrv.class, zzgql.class);
        zzh = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgtf
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgtg.zzc((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzb2, zzgql.class);
    }

    public static /* synthetic */ zzgql zza(zzgrv zzgrvVar, zzgic zzgicVar) {
        zzgvv zzc2 = zzgvw.zzc();
        zzc2.zzb(zzf(zzgrvVar.zzb()));
        byte[] zzd2 = zzgrvVar.zzd().zzd(zzgicVar);
        zzc2.zza(zzhac.zzv(zzd2, 0, zzd2.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgvw) zzc2.zzbr()).zzaN(), zzgwg.SYMMETRIC, (zzgxn) zzc.zzb(zzgrvVar.zzb().zzg()), zzgrvVar.zze());
    }

    public static /* synthetic */ zzgqm zzb(zzgsg zzgsgVar) {
        zzgwl zza2 = zzgwm.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgvy zzd2 = zzgvz.zzd();
        zzd2.zzb(zzf(zzgsgVar));
        zzd2.zza(zzgsgVar.zzc());
        zza2.zzc(((zzgvz) zzd2.zzbr()).zzaN());
        zza2.zza((zzgxn) zzc.zzb(zzgsgVar.zzg()));
        return zzgqm.zzb((zzgwm) zza2.zzbr());
    }

    public static /* synthetic */ zzgrv zzc(zzgql zzgqlVar, zzgic zzgicVar) {
        if (zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgvw zzf2 = zzgvw.zzf(zzgqlVar.zze(), zzhay.zza());
                if (zzf2.zza() == 0) {
                    zzgsc zze2 = zzgsg.zze();
                    zze2.zzb(zzf2.zzh().zzd());
                    zze2.zzc(zzf2.zzg().zza());
                    zze2.zza((zzgsd) zzd.zzc(zzf2.zzg().zzc()));
                    zze2.zzd((zzgse) zzc.zzc(zzgqlVar.zzc()));
                    zzgsg zze3 = zze2.zze();
                    zzgrt zza2 = zzgrv.zza();
                    zza2.zzc(zze3);
                    zza2.zzb(zzgzf.zzb(zzf2.zzh().zzB(), zzgicVar));
                    zza2.zza(zzgqlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzhcd | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgsg zzd(zzgqm zzgqmVar) {
        if (zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgvz zzg2 = zzgvz.zzg(zzgqmVar.zzc().zzh(), zzhay.zza());
                if (zzg2.zzc() == 0) {
                    zzgsc zze2 = zzgsg.zze();
                    zze2.zzb(zzg2.zza());
                    zze2.zzc(zzg2.zzh().zza());
                    zze2.zza((zzgsd) zzd.zzc(zzg2.zzh().zzc()));
                    zze2.zzd((zzgse) zzc.zzc(zzgqmVar.zzc().zzg()));
                    return zze2.zze();
                }
                throw new GeneralSecurityException(o.h(zzg2.zzc(), "Parsing HmacParameters failed: unknown Version "));
            } catch (zzhcd e4) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zze);
        zzgplVar.zzh(zzf);
        zzgplVar.zzg(zzg);
        zzgplVar.zzf(zzh);
    }

    private static zzgwc zzf(zzgsg zzgsgVar) throws GeneralSecurityException {
        zzgwb zzd2 = zzgwc.zzd();
        zzd2.zzb(zzgsgVar.zzb());
        zzd2.zza((zzgvt) zzd.zzb(zzgsgVar.zzf()));
        return (zzgwc) zzd2.zzbr();
    }
}
