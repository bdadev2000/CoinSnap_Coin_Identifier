package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdcd {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfch zzo;

    public final zzdcd zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzded(zzaVar, executor));
        return this;
    }

    public final zzdcd zzb(zzcwp zzcwpVar, Executor executor) {
        this.zzi.add(new zzded(zzcwpVar, executor));
        return this;
    }

    public final zzdcd zzc(zzcxc zzcxcVar, Executor executor) {
        this.zzl.add(new zzded(zzcxcVar, executor));
        return this;
    }

    public final zzdcd zzd(zzcxg zzcxgVar, Executor executor) {
        this.zzf.add(new zzded(zzcxgVar, executor));
        return this;
    }

    public final zzdcd zze(zzcwm zzcwmVar, Executor executor) {
        this.zze.add(new zzded(zzcwmVar, executor));
        return this;
    }

    public final zzdcd zzf(zzcya zzcyaVar, Executor executor) {
        this.zzh.add(new zzded(zzcyaVar, executor));
        return this;
    }

    public final zzdcd zzg(zzcyl zzcylVar, Executor executor) {
        this.zzg.add(new zzded(zzcylVar, executor));
        return this;
    }

    public final zzdcd zzh(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzded(zzrVar, executor));
        return this;
    }

    public final zzdcd zzi(zzcyx zzcyxVar, Executor executor) {
        this.zzm.add(new zzded(zzcyxVar, executor));
        return this;
    }

    public final zzdcd zzj(zzczj zzczjVar, Executor executor) {
        this.zzb.add(new zzded(zzczjVar, executor));
        return this;
    }

    public final zzdcd zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzded(appEventListener, executor));
        return this;
    }

    public final zzdcd zzl(zzdel zzdelVar, Executor executor) {
        this.zzd.add(new zzded(zzdelVar, executor));
        return this;
    }

    public final zzdcd zzm(zzfch zzfchVar) {
        this.zzo = zzfchVar;
        return this;
    }

    public final zzdcf zzn() {
        return new zzdcf(this, null);
    }
}
