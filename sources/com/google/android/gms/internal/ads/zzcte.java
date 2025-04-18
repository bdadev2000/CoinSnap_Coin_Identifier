package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class zzcte implements zzekf {
    protected final zzfgt zza;
    protected final zzfgh zzb;
    private final zzcyz zzc;
    private final zzczm zzd;

    @Nullable
    private final zzfdv zze;
    private final zzcxt zzf;
    private final zzdck zzg;
    private final zzczq zzh;
    private final zzdfp zzi;

    public zzcte(zzctd zzctdVar) {
        zzfgt zzfgtVar;
        zzfgh zzfghVar;
        zzcyz zzcyzVar;
        zzczm zzczmVar;
        zzfdv zzfdvVar;
        zzcxt zzcxtVar;
        zzdck zzdckVar;
        zzczq zzczqVar;
        zzdfp zzdfpVar;
        zzfgtVar = zzctdVar.zza;
        this.zza = zzfgtVar;
        zzfghVar = zzctdVar.zzb;
        this.zzb = zzfghVar;
        zzcyzVar = zzctdVar.zzc;
        this.zzc = zzcyzVar;
        zzczmVar = zzctdVar.zzd;
        this.zzd = zzczmVar;
        zzfdvVar = zzctdVar.zze;
        this.zze = zzfdvVar;
        zzcxtVar = zzctdVar.zzf;
        this.zzf = zzcxtVar;
        zzdckVar = zzctdVar.zzg;
        this.zzg = zzdckVar;
        zzczqVar = zzctdVar.zzh;
        this.zzh = zzczqVar;
        zzdfpVar = zzctdVar.zzi;
        this.zzi = zzdfpVar;
    }

    public void zzb() {
        this.zzc.zza(null);
    }

    public void zzk() {
        this.zzd.zzs();
        this.zzh.zza(this);
    }

    public final zzcxt zzm() {
        return this.zzf;
    }

    public final zzcyz zzn() {
        return this.zzc;
    }

    public final zzdci zzo() {
        return this.zzg.zzi();
    }

    @Nullable
    public final zzfdv zzp() {
        return this.zze;
    }

    public final zzfgt zzq() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzekf
    public final void zzr() {
        this.zzi.zzt();
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }
}
