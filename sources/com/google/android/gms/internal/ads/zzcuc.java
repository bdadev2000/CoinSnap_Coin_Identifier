package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import x.l;

/* loaded from: classes2.dex */
public final class zzcuc implements zzdaz, zzdaf {
    private final Context zza;

    @Nullable
    private final zzchd zzb;
    private final zzfgt zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private zzehg zze;
    private boolean zzf;
    private final zzehe zzg;

    public zzcuc(Context context, @Nullable zzchd zzchdVar, zzfgt zzfgtVar, VersionInfoParcel versionInfoParcel, zzehe zzeheVar) {
        this.zza = context;
        this.zzb = zzchdVar;
        this.zzc = zzfgtVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzeheVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [x.l, java.util.Map] */
    private final synchronized void zza() {
        zzehd zzehdVar;
        zzehd zzehdVar2;
        zzehc zzehcVar;
        try {
            if (this.zzc.zzU && this.zzb != null) {
                if (com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                    zzfhr zzfhrVar = this.zzc.zzW;
                    String zza = zzfhrVar.zza();
                    if (zzfhrVar.zzc() == 1) {
                        zzehcVar = zzehc.VIDEO;
                        zzehdVar2 = zzehd.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzfgt zzfgtVar = this.zzc;
                        zzehc zzehcVar2 = zzehc.HTML_DISPLAY;
                        if (zzfgtVar.zzf == 1) {
                            zzehdVar = zzehd.ONE_PIXEL;
                        } else {
                            zzehdVar = zzehd.BEGIN_TO_RENDER;
                        }
                        zzehdVar2 = zzehdVar;
                        zzehcVar = zzehcVar2;
                    }
                    zzehg zza2 = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza, zzehdVar2, zzehcVar, this.zzc.zzam);
                    this.zze = zza2;
                    Object obj = this.zzb;
                    if (zza2 != null) {
                        zzfoj zza3 = zza2.zza();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfb)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzu.zzA().zzj(zza3, this.zzb.zzG());
                            Iterator it = this.zzb.zzV().iterator();
                            while (it.hasNext()) {
                                com.google.android.gms.ads.internal.zzu.zzA().zzg(zza3, (View) it.next());
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzu.zzA().zzj(zza3, (View) obj);
                        }
                        this.zzb.zzat(this.zze);
                        com.google.android.gms.ads.internal.zzu.zzA().zzk(zza3);
                        this.zzf = true;
                        this.zzb.zzd("onSdkLoaded", new l());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && this.zzg.zzd()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x.l, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.zzdaf
    public final synchronized void zzr() {
        zzchd zzchdVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (this.zzc.zzU && this.zze != null && (zzchdVar = this.zzb) != 0) {
            zzchdVar.zzd("onSdkImpression", new l());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
