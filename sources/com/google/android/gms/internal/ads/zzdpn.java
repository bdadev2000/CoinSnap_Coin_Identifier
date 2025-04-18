package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzdpn {
    private final Context zza;
    private final zzavc zzb;
    private final zzbdu zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbbl zzf;
    private final zzcze zzg;
    private final zzeea zzh;
    private final zzffs zzi;

    public zzdpn(zzcfx zzcfxVar, Context context, zzavc zzavcVar, zzbdu zzbduVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbl zzbblVar, zzcze zzczeVar, zzeea zzeeaVar, zzffs zzffsVar) {
        this.zza = context;
        this.zzb = zzavcVar;
        this.zzc = zzbduVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbblVar;
        this.zzg = zzczeVar;
        this.zzh = zzeeaVar;
        this.zzi = zzffsVar;
    }

    public final zzcfk zza(com.google.android.gms.ads.internal.client.zzs zzsVar, zzfet zzfetVar, zzfew zzfewVar) throws zzcfw {
        zzche zzc = zzche.zzc(zzsVar);
        String str = zzsVar.zza;
        zzdpc zzdpcVar = new zzdpc(this);
        zzeea zzeeaVar = this.zzh;
        zzffs zzffsVar = this.zzi;
        com.google.android.gms.ads.internal.zza zzaVar = this.zze;
        zzbbl zzbblVar = this.zzf;
        return zzcfx.zza(this.zza, zzc, str, false, false, this.zzb, this.zzc, this.zzd, null, zzdpcVar, zzaVar, zzbblVar, zzfetVar, zzfewVar, zzeeaVar, zzffsVar);
    }
}
