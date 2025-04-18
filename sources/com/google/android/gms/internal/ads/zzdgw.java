package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzdgw implements zzcya, com.google.android.gms.ads.internal.overlay.zzr, zzcxg {

    @Nullable
    zzeew zza;
    private final Context zzb;

    @Nullable
    private final zzcfk zzc;
    private final zzfet zzd;
    private final VersionInfoParcel zze;
    private final zzbbs.zza.EnumC0141zza zzf;
    private final zzeeu zzg;

    public zzdgw(Context context, @Nullable zzcfk zzcfkVar, zzfet zzfetVar, VersionInfoParcel versionInfoParcel, zzbbs.zza.EnumC0141zza enumC0141zza, zzeeu zzeeuVar) {
        this.zzb = context;
        this.zzc = zzcfkVar;
        this.zzd = zzfetVar;
        this.zze = versionInfoParcel;
        this.zzf = enumC0141zza;
        this.zzg = zzeeuVar;
    }

    private final boolean zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && this.zzg.zzd()) {
            return true;
        }
        return false;
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

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfj)).booleanValue() && this.zzc != null) {
            if (this.zza != null || zzg()) {
                if (this.zza != null) {
                    this.zzc.zzd("onSdkImpression", new r.b());
                } else {
                    this.zzg.zzb();
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
            return;
        }
        if (this.zza != null && this.zzc != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfj)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new r.b());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        zzeet zzeetVar;
        zzeet zzeetVar2;
        zzees zzeesVar;
        zzbbs.zza.EnumC0141zza enumC0141zza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfm)).booleanValue() || (enumC0141zza = this.zzf) == zzbbs.zza.EnumC0141zza.REWARD_BASED_VIDEO_AD || enumC0141zza == zzbbs.zza.EnumC0141zza.INTERSTITIAL || enumC0141zza == zzbbs.zza.EnumC0141zza.APP_OPEN) && this.zzd.zzT && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zzb)) {
                if (zzg()) {
                    this.zzg.zzc();
                    return;
                }
                VersionInfoParcel versionInfoParcel = this.zze;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzffr zzffrVar = this.zzd.zzV;
                String zza = zzffrVar.zza();
                if (zzffrVar.zzc() == 1) {
                    zzeesVar = zzees.VIDEO;
                    zzeetVar2 = zzeet.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.zzd.zzY == 2) {
                        zzeetVar = zzeet.UNSPECIFIED;
                    } else {
                        zzeetVar = zzeet.BEGIN_TO_RENDER;
                    }
                    zzeetVar2 = zzeetVar;
                    zzeesVar = zzees.HTML_DISPLAY;
                }
                this.zza = com.google.android.gms.ads.internal.zzv.zzB().zza(str, this.zzc.zzG(), "", "javascript", zza, zzeetVar2, zzeesVar, this.zzd.zzal);
                View zzF = this.zzc.zzF();
                zzeew zzeewVar = this.zza;
                if (zzeewVar != null) {
                    zzfmw zza2 = zzeewVar.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfd)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zza2, this.zzc.zzG());
                        Iterator it = this.zzc.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzv.zzB().zzg(zza2, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zza2, zzF);
                    }
                    this.zzc.zzat(this.zza);
                    com.google.android.gms.ads.internal.zzv.zzB().zzk(zza2);
                    this.zzc.zzd("onSdkLoaded", new r.b());
                }
            }
        }
    }
}
