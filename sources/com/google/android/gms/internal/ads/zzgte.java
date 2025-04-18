package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgte {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyx zzb;
    private static final zzgpz zzc;
    private static final zzgpv zzd;
    private static final zzgom zze;
    private static final zzgoi zzf;

    static {
        zzgyx zzb2 = zzgrg.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzc = zzgpz.zzb(new zzgpx() { // from class: com.google.android.gms.internal.ads.zzgta
            @Override // com.google.android.gms.internal.ads.zzgpx
            public final zzgqw zza(zzghs zzghsVar) {
                return zzgte.zzb((zzgrt) zzghsVar);
            }
        }, zzgrt.class, zzgqs.class);
        zzd = zzgpv.zzb(new zzgpt() { // from class: com.google.android.gms.internal.ads.zzgtb
            @Override // com.google.android.gms.internal.ads.zzgpt
            public final zzghs zza(zzgqw zzgqwVar) {
                return zzgte.zzd((zzgqs) zzgqwVar);
            }
        }, zzb2, zzgqs.class);
        zze = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgtc
            @Override // com.google.android.gms.internal.ads.zzgok
            public final zzgqw zza(zzghd zzghdVar, zzghw zzghwVar) {
                return zzgte.zza((zzgrk) zzghdVar, zzghwVar);
            }
        }, zzgrk.class, zzgqr.class);
        zzf = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgtd
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) {
                return zzgte.zzc((zzgqr) zzgqwVar, zzghwVar);
            }
        }, zzb2, zzgqr.class);
    }

    public static /* synthetic */ zzgqr zza(zzgrk zzgrkVar, zzghw zzghwVar) {
        zzgtq zzc2 = zzgtr.zzc();
        zzc2.zzb(zzg(zzgrkVar.zzb()));
        byte[] zzd2 = zzgrkVar.zzd().zzd(zzghwVar);
        zzc2.zza(zzgzs.zzv(zzd2, 0, zzd2.length));
        return zzgqr.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgtr) zzc2.zzbr()).zzaN(), zzgwa.SYMMETRIC, zzh(zzgrkVar.zzb().zzf()), zzgrkVar.zze());
    }

    public static /* synthetic */ zzgqs zzb(zzgrt zzgrtVar) {
        zzgwe zza2 = zzgwf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgtt zzc2 = zzgtu.zzc();
        zzc2.zzb(zzg(zzgrtVar));
        zzc2.zza(zzgrtVar.zzc());
        zza2.zzc(((zzgtu) zzc2.zzbr()).zzaN());
        zza2.zza(zzh(zzgrtVar.zzf()));
        return zzgqs.zzb((zzgwf) zza2.zzbr());
    }

    public static /* synthetic */ zzgrk zzc(zzgqr zzgqrVar, zzghw zzghwVar) {
        if (!zzgqrVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgtr zze2 = zzgtr.zze(zzgqrVar.zze(), zzhao.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgrq zze3 = zzgrt.zze();
            zze3.zza(zze2.zzg().zzd());
            zze3.zzb(zze2.zzf().zza());
            zze3.zzc(zzf(zzgqrVar.zzc()));
            zzgrt zzd2 = zze3.zzd();
            zzgri zza2 = zzgrk.zza();
            zza2.zzc(zzd2);
            zza2.zza(zzgyy.zzb(zze2.zzg().zzA(), zzghwVar));
            zza2.zzb(zzgqrVar.zzf());
            return zza2.zzd();
        } catch (zzhbt | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgrt zzd(zzgqs zzgqsVar) {
        if (!zzgqsVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqsVar.zzc().zzi())));
        }
        try {
            zzgtu zze2 = zzgtu.zze(zzgqsVar.zzc().zzh(), zzhao.zza());
            zzgrq zze3 = zzgrt.zze();
            zze3.zza(zze2.zza());
            zze3.zzb(zze2.zzf().zza());
            zze3.zzc(zzf(zzgqsVar.zzc().zzg()));
            return zze3.zzd();
        } catch (zzhbt e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zze(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgpqVar.zzi(zzc);
        zzgpqVar.zzh(zzd);
        zzgpqVar.zzg(zze);
        zzgpqVar.zzf(zzf);
    }

    private static zzgrr zzf(zzgxf zzgxfVar) throws GeneralSecurityException {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 1) {
            return zzgrr.zza;
        }
        if (ordinal == 2) {
            return zzgrr.zzc;
        }
        if (ordinal == 3) {
            return zzgrr.zzd;
        }
        if (ordinal == 4) {
            return zzgrr.zzb;
        }
        throw new GeneralSecurityException(d.i("Unable to parse OutputPrefixType: ", zzgxfVar.zza()));
    }

    private static zzgtx zzg(zzgrt zzgrtVar) {
        zzgtw zzc2 = zzgtx.zzc();
        zzc2.zza(zzgrtVar.zzb());
        return (zzgtx) zzc2.zzbr();
    }

    private static zzgxf zzh(zzgrr zzgrrVar) throws GeneralSecurityException {
        if (zzgrr.zza.equals(zzgrrVar)) {
            return zzgxf.TINK;
        }
        if (zzgrr.zzb.equals(zzgrrVar)) {
            return zzgxf.CRUNCHY;
        }
        if (zzgrr.zzd.equals(zzgrrVar)) {
            return zzgxf.RAW;
        }
        if (zzgrr.zzc.equals(zzgrrVar)) {
            return zzgxf.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgrrVar)));
    }
}
