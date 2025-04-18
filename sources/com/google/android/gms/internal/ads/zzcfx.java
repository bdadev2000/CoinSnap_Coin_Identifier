package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcfx {
    public static final zzcfk zza(final Context context, final zzche zzcheVar, final String str, final boolean z10, final boolean z11, @Nullable final zzavc zzavcVar, @Nullable final zzbdu zzbduVar, final VersionInfoParcel versionInfoParcel, @Nullable zzbdc zzbdcVar, @Nullable final com.google.android.gms.ads.internal.zzn zznVar, @Nullable final com.google.android.gms.ads.internal.zza zzaVar, final zzbbl zzbblVar, @Nullable final zzfet zzfetVar, @Nullable final zzfew zzfewVar, @Nullable final zzeea zzeeaVar, @Nullable final zzffs zzffsVar) throws zzcfw {
        zzbcn.zza(context);
        try {
            final zzbdc zzbdcVar2 = null;
            zzfxg zzfxgVar = new zzfxg(context, zzcheVar, str, z10, z11, zzavcVar, zzbduVar, versionInfoParcel, zzbdcVar2, zznVar, zzaVar, zzbblVar, zzfetVar, zzfewVar, zzffsVar, zzeeaVar) { // from class: com.google.android.gms.internal.ads.zzcft
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzche zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzavc zzf;
                public final /* synthetic */ zzbdu zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbbl zzk;
                public final /* synthetic */ zzfet zzl;
                public final /* synthetic */ zzfew zzm;
                public final /* synthetic */ zzffs zzn;
                public final /* synthetic */ zzeea zzo;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbblVar;
                    this.zzl = zzfetVar;
                    this.zzm = zzfewVar;
                    this.zzn = zzffsVar;
                    this.zzo = zzeeaVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfxg
                public final Object zza() {
                    zzche zzcheVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    zzbbl zzbblVar2 = this.zzk;
                    boolean z13 = this.zze;
                    zzavc zzavcVar2 = this.zzf;
                    zzfet zzfetVar2 = this.zzl;
                    zzbdu zzbduVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    zzfew zzfewVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzffs zzffsVar2 = this.zzn;
                    zzeea zzeeaVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcgj.zza;
                        zzcgc zzcgcVar = new zzcgc(new zzcgj(new zzchd(context2), zzcheVar2, str2, z12, z13, zzavcVar2, zzbduVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbblVar2, zzfetVar2, zzfewVar2, zzffsVar2));
                        zzcgcVar.setWebViewClient(com.google.android.gms.ads.internal.zzv.zzr().zzc(zzcgcVar, zzbblVar2, z13, zzeeaVar2));
                        zzcgcVar.setWebChromeClient(new zzcfj(zzcgcVar));
                        return zzcgcVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object zza = zzfxgVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcfk) zza;
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new zzcfw("Webview initialization failed.", th3);
        }
    }
}
