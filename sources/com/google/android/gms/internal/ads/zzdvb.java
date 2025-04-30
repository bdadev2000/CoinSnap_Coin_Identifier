package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzdvb {
    final /* synthetic */ zzdvc zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdvb(zzdvc zzdvcVar) {
        this.zza = zzdvcVar;
    }

    public static /* bridge */ /* synthetic */ zzdvb zza(zzdvb zzdvbVar) {
        zzdvbVar.zzb.putAll(zzdvc.zzc(zzdvbVar.zza));
        return zzdvbVar;
    }

    public final zzdvb zzb(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdvb zzc(zzfgt zzfgtVar) {
        zzb("aai", zzfgtVar.zzx);
        zzb("request_id", zzfgtVar.zzao);
        zzb("ad_format", zzfgt.zza(zzfgtVar.zzb));
        return this;
    }

    public final zzdvb zzd(zzfgw zzfgwVar) {
        zzb("gqi", zzfgwVar.zzb);
        return this;
    }

    public final String zze() {
        return zzdvc.zzb(this.zza).zzb(this.zzb);
    }

    public final void zzf() {
        zzdvc.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduz
            @Override // java.lang.Runnable
            public final void run() {
                zzdvb.this.zzh();
            }
        });
    }

    public final void zzg() {
        zzdvc.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdva
            @Override // java.lang.Runnable
            public final void run() {
                zzdvb.this.zzi();
            }
        });
    }

    public final /* synthetic */ void zzh() {
        zzdvc.zzb(this.zza).zzf(this.zzb);
    }

    public final /* synthetic */ void zzi() {
        zzdvc.zzb(this.zza).zze(this.zzb);
    }
}
