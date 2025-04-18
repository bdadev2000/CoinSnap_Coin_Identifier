package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzduc {
    final /* synthetic */ zzdud zza;
    private final Map zzb = new ConcurrentHashMap();

    @VisibleForTesting
    public zzduc(zzdud zzdudVar) {
        this.zza = zzdudVar;
    }

    public static /* bridge */ /* synthetic */ zzduc zza(zzduc zzducVar) {
        zzducVar.zzb.putAll(zzdud.zzc(zzducVar.zza));
        return zzducVar;
    }

    public final zzduc zzb(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzduc zzc(zzfgh zzfghVar) {
        zzb("aai", zzfghVar.zzw);
        zzb(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, zzfghVar.zzan);
        zzb("ad_format", zzfgh.zza(zzfghVar.zzb));
        return this;
    }

    public final zzduc zzd(zzfgk zzfgkVar) {
        zzb("gqi", zzfgkVar.zzb);
        return this;
    }

    public final String zze() {
        return zzdud.zzb(this.zza).zzb(this.zzb);
    }

    public final void zzf() {
        zzdud.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdua
            @Override // java.lang.Runnable
            public final void run() {
                zzduc.this.zzh();
            }
        });
    }

    public final void zzg() {
        zzdud.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdub
            @Override // java.lang.Runnable
            public final void run() {
                zzduc.this.zzi();
            }
        });
    }

    public final /* synthetic */ void zzh() {
        zzdud.zzb(this.zza).zzf(this.zzb);
    }

    public final /* synthetic */ void zzi() {
        zzdud.zzb(this.zza).zze(this.zzb);
    }
}
