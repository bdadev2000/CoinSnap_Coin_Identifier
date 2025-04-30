package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgzb implements zzghw {
    private static final byte[] zza = {0};
    private final zzgts zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgzb(zzgre zzgreVar) throws GeneralSecurityException {
        this.zzb = new zzgyy(zzgreVar.zzd().zzd(zzghh.zza()));
        this.zzc = zzgreVar.zzb().zzb();
        this.zzd = zzgreVar.zzc().zzc();
        if (zzgreVar.zzb().zzf().equals(zzgrl.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzghw zza(zzgre zzgreVar) throws GeneralSecurityException {
        return new zzgzb(zzgreVar);
    }

    public static zzghw zzb(zzgrv zzgrvVar) throws GeneralSecurityException {
        return new zzgzb(zzgrvVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzgyd.zzb(this.zzd, this.zzb.zza(zzgyd.zzb(bArr, bArr2), this.zzc));
        }
        return zzgyd.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgzb(zzgrv zzgrvVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(zzgrvVar.zzb().zzf());
        this.zzb = new zzgza("HMAC".concat(valueOf), new SecretKeySpec(zzgrvVar.zzd().zzd(zzghh.zza()), "HMAC"));
        this.zzc = zzgrvVar.zzb().zzb();
        this.zzd = zzgrvVar.zzc().zzc();
        if (zzgrvVar.zzb().zzg().equals(zzgse.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgzb(zzgts zzgtsVar, int i9) throws GeneralSecurityException {
        this.zzb = zzgtsVar;
        this.zzc = i9;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgtsVar.zza(new byte[0], i9);
    }
}
