package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzckg {
    private zzchr zza;
    private zzclt zzb;
    private zzflk zzc;
    private zzcmf zzd;
    private zzfif zze;

    private zzckg() {
        throw null;
    }

    public /* synthetic */ zzckg(zzckf zzckfVar) {
    }

    public final zzcho zza() {
        zzhiq.zzc(this.zza, zzchr.class);
        zzhiq.zzc(this.zzb, zzclt.class);
        if (this.zzc == null) {
            this.zzc = new zzflk();
        }
        if (this.zzd == null) {
            this.zzd = new zzcmf();
        }
        if (this.zze == null) {
            this.zze = new zzfif();
        }
        return new zzcjk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzckg zzb(zzchr zzchrVar) {
        this.zza = zzchrVar;
        return this;
    }

    public final zzckg zzc(zzclt zzcltVar) {
        this.zzb = zzcltVar;
        return this;
    }
}
