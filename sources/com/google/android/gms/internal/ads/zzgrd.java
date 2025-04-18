package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgrd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgqz
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgrd.zzb((zzgpu) zzggjVar);
            }
        }, zzgpu.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgra
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgrd.zzd((zzgox) zzgpbVar);
            }
        }, zzb2, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgrb
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgrd.zza((zzgpm) zzgfwVar, zzggnVar);
            }
        }, zzgpm.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgrc
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgrd.zzc((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzb2, zzgow.class);
    }

    public static /* synthetic */ zzgow zza(zzgpm zzgpmVar, zzggn zzggnVar) {
        zzgro zzb2 = zzgrq.zzb();
        zzb2.zzb(zzg(zzgpmVar.zzb()));
        byte[] zzd2 = zzgpmVar.zzd().zzd(zzggnVar);
        zzb2.zza(zzgxp.zzv(zzd2, 0, zzd2.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgrq) zzb2.zzbr()).zzaN(), zzgty.SYMMETRIC, zzh(zzgpmVar.zzb().zzf()), zzgpmVar.zze());
    }

    public static /* synthetic */ zzgox zzb(zzgpu zzgpuVar) {
        zzguc zza2 = zzgue.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgrr zzb2 = zzgrt.zzb();
        zzb2.zzb(zzg(zzgpuVar));
        zzb2.zza(zzgpuVar.zzc());
        zza2.zzc(((zzgrt) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzgpuVar.zzf()));
        return zzgox.zzb((zzgue) zza2.zzbr());
    }

    public static /* synthetic */ zzgpm zzc(zzgow zzgowVar, zzggn zzggnVar) {
        if (zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgrq zzd2 = zzgrq.zzd(zzgowVar.zze(), zzgyh.zza());
                if (zzd2.zza() == 0) {
                    zzgpr zze2 = zzgpu.zze();
                    zze2.zza(zzd2.zzg().zzd());
                    zze2.zzb(zzd2.zzf().zza());
                    zze2.zzc(zzf(zzgowVar.zzc()));
                    zzgpu zzd3 = zze2.zzd();
                    zzgpk zza2 = zzgpm.zza();
                    zza2.zzc(zzd3);
                    zza2.zza(zzgwv.zzb(zzd2.zzg().zzA(), zzggnVar));
                    zza2.zzb(zzgowVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzm | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgpu zzd(zzgox zzgoxVar) {
        if (zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgrt zzd2 = zzgrt.zzd(zzgoxVar.zzc().zzh(), zzgyh.zza());
                zzgpr zze2 = zzgpu.zze();
                zze2.zza(zzd2.zza());
                zze2.zzb(zzd2.zzf().zza());
                zze2.zzc(zzf(zzgoxVar.zzc().zzg()));
                return zze2.zzd();
            } catch (zzgzm e2) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgps zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int ordinal = zzgveVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return zzgps.zzb;
                    }
                    throw new GeneralSecurityException(j.i("Unable to parse OutputPrefixType: ", zzgveVar.zza()));
                }
                return zzgps.zzd;
            }
            return zzgps.zzc;
        }
        return zzgps.zza;
    }

    private static zzgrw zzg(zzgpu zzgpuVar) {
        zzgru zzb2 = zzgrw.zzb();
        zzb2.zza(zzgpuVar.zzb());
        return (zzgrw) zzb2.zzbr();
    }

    private static zzgve zzh(zzgps zzgpsVar) throws GeneralSecurityException {
        if (zzgps.zza.equals(zzgpsVar)) {
            return zzgve.TINK;
        }
        if (zzgps.zzb.equals(zzgpsVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgps.zzd.equals(zzgpsVar)) {
            return zzgve.RAW;
        }
        if (zzgps.zzc.equals(zzgpsVar)) {
            return zzgve.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgpsVar)));
    }
}
