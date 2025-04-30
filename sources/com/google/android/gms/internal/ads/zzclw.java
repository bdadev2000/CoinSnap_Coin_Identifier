package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzclw {
    private zzcjg zza;
    private zzcnj zzb;
    private zzflx zzc;
    private zzcnv zzd;
    private zzfir zze;

    private zzclw() {
        throw null;
    }

    public final zzcjd zza() {
        zzhkx.zzc(this.zza, zzcjg.class);
        zzhkx.zzc(this.zzb, zzcnj.class);
        if (this.zzc == null) {
            this.zzc = new zzflx();
        }
        if (this.zzd == null) {
            this.zzd = new zzcnv();
        }
        if (this.zze == null) {
            this.zze = new zzfir();
        }
        return new zzcla(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzclw zzb(zzcjg zzcjgVar) {
        this.zza = zzcjgVar;
        return this;
    }

    public final zzclw zzc(zzcnj zzcnjVar) {
        this.zzb = zzcnjVar;
        return this;
    }

    public /* synthetic */ zzclw(zzclv zzclvVar) {
    }
}
