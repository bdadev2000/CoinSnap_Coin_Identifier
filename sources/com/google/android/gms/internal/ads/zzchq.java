package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzchq {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzchd, java.lang.Object] */
    public static final zzchd zza(final Context context, final zzcix zzcixVar, final String str, final boolean z8, final boolean z9, @Nullable final zzaxd zzaxdVar, @Nullable final zzbfs zzbfsVar, final VersionInfoParcel versionInfoParcel, @Nullable zzbfe zzbfeVar, @Nullable final com.google.android.gms.ads.internal.zzm zzmVar, @Nullable final com.google.android.gms.ads.internal.zza zzaVar, final zzbdm zzbdmVar, @Nullable final zzfgt zzfgtVar, @Nullable final zzfgw zzfgwVar, @Nullable final zzegk zzegkVar, @Nullable final zzfhs zzfhsVar) throws zzchp {
        zzbep.zza(context);
        try {
            final zzbfe zzbfeVar2 = null;
            zzfyw zzfywVar = new zzfyw(context, zzcixVar, str, z8, z9, zzaxdVar, zzbfsVar, versionInfoParcel, zzbfeVar2, zzmVar, zzaVar, zzbdmVar, zzfgtVar, zzfgwVar, zzfhsVar, zzegkVar) { // from class: com.google.android.gms.internal.ads.zzchm
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcix zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzaxd zzf;
                public final /* synthetic */ zzbfs zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzm zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbdm zzk;
                public final /* synthetic */ zzfgt zzl;
                public final /* synthetic */ zzfgw zzm;
                public final /* synthetic */ zzfhs zzn;
                public final /* synthetic */ zzegk zzo;

                {
                    this.zzi = zzmVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbdmVar;
                    this.zzl = zzfgtVar;
                    this.zzm = zzfgwVar;
                    this.zzn = zzfhsVar;
                    this.zzo = zzegkVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfyw
                public final Object zza() {
                    zzcix zzcixVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z10 = this.zzd;
                    zzbdm zzbdmVar2 = this.zzk;
                    boolean z11 = this.zze;
                    zzaxd zzaxdVar2 = this.zzf;
                    zzfgt zzfgtVar2 = this.zzl;
                    zzbfs zzbfsVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzm zzmVar2 = this.zzi;
                    zzfgw zzfgwVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzfhs zzfhsVar2 = this.zzn;
                    zzegk zzegkVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i9 = zzcic.zza;
                        zzchv zzchvVar = new zzchv(new zzcic(new zzciw(context2), zzcixVar2, str2, z10, z11, zzaxdVar2, zzbfsVar2, versionInfoParcel2, null, zzmVar2, zzaVar2, zzbdmVar2, zzfgtVar2, zzfgwVar2, zzfhsVar2));
                        zzchvVar.setWebViewClient(com.google.android.gms.ads.internal.zzu.zzq().zzc(zzchvVar, zzbdmVar2, z11, zzegkVar2));
                        zzchvVar.setWebChromeClient(new zzchc(zzchvVar));
                        return zzchvVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzfywVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzchp("Webview initialization failed.", th);
        }
    }
}
