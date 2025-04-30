package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzcjg {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcjg(zzcje zzcjeVar, zzcjf zzcjfVar) {
        VersionInfoParcel versionInfoParcel;
        Context context;
        WeakReference weakReference;
        long j7;
        versionInfoParcel = zzcjeVar.zza;
        this.zza = versionInfoParcel;
        context = zzcjeVar.zzb;
        this.zzb = context;
        weakReference = zzcjeVar.zzd;
        this.zzd = weakReference;
        j7 = zzcjeVar.zzc;
        this.zzc = j7;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.internal.zzj zzc() {
        return new com.google.android.gms.ads.internal.zzj(this.zzb, this.zza);
    }

    public final zzbhd zzd() {
        return new zzbhd(this.zzb);
    }

    public final VersionInfoParcel zze() {
        return this.zza;
    }

    public final String zzf() {
        return com.google.android.gms.ads.internal.zzu.zzp().zzc(this.zzb, this.zza.afmaVersion);
    }

    public final WeakReference zzg() {
        return this.zzd;
    }
}
