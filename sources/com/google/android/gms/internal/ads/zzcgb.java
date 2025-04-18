package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcgb {
    public static final zzcfo zza(final Context context, final zzchi zzchiVar, final String str, final boolean z2, final boolean z3, @Nullable final zzavn zzavnVar, @Nullable final zzbdy zzbdyVar, final VersionInfoParcel versionInfoParcel, @Nullable zzbdk zzbdkVar, @Nullable final com.google.android.gms.ads.internal.zzm zzmVar, @Nullable final com.google.android.gms.ads.internal.zza zzaVar, final zzbbu zzbbuVar, @Nullable final zzfgh zzfghVar, @Nullable final zzfgk zzfgkVar, @Nullable final zzefj zzefjVar, @Nullable final zzfhg zzfhgVar) throws zzcga {
        zzbcv.zza(context);
        try {
            final zzbdk zzbdkVar2 = null;
            zzfyp zzfypVar = new zzfyp(context, zzchiVar, str, z2, z3, zzavnVar, zzbdyVar, versionInfoParcel, zzbdkVar2, zzmVar, zzaVar, zzbbuVar, zzfghVar, zzfgkVar, zzfhgVar, zzefjVar) { // from class: com.google.android.gms.internal.ads.zzcfx
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzchi zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzavn zzf;
                public final /* synthetic */ zzbdy zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzm zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbbu zzk;
                public final /* synthetic */ zzfgh zzl;
                public final /* synthetic */ zzfgk zzm;
                public final /* synthetic */ zzfhg zzn;
                public final /* synthetic */ zzefj zzo;

                {
                    this.zzi = zzmVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbbuVar;
                    this.zzl = zzfghVar;
                    this.zzm = zzfgkVar;
                    this.zzn = zzfhgVar;
                    this.zzo = zzefjVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfyp
                public final Object zza() {
                    zzchi zzchiVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z4 = this.zzd;
                    zzbbu zzbbuVar2 = this.zzk;
                    boolean z5 = this.zze;
                    zzavn zzavnVar2 = this.zzf;
                    zzfgh zzfghVar2 = this.zzl;
                    zzbdy zzbdyVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzm zzmVar2 = this.zzi;
                    zzfgk zzfgkVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzfhg zzfhgVar2 = this.zzn;
                    zzefj zzefjVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = zzcgn.zza;
                        zzcgg zzcggVar = new zzcgg(new zzcgn(new zzchh(context2), zzchiVar2, str2, z4, z5, zzavnVar2, zzbdyVar2, versionInfoParcel2, null, zzmVar2, zzaVar2, zzbbuVar2, zzfghVar2, zzfgkVar2, zzfhgVar2));
                        zzcggVar.setWebViewClient(com.google.android.gms.ads.internal.zzu.zzq().zzc(zzcggVar, zzbbuVar2, z5, zzefjVar2));
                        zzcggVar.setWebChromeClient(new zzcfn(zzcggVar));
                        return zzcggVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object zza = zzfypVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcfo) zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzcga("Webview initialization failed.", th2);
        }
    }
}
