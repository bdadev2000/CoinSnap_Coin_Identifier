package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzcrd implements zzcya, zzcxg {
    private final Context zza;

    @Nullable
    private final zzcfk zzb;
    private final zzfet zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private zzeew zze;
    private boolean zzf;
    private final zzeeu zzg;

    public zzcrd(Context context, @Nullable zzcfk zzcfkVar, zzfet zzfetVar, VersionInfoParcel versionInfoParcel, zzeeu zzeeuVar) {
        this.zza = context;
        this.zzb = zzcfkVar;
        this.zzc = zzfetVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzeeuVar;
    }

    private final synchronized void zza() {
        zzeet zzeetVar;
        zzeet zzeetVar2;
        zzees zzeesVar;
        if (this.zzc.zzT && this.zzb != null) {
            if (com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzffr zzffrVar = this.zzc.zzV;
                String zza = zzffrVar.zza();
                if (zzffrVar.zzc() == 1) {
                    zzeesVar = zzees.VIDEO;
                    zzeetVar2 = zzeet.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzfet zzfetVar = this.zzc;
                    zzees zzeesVar2 = zzees.HTML_DISPLAY;
                    if (zzfetVar.zze == 1) {
                        zzeetVar = zzeet.ONE_PIXEL;
                    } else {
                        zzeetVar = zzeet.BEGIN_TO_RENDER;
                    }
                    zzeetVar2 = zzeetVar;
                    zzeesVar = zzeesVar2;
                }
                this.zze = com.google.android.gms.ads.internal.zzv.zzB().zza(str, this.zzb.zzG(), "", "javascript", zza, zzeetVar2, zzeesVar, this.zzc.zzal);
                View zzF = this.zzb.zzF();
                zzeew zzeewVar = this.zze;
                if (zzeewVar != null) {
                    zzfmw zza2 = zzeewVar.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfd)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zza2, this.zzb.zzG());
                        Iterator it = this.zzb.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzv.zzB().zzg(zza2, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zza2, zzF);
                    }
                    this.zzb.zzat(this.zze);
                    com.google.android.gms.ads.internal.zzv.zzB().zzk(zza2);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new r.b());
                }
            }
        }
    }

    private final boolean zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && this.zzg.zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzr() {
        zzcfk zzcfkVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (this.zzc.zzT && this.zze != null && (zzcfkVar = this.zzb) != null) {
            zzcfkVar.zzd("onSdkImpression", new r.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
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
