package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class zzcrq implements zzeiw {
    protected final zzfff zza;
    protected final zzfet zzb;
    private final zzcxl zzc;
    private final zzcxy zzd;

    @Nullable
    private final zzfch zze;
    private final zzcwf zzf;
    private final zzdav zzg;
    private final zzcyc zzh;
    private final zzdea zzi;

    public zzcrq(zzcrp zzcrpVar) {
        zzfff zzfffVar;
        zzfet zzfetVar;
        zzcxl zzcxlVar;
        zzcxy zzcxyVar;
        zzfch zzfchVar;
        zzcwf zzcwfVar;
        zzdav zzdavVar;
        zzcyc zzcycVar;
        zzdea zzdeaVar;
        zzfffVar = zzcrpVar.zza;
        this.zza = zzfffVar;
        zzfetVar = zzcrpVar.zzb;
        this.zzb = zzfetVar;
        zzcxlVar = zzcrpVar.zzc;
        this.zzc = zzcxlVar;
        zzcxyVar = zzcrpVar.zzd;
        this.zzd = zzcxyVar;
        zzfchVar = zzcrpVar.zze;
        this.zze = zzfchVar;
        zzcwfVar = zzcrpVar.zzf;
        this.zzf = zzcwfVar;
        zzdavVar = zzcrpVar.zzg;
        this.zzg = zzdavVar;
        zzcycVar = zzcrpVar.zzh;
        this.zzh = zzcycVar;
        zzdeaVar = zzcrpVar.zzi;
        this.zzi = zzdeaVar;
    }

    public void zzb() {
        this.zzc.zza(null);
    }

    public void zzk() {
        this.zzd.zzs();
        this.zzh.zza(this);
    }

    public final zzcwf zzm() {
        return this.zzf;
    }

    public final zzcxl zzn() {
        return this.zzc;
    }

    public final zzdas zzo() {
        return this.zzg.zzi();
    }

    @Nullable
    public final zzfch zzp() {
        return this.zze;
    }

    public final zzfff zzq() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zzr() {
        this.zzi.zzt();
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }
}
