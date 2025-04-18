package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbcb;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzdil implements zzczo, com.google.android.gms.ads.internal.overlay.zzr, zzcyu {

    @Nullable
    @VisibleForTesting
    zzegf zza;
    private final Context zzb;

    @Nullable
    private final zzcfo zzc;
    private final zzfgh zzd;
    private final VersionInfoParcel zze;
    private final zzbcb.zza.EnumC0122zza zzf;
    private final zzegd zzg;

    public zzdil(Context context, @Nullable zzcfo zzcfoVar, zzfgh zzfghVar, VersionInfoParcel versionInfoParcel, zzbcb.zza.EnumC0122zza enumC0122zza, zzegd zzegdVar) {
        this.zzb = context;
        this.zzc = zzcfoVar;
        this.zzd = zzfghVar;
        this.zze = versionInfoParcel;
        this.zzf = enumC0122zza;
        this.zzg = zzegdVar;
    }

    private final boolean zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeX)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, androidx.collection.SimpleArrayMap] */
    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfc)).booleanValue() || this.zzc == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                this.zzc.zzd("onSdkImpression", new SimpleArrayMap());
            } else {
                this.zzg.zzb();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int i2) {
        this.zza = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, androidx.collection.SimpleArrayMap] */
    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
            return;
        }
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfc)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new SimpleArrayMap());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map, androidx.collection.SimpleArrayMap] */
    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
        zzegc zzegcVar;
        zzegb zzegbVar;
        zzbcb.zza.EnumC0122zza enumC0122zza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzff)).booleanValue() || (enumC0122zza = this.zzf) == zzbcb.zza.EnumC0122zza.REWARD_BASED_VIDEO_AD || enumC0122zza == zzbcb.zza.EnumC0122zza.INTERSTITIAL || enumC0122zza == zzbcb.zza.EnumC0122zza.APP_OPEN) && this.zzd.zzT && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zzb)) {
                if (zzg()) {
                    this.zzg.zzc();
                    return;
                }
                VersionInfoParcel versionInfoParcel = this.zze;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfhf zzfhfVar = this.zzd.zzV;
                String zza = zzfhfVar.zza();
                if (zzfhfVar.zzc() == 1) {
                    zzegbVar = zzegb.VIDEO;
                    zzegcVar = zzegc.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzegcVar = this.zzd.zzY == 2 ? zzegc.UNSPECIFIED : zzegc.BEGIN_TO_RENDER;
                    zzegbVar = zzegb.HTML_DISPLAY;
                }
                this.zza = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzc.zzG(), "", "javascript", zza, zzegcVar, zzegbVar, this.zzd.zzal);
                View zzF = this.zzc.zzF();
                zzegf zzegfVar = this.zza;
                if (zzegfVar != null) {
                    zzfoi zza2 = zzegfVar.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeW)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zza2, this.zzc.zzG());
                        Iterator it = this.zzc.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzu.zzA().zzg(zza2, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zza2, zzF);
                    }
                    this.zzc.zzat(this.zza);
                    com.google.android.gms.ads.internal.zzu.zzA().zzk(zza2);
                    this.zzc.zzd("onSdkLoaded", new SimpleArrayMap());
                }
            }
        }
    }
}
