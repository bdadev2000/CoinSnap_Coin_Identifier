package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdnz implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdsm zzc;
    private final zzedp zzd;
    private final Executor zze;
    private final zzavc zzf;
    private final VersionInfoParcel zzg;
    private final zzflr zzh;
    private final zzeea zzi;
    private final zzffs zzj;

    public zzdnz(Context context, Executor executor, zzavc zzavcVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcfx zzcfxVar, zzedp zzedpVar, zzflr zzflrVar, zzdsm zzdsmVar, zzeea zzeeaVar, zzffs zzffsVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavcVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzedpVar;
        this.zzh = zzflrVar;
        this.zzc = zzdsmVar;
        this.zzi = zzeeaVar;
        this.zzj = zzffsVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdnz zzdnzVar) {
        return zzdnzVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzavc zzb(zzdnz zzdnzVar) {
        return zzdnzVar.zzf;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdnz zzdnzVar) {
        return zzdnzVar.zza;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzd(zzdnz zzdnzVar) {
        return zzdnzVar.zzg;
    }

    public static /* bridge */ /* synthetic */ zzdsm zze(zzdnz zzdnzVar) {
        return zzdnzVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzedp zzf(zzdnz zzdnzVar) {
        return zzdnzVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzeea zzg(zzdnz zzdnzVar) {
        return zzdnzVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzffs zzh(zzdnz zzdnzVar) {
        return zzdnzVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzflr zzi(zzdnz zzdnzVar) {
        return zzdnzVar.zzh;
    }

    public static /* bridge */ /* synthetic */ Executor zzj(zzdnz zzdnzVar) {
        return zzdnzVar.zze;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdoc zzdocVar = new zzdoc(this);
        zzdocVar.zzk();
        return zzdocVar;
    }
}
