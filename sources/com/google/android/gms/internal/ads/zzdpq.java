package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdpq implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdud zzc;
    private final zzeey zzd;
    private final Executor zze;
    private final zzavn zzf;
    private final VersionInfoParcel zzg;
    private final zzfng zzh;
    private final zzefj zzi;
    private final zzfhg zzj;

    public zzdpq(Context context, Executor executor, zzavn zzavnVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcgb zzcgbVar, zzeey zzeeyVar, zzfng zzfngVar, zzdud zzdudVar, zzefj zzefjVar, zzfhg zzfhgVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavnVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzeeyVar;
        this.zzh = zzfngVar;
        this.zzc = zzdudVar;
        this.zzi = zzefjVar;
        this.zzj = zzfhgVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdpq zzdpqVar) {
        return zzdpqVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzavn zzb(zzdpq zzdpqVar) {
        return zzdpqVar.zzf;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdpq zzdpqVar) {
        return zzdpqVar.zza;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzd(zzdpq zzdpqVar) {
        return zzdpqVar.zzg;
    }

    public static /* bridge */ /* synthetic */ zzdud zze(zzdpq zzdpqVar) {
        return zzdpqVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzeey zzf(zzdpq zzdpqVar) {
        return zzdpqVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzefj zzg(zzdpq zzdpqVar) {
        return zzdpqVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzfhg zzh(zzdpq zzdpqVar) {
        return zzdpqVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfng zzi(zzdpq zzdpqVar) {
        return zzdpqVar.zzh;
    }

    public static /* bridge */ /* synthetic */ Executor zzj(zzdpq zzdpqVar) {
        return zzdpqVar.zze;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdpt zzdptVar = new zzdpt(this);
        zzdptVar.zzk();
        return zzdptVar;
    }
}
