package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdv;
import java.util.Iterator;
import x.l;

/* loaded from: classes2.dex */
public final class zzdjq implements zzdaz, com.google.android.gms.ads.internal.overlay.zzp, zzdaf {

    @Nullable
    zzehg zza;
    private final Context zzb;

    @Nullable
    private final zzchd zzc;
    private final zzfgt zzd;
    private final VersionInfoParcel zze;
    private final zzbdv.zza.EnumC0129zza zzf;
    private final zzehe zzg;

    public zzdjq(Context context, @Nullable zzchd zzchdVar, zzfgt zzfgtVar, VersionInfoParcel versionInfoParcel, zzbdv.zza.EnumC0129zza enumC0129zza, zzehe zzeheVar) {
        this.zzb = context;
        this.zzc = zzchdVar;
        this.zzd = zzfgtVar;
        this.zze = versionInfoParcel;
        this.zzf = enumC0129zza;
        this.zzg = zzeheVar;
    }

    private final boolean zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && this.zzg.zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [x.l, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfh)).booleanValue() && this.zzc != null) {
            if (this.zza != null || zzg()) {
                if (this.zza != null) {
                    this.zzc.zzd("onSdkImpression", new l());
                } else {
                    this.zzg.zzb();
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i9) {
        this.zza = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [x.l, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
            return;
        }
        if (this.zza != null && this.zzc != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfh)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new l());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [x.l, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        zzehd zzehdVar;
        zzehd zzehdVar2;
        zzehc zzehcVar;
        zzbdv.zza.EnumC0129zza enumC0129zza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfk)).booleanValue() || (enumC0129zza = this.zzf) == zzbdv.zza.EnumC0129zza.REWARD_BASED_VIDEO_AD || enumC0129zza == zzbdv.zza.EnumC0129zza.INTERSTITIAL || enumC0129zza == zzbdv.zza.EnumC0129zza.APP_OPEN) && this.zzd.zzU && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zzb)) {
                if (zzg()) {
                    this.zzg.zzc();
                    return;
                }
                VersionInfoParcel versionInfoParcel = this.zze;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfhr zzfhrVar = this.zzd.zzW;
                String zza = zzfhrVar.zza();
                if (zzfhrVar.zzc() == 1) {
                    zzehcVar = zzehc.VIDEO;
                    zzehdVar2 = zzehd.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.zzd.zzZ == 2) {
                        zzehdVar = zzehd.UNSPECIFIED;
                    } else {
                        zzehdVar = zzehd.BEGIN_TO_RENDER;
                    }
                    zzehdVar2 = zzehdVar;
                    zzehcVar = zzehc.HTML_DISPLAY;
                }
                zzehg zza2 = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzc.zzG(), "", "javascript", zza, zzehdVar2, zzehcVar, this.zzd.zzam);
                this.zza = zza2;
                Object obj = this.zzc;
                if (zza2 != null) {
                    zzfoj zza3 = zza2.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfb)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zza3, this.zzc.zzG());
                        Iterator it = this.zzc.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzu.zzA().zzg(zza3, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zza3, (View) obj);
                    }
                    this.zzc.zzat(this.zza);
                    com.google.android.gms.ads.internal.zzu.zzA().zzk(zza3);
                    this.zzc.zzd("onSdkLoaded", new l());
                }
            }
        }
    }
}
