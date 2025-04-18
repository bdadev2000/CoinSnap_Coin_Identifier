package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdsl {
    final /* synthetic */ zzdsm zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdsl(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public static /* bridge */ /* synthetic */ zzdsl zza(zzdsl zzdslVar) {
        Map map;
        zzdsm zzdsmVar = zzdslVar.zza;
        Map map2 = zzdslVar.zzb;
        map = zzdsmVar.zzc;
        map2.putAll(map);
        return zzdslVar;
    }

    public final zzdsl zzb(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdsl zzc(zzfet zzfetVar) {
        zzb("aai", zzfetVar.zzw);
        zzb("request_id", zzfetVar.zzan);
        zzb("ad_format", zzfet.zza(zzfetVar.zzb));
        return this;
    }

    public final zzdsl zzd(zzfew zzfewVar) {
        zzb("gqi", zzfewVar.zzb);
        return this;
    }

    public final String zze() {
        zzdsr zzdsrVar;
        zzdsrVar = this.zza.zza;
        return zzdsrVar.zzb(this.zzb);
    }

    public final void zzf() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsj
            @Override // java.lang.Runnable
            public final void run() {
                zzdsl.this.zzh();
            }
        });
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsk
            @Override // java.lang.Runnable
            public final void run() {
                zzdsl.this.zzi();
            }
        });
    }

    public final /* synthetic */ void zzh() {
        zzdsr zzdsrVar;
        zzdsrVar = this.zza.zza;
        zzdsrVar.zzf(this.zzb);
    }

    public final /* synthetic */ void zzi() {
        zzdsr zzdsrVar;
        zzdsrVar = this.zza.zza;
        zzdsrVar.zze(this.zzb);
    }
}
