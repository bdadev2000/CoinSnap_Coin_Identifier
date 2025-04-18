package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class zzgwr implements zzggi {
    private static final byte[] zza = {0};
    private final zzgrn zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgwr(zzgpm zzgpmVar) throws GeneralSecurityException {
        this.zzb = new zzgwo(zzgpmVar.zzd().zzd(zzgfv.zza()));
        this.zzc = zzgpmVar.zzb().zzb();
        this.zzd = zzgpmVar.zzc().zzc();
        if (zzgpmVar.zzb().zzf().equals(zzgps.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzggi zza(zzgpm zzgpmVar) throws GeneralSecurityException {
        return new zzgwr(zzgpmVar);
    }

    public static zzggi zzb(zzgqb zzgqbVar) throws GeneralSecurityException {
        return new zzgwr(zzgqbVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzgvu.zzb(this.zzd, this.zzb.zza(zzgvu.zzb(bArr, bArr2), this.zzc));
        }
        return zzgvu.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgwr(zzgqb zzgqbVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(zzgqbVar.zzb().zzf());
        this.zzb = new zzgwq("HMAC".concat(valueOf), new SecretKeySpec(zzgqbVar.zzd().zzd(zzgfv.zza()), "HMAC"));
        this.zzc = zzgqbVar.zzb().zzb();
        this.zzd = zzgqbVar.zzc().zzc();
        if (zzgqbVar.zzb().zzg().equals(zzgqj.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgwr(zzgrn zzgrnVar, int i10) throws GeneralSecurityException {
        this.zzb = zzgrnVar;
        this.zzc = i10;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgrnVar.zza(new byte[0], i10);
    }
}
