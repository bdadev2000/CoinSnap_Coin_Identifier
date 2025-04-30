package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdfa {
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
    private zzfeh zzo;

    public final zzdfa zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdha(zzaVar, executor));
        return this;
    }

    public final zzdfa zzb(zzczo zzczoVar, Executor executor) {
        this.zzi.add(new zzdha(zzczoVar, executor));
        return this;
    }

    public final zzdfa zzc(zzdab zzdabVar, Executor executor) {
        this.zzl.add(new zzdha(zzdabVar, executor));
        return this;
    }

    public final zzdfa zzd(zzdaf zzdafVar, Executor executor) {
        this.zzf.add(new zzdha(zzdafVar, executor));
        return this;
    }

    public final zzdfa zze(zzczl zzczlVar, Executor executor) {
        this.zze.add(new zzdha(zzczlVar, executor));
        return this;
    }

    public final zzdfa zzf(zzdaz zzdazVar, Executor executor) {
        this.zzh.add(new zzdha(zzdazVar, executor));
        return this;
    }

    public final zzdfa zzg(zzdbk zzdbkVar, Executor executor) {
        this.zzg.add(new zzdha(zzdbkVar, executor));
        return this;
    }

    public final zzdfa zzh(com.google.android.gms.ads.internal.overlay.zzp zzpVar, Executor executor) {
        this.zzn.add(new zzdha(zzpVar, executor));
        return this;
    }

    public final zzdfa zzi(zzdbw zzdbwVar, Executor executor) {
        this.zzm.add(new zzdha(zzdbwVar, executor));
        return this;
    }

    public final zzdfa zzj(zzdcg zzdcgVar, Executor executor) {
        this.zzb.add(new zzdha(zzdcgVar, executor));
        return this;
    }

    public final zzdfa zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdha(appEventListener, executor));
        return this;
    }

    public final zzdfa zzl(zzdhi zzdhiVar, Executor executor) {
        this.zzd.add(new zzdha(zzdhiVar, executor));
        return this;
    }

    public final zzdfa zzm(zzfeh zzfehVar) {
        this.zzo = zzfehVar;
        return this;
    }

    public final zzdfc zzn() {
        return new zzdfc(this, null);
    }
}
